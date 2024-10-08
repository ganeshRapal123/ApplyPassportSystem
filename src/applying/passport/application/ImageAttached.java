/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package applying.passport.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JFileChooser;



/**
 *
 * @author gxrcr
 */
public class ImageAttached extends javax.swing.JFrame {
private final String passportNumber;
	
	public ImageAttached() {
		passportNumber = generateRandomPassportNumber(); 
        
		initComponents();
	}
	private String generateRandomPassportNumber() {
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(90000000) + 10000000;
        return "PP" + randomNumber;
    }
	private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/passport";
        String username = "root";
        String password = "yes";

        return DriverManager.getConnection(url, username, password);
    }
	private void insertImageIntoDatabase(File imageFile) {
        String query = "INSERT INTO pass (image) VALUES (?)"; // Adjust the table and column names as needed

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            FileInputStream inputStream = new FileInputStream(imageFile);
            preparedStatement.setBinaryStream(1, inputStream, (int) imageFile.length());
            preparedStatement.executeUpdate();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    
    private String generatePassportIssueDate() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
    Date date = new Date();
    return sdf.format(date);
    }

    private void saveDataToFile(String passportNumber, String issueDate) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("information.txt", true))) {
            
	    writer.write("Passport Number: " + passportNumber);
            writer.newLine();
            writer.write("Passport Issue Date: " + issueDate);
            writer.newLine();
            writer.write("-------------------------------");
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while saving the data.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jDesktopPane1 = new javax.swing.JDesktopPane();
                jLabel2 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jLabel5 = new javax.swing.JLabel();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Image Document ");

                jLabel2.setText("FrontPage of Citizenship");

                jButton1.setText("Upload");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel3.setText("Back Page Of Citizenship");

                jButton2.setText("Upload ");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel4.setText("Front Page of NID");

                jButton3.setText("Upload");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel5.setText("Back Page Of NID");

                jButton4.setText("Upload");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setBackground(new java.awt.Color(0, 255, 0));
                jButton5.setText("Apply");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton6.setText("Previous");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
                jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

                javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
                jDesktopPane1.setLayout(jDesktopPane1Layout);
                jDesktopPane1Layout.setHorizontalGroup(
                        jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jButton6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addComponent(jLabel5))
                                                        .addGap(56, 56, 56)
                                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButton3)
                                                                .addComponent(jButton1)
                                                                .addComponent(jButton2)
                                                                .addComponent(jButton4)))))
                                .addContainerGap(84, Short.MAX_VALUE))
                );
                jDesktopPane1Layout.setVerticalGroup(
                        jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jButton1))
                                                .addGap(34, 34, 34)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jButton2))
                                                .addGap(28, 28, 28)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton3)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4))
                                        .addComponent(jLabel5))
                                .addGap(37, 37, 37)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5)
                                        .addComponent(jButton6))
                                .addGap(0, 33, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDesktopPane1)
                                .addGap(12, 12, 12))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                
                                JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        JOptionPane.showMessageDialog(this, "Front Page of NID Uploaded: " + selectedFile.getName(), "Image Uploaded", JOptionPane.INFORMATION_MESSAGE);
        
        insertImageIntoDatabase(selectedFile); 
        jButton4.setText("Uploaded");
        jButton4.setBackground(Color.BLUE); 
    }
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
                  JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        JOptionPane.showMessageDialog(this, "Front Page of NID Uploaded: " + selectedFile.getName(), "Image Uploaded", JOptionPane.INFORMATION_MESSAGE);
        insertImageIntoDatabase(selectedFile); 
        
        jButton3.setText("Uploaded");
        jButton3.setBackground(Color.BLUE); 
    }
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                
 JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        JOptionPane.showMessageDialog(this, "Back Page of Citizenship Uploaded: " + selectedFile.getName(), "Image Uploaded", JOptionPane.INFORMATION_MESSAGE);
        
        insertImageIntoDatabase(selectedFile); 
        jButton2.setText("Uploaded");
        jButton2.setBackground(Color.BLUE); 
    }
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        
        JOptionPane.showMessageDialog(this, "Front Page of Citizenship Uploaded: " + selectedFile.getName(), "Image Uploaded", JOptionPane.INFORMATION_MESSAGE);
        
         insertImageIntoDatabase(selectedFile);
        jButton1.setText("Uploaded");
        jButton1.setBackground(Color.BLUE);
    }
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                
		NewApplication3 HomePageFrame = new NewApplication3();
    HomePageFrame.setVisible(true);

    
    this.dispose();
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                // TODO add your handling code here:
	 String passportNumber = generateRandomPassportNumber();

        // Generate the passport issue date as a timestamp
        String issueDate = generatePassportIssueDate();

        // Save the data to "information.txt"
        saveDataToFile(passportNumber, issueDate);

        // Display a message with the generated passport number
        JOptionPane.showMessageDialog(this, "Passport Application submitted.\nPassport Number: " + passportNumber, "Success", JOptionPane.INFORMATION_MESSAGE);
		HomePage HomePageFrame = new HomePage();
    HomePageFrame.setVisible(true);

        // Close the current frame
        this.dispose();	
        }//GEN-LAST:event_jButton5ActionPerformed

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
			java.util.logging.Logger.getLogger(ImageAttached.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ImageAttached.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ImageAttached.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ImageAttached.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ImageAttached().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JDesktopPane jDesktopPane1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        // End of variables declaration//GEN-END:variables
}
