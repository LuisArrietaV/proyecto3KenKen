
package com.mycompany.programa2kenken;

/**
 * JFrame Form llamado menuPrincipal utilizado para poder jugar una partida del kenken, cambiar su configuración, ver 
 * información acerca del programa, y salir del programa
 * @author Luis Arrieta Víquez
 */
public class menuPrincipal extends javax.swing.JFrame {

    
    private Configuraciones configurar;
    
    
    /**
     * Inicializa los componentes del JFrameForm menuPrincipal y lo centra en la pantalla
     */
    public menuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonJugar = new javax.swing.JButton();
        botonConfigurar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Programa 2 KenKen");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 30, 250, 28);

        botonJugar.setBackground(new java.awt.Color(255, 255, 0));
        botonJugar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonJugar.setText("Jugar");
        botonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonJugarMousePressed(evt);
            }
        });
        jPanel1.add(botonJugar);
        botonJugar.setBounds(180, 120, 150, 30);

        botonConfigurar.setBackground(new java.awt.Color(204, 0, 255));
        botonConfigurar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonConfigurar.setText("Configurar");
        botonConfigurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonConfigurarMousePressed(evt);
            }
        });
        botonConfigurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfigurarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConfigurar);
        botonConfigurar.setBounds(180, 190, 150, 30);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Acerca de");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 260, 150, 30);

        botonSalir.setBackground(new java.awt.Color(255, 0, 0));
        botonSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir);
        botonSalir.setBounds(180, 350, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton utilizado para mostrar el JFrame Form de interfazKenKen, y poder
     * jugar una partida, y se oculta este JFrame Form
     * @param evt 
     */
    private void botonJugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJugarMousePressed
        interfazKenKen interfaz = new interfazKenKen();
        this.setVisible(false);
        interfaz.setVisible(true);
    }//GEN-LAST:event_botonJugarMousePressed

    /**
     * Boton que muestra el JFram Form Configuraciones para cambiar
     * las configuraciones del jeugo
     * @param evt 
     */
    private void botonConfigurarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfigurarMousePressed
        if(configurar != null) {
            configurar.setVisible(true);
        } else {
            configurar = new Configuraciones();
            configurar.setVisible(true);
        }
    }//GEN-LAST:event_botonConfigurarMousePressed

    private void botonConfigurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfigurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfigurarActionPerformed

    /**
     * Boton que muestra el JFrame Form llamado: "acercaDe", para ver
     * información acerca del programa, y se oculta este JFrame Form
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acercaDe acerca = new acercaDe();
        this.setVisible(false);
        acerca.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Boton para salir del programa
     * @param evt 
     */
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfigurar;
    private javax.swing.JButton botonJugar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
