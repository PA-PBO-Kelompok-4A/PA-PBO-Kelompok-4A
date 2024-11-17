package model;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

public class Report {
    private int id;
    private String reportType;
    private String reportDescription;
    private String location;
    private String status;
    private File image;
    private int userId;
    private double latitude;
    private double longitude;
    
    public Report(String reportType, String reportDescription, String location, String status, File image, int userId, double latitude, double longitude) throws IOException{
        this.reportType = reportType;
        this.reportDescription = reportDescription;
        this.location = location;
        this.status = status;
        this.image = image;
        this.userId = userId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public Report(String reportType, String reportDescription, String location, String status, File image) throws IOException{
        this.reportType = reportType;
        this.reportDescription = reportDescription;
        this.location = location;
        this.status = status;
        this.image = image;
    }
    
    public Report(String status, File image) throws IOException{
        this.status = status;
        this.image = image;
    }

    public String getReportType() {
        return reportType;
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public File getImage() {
        return image;
    }

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void createReport(){
        try {
            FileInputStream imageFileInput = new FileInputStream(this.getImage());
            
            String query = "INSERT INTO laporan (jenis_laporan, isi_laporan, lokasi, status, gambar_lokasi, latitude, longitude, user_id_user) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            Database.preparedStatement = Database.connection.prepareStatement(query);
            
            Database.preparedStatement.setString(1, getReportType());
            Database.preparedStatement.setString(2, getReportDescription());
            Database.preparedStatement.setString(3, getLocation());
            Database.preparedStatement.setString(4, getStatus());
            Database.preparedStatement.setBinaryStream(5, imageFileInput, (int) this.getImage().length());
            Database.preparedStatement.setDouble(6, this.latitude);
            Database.preparedStatement.setDouble(7, this.longitude);
            Database.preparedStatement.setInt(8, getUserId());
            
            Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil menambah data!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terdapat Kesalahan: " + e.getMessage());
        }
    }
    
    public final void updateReport(){
        try {
            FileInputStream imageFileInput = new FileInputStream(this.getImage());
            
            String query = "UPDATE laporan SET status = ?, gambar_lokasi = ? WHERE id_laporan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, getStatus());
            Database.preparedStatement.setBinaryStream(2, imageFileInput, (int) this.getImage().length());
            Database.preparedStatement.setInt(3, getId());
            
            Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil mengubah data!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengedit data! " + e.getMessage());
        }
    }
    
    public final void updateReportStatusOnly(){
        try {
            String query = "UPDATE laporan SET status = ? WHERE id_laporan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
        
            Database.preparedStatement.setString(1, this.status);
            Database.preparedStatement.setInt(2, this.id);
            
            Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil mengubah data!");
        } catch (Exception e) {
        }
        
    }
    
    public final void updateReportImageOnly(){
        try {
            FileInputStream imageFileInput = new FileInputStream(this.getImage());
            
            String query = "UPDATE laporan SET gambar_lokasi = ? WHERE id_laporan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setBinaryStream(1, imageFileInput, (int) this.getImage().length());
            Database.preparedStatement.setInt(2, getId());
            
            Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil mengubah data!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengedit data! " + e.getMessage());
        }
    }
    
    public final void deleteReport(){
        try {
            String query = "DELETE FROM laporan WHERE id_laporan = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setInt(1, getId());
            Database.preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data!");
        } catch (Exception e) {
        }
    }    
            
}
