
package com.mycompany.programa3kenken;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase llamada Tablero, utilizada para crear el tablero del kenken, apartir de JTextField, para los eventos
 * del tablero, y para comprobar que el tablero este correcto, una vez hayan sido ingresados todos los numeros
 * @author Luis Arrieta Víquez
 */

public class Tablero extends JPanel{

    public static JTextField[][] listaKenkenTxt;
    private JLabel texto;
    private int txtAltura;
    private int txtAncho;
    private int txtMargen;
    private int txtLetra;
    public static Color colorPanel;
    private Color txtColorFondo1;
    private Color txtColorLetra1;
    private Color txtColorFondo2;
    private Color txtColorLetra2;
    private Color txtColorFondo3;
    private Color txtColorLetra3;
    private Modelo kenken;
    private TipoDeCuadricula tipo;

    
    private ArrayList<JTextField> listaAuxiliar;
    public JTextField seleccionar;
    public boolean campoSeleccionado;
    public boolean victoria;
    public static int filaGuardada;
    public static int columnaGuardada;
    
    


    

    public JTextField[][] getListaKenkenTxt() {
        return listaKenkenTxt;
    }

    public void setListaKenkenTxt(JTextField[][] listaKenkenTxt) {
        this.listaKenkenTxt = listaKenkenTxt;
    }

    public int getTxtAltura() {
        return txtAltura;
    }

    public void setTxtAltura(int txtAltura) {
        this.txtAltura = txtAltura;
    }

    public int getTxtAncho() {
        return txtAncho;
    }

    public void setTxtAncho(int txtAncho) {
        this.txtAncho = txtAncho;
    }

    public int getTxtMargen() {
        return txtMargen;
    }

    public void setTxtMargen(int txtMargen) {
        this.txtMargen = txtMargen;
    }

    public int getTxtLetra() {
        return txtLetra;
    }

    public void setTxtLetra(int txtLetra) {
        this.txtLetra = txtLetra;
    }

    public Color getColorPanel() {
        return colorPanel;
    }

    public void setColorPanel(Color colorPanel) {
        this.colorPanel = colorPanel;
    }

    public Color getTxtColorFondo1() {
        return txtColorFondo1;
    }

    public void setTxtColorFondo1(Color txtColorFondo1) {
        this.txtColorFondo1 = txtColorFondo1;
    }

    public Color getTxtColorLetra1() {
        return txtColorLetra1;
    }

    public void setTxtColorLetra1(Color txtColorLetra1) {
        this.txtColorLetra1 = txtColorLetra1;
    }

    public Color getTxtColorFondo2() {
        return txtColorFondo2;
    }

    public void setTxtColorFondo2(Color txtColorFondo2) {
        this.txtColorFondo2 = txtColorFondo2;
    }

    public Color getTxtColorLetra2() {
        return txtColorLetra2;
    }

    public void setTxtColorLetra2(Color txtColorLetra2) {
        this.txtColorLetra2 = txtColorLetra2;
    }

    public Color getTxtColorFondo3() {
        return txtColorFondo3;
    }

    public void setTxtColorFondo3(Color txtColorFondo3) {
        this.txtColorFondo3 = txtColorFondo3;
    }

    public Color getTxtColorLetra3() {
        return txtColorLetra3;
    }

    public void setTxtColorLetra3(Color txtColorLetra3) {
        this.txtColorLetra3 = txtColorLetra3;
    }
    
    



    
    /**
     * Llama a la funcion iniciarTablero()
     */
    public Tablero() {
        iniciarTablero();
    }
    
    
    /**
     * Le da un valor inicial a varios de los atributos de esta clase
     */
    public void iniciarTablero(){
        if (Configuraciones.cuadricula3x3 == true) {
            listaKenkenTxt = new JTextField[3][3];
            txtAltura = 66;
            txtAncho = 65;
            tipo = TipoDeCuadricula.C3x3;
        }
        if (Configuraciones.cuadricula4x4 == true) {
            listaKenkenTxt = new JTextField[4][4];
            txtAltura = 66;
            txtAncho = 65;
            tipo = TipoDeCuadricula.C4x4;
        }
        if (Configuraciones.cuadricula5x5 == true) {
            listaKenkenTxt = new JTextField[5][5];
            txtAltura = 56;
            txtAncho = 55;
            tipo = TipoDeCuadricula.C5x5;
        }
        if (Configuraciones.cuadricula6x6 == true) {
            listaKenkenTxt = new JTextField[6][6];
            txtAltura = 36;
            txtAncho = 35;
            tipo = TipoDeCuadricula.C6x6;
        }
        if (Configuraciones.cuadricula7x7 == true) {
            listaKenkenTxt = new JTextField[7][7];
            txtAltura = 36;
            txtAncho = 35;
            tipo = TipoDeCuadricula.C7x7;
        }
        if (Configuraciones.cuadricula8x8 == true) {
            listaKenkenTxt = new JTextField[8][8];
            txtAltura = 36;
            txtAncho = 35;
            tipo = TipoDeCuadricula.C8x8;
        }
        if (Configuraciones.cuadricula9x9 == true) {
            listaKenkenTxt = new JTextField[9][9];
            txtAltura = 36;
            txtAncho = 35;
            tipo = TipoDeCuadricula.C9x9;
        }
        texto = new JLabel();
        txtMargen = 4;
        txtLetra = 25;
        colorPanel = Color.BLACK;
        txtColorFondo1 = Color.WHITE;
        txtColorLetra1 = Color.BLACK;
        txtColorFondo2 = Color.WHITE;
        txtColorLetra2 = Color.BLACK;
        txtColorFondo3 = Color.WHITE;
        txtColorLetra3 = Color.BLACK;
        kenken = new Modelo();
        listaAuxiliar = new ArrayList<>();
        seleccionar = new JTextField();
        campoSeleccionado = false;
        victoria = false;
        filaGuardada = 0;
        columnaGuardada = 0;
    }
    
    /**
     * Crea el cablero del KenKen al asignarle un tamaño, un color de fonodo, y al crear cada uno de 
     * los campos del tablero con la funcion camposTablero()
     */
    public void crearKenKen(){
        this.setLayout(null);
        if (Configuraciones.cuadricula3x3 == true) {
            this.setSize(txtAncho*3+(txtMargen*2), txtAltura*3+(txtMargen*2));
        }
        if (Configuraciones.cuadricula4x4 == true) {
            this.setSize(txtAncho*4+(txtMargen*2), txtAltura*4+(txtMargen*2));
        }
        if (Configuraciones.cuadricula5x5 == true) {
            this.setSize(txtAncho*5+(txtMargen*2), txtAltura*5+(txtMargen*2));
        }
        if (Configuraciones.cuadricula6x6 == true) {
            this.setSize(txtAncho*6+(txtMargen*2), txtAltura*6+(txtMargen*2));
        }
        if (Configuraciones.cuadricula7x7 == true) {
            this.setSize(txtAncho*7+(txtMargen*2), txtAltura*7+(txtMargen*2));
        }
        if (Configuraciones.cuadricula8x8 == true) {
            this.setSize(txtAncho*8+(txtMargen*2), txtAltura*8+(txtMargen*2));
        }
        if (Configuraciones.cuadricula9x9 == true) {
            this.setSize(txtAncho*9+(txtMargen*2), txtAltura*9+(txtMargen*2));
        }
        this.setBackground(colorPanel);
        camposTablero();
    }
    
    
    /**
     * Crea los campos del tablero apartir de JTextField, les da una posición en X, Y, cambia el color de fondo, 
     * el color de letra, les da un tipo de letra, y un tamaño de margen.
     */
    public void camposTablero() {
        int posX = txtMargen;
        int posY = txtMargen;
        int posX2 = txtMargen; 
        
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                
                JTextField campo = new JTextField();
                this.add(campo);
                campo.setBounds(posX, posY, txtAncho, txtAltura);
                campo.setBackground(txtColorFondo1);
                campo.setForeground(txtColorLetra1);
                campo.setFont(new Font("Arial", Font.BOLD, txtLetra));
                campo.setEditable(false);
                campo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                campo.setBorder(BorderFactory.createLineBorder(colorPanel, 1));
                
                campo.setVisible(true);
                posX = posX + txtAncho;
                //System.out.println(Modelo.facil);
                
                listaKenkenTxt[fila][columna] = campo;
                eventosTablero(campo);
                
                
            }
            posX = txtMargen;
            posY = posY + txtAltura;
        }
        
    }
    
    
    /**
     * Funcion utilizada para realizar una accion al presionar un JTextField del tablero, como
     * poder ingresar un numero apartir del teclado, o almacenar cual es la posicion exacta, del
     * campo seleccionado
     * @param campo es un JTextField del campo seleccionado
     */
    public void eventosTablero(JTextField campo) {
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                campoSeleccionado(campo);
                seleccionar = campo;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        KeyListener presionarTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
                    campo.setText("");
                    Numeros.movimientos.push(0, Tablero.filaGuardada, Tablero.columnaGuardada);
                }
                
                if (Configuraciones.cuadricula3x3 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 51) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula4x4 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 52) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula5x5 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 53) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula6x6 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 54) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula7x7 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 55) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula8x8 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 56) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                if (Configuraciones.cuadricula9x9 == true) {
                    if(e.getKeyChar()>= 49 && e.getKeyChar() <= 57) {
                        campo.setText(String.valueOf(e.getKeyChar()));
                        Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                        Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    }
                }
                
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
            
        };
        
        campo.addMouseListener(evento);
        campo.addKeyListener(presionarTeclado);
    }
    
    /**
     * Funcion utilizada para asignarle a cada uno de los JTextField, un color de fondo
     * blanco
     */
    public void pintarCampos() {
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                    listaKenkenTxt[fila][columna].setBackground(Color.WHITE);
                }
        }
    }
    
    /**
     * Cambia el color del campo seleccionado de color blanco a celeste a través del mouse, para indicar
     * cual campo se está seleccionando y cuales numeros estan en esa fila y  columna, pintando los campos
     * de un celeste más claro
     * @param campo Es un JTextField
     */
    public void campoSeleccionado(JTextField campo) {
        
        for(JTextField colorInicial : listaAuxiliar) {
            colorInicial.setBackground(txtColorFondo1);
            colorInicial.setForeground(txtColorLetra1);
        }
        listaAuxiliar.clear();
        
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                pintarCampos();
                if(listaKenkenTxt[fila][columna] == campo) {
                    
                    for (int i = 0; i < listaKenkenTxt.length; i++) {
                        listaKenkenTxt[i][columna].setBackground(txtColorFondo2);
                        listaKenkenTxt[i][columna].setForeground(txtColorLetra2);
                        listaAuxiliar.add(listaKenkenTxt[i][columna]);
                    }
                    for (int i = 0; i < listaKenkenTxt[0].length; i++) {
                        listaKenkenTxt[fila][i].setBackground(txtColorFondo2);
                        listaKenkenTxt[fila][i].setForeground(txtColorLetra2);
                        listaAuxiliar.add(listaKenkenTxt[fila][i]);
                    }
                    
                    listaKenkenTxt[fila][columna].setBackground(txtColorFondo3);
                    listaKenkenTxt[fila][columna].setForeground(txtColorLetra3);
                    //listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                    filaGuardada = fila;
                    columnaGuardada = columna;
                    campoSeleccionado = true;
                    return;
                }
            }
        }
    }
    
    /**
     * Funcion que genera el juego del kenken en el tablero, según la dificultad seleccionada por el usuario
     * (facil, intermedio, dificil), según por el tablero que haya salido aleatoriamente en esa dificultad,
     * y según el tipo de cuadricula que se haya seleccionado, al asignarle diferentes tamaños de bordes 
     * a cada uno de los JTextField, y numeros sobre algunos JTextField, junto con
     * algun signo (+, -, /, *), para indicar que numeros deben colocarse, para dar ese resultado mostrado, y
     * todo esto se realiza con el patrón de diseño básico llamado Factory para crear el juego según el 
     * tipo de cuadricula, de una forma organizada
     */
    public void generarKenKen() {
        limpiarTablero();
        kenken.generarKenKen();
        KenkenFactory factory = new KenkenFactory();
        Cuadricula cuadricula = factory.construirCuadricula(tipo);
        
       
        
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                
                    cuadricula.crearCuadriculaKenken(fila, columna);
                
            }
        }
    }
    
    
    
    
    /**
     * Limpia el tablero del kenken, para dejar cada uno de los campos vacios
     */
    public void limpiarTablero() {
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                listaKenkenTxt[fila][columna].setText("");
            }
        }
    }
    
    
    
    /**
     * Funcion utilizada para que suene una musica
     * @param location nombre del archivo .wav de la musica
     */
    public static void musicaVictoria(String location) {
        
        try {
            
            File musicPath = new File(location);
            
            if(musicPath.exists()) {
                AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
            }
            else {
                System.out.println("Can't find file");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    /**
     * Valida que el tablero del kenken, con los numeros ingresados por el usuario sean los correctos,
     * en cada fila, columna, y a nivel del tablero según la dificultad que haya sido elegida, si el usuario
     * gana la partida, sonará una musica, y si no, se indicará en que casillas hay errores
     */
    public void validarKenKen() {
        int numeroCuadricula = 1;
        if (Configuraciones.cuadricula3x3 == true) {
            numeroCuadricula = 3;
        }
        if (Configuraciones.cuadricula4x4 == true) {
            numeroCuadricula = 4;
        }
        if (Configuraciones.cuadricula5x5 == true) {
            numeroCuadricula = 5;
        }
        if (Configuraciones.cuadricula6x6 == true) {
            numeroCuadricula = 6;
        }
        if (Configuraciones.cuadricula7x7 == true) {
            numeroCuadricula = 7;
        }
        if (Configuraciones.cuadricula8x8 == true) {
            numeroCuadricula = 8;
        }
        if (Configuraciones.cuadricula9x9 == true) {
            numeroCuadricula = 9;
        }
        int matrizRespuesta[][] = new int [numeroCuadricula][numeroCuadricula];
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                if(listaKenkenTxt[fila][columna].getText().isEmpty()) {
                    //JOptionPane.showMessageDialog(null, "HAY ERRORES EN EL JUEGO PORQUE HAY ESPACIOS VACIOS", "Error", JOptionPane.ERROR_MESSAGE);
                    //return;
                } else {
                    matrizRespuesta[fila][columna] = Integer.parseInt(listaKenkenTxt[fila][columna].getText());
                }
            }
        }
        kenken.setKenken(matrizRespuesta);
        if (kenken.comprobarKenKen()) {
            
            if (Configuraciones.escucharSonido == true) {
                String filepath = "KirbySuperStarVictory.wav";
                musicaVictoria(filepath);
            }
            interfazKenKen.contador.stop();
            interfazKenKen.contador2.stop();
            JOptionPane.showMessageDialog(null, "¡FELICITACIONES, JUEGO COMPLETADO!");
            victoria = true;
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "HAY ERRORES EN EL JUEGO", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
