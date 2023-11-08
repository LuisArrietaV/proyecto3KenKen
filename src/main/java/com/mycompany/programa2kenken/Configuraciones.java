
package com.mycompany.programa2kenken;

/**
 * 
 * Jframe Form que tiene las configuraciones a elegir para el programa KenKen
 * @author Luis Arrieta Viquez
 * 
 */

public class Configuraciones extends javax.swing.JFrame {

    
    //private Tablero tableroKenken;
    public static boolean dificultadFacil = true;
    public static boolean dificultadIntermedio = false;
    public static boolean dificultadDificil = false;
    public static boolean relojCronometro = true;
    public static boolean relojTimer = false;
    public static boolean panelDerecha = true;
    public static boolean panelIzquierda = false;
    public static boolean escucharSonido = true;

    
    
    /**
     * Inicializa el JFrame Form y lo centra en la pantalla
     */
    public Configuraciones() {
        initComponents();
        this.setTitle("Configuraciones");
        setLocationRelativeTo(null);
        if(dificultadFacil == true) {
            botonFacil1.setBorderPainted(true);
            botonIntermedio.setBorderPainted(false);
            botonDificil.setBorderPainted(false);
        }
        if(dificultadIntermedio == true) {
            botonFacil1.setBorderPainted(false);
            botonIntermedio.setBorderPainted(true);
            botonDificil.setBorderPainted(false);
        }
        if(dificultadDificil == true) {
            botonFacil1.setBorderPainted(false);
            botonIntermedio.setBorderPainted(false);
            botonDificil.setBorderPainted(true);
        }
        if (relojCronometro == true) {
            botonCronometro.setBorderPainted(true);
            botonTimer.setBorderPainted(false);
            botonNoUtilizarReloj.setBorderPainted(false);
        }
        if (relojTimer == true) {
            botonCronometro.setBorderPainted(false);
            botonTimer.setBorderPainted(true);
            botonNoUtilizarReloj.setBorderPainted(false);
        }
        if (relojCronometro == false && relojTimer == false) {
            botonCronometro.setBorderPainted(false);
            botonTimer.setBorderPainted(false);
            botonNoUtilizarReloj.setBorderPainted(true);
        }
        if (panelDerecha == true) {
            botonDerecha.setBorderPainted(true);
            botonIzquierda.setBorderPainted(false);
        }
        if (panelIzquierda == true) {
            botonDerecha.setBorderPainted(false);
            botonIzquierda.setBorderPainted(true);
        }
        if (escucharSonido == true) {
            botonSiEscuchar.setBorderPainted(true);
            botonNoEscuchar.setBorderPainted(false);
        }
        if (escucharSonido == false) {
            botonSiEscuchar.setBorderPainted(false);
            botonNoEscuchar.setBorderPainted(true);
        }
        //this.tableroKenken = tableroKenken;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        labelConfiguracion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonIntermedio = new javax.swing.JButton();
        botonDificil = new javax.swing.JButton();
        botonFacil1 = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonCronometro = new javax.swing.JButton();
        botonTimer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonNoUtilizarReloj = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonSiEscuchar = new javax.swing.JButton();
        botonNoEscuchar = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        labelConfiguracion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelConfiguracion.setText("Configuraciones");
        jPanel1.add(labelConfiguracion);
        labelConfiguracion.setBounds(200, 20, 210, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("1. Nivel de dificultad:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 90, 170, 17);

        botonIntermedio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonIntermedio.setText("Intermedio");
        botonIntermedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonIntermedio.setBorderPainted(false);
        botonIntermedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIntermedioMousePressed(evt);
            }
        });
        jPanel1.add(botonIntermedio);
        botonIntermedio.setBounds(280, 120, 110, 22);

        botonDificil.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonDificil.setText("Difícil");
        botonDificil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonDificil.setBorderPainted(false);
        botonDificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDificilMousePressed(evt);
            }
        });
        jPanel1.add(botonDificil);
        botonDificil.setBounds(400, 120, 100, 20);

        botonFacil1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonFacil1.setText("Fácil");
        botonFacil1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonFacil1.setBorderPainted(false);
        botonFacil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonFacil1MousePressed(evt);
            }
        });
        botonFacil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacil1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonFacil1);
        botonFacil1.setBounds(180, 120, 90, 20);

        botonRegresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRegresarMousePressed(evt);
            }
        });
        jPanel1.add(botonRegresar);
        botonRegresar.setBounds(20, 460, 110, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("2. Reloj:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 180, 60, 16);

        botonCronometro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCronometro.setText("Cronómetro");
        botonCronometro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonCronometro.setBorderPainted(false);
        botonCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCronometroActionPerformed(evt);
            }
        });
        jPanel1.add(botonCronometro);
        botonCronometro.setBounds(180, 200, 120, 18);

        botonTimer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonTimer.setText("Timer");
        botonTimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonTimer.setBorderPainted(false);
        botonTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTimerActionPerformed(evt);
            }
        });
        jPanel1.add(botonTimer);
        botonTimer.setBounds(330, 200, 120, 18);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("3.Posición del panel de números y el borrador:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 260, 350, 16);

        botonNoUtilizarReloj.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonNoUtilizarReloj.setText("No");
        botonNoUtilizarReloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonNoUtilizarReloj.setBorderPainted(false);
        botonNoUtilizarReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNoUtilizarRelojActionPerformed(evt);
            }
        });
        jPanel1.add(botonNoUtilizarReloj);
        botonNoUtilizarReloj.setBounds(480, 200, 90, 18);

        botonDerecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonDerecha.setText("Derecha");
        botonDerecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonDerecha.setBorderPainted(false);
        botonDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(botonDerecha);
        botonDerecha.setBounds(330, 300, 120, 22);

        botonIzquierda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonIzquierda.setText("Izquierda");
        botonIzquierda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonIzquierda.setBorderPainted(false);
        botonIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(botonIzquierda);
        botonIzquierda.setBounds(180, 300, 120, 18);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("4. Sonido cuando termina el juego exitosamente:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 350, 380, 17);

        botonSiEscuchar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonSiEscuchar.setText("Sí");
        botonSiEscuchar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonSiEscuchar.setBorderPainted(false);
        botonSiEscuchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiEscucharActionPerformed(evt);
            }
        });
        jPanel1.add(botonSiEscuchar);
        botonSiEscuchar.setBounds(180, 390, 120, 18);

        botonNoEscuchar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonNoEscuchar.setText("No");
        botonNoEscuchar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        botonNoEscuchar.setBorderPainted(false);
        botonNoEscuchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNoEscucharActionPerformed(evt);
            }
        });
        jPanel1.add(botonNoEscuchar);
        botonNoEscuchar.setBounds(340, 390, 110, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton que al presionarlo se indica que se va a jugar en la dificultad fácil
     * @param evt 
     */
    private void botonFacil1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFacil1MousePressed
        dificultadFacil = true;
        dificultadIntermedio = false;
        dificultadDificil = false;
        botonFacil1.setBorderPainted(true);
        botonIntermedio.setBorderPainted(false);
        botonDificil.setBorderPainted(false);
        //tableroKenken.generarKenKen();
    }//GEN-LAST:event_botonFacil1MousePressed

    /**
     * Boton que al presionarlo, esconde este Jframe form, y se regresa al del menú principal
     * @param evt 
     */
    private void botonRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresarMousePressed

    
    private void botonFacil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFacil1ActionPerformed

    
    /**
     * Boton que al presionarlo, se indica que se va a jugar en la dificultad intermedio
     * @param evt 
     */
    private void botonIntermedioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIntermedioMousePressed
        dificultadFacil = false;
        dificultadIntermedio = true;
        dificultadDificil = false;
        botonFacil1.setBorderPainted(false);
        botonIntermedio.setBorderPainted(true);
        botonDificil.setBorderPainted(false);
        //tableroKenken.generarKenKen();
    }//GEN-LAST:event_botonIntermedioMousePressed

    /**
     * Boton que al presionarlo, se indicia que se va a jugar en la dificultad difícil
     * @param evt 
     */
    private void botonDificilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDificilMousePressed
        dificultadFacil = false;
        dificultadIntermedio = false;
        dificultadDificil = true;
        botonFacil1.setBorderPainted(false);
        botonIntermedio.setBorderPainted(false);
        botonDificil.setBorderPainted(true);
        //tableroKenken.generarKenKen();
    }//GEN-LAST:event_botonDificilMousePressed

    
    /**
     * Boton que al presionarlo, indica que el reloj será de tipo cronometro
     * @param evt 
     */
    private void botonCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCronometroActionPerformed
        relojCronometro = true;
        relojTimer = false;
        botonCronometro.setBorderPainted(true);
        botonTimer.setBorderPainted(false);
        botonNoUtilizarReloj.setBorderPainted(false);
    }//GEN-LAST:event_botonCronometroActionPerformed

    /**
     * Boton que al presionarlo, indica que el reloj será de tipo Timer
     * @param evt 
     */
    private void botonTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTimerActionPerformed
        relojCronometro = false;
        relojTimer = true;
        botonCronometro.setBorderPainted(false);
        botonTimer.setBorderPainted(true);
        botonNoUtilizarReloj.setBorderPainted(false);
    }//GEN-LAST:event_botonTimerActionPerformed

    /**
     * Boton que al presionarlo, indicia que no se utilizará ningún reloj durante el juego.
     * @param evt 
     */
    private void botonNoUtilizarRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNoUtilizarRelojActionPerformed
        relojCronometro = false;
        relojTimer = false;
        botonCronometro.setBorderPainted(false);
        botonTimer.setBorderPainted(false);
        botonNoUtilizarReloj.setBorderPainted(true);
    }//GEN-LAST:event_botonNoUtilizarRelojActionPerformed

    
    /**
     * Boton que al presionarlo, indica que el panel de números y el bóton del borrador, se mostrarán al lado
     * derecho del tablero del juego kenken
     * @param evt 
     */
    private void botonDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDerechaActionPerformed
        panelDerecha = true;
        panelIzquierda = false;
        botonDerecha.setBorderPainted(true);
        botonIzquierda.setBorderPainted(false);
    }//GEN-LAST:event_botonDerechaActionPerformed

    /**
     * Boton que al presionarlo, indica que el panel de números y el bóton del borrador, se mostrarán al lado
     * izquierdo del tablero del juego kenken
     * @param evt 
     */
    private void botonIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIzquierdaActionPerformed
        panelDerecha = false;
        panelIzquierda = true;
        botonDerecha.setBorderPainted(false);
        botonIzquierda.setBorderPainted(true);
    }//GEN-LAST:event_botonIzquierdaActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se escuchará un sonido al ganar la partida
     * @param evt 
     */
    private void botonSiEscucharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiEscucharActionPerformed
        escucharSonido = true;
        botonSiEscuchar.setBorderPainted(true);
        botonNoEscuchar.setBorderPainted(false);
    }//GEN-LAST:event_botonSiEscucharActionPerformed

    
    /**
     * 
     * Boton que al presionarlo, indica que no se escuchará un sonido al ganar la partida
     * @param evt 
     */
    private void botonNoEscucharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNoEscucharActionPerformed
        escucharSonido = false;
        botonSiEscuchar.setBorderPainted(false);
        botonNoEscuchar.setBorderPainted(true);
    }//GEN-LAST:event_botonNoEscucharActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCronometro;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonDificil;
    private javax.swing.JButton botonFacil1;
    private javax.swing.JButton botonIntermedio;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonNoEscuchar;
    private javax.swing.JButton botonNoUtilizarReloj;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSiEscuchar;
    private javax.swing.JButton botonTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelConfiguracion;
    // End of variables declaration//GEN-END:variables
}
