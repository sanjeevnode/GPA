
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author shivamkumar
 */
public class show extends javax.swing.JFrame {

    /**
     * Creates new form show
     */
    private boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;

    public show() {
        initComponents();
        b1 = true;
        b2 = true;
        b3 = true;
        b4 = true;
        b5 = true;
        b6 = true;
        b7 = true;
        b8 = true;
        b9 = true;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("show");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56, 176, 0), 3));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(null);

        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });
        jPanel1.add(B4);
        B4.setBounds(20, 190, 120, 120);

        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B5.setEnabled(false);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        jPanel1.add(B5);
        B5.setBounds(140, 190, 120, 120);

        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });
        jPanel1.add(B6);
        B6.setBounds(260, 190, 120, 120);

        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });
        jPanel1.add(B7);
        B7.setBounds(20, 310, 120, 120);

        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });
        jPanel1.add(B8);
        B8.setBounds(140, 310, 120, 120);

        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });
        jPanel1.add(B9);
        B9.setBounds(260, 310, 120, 120);

        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });
        jPanel1.add(B1);
        B1.setBounds(20, 70, 120, 120);

        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });
        jPanel1.add(B2);
        B2.setBounds(140, 70, 120, 120);

        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });
        jPanel1.add(B3);
        B3.setBounds(260, 70, 120, 120);
        jPanel1.add(l3);
        l3.setBounds(20, 70, 360, 360);

        back.setBackground(new java.awt.Color(56, 176, 0));
        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(460, 140, 100, 40);

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 210, 100, 40);

        jButton1.setBackground(new java.awt.Color(56, 176, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 280, 100, 40);

        jPanel2.setBackground(new java.awt.Color(56, 176, 0));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("Select Pattern");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 600, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        SetPassword.imagelist = "";
        SetPassword.blocklist = "";
        if (SetPassword.s.empty()) {
            SetPassword.layer1flag = true;
            SetPassword.layer2flag = true;
            SetPassword.layer3flag = true;

        }
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        // TODO add your handling code here:
        if (b1) {
            B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "1,";
            b1 = false;
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_B1MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
        // TODO add your handling code here:
        if (b8) {
            B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "8,";
            b8 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B8MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));

        SetPassword.blocklist = "";
            b1 = true;
        b2 = true;
        b3 = true;
        b4 = true;
        b5 = true;
        b6 = true;
        b7 = true;
        b8 = true;
        b9 = true;



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SetPassword.s.add(SetPassword.layerlist);
        SetPassword.s.add(SetPassword.imagelist);
        SetPassword.s.add(SetPassword.blocklist);
        SetPassword.layerlist = "";
        SetPassword.imagelist = "";
        SetPassword.blocklist = "";
        SetPassword.L1next.setEnabled(true);
        SetPassword.L2next.setEnabled(true);
        SetPassword.L3finish.setEnabled(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        // TODO add your handling code here:
        if (b2) {
            B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "2,";
            b2 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        // TODO add your handling code here:
        if (b3) {
            B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "3,";
            b3 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        // TODO add your handling code here:
        if (b4) {
            B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "4,";
            b4 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
        if (b5) {
            B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "5,";
            b5 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        // TODO add your handling code here:
        if (b6) {
            B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "6,";
            b6 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        // TODO add your handling code here:
        if (b7) {
            B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "7,";
            b7 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B7MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        // TODO add your handling code here:
        if (b9) {
            B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(56,176,0), 3));
            SetPassword.blocklist += "9,";
            b9 = false;
        } else
            evt.consume();
    }//GEN-LAST:event_B9MouseClicked

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
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables
}
