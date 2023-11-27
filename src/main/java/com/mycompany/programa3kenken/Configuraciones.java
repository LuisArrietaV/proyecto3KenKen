
package com.mycompany.programa3kenken;

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
    public static boolean cuadricula3x3 = false;
    public static boolean cuadricula4x4 = false;
    public static boolean cuadricula5x5 = false;
    public static boolean cuadricula6x6 = true;
    public static boolean cuadricula7x7 = false;
    public static boolean cuadricula8x8 = false;
    public static boolean cuadricula9x9 = false;
    

    
    
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
        if (cuadricula3x3 == true) {
            boton3x3.setBorderPainted(true);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula4x4 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(true);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula5x5 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(true);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula6x6 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(true);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula7x7 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(true);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula8x8 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(true);
            boton9x9.setBorderPainted(false);
        }
        if (cuadricula9x9 == true) {
            boton3x3.setBorderPainted(false);
            boton4x4.setBorderPainted(false);
            boton5x5.setBorderPainted(false);
            boton6x6.setBorderPainted(false);
            boton7x7.setBorderPainted(false);
            boton8x8.setBorderPainted(false);
            boton9x9.setBorderPainted(true);
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
        jLabel5 = new javax.swing.JLabel();
        boton3x3 = new javax.swing.JButton();
        boton6x6 = new javax.swing.JButton();
        boton4x4 = new javax.swing.JButton();
        boton5x5 = new javax.swing.JButton();
        boton7x7 = new javax.swing.JButton();
        boton8x8 = new javax.swing.JButton();
        boton9x9 = new javax.swing.JButton();

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
        botonRegresar.setBounds(20, 570, 110, 30);

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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("5. Tamaño de la cuadrícula: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 440, 220, 17);

        boton3x3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton3x3.setText("3 x 3");
        boton3x3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton3x3.setBorderPainted(false);
        boton3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3x3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3x3);
        boton3x3.setBounds(180, 480, 70, 20);

        boton6x6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton6x6.setText("6 x 6");
        boton6x6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton6x6.setBorderPainted(false);
        boton6x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6x6ActionPerformed(evt);
            }
        });
        jPanel1.add(boton6x6);
        boton6x6.setBounds(450, 480, 70, 20);

        boton4x4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton4x4.setText("4 x 4");
        boton4x4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton4x4.setBorderPainted(false);
        boton4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4x4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton4x4);
        boton4x4.setBounds(270, 480, 70, 20);

        boton5x5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton5x5.setText("5 x 5");
        boton5x5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton5x5.setBorderPainted(false);
        boton5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5x5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton5x5);
        boton5x5.setBounds(360, 480, 70, 20);

        boton7x7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton7x7.setText("7 x 7");
        boton7x7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton7x7.setBorderPainted(false);
        boton7x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7x7ActionPerformed(evt);
            }
        });
        jPanel1.add(boton7x7);
        boton7x7.setBounds(210, 520, 70, 20);

        boton8x8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton8x8.setText("8 x 8");
        boton8x8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton8x8.setBorderPainted(false);
        boton8x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8x8ActionPerformed(evt);
            }
        });
        jPanel1.add(boton8x8);
        boton8x8.setBounds(310, 520, 70, 20);

        boton9x9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        boton9x9.setText("9 x 9");
        boton9x9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        boton9x9.setBorderPainted(false);
        boton9x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9x9ActionPerformed(evt);
            }
        });
        jPanel1.add(boton9x9);
        boton9x9.setBounds(410, 520, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
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

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 3x3 del Kenken
     * @param evt 
     */
    private void boton3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3x3ActionPerformed
        cuadricula3x3 = true;
        cuadricula4x4 = false;
        cuadricula5x5 = false;
        cuadricula6x6 = false;
        cuadricula7x7 = false;
        cuadricula8x8 = false;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(true);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton3x3ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 6x6 del Kenken
     * @param evt 
     */
    private void boton6x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6x6ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = false;
        cuadricula5x5 = false;
        cuadricula6x6 = true;
        cuadricula7x7 = false;
        cuadricula8x8 = false;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(true);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton6x6ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 4x4 del Kenken
     * @param evt 
     */
    private void boton4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4x4ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = true;
        cuadricula5x5 = false;
        cuadricula6x6 = false;
        cuadricula7x7 = false;
        cuadricula8x8 = false;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(true);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton4x4ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 5x5 del Kenken
     * @param evt 
     */
    private void boton5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5x5ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = false;
        cuadricula5x5 = true;
        cuadricula6x6 = false;
        cuadricula7x7 = false;
        cuadricula8x8 = false;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(true);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton5x5ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 7x7 del Kenken
     * @param evt 
     */
    private void boton7x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7x7ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = false;
        cuadricula5x5 = false;
        cuadricula6x6 = false;
        cuadricula7x7 = true;
        cuadricula8x8 = false;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(true);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton7x7ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 8x8 del Kenken
     * @param evt 
     */
    private void boton8x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8x8ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = false;
        cuadricula5x5 = false;
        cuadricula6x6 = false;
        cuadricula7x7 = false;
        cuadricula8x8 = true;
        cuadricula9x9 = false;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(true);
        boton9x9.setBorderPainted(false);
    }//GEN-LAST:event_boton8x8ActionPerformed

    
    /**
     * Boton que al presionarlo, indica que se va a utilizar y jugar con 
     * la cuadricula 9x9 del Kenken
     * @param evt 
     */
    private void boton9x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9x9ActionPerformed
        cuadricula3x3 = false;
        cuadricula4x4 = false;
        cuadricula5x5 = false;
        cuadricula6x6 = false;
        cuadricula7x7 = false;
        cuadricula8x8 = false;
        cuadricula9x9 = true;
        boton3x3.setBorderPainted(false);
        boton4x4.setBorderPainted(false);
        boton5x5.setBorderPainted(false);
        boton6x6.setBorderPainted(false);
        boton7x7.setBorderPainted(false);
        boton8x8.setBorderPainted(false);
        boton9x9.setBorderPainted(true);
    }//GEN-LAST:event_boton9x9ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton3x3;
    private javax.swing.JButton boton4x4;
    private javax.swing.JButton boton5x5;
    private javax.swing.JButton boton6x6;
    private javax.swing.JButton boton7x7;
    private javax.swing.JButton boton8x8;
    private javax.swing.JButton boton9x9;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelConfiguracion;
    // End of variables declaration//GEN-END:variables
}
