/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dropbox.GUI;

import dropbox.AbstractFile;
import dropbox.AbstractFileFactory;
import dropbox.AbstractFileFactory.FileType;
import dropbox.Authentication;
import dropbox.FileSystemElement;
import dropbox.Folder;
import dropbox.ImageFile;
import dropbox.PdfFile;
import dropbox.Storage;
import dropbox.TextFile;
import dropbox.Toast;
import dropbox.VideoFile;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Aiman Nawaz
 */
public class FilesUI extends javax.swing.JPanel {

    /**
     * Creates new form FilesUI
     */
    public FilesUI() throws SQLException 
    {
        initComponents();
        nameDialog.setVisible(false);
        createFilePanel.setVisible(false);
        editFilePanel.setVisible(false);
        userNameLabel.setText( Authentication.online_user.getUserName());
        Authentication.online_user.getUserAccount().displayFiles(Authentication.online_user.getUserAccount().getRootFolder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameDialog = new javax.swing.JDialog();
        newNameDialogLabel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cancelNameDialogButton = new javax.swing.JButton();
        saveNameDialogButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateInfo = new javax.swing.JLabel();
        createFileButton = new javax.swing.JButton();
        uploadFileButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        filePanel = new javax.swing.JPanel();
        pathLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        createFilePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelFileCreate = new javax.swing.JLabel();
        fileNameField = new javax.swing.JTextField();
        editFilePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentArea1 = new javax.swing.JTextArea();
        saveEditsButton = new javax.swing.JButton();
        cancelFileEdit = new javax.swing.JLabel();
        fileNameFieldEdit = new javax.swing.JTextField();

        nameDialog.setTitle("Change your information");
        nameDialog.setAlwaysOnTop(true);
        nameDialog.setBackground(new java.awt.Color(246, 249, 252));
        nameDialog.setLocation(new java.awt.Point(320, 180));
        nameDialog.setMinimumSize(new java.awt.Dimension(284, 250));
        nameDialog.setResizable(false);
        nameDialog.setSize(new java.awt.Dimension(284, 250));
        nameDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                nameDialogWindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("New Name");

        cancelNameDialogButton.setBackground(new java.awt.Color(0, 97, 240));
        cancelNameDialogButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelNameDialogButton.setText("Cancel");
        cancelNameDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelNameDialogButtonActionPerformed(evt);
            }
        });

        saveNameDialogButton.setBackground(new java.awt.Color(0, 97, 240));
        saveNameDialogButton.setForeground(new java.awt.Color(255, 255, 255));
        saveNameDialogButton.setText("Save");
        saveNameDialogButton.setMaximumSize(new java.awt.Dimension(65, 23));
        saveNameDialogButton.setMinimumSize(new java.awt.Dimension(65, 23));
        saveNameDialogButton.setPreferredSize(new java.awt.Dimension(65, 23));
        saveNameDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNameDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nameDialogLayout = new javax.swing.GroupLayout(nameDialog.getContentPane());
        nameDialog.getContentPane().setLayout(nameDialogLayout);
        nameDialogLayout.setHorizontalGroup(
            nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameDialogLayout.createSequentialGroup()
                .addGroup(nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nameDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newNameDialogLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveNameDialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelNameDialogButton)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        nameDialogLayout.setVerticalGroup(
            nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(newNameDialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(nameDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNameDialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelNameDialogButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(247, 249, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/dropbox_logo.PNG"))); // NOI18N

        homeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Files");

        updateInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateInfo.setText("Update Info");
        updateInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateInfoMouseClicked(evt);
            }
        });

        createFileButton.setBackground(new java.awt.Color(0, 97, 240));
        createFileButton.setForeground(new java.awt.Color(255, 255, 255));
        createFileButton.setText("Create File");
        createFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileButtonActionPerformed(evt);
            }
        });

        uploadFileButton.setBackground(new java.awt.Color(0, 97, 240));
        uploadFileButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadFileButton.setText("Upload File");
        uploadFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeLabel)
                            .addComponent(jLabel3)
                            .addComponent(updateInfo)
                            .addComponent(uploadFileButton)
                            .addComponent(createFileButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(updateInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uploadFileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createFileButton)
                .addGap(19, 19, 19))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Files");

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLabel.setText("username");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/avatar_profile_photo.PNG"))); // NOI18N

        filePanel.setBackground(new java.awt.Color(255, 255, 255));
        filePanel.setMaximumSize(new java.awt.Dimension(534, 418));
        filePanel.setMinimumSize(new java.awt.Dimension(534, 418));
        filePanel.setPreferredSize(new java.awt.Dimension(537, 418));

        javax.swing.GroupLayout filePanelLayout = new javax.swing.GroupLayout(filePanel);
        filePanel.setLayout(filePanelLayout);
        filePanelLayout.setHorizontalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        filePanelLayout.setVerticalGroup(
            filePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/back.PNG"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        createFilePanel.setBackground(new java.awt.Color(255, 255, 255));
        createFilePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        createFilePanel.setMinimumSize(new java.awt.Dimension(800, 600));

        contentArea.setColumns(20);
        contentArea.setLineWrap(true);
        contentArea.setRows(5);
        jScrollPane1.setViewportView(contentArea);

        saveButton.setBackground(new java.awt.Color(0, 97, 240));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });

        cancelFileCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/back.PNG"))); // NOI18N
        cancelFileCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelFileCreateMouseClicked(evt);
            }
        });

        fileNameField.setText("sample_name");

        javax.swing.GroupLayout createFilePanelLayout = new javax.swing.GroupLayout(createFilePanel);
        createFilePanel.setLayout(createFilePanelLayout);
        createFilePanelLayout.setHorizontalGroup(
            createFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFilePanelLayout.createSequentialGroup()
                        .addComponent(cancelFileCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        createFilePanelLayout.setVerticalGroup(
            createFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFilePanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(createFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelFileCreate)
                    .addComponent(fileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        editFilePanel.setBackground(new java.awt.Color(255, 255, 255));
        editFilePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        editFilePanel.setMinimumSize(new java.awt.Dimension(800, 600));

        contentArea1.setColumns(20);
        contentArea1.setLineWrap(true);
        contentArea1.setRows(5);
        jScrollPane2.setViewportView(contentArea1);

        saveEditsButton.setBackground(new java.awt.Color(0, 97, 240));
        saveEditsButton.setForeground(new java.awt.Color(255, 255, 255));
        saveEditsButton.setText("Save");
        saveEditsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEditsButtonMouseClicked(evt);
            }
        });

        cancelFileEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/back.PNG"))); // NOI18N
        cancelFileEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelFileEditMouseClicked(evt);
            }
        });

        fileNameFieldEdit.setText("sample_name");

        javax.swing.GroupLayout editFilePanelLayout = new javax.swing.GroupLayout(editFilePanel);
        editFilePanel.setLayout(editFilePanelLayout);
        editFilePanelLayout.setHorizontalGroup(
            editFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFilePanelLayout.createSequentialGroup()
                        .addComponent(cancelFileEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileNameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)
                        .addComponent(saveEditsButton)))
                .addContainerGap())
        );
        editFilePanelLayout.setVerticalGroup(
            editFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editFilePanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(editFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveEditsButton)
                    .addComponent(cancelFileEdit)
                    .addComponent(fileNameFieldEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pathLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userNameLabel)
                                    .addComponent(jLabel8))))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(createFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pathLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(filePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(createFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInfoMouseClicked
        // TODO add your handling code here:
        GUI.getForm().loadPanel("updateinfo");
    }//GEN-LAST:event_updateInfoMouseClicked

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        
        GUI.getForm().loadPanel("profile");
    }//GEN-LAST:event_homeLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        try {
        
            String currFolderID = pathLabel.getName();
            String parentFolderID = Storage.getInstance().loadContainerID(currFolderID);
            if(parentFolderID == null)
                return;
            HashMap folderInfo = Storage.getInstance().loadFolder(parentFolderID);
            Folder f = new Folder((String)folderInfo.get("id") , (String)folderInfo.get("name") , (String)folderInfo.get("container_id") , (String)folderInfo.get("creation_date"));
            Authentication.online_user.getUserAccount().displayFiles(f);

            
        } catch (SQLException ex) {
            Logger.getLogger(FilesUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_backLabelMouseClicked

    private void createFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileButtonActionPerformed
        // TODO add your handling code here:
        createFilePanel.setVisible(true);
        
        jPanel1.setVisible(false);
        filePanel.setVisible(false);
        jLabel6.setVisible(false);
        userNameLabel.setVisible(false);
        jLabel8.setVisible(false);
        pathLabel.setVisible(false);
        backLabel.setVisible(false);
        
        contentArea.setText("Write your content here...");
        fileNameField.setText("sample_name");
        
    }//GEN-LAST:event_createFileButtonActionPerformed

    
    private void cancelFileCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelFileCreateMouseClicked
        // TODO add your handling code here:
        
        jPanel1.setVisible(true);
        filePanel.setVisible(true);
        jLabel6.setVisible(true);
        userNameLabel.setVisible(true);
        jLabel8.setVisible(true);
        pathLabel.setVisible(true);
        backLabel.setVisible(true);
        
        createFilePanel.setVisible(false);
        
    }//GEN-LAST:event_cancelFileCreateMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        
        if(TextFile.createTextFile(fileNameField.getText() , pathLabel.getName()))
        {
        
            jPanel1.setVisible(true);
            filePanel.setVisible(true);
            jLabel6.setVisible(true);
            userNameLabel.setVisible(true);
            jLabel8.setVisible(true);
            pathLabel.setVisible(true);
            backLabel.setVisible(true);

            createFilePanel.setVisible(false);
        }
    }//GEN-LAST:event_saveButtonMouseClicked

    
    private void saveEditsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditsButtonMouseClicked
        try 
        {
            String oldName = Storage.getInstance().loadFileName(fileNameFieldEdit.getName());
            String newName = fileNameFieldEdit.getText();
            
            if(TextFile.editTextFile(oldName , newName , pathLabel.getName() , fileNameFieldEdit.getName() , contentArea1.getText()))
            {
                contentArea1.setText("");
                fileNameFieldEdit.setText("");


                editFilePanel.setVisible(false);

                jPanel1.setVisible(true);
                filePanel.setVisible(true);
                jLabel6.setVisible(true);
                userNameLabel.setVisible(true);
                jLabel8.setVisible(true);
                pathLabel.setVisible(true);
                backLabel.setVisible(true);
            }
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(FilesUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex)
        {
            Logger.getLogger(FilesUI.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_saveEditsButtonMouseClicked

    private void cancelFileEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelFileEditMouseClicked
        // TODO add your handling code here:
        
        jPanel1.setVisible(true);
        filePanel.setVisible(true);
        jLabel6.setVisible(true);
        userNameLabel.setVisible(true);
        jLabel8.setVisible(true);
        pathLabel.setVisible(true);
        backLabel.setVisible(true);
        
        editFilePanel.setVisible(false);
        
    }//GEN-LAST:event_cancelFileEditMouseClicked

    
    
    private void cancelNameDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelNameDialogButtonActionPerformed
        // TODO add your handling code here:
        nameDialog.setVisible(false);
        filePanel.setVisible(true);
        newNameDialogLabel.setText("");
   
    }//GEN-LAST:event_cancelNameDialogButtonActionPerformed

    private void saveNameDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNameDialogButtonActionPerformed
        try 
        {
            String newName = newNameDialogLabel.getText();
            String oldName = Storage.getInstance().loadFileName(newNameDialogLabel.getName());
            if(AbstractFile.editFileName(oldName , newName , newNameDialogLabel.getName() , pathLabel.getName()))
            {
                nameDialog.setVisible(false);
                filePanel.setVisible(true); 
                newNameDialogLabel.setText("");
            }
        
            
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(FilesUI.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
    }//GEN-LAST:event_saveNameDialogButtonActionPerformed

    private void nameDialogWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_nameDialogWindowClosing
        
        nameDialog.setVisible(false);
        filePanel.setVisible(true);
        newNameDialogLabel.setText("");
    }//GEN-LAST:event_nameDialogWindowClosing

    private void uploadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileButtonActionPerformed
        // TODO add your handling code here:
        
        JFileChooser j = new JFileChooser(); 
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        j.showSaveDialog(null);

        if(j.getSelectedFile() == null)
            return;
        File selectedFile = j.getSelectedFile();
        
        String name = selectedFile.getName().substring(0, selectedFile.getName().indexOf("."));
        String randomID = UUID.randomUUID().toString();
        String parentFolderID = pathLabel.getName();
        String url = "";
        String date = Folder.dateFormat.format(new Date()).toString();
        String uploadPath = selectedFile.getAbsolutePath();
        AbstractFile absFile = null;
        

        try
        {
            ResultSet conatinerIDs = Storage.getInstance().loadContainerUsingFileName(name);
            while(conatinerIDs.next())
            {
                if(parentFolderID.equals(conatinerIDs.getString("container_id")))
                {
                    Toast t = new Toast("Current folder has file with same name!" , 495 , 505);
                    t.showtoast();
                    return;
                }
            }

            if(selectedFile.getAbsolutePath().endsWith(".mp4"))
                absFile = AbstractFileFactory.getInstance().getFile(FileType.VIDEO , randomID , name , parentFolderID , date , url);
              
            else if(selectedFile.getAbsolutePath().endsWith(".txt"))
                absFile = AbstractFileFactory.getInstance().getFile(FileType.TEXT , randomID , name , parentFolderID , date , url);
           
            else if(selectedFile.getAbsolutePath().endsWith(".pdf"))
                absFile = AbstractFileFactory.getInstance().getFile(FileType.PDF , randomID , name , parentFolderID , date , url);
           
            else if(selectedFile.getAbsolutePath().endsWith(".png"))
                absFile = AbstractFileFactory.getInstance().getFile(FileType.IMAGE , randomID , name , parentFolderID , date , url);
            
            else 
            {
                Toast t = new Toast("File type not supported" , 495 , 505);
                t.showtoast();
                return;
            }
            
            absFile.upload(uploadPath);               
        }
        catch (Exception ex) 
        {
            Logger.getLogger(FilesUI.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_uploadFileButtonActionPerformed

    
    public static void displayEditNameDialog(String fileID)
    {
        nameDialog.setVisible(true);
        filePanel.setVisible(false);
        newNameDialogLabel.setName(fileID);
    }
    
    public static void displayContents(String contents , String fileID) throws IOException, SQLException
    {   	
        editFilePanel.setVisible(true);
        
        jPanel1.setVisible(false);
        filePanel.setVisible(false);
        jLabel6.setVisible(false);
        userNameLabel.setVisible(false);
        jLabel8.setVisible(false);
        pathLabel.setVisible(false);
        backLabel.setVisible(false);
       
        contentArea1.setText(contents);
        fileNameFieldEdit.setText(Storage.getInstance().loadFileName(fileID));
        fileNameFieldEdit.setName(fileID);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel backLabel;
    private javax.swing.JLabel cancelFileCreate;
    private javax.swing.JLabel cancelFileEdit;
    private javax.swing.JButton cancelNameDialogButton;
    public static javax.swing.JTextArea contentArea;
    public static javax.swing.JTextArea contentArea1;
    private javax.swing.JButton createFileButton;
    public static javax.swing.JPanel createFilePanel;
    public static javax.swing.JPanel editFilePanel;
    private javax.swing.JTextField fileNameField;
    public static javax.swing.JTextField fileNameFieldEdit;
    public static javax.swing.JPanel filePanel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JDialog nameDialog;
    public static javax.swing.JTextField newNameDialogLabel;
    public static javax.swing.JLabel pathLabel;
    public static javax.swing.JButton saveButton;
    public static javax.swing.JButton saveEditsButton;
    private javax.swing.JButton saveNameDialogButton;
    private javax.swing.JLabel updateInfo;
    private javax.swing.JButton uploadFileButton;
    public static javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}