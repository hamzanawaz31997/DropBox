/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dropbox.GUI;

import dropbox.Authentication;
import dropbox.Toast;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aiman Nawaz
 */
public class UpdateAccountInfoUI extends javax.swing.JPanel {

    /**
     * Creates new form UpdateAccountInfoUI
     */
    public UpdateAccountInfoUI() {
        initComponents();
        userNameLabel.setText(Authentication.online_user.getUserName());
        usernamePlaceholder.setText(Authentication.online_user.getUserName());
        emailPlaceholder.setText(Authentication.online_user.getEmail());
        passwordPLaceholder.setText(Authentication.online_user.getPassword());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        newInfoDialog = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelDialog = new javax.swing.JButton();
        updateDialog = new javax.swing.JButton();
        passwordDialog = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        filesLabel = new javax.swing.JLabel();
        updateInfo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernamePlaceholder = new javax.swing.JLabel();
        editUserName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        emailPlaceholder = new javax.swing.JLabel();
        editEmail = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        passwordPLaceholder = new javax.swing.JLabel();
        editPassword = new javax.swing.JLabel();

        jDialog1.setTitle("Change your information");
        jDialog1.setBackground(new java.awt.Color(246, 249, 252));
        jDialog1.setMaximumSize(new java.awt.Dimension(300, 280));
        jDialog1.setMinimumSize(new java.awt.Dimension(300, 280));
        jDialog1.setPreferredSize(new java.awt.Dimension(300, 280));
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog1WindowClosing(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("New Info");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Current Password");

        cancelDialog.setBackground(new java.awt.Color(0, 97, 240));
        cancelDialog.setForeground(new java.awt.Color(255, 255, 255));
        cancelDialog.setText("Cancel");
        cancelDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDialogActionPerformed(evt);
            }
        });

        updateDialog.setBackground(new java.awt.Color(0, 97, 240));
        updateDialog.setForeground(new java.awt.Color(255, 255, 255));
        updateDialog.setText("Update");
        updateDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(updateDialog)
                        .addGap(18, 18, 18)
                        .addComponent(cancelDialog))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newInfoDialog, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordDialog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(newInfoDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(passwordDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelDialog)
                    .addComponent(updateDialog))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(247, 249, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/dropbox_logo.PNG"))); // NOI18N

        homeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeLabel.setText("Home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
        });

        filesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filesLabel.setText("Files");
        filesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filesLabelMouseClicked(evt);
            }
        });

        updateInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateInfo.setForeground(new java.awt.Color(102, 153, 255));
        updateInfo.setText("Update Info");

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
                            .addComponent(filesLabel)
                            .addComponent(updateInfo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(filesLabel)
                .addGap(18, 18, 18)
                .addComponent(updateInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Update Info");

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLabel.setText("Username ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/avatar_profile_photo.PNG"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(200, 200, 200));
        jLabel9.setText("______________________________________________________________________");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dropbox/images/footer.PNG"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Username");

        jLabel11.setForeground(new java.awt.Color(200, 200, 200));
        jLabel11.setText("______________________________________________________________________");

        usernamePlaceholder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernamePlaceholder.setText("jLabel7");

        editUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editUserName.setForeground(new java.awt.Color(102, 153, 255));
        editUserName.setText("Edit");
        editUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUserNameMouseClicked(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(200, 200, 200));
        jLabel13.setText("______________________________________________________________________");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Email");

        emailPlaceholder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emailPlaceholder.setText("jLabel15");

        editEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editEmail.setForeground(new java.awt.Color(102, 153, 255));
        editEmail.setText("Edit");
        editEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Password");

        passwordPLaceholder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordPLaceholder.setText("jLabel18");

        editPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editPassword.setForeground(new java.awt.Color(102, 153, 255));
        editPassword.setText("Edit");
        editPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(userNameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernamePlaceholder)
                        .addGap(38, 38, 38)
                        .addComponent(editUserName)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(emailPlaceholder)
                                .addGap(40, 40, 40)
                                .addComponent(editEmail)
                                .addGap(142, 142, 142))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordPLaceholder)
                                .addGap(41, 41, 41)
                                .addComponent(editPassword)
                                .addGap(143, 143, 143))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70)
                .addComponent(jLabel9)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernamePlaceholder)
                    .addComponent(editUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(emailPlaceholder)
                    .addComponent(editEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(passwordPLaceholder)
                    .addComponent(editPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserNameMouseClicked
        // TODO add your handling code here:
        
        dialogType = 0;
        jDialog1.setVisible(true);
        jDialog1.setLocation(320, 180);
        jDialog1.setAlwaysOnTop(true);
        editEmail.setVisible(false);
        editUserName.setVisible(false);
        editPassword.setVisible(false);
        emailPlaceholder.setVisible(false);
        passwordPLaceholder.setVisible(false);
        usernamePlaceholder.setVisible(false);
        
              
        
    }//GEN-LAST:event_editUserNameMouseClicked

    private void editEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailMouseClicked
        // TODO add your handling code here:
        dialogType = 1;
        jDialog1.setVisible(true);
        jDialog1.setLocation(320, 180);
        jDialog1.setAlwaysOnTop(true);
        editEmail.setVisible(false);
        editUserName.setVisible(false);
        editPassword.setVisible(false);
        emailPlaceholder.setVisible(false);
        passwordPLaceholder.setVisible(false);
        usernamePlaceholder.setVisible(false);
        
    }//GEN-LAST:event_editEmailMouseClicked

    private void editPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPasswordMouseClicked
        // TODO add your handling code here:
        dialogType = 2;
        jDialog1.setVisible(true);
        jDialog1.setLocation(320, 180);
        jDialog1.setAlwaysOnTop(true);
        editEmail.setVisible(false);
        editUserName.setVisible(false);
        editPassword.setVisible(false);
        emailPlaceholder.setVisible(false);
        passwordPLaceholder.setVisible(false);
        usernamePlaceholder.setVisible(false);
    }//GEN-LAST:event_editPasswordMouseClicked

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        GUI.getForm().loadPanel("profile");
    }//GEN-LAST:event_homeLabelMouseClicked

    private void filesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesLabelMouseClicked
        // TODO add your handling code here:
        GUI.getForm().loadPanel("files");
       
    }//GEN-LAST:event_filesLabelMouseClicked

    private void updateDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDialogActionPerformed
        // TODO add your handling code here:
        
        
        if(dialogType == 0)
        {   try {
            //username
            if(Authentication.online_user.updateUserName(newInfoDialog.getText() , new String(passwordDialog.getPassword())))
            {
                editEmail.setVisible(true);
                editUserName.setVisible(true);
                editPassword.setVisible(true);
                emailPlaceholder.setVisible(true);
                passwordPLaceholder.setVisible(true);
                usernamePlaceholder.setVisible(true);
                jDialog1.setVisible(false);
                userNameLabel.setText(Authentication.online_user.getUserName());
                newInfoDialog.setText("");
                passwordDialog.setText("");
                usernamePlaceholder.setText(Authentication.online_user.getUserName());
                dialogType = -1;
            }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateAccountInfoUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(dialogType == 1)
        {
            try {
                //email
                
                if(Authentication.online_user.updateEmail(newInfoDialog.getText() , new String(passwordDialog.getPassword())))
                {
                    editEmail.setVisible(true);
                    editUserName.setVisible(true);
                    editPassword.setVisible(true);
                    emailPlaceholder.setVisible(true);
                    passwordPLaceholder.setVisible(true);
                    usernamePlaceholder.setVisible(true);
                    jDialog1.setVisible(false);
                    emailPlaceholder.setText(Authentication.online_user.getEmail());
                    newInfoDialog.setText("");
                    passwordDialog.setText("");
                    dialogType = -1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateAccountInfoUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(dialogType == 2)
        {
            try {
                //password
                if(Authentication.online_user.updatePassword(newInfoDialog.getText() , new String(passwordDialog.getPassword())))
                {
                    
                    editEmail.setVisible(true);
                    editUserName.setVisible(true);
                    editPassword.setVisible(true);
                    emailPlaceholder.setVisible(true);
                    passwordPLaceholder.setVisible(true);
                    usernamePlaceholder.setVisible(true);
                    jDialog1.setVisible(false);
                    passwordPLaceholder.setText(Authentication.online_user.getPassword());
                    newInfoDialog.setText("");
                    passwordDialog.setText("");
                    dialogType = -1;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateAccountInfoUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }//GEN-LAST:event_updateDialogActionPerformed

    private void cancelDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDialogActionPerformed
        // TODO add your handling code here:
        editEmail.setVisible(true);
        editUserName.setVisible(true);
        editPassword.setVisible(true);
        emailPlaceholder.setVisible(true);
        passwordPLaceholder.setVisible(true);
        usernamePlaceholder.setVisible(true);
        jDialog1.setVisible(false);
        newInfoDialog.setText("");
        passwordDialog.setText("");
        dialogType = -1;
    }//GEN-LAST:event_cancelDialogActionPerformed

    private void jDialog1WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowClosing
        // TODO add your handling code here:
        editEmail.setVisible(true);
        editUserName.setVisible(true);
        editPassword.setVisible(true);
        emailPlaceholder.setVisible(true);
        passwordPLaceholder.setVisible(true);
        usernamePlaceholder.setVisible(true);
        newInfoDialog.setText("");
        passwordDialog.setText("");
        dialogType = -1;
    }//GEN-LAST:event_jDialog1WindowClosing

    
int dialogType;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelDialog;
    private javax.swing.JLabel editEmail;
    private javax.swing.JLabel editPassword;
    private javax.swing.JLabel editUserName;
    private javax.swing.JLabel emailPlaceholder;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newInfoDialog;
    private javax.swing.JPasswordField passwordDialog;
    private javax.swing.JLabel passwordPLaceholder;
    private javax.swing.JButton updateDialog;
    private javax.swing.JLabel updateInfo;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel usernamePlaceholder;
    // End of variables declaration//GEN-END:variables
}
