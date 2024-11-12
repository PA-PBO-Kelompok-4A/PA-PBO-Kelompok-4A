package model;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User extends Account{
    final private String fullname;
    private static final String emailPattern = "^[a-z0-9.]+@[a-z0-9.]+\\.[a-z]{2,6}$";
    
    public User(String email, String password, String fullname){
        super(email, password);
        this.fullname = fullname;
    }

    public String getUsername() {
        return fullname;
    }
    
    final public void createAccount(){
        try {
            String query = "INSERT INTO user (email, password, nama_lengkap) VALUES (?, ?, ?)";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, super.getEmail());
            Database.preparedStatement.setString(2, super.getPassword());
            Database.preparedStatement.setString(3, getUsername());

            Database.preparedStatement.executeUpdate();
            System.out.println("Berhasil tambah user!");
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
    final public static boolean loginAccount(String email, String password){
        try {
            String query = "SELECT * FROM user WHERE email = ? AND password = ?";

            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, email);
            Database.preparedStatement.setString(2, password);

            Database.resultSet = Database.preparedStatement.executeQuery();
            if (Database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    final public static boolean checkEmail(String email) {
        try {
            String query = "SELECT * FROM user WHERE email = ?";
            
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, email);
            Database.resultSet = Database.preparedStatement.executeQuery();
            if (Database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
        }
        return false;
    } 
    
    final public static Integer getUserID(String email, String password){
        try {
            String query = "SELECT id_user FROM user WHERE email = ? AND password = ?";
            
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, email);
            Database.preparedStatement.setString(2, password);
            Database.resultSet = Database.preparedStatement.executeQuery();
            
            if (Database.resultSet.next()) {
                int userID = Database.resultSet.getInt("id_user");
                return userID;
            } else {
                return null;
            }
            
        } catch (SQLException e) {
        }
        return null;
    }
   
    final public static boolean emailFormatValidation(String email){
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
