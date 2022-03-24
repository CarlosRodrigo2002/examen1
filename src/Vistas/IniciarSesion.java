package Vistas;

import java.awt.Color;

public class IniciarSesion extends javax.swing.JFrame {
    public IniciarSesion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        citybg = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        loginBtnTxt = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        userTxt = new javax.swing.JFormattedTextField();
        loginBtn = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setAlignmentX(0.0F);
        bg.setAlignmentY(0.0F);
        bg.setMaximumSize(new java.awt.Dimension(800, 400));
        bg.setMinimumSize(new java.awt.Dimension(800, 400));
        bg.setPreferredSize(new java.awt.Dimension(800, 400));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });

        citybg.setBackground(new java.awt.Color(255, 255, 255));
        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda.png"))); // NOI18N

        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N

        header.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        header.setText("FMOcc");

        loginBtnTxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginBtnTxt.setText("INICIAR SESION");

        userLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        userLabel.setText("Usuario");

        passLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        passLabel.setText("Contraseña");

        passTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passTxt.setForeground(new java.awt.Color(109, 109, 109));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });

        userTxt.setBorder(null);
        userTxt.setForeground(new java.awt.Color(109, 109, 109));
        userTxt.setText("Ingrese su nombre de usuario");
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));
        loginBtn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N

        loginTxt.setBackground(new java.awt.Color(255, 255, 255));
        loginTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        loginTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTxt.setText("Entrar");
        loginTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(userTxt)
                    .addComponent(passTxt)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(favicon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(header))
                    .addComponent(loginBtnTxt)
                    .addComponent(userLabel)
                    .addComponent(passLabel)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(citybg)
                .addGap(44, 44, 44))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(favicon)
                            .addComponent(header))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtnTxt)
                        .addGap(18, 18, 18)
                        .addComponent(userLabel)
                        .addGap(5, 5, 5)
                        .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(citybg, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked
int xx,xy;
    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_bgMouseDragged

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // TODO add your handling code here:
        exitBtn.setBackground(Color.red);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // TODO add your handling code here:
        exitBtn.setBackground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseEntered
        // TODO add your handling code here:
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginTxtMouseEntered

    private void loginTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseExited
        // TODO add your handling code here:
        loginBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_loginTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        // TODO add your handling code here:
        if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        // TODO add your handling code here:
       if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
       }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    private void loginTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginTxtMouseClicked
       javax.swing.JOptionPane.showMessageDialog(this, "Datos del login:\nUsuario: " + userTxt.getText() + "\nContraseña: " + String.valueOf(passTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginTxtMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IniciarSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JLabel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel userLabel;
    private javax.swing.JFormattedTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
