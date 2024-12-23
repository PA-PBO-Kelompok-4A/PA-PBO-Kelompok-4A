package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Report;

public class AdminMenu extends javax.swing.JFrame {
    private File image;
    private DefaultTableModel tableModel;
    private BufferedImage displayedImage;
    private double zoomFactor = 1.0;
    private JLabel imageLabel;
    private JFrame imageFrame = null;
    /**
     * Creates new form Admin
     */
    public AdminMenu() {
        initComponents();
        table();     
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportTableScroll = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        uploadButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        viewImageButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cariIdButton = new javax.swing.JButton();
        cariIdField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        reportStatusComboBox = new javax.swing.JComboBox<>();
        uploadLabel = new javax.swing.JLabel();
        viewLocationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportTableScroll.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                reportTableScrollAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Isi Laporan", "Lokasi Laporan", "Jenis Laporan", "Bukti Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportTableMouseClicked(evt);
            }
        });
        reportTableScroll.setViewportView(reportTable);

        getContentPane().add(reportTableScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 810, 360));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewImageButton.setText("Lihat Foto");
        viewImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewImageButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jLabel7.setText("Bukti Foto");

        cariIdButton.setText("Cari ID");
        cariIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariIdButtonActionPerformed(evt);
            }
        });

        cariIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariIdFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Cari ID Laporan : ");

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jLabel6.setText("Status Laporan");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        reportStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Menunggu", "Selesai" }));

        viewLocationButton.setText("Lihat Lokasi");
        viewLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLocationButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(uploadButton)
                                .addGap(141, 141, 141)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(reportStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cariIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(cariIdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(viewImageButton)
                                        .addGap(29, 29, 29)
                                        .addComponent(viewLocationButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(refreshButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(221, 221, 221)))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(editButton))
                                .addGap(47, 47, 47)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reportStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(uploadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadLabel)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cariIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariIdButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewLocationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 750, 170));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 48)); // NOI18N
        jLabel2.setText("Admin Menu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asdw_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    void table(){
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableModel.setRowCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Isi Laporan");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Jenis Laporan");
        tableModel.addColumn("Bukti Foto");
        tableModel.addColumn("Status Laporan");
        try {
            Statement statement = Database.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM laporan");
            while (resultSet.next()){
                int reportId = resultSet.getInt("id_laporan");
                String reportDescription = resultSet.getString("isi_laporan");
                String reportAddress = resultSet.getString("alamat");
                String reportType = resultSet.getString("jenis_laporan");
                String reportStatus = resultSet.getString("status");
                
                tableModel.addRow(new Object[]{
                    reportId, 
                    reportDescription, 
                    reportAddress, 
                    reportType, 
                    "Gambar " + reportId, 
                    reportStatus});
                reportTable.setModel(tableModel);
            }
        } catch (Exception e) {
        }
    }
    
    void tableSearching(){
        tableModel = new DefaultTableModel();
        tableModel.setRowCount(0);
        tableModel.addColumn("ID");
        tableModel.addColumn("Isi Laporan");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Jenis Laporan");
        tableModel.addColumn("Bukti Foto");
        tableModel.addColumn("Status Laporan");
        try {
            int searchId = Integer.parseInt(cariIdField.getText());
            String query = "SELECT * FROM laporan WHERE id_laporan = ?";
            PreparedStatement preparedStatement = Database.connection.prepareStatement(query);
            preparedStatement.setInt(1, searchId);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                int reportId = resultSet.getInt("id_laporan");
                String reportDescription = resultSet.getString("isi_laporan");
                String reportAddress = resultSet.getString("alamat");
                String reportType = resultSet.getString("jenis_laporan");
                String reportStatus = resultSet.getString("status");
                
                tableModel.addRow(new Object[]{
                    reportId, 
                    reportDescription, 
                    reportAddress, 
                    reportType, 
                    "Gambar " + reportId, 
                    reportStatus});
                reportTable.setModel(tableModel);
            } else {
                tableModel = new DefaultTableModel();
                tableModel.setRowCount(0);
                tableModel.addColumn("ID");
                tableModel.addColumn("Isi Laporan");
                tableModel.addColumn("Alamat");
                tableModel.addColumn("Jenis Laporan");
                tableModel.addColumn("Bukti Foto");
                tableModel.addColumn("Status Laporan");
                reportTable.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "Laporan tidak ditemukan");
            }
        } catch (Exception e){
            
        }
    }
    
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login loginMenu = new Login();
        loginMenu.setVisible(true);
        loginMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        JFileChooser imageChooser = new JFileChooser();
        imageChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Images", "jpg", "jpeg", "png", "gif"));
        imageChooser.showOpenDialog(null);
        setImage(imageChooser.getSelectedFile());
        if (this.image != null) {
            uploadLabel.setText("Foto berhasil di upload");
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void viewImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewImageButtonActionPerformed
        int selectedRow = reportTable.getSelectedRow();
        if (selectedRow >= 0) {
            int imageId = (int) tableModel.getValueAt(selectedRow, 0);
            displayImage(imageId);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih laporan terlebih dahulu.");
        }
    }//GEN-LAST:event_viewImageButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int selectedRow = reportTable.getSelectedRow();
            if (selectedRow >= 0) {
                DefaultTableModel model = (DefaultTableModel) reportTable.getModel();
                int id = Integer.parseInt(reportTable.getValueAt(selectedRow, 0).toString());
                Report report = new Report("", "", "", "", null);
                report.setId(id);
                report.deleteReport();
                model.removeRow(selectedRow);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
            int selectedRow = reportTable.getSelectedRow();
            
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Silahkan pilih baris yang akan diubah!");
            } else {
                int id = Integer.parseInt(reportTable.getValueAt(selectedRow, 0).toString());
                String reportStatus = reportStatusComboBox.getSelectedItem().toString();
                File image = this.getImage();
                if (!reportStatus.equals("Pilih Status") && image != null) {
                    Report report = new Report(reportStatus, image);
                    report.setId(id);
                    report.updateReport();
                    table();
                    uploadLabel.setText("");
                } else if (reportStatus.equals("Pilih Status") && image != null) {
                    Report report = new Report(reportStatus, image);
                    report.setId(id);
                    report.updateReportImageOnly();
                    table();
                    uploadLabel.setText("");
                } else if (!reportStatus.equals("Pilih Status") && image == null) {
                    Report report = new Report(reportStatus, image);
                    report.setId(id);
                    report.updateReportStatusOnly();
                    table();
                    uploadLabel.setText("");
                }  
                else {
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void reportTableScrollAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_reportTableScrollAncestorAdded
       
    }//GEN-LAST:event_reportTableScrollAncestorAdded

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        table();
        reportStatusComboBox.setSelectedItem("Pilih Status");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void reportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportTableMouseClicked
        int selectedRow = reportTable.getSelectedRow();
        if (selectedRow >= 0) {
            String reportStatus = tableModel.getValueAt(selectedRow, 5).toString();
            reportStatusComboBox.setSelectedItem(reportStatus);
        }
    }//GEN-LAST:event_reportTableMouseClicked

    private void cariIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariIdButtonActionPerformed
        try {
            if (cariIdField.getText().equals("")) {
                reportStatusComboBox.setSelectedItem("Pilih Status");
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong");
            } else if (cariIdField.getText().matches("[a-zA-Z]+")) {
                reportStatusComboBox.setSelectedItem("Pilih Status");
                JOptionPane.showMessageDialog(null, "Tolong masukkan angka");
            }  
            else {
                reportStatusComboBox.setSelectedItem("Pilih Status");
                tableSearching();
            }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_cariIdButtonActionPerformed

    private void cariIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariIdFieldActionPerformed

    private void viewLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLocationButtonActionPerformed
        try {   
            int selectedRow = reportTable.getSelectedRow();
            if (selectedRow >= 0) {
                int reportId = (int) tableModel.getValueAt(selectedRow, 0);
                String query = "SELECT * FROM laporan WHERE id_laporan = ?";
                PreparedStatement preparedStatement = Database.connection.prepareStatement(query);
                preparedStatement.setInt(1, reportId);
                
                ResultSet resultSet = preparedStatement.executeQuery();
                
                if (resultSet.next()) {
                    double latitude = resultSet.getDouble("latitude");
                    double longitude = resultSet.getDouble("longitude");
                    WorldMap map = new WorldMap(latitude, longitude);
                    map.setVisible(true);
                    map.setLocationRelativeTo(null);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilih laporan terlebih dahulu.");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_viewLocationButtonActionPerformed

    private void displayImage(int id) {
        String query = "SELECT gambar_lokasi FROM laporan WHERE id_laporan = ?";
        try {
            PreparedStatement preparedStatement = Database.connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                byte[] imageBytes = resultSet.getBytes("gambar_lokasi");
                displayedImage = ImageIO.read(new ByteArrayInputStream(imageBytes));
                
                if (imageFrame != null) {
                    imageFrame.dispose();
                }
                
                imageFrame = new JFrame("ID Gambar: " + id);
                imageFrame.setSize(600, 600);
                imageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                imageLabel = new JLabel();
                imageFrame.add(imageLabel);
                imageFrame.setLocationRelativeTo(null);
                
                zoomFactor = calculateInitialZoomFactor(imageFrame.getWidth(), imageFrame.getHeight(), displayedImage);
                zoomImage();

                imageFrame.setVisible(true);
            }
        } catch (Exception e) {
        }
        
        
    }
    
    private double calculateInitialZoomFactor(int frameWidth, int frameHeight, BufferedImage image) {
        double widthRatio = (double) frameWidth / image.getWidth();
        double heightRatio = (double) frameHeight / image.getHeight();
        return Math.min(widthRatio, heightRatio);
    }
    
    private void zoomImage() {
        if (displayedImage != null) {
            int newWidth = (int) (displayedImage.getWidth() * zoomFactor);
            int newHeight = (int) (displayedImage.getHeight() * zoomFactor);
            Image scaledImage = displayedImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
            imageLabel.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "No image to display!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariIdButton;
    private javax.swing.JTextField cariIdField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> reportStatusComboBox;
    private javax.swing.JTable reportTable;
    private javax.swing.JScrollPane reportTableScroll;
    private javax.swing.JButton uploadButton;
    private javax.swing.JLabel uploadLabel;
    private javax.swing.JButton viewImageButton;
    private javax.swing.JButton viewLocationButton;
    // End of variables declaration//GEN-END:variables
}
