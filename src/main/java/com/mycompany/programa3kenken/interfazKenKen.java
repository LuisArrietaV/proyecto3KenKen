
package com.mycompany.programa3kenken;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * JFrame Form llamado interfazKenKen utilizada para mostrar el tablero del kenken apartir de JTextField,
 * mostrar todos los botones para poder jugar, como el iniciar juego, validar juego, deshacer y rehacer jugadas, terminar
 * juego, reiniciar juego, jugar otro tablero, y también realizar funciones para verificar que el tablero este 
 * correcto, y para el cronometro o timer
 * @author Luis Arrieta Víquez
 */
public class interfazKenKen extends javax.swing.JFrame {

    
    public static Tablero tableroKenKen;
    private Numeros panelDeNumeros;
    private Configuraciones configurar;
    public static int otroJuego;
    public static Timer contador;
    public static Timer contador2;
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;
    private int milisegundos = 0;
    private int horasTimer = 1;
    private int minutosTimer = 10;
    private int segundosTimer = 59;
    private int milisegundosTimer = 0;
    private int horaInicial = 0;
    private int minutoInicial = 0;
    private int segundoInicial = 0;
    private String nombreJugador = "";
    private boolean validarNombre = false;

    
    /**
     * Esta funcion inicia los componentes del JFrame Form, como los botones, labels, JTextField, y da valor a los
     * atributos, asi como deshabilita algunos botones, o hace que se muestren o no se muestren algunas cosas, dependiendo
     * de si se va a jugar con cronometro, con timer, o con ninguno
     */
    public interfazKenKen() {
        initComponents();
        this.setTitle("KenKen");
        cargarComponentes();
        setLocationRelativeTo(null);
        botonIniciar.setEnabled(true);
        botonValidar.setEnabled(false);
        botonTerminar.setEnabled(false);
        botonOtroJuego.setEnabled(false);
        labelNombre_Jugador.setVisible(true);
        txtJugador.setVisible(true);
        botonAceptarNombre.setVisible(true);
        labelJugador.setVisible(false);
        labelNombre.setVisible(false);
        if (Configuraciones.relojCronometro == true || Configuraciones.relojTimer == true) {
            labelCronometro.setVisible(true);
        }
        else {
            labelCronometro.setVisible(false);
        }
        if (Configuraciones.relojTimer == true) {
            txtHorasTimer.setVisible(true);
            txtMinutosTimer.setVisible(true);
            txtSegundosTimer.setVisible(true);
            labelHoras.setVisible(true);
            labelMinutos.setVisible(true);
            labelSegundos.setVisible(true);
            botonAceptarTimer.setVisible(true);
        }
        else {
            txtHorasTimer.setVisible(false);
            txtMinutosTimer.setVisible(false);
            txtSegundosTimer.setVisible(false);
            labelHoras.setVisible(false);
            labelMinutos.setVisible(false);
            labelSegundos.setVisible(false);
            botonAceptarTimer.setVisible(false);
        }
            
        contador = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comenzarCronometro();
            }
        });
        contador2 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comenzarCronometro2();
            }
        });
        
        
    }

    /**
     * Le asigna un valor a cada uno de los atributos, asi como un ancho, una altura, margen, tamaño de letra,
     * color de fondo, color de letra, y posición, al tablero y al panel de numeros
     */
    public void cargarComponentes() {
        tableroKenKen = new Tablero();
        if (Configuraciones.cuadricula3x3 == true || Configuraciones.cuadricula4x4 == true || Configuraciones.cuadricula5x5 == true || Configuraciones.cuadricula6x6 == true) {
            tableroKenKen.setTxtAltura(50);
            tableroKenKen.setTxtAncho(50);
            tableroKenKen.setTxtMargen(4);
            tableroKenKen.setTxtLetra(25);
        }
        if (Configuraciones.cuadricula7x7 == true) {
            tableroKenKen.setTxtAltura(44);
            tableroKenKen.setTxtAncho(44);
            tableroKenKen.setTxtMargen(4);
            tableroKenKen.setTxtLetra(22);
        }
        if (Configuraciones.cuadricula8x8 == true) {
            tableroKenKen.setTxtAltura(40);
            tableroKenKen.setTxtAncho(40);
            tableroKenKen.setTxtMargen(4);
            tableroKenKen.setTxtLetra(20);
        }
        if (Configuraciones.cuadricula9x9 == true) {
            tableroKenKen.setTxtAltura(36);
            tableroKenKen.setTxtAncho(36);
            tableroKenKen.setTxtMargen(4);
            tableroKenKen.setTxtLetra(18);
        }
        
        tableroKenKen.setColorPanel(Color.BLACK);
        
        tableroKenKen.setTxtColorFondo1(Color.WHITE);
        tableroKenKen.setTxtColorLetra1(Color.BLACK);
        tableroKenKen.setTxtColorFondo2(new Color(224,247,255));
        tableroKenKen.setTxtColorLetra2(Color.BLACK);
        tableroKenKen.setTxtColorFondo3(new Color(51,204,255));
        // 51,204,255
        tableroKenKen.setTxtColorLetra3(Color.WHITE);
        panel1.add(tableroKenKen);
        if (Configuraciones.cuadricula3x3 == true) {
            tableroKenKen.setLocation(260, 60);
        }
        if (Configuraciones.cuadricula4x4 == true) {
            tableroKenKen.setLocation(240, 60);
        }
        if (Configuraciones.cuadricula5x5 == true) {
            tableroKenKen.setLocation(220, 60);
        }
        if (Configuraciones.cuadricula6x6 == true) {
            tableroKenKen.setLocation(200, 60);
        }
        if (Configuraciones.cuadricula7x7 == true) {
            tableroKenKen.setLocation(200, 60);
        }
        if (Configuraciones.cuadricula8x8 == true) {
            tableroKenKen.setLocation(190, 60);
        }
        if (Configuraciones.cuadricula9x9 == true) {
            tableroKenKen.setLocation(180, 60);
        }
        tableroKenKen.setVisible(true);
        tableroKenKen.crearKenKen();
        
        
        panelDeNumeros = new Numeros();
        if (Configuraciones.cuadricula3x3 == true || Configuraciones.cuadricula4x4 == true || Configuraciones.cuadricula5x5 == true || Configuraciones.cuadricula6x6 == true) {
            panelDeNumeros.setAltura(50);
            panelDeNumeros.setAncho(50);
            panelDeNumeros.setMargen(4);
            panelDeNumeros.setTamano(25);
        }
        if (Configuraciones.cuadricula7x7 == true) {
            panelDeNumeros.setAltura(44);
            panelDeNumeros.setAncho(44);
            panelDeNumeros.setMargen(4);
            panelDeNumeros.setTamano(22);
        }
        if (Configuraciones.cuadricula8x8 == true) {
            panelDeNumeros.setAltura(40);
            panelDeNumeros.setAncho(40);
            panelDeNumeros.setMargen(4);
            panelDeNumeros.setTamano(20);
        }
        if (Configuraciones.cuadricula9x9 == true) {
            panelDeNumeros.setAltura(36);
            panelDeNumeros.setAncho(36);
            panelDeNumeros.setMargen(4);
            panelDeNumeros.setTamano(18);
        }
        
        
        panelDeNumeros.setPanel(Color.BLACK);
        panelDeNumeros.setColorFondo1(Color.BLUE);
        panelDeNumeros.setColorLetra1(Color.BLACK);
        panelDeNumeros.setColorFondo2(new Color(0,153,255));
        panelDeNumeros.setColorLetra2(Color.WHITE);
        panel1.add(panelDeNumeros);
        panelDeNumeros.crearPanelNumeros();
        if (Configuraciones.panelDerecha == true ) {
            panelDeNumeros.setLocation(530, 60);
            botonBorrar.setLocation(610, 110);
        }
        if (Configuraciones.panelIzquierda == true) {
            panelDeNumeros.setLocation(120, 60);
            botonBorrar.setLocation(50, 110);
        }
        if (Configuraciones.panelDerecha == false && Configuraciones.panelIzquierda == false) {
            panelDeNumeros.setLocation(530, 60);
            botonBorrar.setLocation(610, 110);
        }
        panelDeNumeros.setVisible(true);
        otroJuego = 0;
    }
    
    /**
     * Inicializa el cronometro al actualizar el tiempo, y el 
     * label
     */
    private void comenzarCronometro() {
        actualizarTiempo();
        actualizarLabel();
    }
    
    /**
     * Inicializa el timer al actualizar el tiempo, y el label
     */
    private void comenzarCronometro2() {
        actualizarTiempo2();
        actualizarLabel2();
    }
    
    /**
     * Va aumentando el valor de minisegundos, segundos, minutos y horas, 
     * en función del tiempo transcurrido tras empezar una partida del kenken
     */
    private void actualizarTiempo() {
        milisegundos++;
        
        if (milisegundos == 100) {
            milisegundos = 0;
            segundos++;
        }
        
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        
    }
    
    
    /**
     * Va disminuyendo el tiempo del timer, hasta que horas, minutos, y segundos lleguen a cero, en ese
     * caso se muestra un JOptionPane indicando si se quiere seguir el mismo juego, en caso de que sí,
     * empieza un cronometro a partir del tiempo que ya pasó, y si es el caso de que no, se regresa a la opción de 
     * jugar
     */
    private void actualizarTiempo2() {
        milisegundosTimer++;
        
        if (milisegundosTimer == 100) {
            milisegundosTimer = 0;
            segundosTimer--;
        }
        
        if (segundosTimer == 0) {
            if (minutosTimer == 0) {
                segundos = 0;
                contador2.stop();
                int expirado = JOptionPane.showConfirmDialog(this, "TIEMPO EXPIRADO. ¿DESEA CONTINUAR CON EL MISMO JUEGO (SI/NO)?", "Tiempo expirado", JOptionPane.YES_NO_OPTION);
                if (expirado == JOptionPane.YES_OPTION) {
                    Configuraciones.relojTimer = false;
                    Configuraciones.relojCronometro = true;
                    horas = horaInicial;
                    minutos = minutoInicial;
                    segundos = segundoInicial;
                    contador.start();
                }
                if (expirado == JOptionPane.NO_OPTION) {
                    tableroKenKen.limpiarTablero();
                    Numeros.movimientos.pila = null;
                    Numeros.movimientos.pilaRehacer = null;
                    if (Configuraciones.dificultadFacil == true) {
                        otroJuego = Modelo.facil;
                    }
                    if (Configuraciones.dificultadIntermedio == true) {
                        otroJuego = Modelo.intermedio;
                    }
                    if (Configuraciones.dificultadDificil == true) {
                        otroJuego = Modelo.dificil;
                    }
                    horas = 0;
                    minutos = 0;
                    segundos = 0;
                    milisegundos = 0;
                    horasTimer = 1;
                    minutosTimer = 10;
                    segundosTimer = 59;
                    milisegundosTimer = 0;
                    horaInicial = 0;
                    minutoInicial = 0;
                    segundoInicial = 0;
                    botonIniciar.setEnabled(true);
                    botonValidar.setEnabled(false);
                    botonTerminar.setEnabled(false);
                    botonOtroJuego.setEnabled(false);
                    if (Configuraciones.relojCronometro == true || Configuraciones.relojTimer == true) {
                        labelCronometro.setVisible(true);
                    }
                    else {
                        labelCronometro.setVisible(false);
                    }
                    if (Configuraciones.relojTimer == true) {
                        txtHorasTimer.setVisible(true);
                        txtMinutosTimer.setVisible(true);
                        txtSegundosTimer.setVisible(true);
                        labelHoras.setVisible(true);
                        labelMinutos.setVisible(true);
                        labelSegundos.setVisible(true);
                        botonAceptarTimer.setVisible(true);
                    }
                    else {
                        txtHorasTimer.setVisible(false);
                        txtMinutosTimer.setVisible(false);
                        txtSegundosTimer.setVisible(false);
                        labelHoras.setVisible(false);
                        labelMinutos.setVisible(false);
                        labelSegundos.setVisible(false);
                        botonAceptarTimer.setVisible(false);
                    }

                    contador = new Timer(10, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            comenzarCronometro();
                        }
                    });
                    contador2 = new Timer(10, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            comenzarCronometro2();
                        }
                    });
                    
                }
            }
            else {
                segundosTimer = 59;
                minutosTimer--;
            }
            
        }
        
        if (minutosTimer == 0) {
            if (horasTimer == 0) {
                minutosTimer = 0;
            }
            else {
                minutosTimer = 59;
                horasTimer--;
            }
            
        }
        
    }
    
    /**
     * Actualiza el Jlabel del cronometro para que se vaya viendo el tiempo
     * transcurrido desde que se empezó a jugar
     */
    private void actualizarLabel() {
        String cronometroInterfaz = horas + "h:" + minutos + "m:" + segundos + "s";
        labelCronometro.setText(cronometroInterfaz);
        
    }
    
    /**
     * Actualiza el Jlabel para que se vaya viendo cuanto tiempo restante queda
     * en el timer
     */
    private void actualizarLabel2() {
        String cronometroInterfaz = horasTimer + "h:" + minutosTimer + "m:" + segundosTimer + "s";
        labelCronometro.setText(cronometroInterfaz);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        botonValidar = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        botonDeshacer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botonTerminar = new javax.swing.JButton();
        botonOtroJuego = new javax.swing.JButton();
        labelCronometro = new javax.swing.JLabel();
        txtHorasTimer = new javax.swing.JTextField();
        txtMinutosTimer = new javax.swing.JTextField();
        txtSegundosTimer = new javax.swing.JTextField();
        labelHoras = new javax.swing.JLabel();
        labelMinutos = new javax.swing.JLabel();
        labelSegundos = new javax.swing.JLabel();
        botonAceptarTimer = new javax.swing.JButton();
        labelNombre_Jugador = new javax.swing.JLabel();
        txtJugador = new javax.swing.JTextField();
        botonAceptarNombre = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelJugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 204, 0));
        panel1.setPreferredSize(new java.awt.Dimension(540, 420));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("KenKen");
        panel1.add(jLabel1);
        jLabel1.setBounds(290, 10, 100, 40);

        botonBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marce\\Desktop\\borrador.jpg")); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        panel1.add(botonBorrar);
        botonBorrar.setBounds(610, 110, 50, 50);

        botonValidar.setBackground(new java.awt.Color(0, 153, 255));
        botonValidar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonValidar.setText("VALIDAR JUEGO");
        botonValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonValidarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonValidarMouseReleased(evt);
            }
        });
        botonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonValidarActionPerformed(evt);
            }
        });
        panel1.add(botonValidar);
        botonValidar.setBounds(50, 460, 160, 30);

        botonReiniciar.setBackground(new java.awt.Color(255, 102, 0));
        botonReiniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonReiniciar.setText("REINICIAR JUEGO");
        botonReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonReiniciarMousePressed(evt);
            }
        });
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });
        panel1.add(botonReiniciar);
        botonReiniciar.setBounds(440, 460, 160, 30);

        botonIniciar.setBackground(new java.awt.Color(255, 0, 0));
        botonIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonIniciar.setText("INICIAR JUEGO");
        botonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIniciarMousePressed(evt);
            }
        });
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        panel1.add(botonIniciar);
        botonIniciar.setBounds(50, 410, 160, 30);

        botonDeshacer.setBackground(new java.awt.Color(102, 255, 0));
        botonDeshacer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonDeshacer.setText("DESHACER JUGADA");
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });
        panel1.add(botonDeshacer);
        botonDeshacer.setBounds(240, 410, 180, 30);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("REHACER JUGADA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(240, 460, 180, 30);

        botonTerminar.setBackground(new java.awt.Color(255, 102, 102));
        botonTerminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonTerminar.setText("TERMINAR JUEGO");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });
        panel1.add(botonTerminar);
        botonTerminar.setBounds(440, 410, 160, 30);

        botonOtroJuego.setBackground(new java.awt.Color(153, 204, 255));
        botonOtroJuego.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonOtroJuego.setText("OTRO JUEGO");
        botonOtroJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOtroJuegoActionPerformed(evt);
            }
        });
        panel1.add(botonOtroJuego);
        botonOtroJuego.setBounds(630, 410, 130, 30);

        labelCronometro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelCronometro.setText("0h: 0m: 0s");
        panel1.add(labelCronometro);
        labelCronometro.setBounds(610, 10, 170, 40);

        txtHorasTimer.setText("1");
        panel1.add(txtHorasTimer);
        txtHorasTimer.setBounds(690, 170, 64, 22);

        txtMinutosTimer.setText("10");
        panel1.add(txtMinutosTimer);
        txtMinutosTimer.setBounds(690, 210, 64, 20);

        txtSegundosTimer.setText("59");
        panel1.add(txtSegundosTimer);
        txtSegundosTimer.setBounds(690, 250, 64, 22);

        labelHoras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelHoras.setText("Horas:");
        panel1.add(labelHoras);
        labelHoras.setBounds(620, 180, 37, 14);

        labelMinutos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelMinutos.setText("Minutos:");
        panel1.add(labelMinutos);
        labelMinutos.setBounds(620, 210, 60, 14);

        labelSegundos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelSegundos.setText("Segundos:");
        panel1.add(labelSegundos);
        labelSegundos.setBounds(620, 250, 70, 14);

        botonAceptarTimer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAceptarTimer.setText("Aceptar");
        botonAceptarTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarTimerActionPerformed(evt);
            }
        });
        panel1.add(botonAceptarTimer);
        botonAceptarTimer.setBounds(650, 290, 110, 22);

        labelNombre_Jugador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNombre_Jugador.setText("Nombre del jugador:");
        panel1.add(labelNombre_Jugador);
        labelNombre_Jugador.setBounds(610, 330, 150, 16);
        panel1.add(txtJugador);
        txtJugador.setBounds(620, 360, 120, 22);

        botonAceptarNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAceptarNombre.setText("Aceptar");
        botonAceptarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarNombreActionPerformed(evt);
            }
        });
        panel1.add(botonAceptarNombre);
        botonAceptarNombre.setBounds(750, 360, 90, 24);

        labelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(0, 51, 153));
        labelNombre.setText("Nombre");
        panel1.add(labelNombre);
        labelNombre.setBounds(690, 60, 90, 20);

        labelJugador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelJugador.setText("Jugador:");
        panel1.add(labelJugador);
        labelJugador.setBounds(610, 50, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Oculta el JFrame Form de interfazKenKen
     */
    public void esconderInterfaz() {
        this.setVisible(false);
    }
    
    /**
     * Boton que borra un numero ingresado en uno de los campos del tablero del kenken
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (tableroKenKen.campoSeleccionado == false) {
           JOptionPane.showMessageDialog(null, "PRIMERO DEBE SELECCIONAR UNA CASILLA");
        }
        tableroKenKen.seleccionar.setText("");
        Numeros.movimientos.push(0, Tablero.filaGuardada, Tablero.columnaGuardada);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonValidarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonValidarMousePressed
        //
    }//GEN-LAST:event_botonValidarMousePressed

    /**
     * Boton que comprueba que el resultado del kenken según por los numeros ingresados, por el
     * usuario, sean los correctos
     * @param evt 
     */
    private void botonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonValidarActionPerformed
        tableroKenKen.validarKenKen();
        if (tableroKenKen.victoria == true) {
            this.setVisible(false);
            //Configuraciones.relojCronometro = false;
            
    }
    }//GEN-LAST:event_botonValidarActionPerformed

    
    /**
     * Boton que da la posibilidad de reinicar una partida del kenken, limpiando el tablero,
     * al quitar todos los numeros ingresados por el usuario, y reiniciando el timer o el cronometro, en caso
     * de que se esten usando
     * @param evt 
     */
    private void botonReiniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReiniciarMousePressed
        int reiniciar = JOptionPane.showConfirmDialog(this, "¿ESTÁ SEGURO DE EMPEZAR NUEVAMENTE ESTE MISMO JUEGO (SI/NO)?", "Reiniciar", JOptionPane.YES_NO_OPTION);
        if (reiniciar == JOptionPane.YES_OPTION) {
            tableroKenKen.limpiarTablero();
            Numeros.movimientos.pila = null;
            Numeros.movimientos.pilaRehacer = null;
            if (Configuraciones.relojCronometro == true ) {
                labelCronometro.setVisible(true);
                
                
                if (contador.isRunning()) {
                    contador.stop();
                }
                horas = 0;
                minutos = 0;
                segundos = 0;
                milisegundos = 0;
            
                actualizarLabel();
                contador.start();
                
                }
            
            if (Configuraciones.relojTimer == true ) {
                labelCronometro.setVisible(true);
                
                
                if (contador2.isRunning()) {
                    contador2.stop();
                }
                horasTimer = horaInicial;
                minutosTimer = minutoInicial;
                segundosTimer = segundoInicial;
                milisegundos = 0;
            
                actualizarLabel2();
                contador2.start();
                
                }
            
            
            
        }
    }//GEN-LAST:event_botonReiniciarMousePressed

    private void botonIniciarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIniciarMousePressed
        //
    }//GEN-LAST:event_botonIniciarMousePressed

    /**
     * Boton que genera un nuevo kenken según por la dificultad y reloj seleccionados
     * @param evt 
     */
    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if (validarNombre == false) {
           JOptionPane.showMessageDialog(null, "Debe dar algún nombre de jugador para poder jugar");
        }
        else {
        labelNombre_Jugador.setVisible(false);
        txtJugador.setVisible(false);
        botonAceptarNombre.setVisible(false);
        labelJugador.setVisible(true);
        labelNombre.setVisible(true);
        labelNombre.setText(nombreJugador);
        tableroKenKen.generarKenKen();
        botonIniciar.setEnabled(false);
        botonValidar.setEnabled(true);
        botonTerminar.setEnabled(true);
        botonOtroJuego.setEnabled(true);
        if (Configuraciones.relojCronometro == true ) {
            contador.start();
        }
        if (Configuraciones.relojTimer == true ) {
            horaInicial =  Integer.parseInt(txtHorasTimer.getText());
            minutoInicial = Integer.parseInt(txtMinutosTimer.getText());
            segundoInicial = Integer.parseInt(txtSegundosTimer.getText());
            
            
            txtHorasTimer.setVisible(false);
            txtMinutosTimer.setVisible(false);
            txtSegundosTimer.setVisible(false);
            labelHoras.setVisible(false);
            labelMinutos.setVisible(false);
            labelSegundos.setVisible(false);
            botonAceptarTimer.setVisible(false);
            contador2.start();
        }
        }
        
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonValidarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonValidarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_botonValidarMouseReleased

    /**
     * Boton que deshace los numeros ingresados por el usuario
     * @param evt 
     */
    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        Numeros.movimientos.pop();
    }//GEN-LAST:event_botonDeshacerActionPerformed

    /**
     * Boton que rehace los numeros ingresados por el usuario
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Numeros.movimientos.popRehacer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReiniciarActionPerformed

    
    /**
     * Boton que permite terminar el juego, por lo que se regresaría al Jframe Form del menu principal
     * @param evt 
     */
    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
        int terminar = JOptionPane.showConfirmDialog(this, "¿ESTÁ SEGURO DE TERMINAR EL JUEGO (SI/NO)?", "Terminar juego", JOptionPane.YES_NO_OPTION);
        if (terminar == JOptionPane.YES_OPTION) {
            tableroKenKen.limpiarTablero();
            Numeros.movimientos.pila = null;
            Numeros.movimientos.pilaRehacer = null;
            //Configuraciones.relojCronometro = false;
            this.setVisible(false);
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
        }
    }//GEN-LAST:event_botonTerminarActionPerformed

    /**
     * Boton que permite jugar otro juego del kenken de la misma dificultad
     * @param evt 
     */
    private void botonOtroJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOtroJuegoActionPerformed
        int otro = JOptionPane.showConfirmDialog(this, "¿ESTÁ SEGURO DE TERMINAR ESTE JUEGO Y EMPEZAR CON OTRO (SI/NO)?", "Otro juego", JOptionPane.YES_NO_OPTION);
        if (otro == JOptionPane.YES_OPTION) {
            tableroKenKen.limpiarTablero();
            Numeros.movimientos.pila = null;
            Numeros.movimientos.pilaRehacer = null;
            if (Configuraciones.dificultadFacil == true) {
                otroJuego = Modelo.facil;
            }
            if (Configuraciones.dificultadIntermedio == true) {
                otroJuego = Modelo.intermedio;
            }
            if (Configuraciones.dificultadDificil == true) {
                otroJuego = Modelo.dificil;
            }
            tableroKenKen.generarKenKen();
            
            if (Configuraciones.relojCronometro == true ) {
                labelCronometro.setVisible(true);
                
                
                if (contador.isRunning()) {
                    contador.stop();
                }
                horas = 0;
                minutos = 0;
                segundos = 0;
                milisegundos = 0;
            
                actualizarLabel();
                contador.start();
                
                }
            
            if (Configuraciones.relojTimer == true ) {
                labelCronometro.setVisible(true);
                
                
                if (contador2.isRunning()) {
                    contador2.stop();
                }
                horasTimer = horaInicial;
                minutosTimer = minutoInicial;
                segundosTimer = segundoInicial;
                milisegundos = 0;
            
                actualizarLabel2();
                contador2.start();
                
                }
            
        }
            
    }//GEN-LAST:event_botonOtroJuegoActionPerformed

    /**
     * Boton que comprueba y almacena los numeros ingresados por el usuario en los JTextField, de
     * horas, minutos, y segundos, para el timer de la partida del kenken
     * @param evt 
     */
    private void botonAceptarTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarTimerActionPerformed
        try {
            if (Integer.parseInt(txtHorasTimer.getText()) >= 0 && Integer.parseInt(txtHorasTimer.getText()) <= 5) {
            if (Integer.parseInt(txtMinutosTimer.getText()) >= 0 && Integer.parseInt(txtMinutosTimer.getText()) <= 59) {
                if (Integer.parseInt(txtSegundosTimer.getText()) >= 0 && Integer.parseInt(txtSegundosTimer.getText()) <= 59) {
                    horasTimer = Integer.parseInt(txtHorasTimer.getText());
                    horaInicial =  Integer.parseInt(txtHorasTimer.getText());
                    minutosTimer = Integer.parseInt(txtMinutosTimer.getText());
                    minutoInicial = Integer.parseInt(txtMinutosTimer.getText());
                    segundosTimer = Integer.parseInt(txtSegundosTimer.getText());
                    segundoInicial = Integer.parseInt(txtSegundosTimer.getText());
                }
                else {
                    txtSegundosTimer.setText("59");
                    JOptionPane.showMessageDialog(null, "Error: El numero ingresado en los segundos debe estar entre 0 y 59");
                }
            }
            else {
                txtMinutosTimer.setText("10");
                JOptionPane.showMessageDialog(null, "Error: El numero ingresado en los minutos debe estar entre 0 y 59");
            }
        }
        else {
            txtHorasTimer.setText("1");
            JOptionPane.showMessageDialog(null, "Error: El numero ingresado en las horas debe estar entre 0 y 5");
            }
        } catch (Exception e) {
            txtSegundosTimer.setText("59");
            txtMinutosTimer.setText("10");
            txtHorasTimer.setText("1");
            JOptionPane.showMessageDialog(null, "Error: El valor ingresado debe ser un número");
        }
        

    }//GEN-LAST:event_botonAceptarTimerActionPerformed

    
    /**
     * Boton que comprueba y almacena el valor ingresado por el usuario en el JTextField, de
     * nombre del jugador 
     * @param evt 
     */
    private void botonAceptarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarNombreActionPerformed
        if (txtJugador.getText().length() >= 1 && txtJugador.getText().length() <= 40) {
            nombreJugador = txtJugador.getText();
            validarNombre = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Error: El nombre del jugador de estar en un rango de letras de 1 a 40");
        }
    }//GEN-LAST:event_botonAceptarNombreActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazKenKen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarNombre;
    private javax.swing.JButton botonAceptarTimer;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonDeshacer;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonOtroJuego;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonTerminar;
    private javax.swing.JButton botonValidar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCronometro;
    private javax.swing.JLabel labelHoras;
    private javax.swing.JLabel labelJugador;
    private javax.swing.JLabel labelMinutos;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre_Jugador;
    private javax.swing.JLabel labelSegundos;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtHorasTimer;
    private javax.swing.JTextField txtJugador;
    private javax.swing.JTextField txtMinutosTimer;
    private javax.swing.JTextField txtSegundosTimer;
    // End of variables declaration//GEN-END:variables
}
