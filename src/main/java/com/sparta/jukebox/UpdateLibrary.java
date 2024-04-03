/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sparta.jukebox;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author frednyakagwa
 */
public class UpdateLibrary extends javax.swing.JFrame {

    /**
     * UpdateLibrary constructor
     */
    public UpdateLibrary() {
        initComponents();
        allTracksTextArea.setText(LibraryData.listAll());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        allTracksTextArea = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        trackNoTxtFld = new java.awt.TextField();
        checkTrackBtn = new javax.swing.JButton();
        exitPlaylistBtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ratingComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("All Tracks");

        allTracksTextArea.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                allTracksTextAreaComponentShown(evt);
            }
        });

        jLabel1.setText("Enter new rating:");

        trackNoTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackNoTxtFldActionPerformed(evt);
            }
        });

        checkTrackBtn.setText("Update Track");
        checkTrackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTrackBtnActionPerformed(evt);
            }
        });

        exitPlaylistBtn1.setText("Exit");
        exitPlaylistBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitPlaylistBtn1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Track Number to Rate:");

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        ratingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(allTracksTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(trackNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkTrackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitPlaylistBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allTracksTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trackNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkTrackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitPlaylistBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(281, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(132, 132, 132)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allTracksTextAreaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_allTracksTextAreaComponentShown
        // TODO add your handling code here:
        //allTracksTextArea.setText("No tracks");
    }//GEN-LAST:event_allTracksTextAreaComponentShown

    private void trackNoTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackNoTxtFldActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_trackNoTxtFldActionPerformed

    private void checkTrackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTrackBtnActionPerformed
        // TODO add your handling code here:
        // Get the selected track number from the JTextField
          String selectedTrackNumber = trackNoTxtFld.getText();
          String selectedOption = (String) ratingComboBox.getSelectedItem();
         
          int selectedFromComboBoxRating = Integer.parseInt(selectedOption);
          
          String name = LibraryData.getName(selectedTrackNumber);
            if (name == null) {
                //Inavlid track number dialog box
                JOptionPane.showMessageDialog(null, "Invalid track number!", "Error", JOptionPane.ERROR_MESSAGE);

                 System.out.println(selectedFromComboBoxRating);
            } else {
                //LibraryData.getTrackByTrackNumber(selectedTrackNumber);
                JOptionPane.showMessageDialog(null, LibraryData.getTrackByTrackNumber(selectedTrackNumber, selectedFromComboBoxRating), "Track updated!", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
        
    }//GEN-LAST:event_checkTrackBtnActionPerformed

    private void exitPlaylistBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitPlaylistBtn1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitPlaylistBtn1ActionPerformed

    private void ratingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) ratingComboBox.getSelectedItem();
         //label.setText("Selected Option: " + selectedOption);
        
    }//GEN-LAST:event_ratingComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateLibrary().setVisible(true);
            }
        });
    }
    
    //int[] items = {1, 2, 3, 4, 5};
    //ratingComboBox = items;
    
    //String[] items = LibraryData.getAllArtists();
    //JComboBox<String> comboBox = new JComboBox<>(items);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea allTracksTextArea;
    private javax.swing.JButton checkTrackBtn;
    private javax.swing.JButton exitPlaylistBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> ratingComboBox;
    private java.awt.TextField trackNoTxtFld;
    // End of variables declaration//GEN-END:variables
}
