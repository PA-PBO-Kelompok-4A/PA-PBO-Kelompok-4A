package model;

public class Admin extends Account {
    final private String username;
    public Admin(String email, String password, String username){
        super(email, password);
        this.username = username;
    }
    
    final public static boolean loginAdmin(String email, String password){
        try {
            String query = "SELECT * FROM admin WHERE email = ? AND password = ?";
            
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, email);
            Database.preparedStatement.setString(2, password);
            
            Database.resultSet = Database.preparedStatement.executeQuery();
            if (Database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    final public static boolean checkEmail(String email) {
        try {
            String query = "SELECT * FROM admin WHERE email = ?";
            
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, email);
            Database.resultSet = Database.preparedStatement.executeQuery();
            if (Database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
