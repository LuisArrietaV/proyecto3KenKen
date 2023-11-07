
package com.mycompany.programa2kenken;

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
    private Color colorPanel;
    private Color txtColorFondo1;
    private Color txtColorLetra1;
    private Color txtColorFondo2;
    private Color txtColorLetra2;
    private Color txtColorFondo3;
    private Color txtColorLetra3;
    private Modelo kenken;
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
        listaKenkenTxt = new JTextField[6][6];
        texto = new JLabel();
        txtAltura = 36;
        txtAncho = 35;
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
        this.setSize(txtAncho*6+(txtMargen*2), txtAltura*6+(txtMargen*2));
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
     * poder ingresar un numero del 1 al 6 apartir del teclado, o almacenar cual es la posicion exacta, del
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
                
                if(e.getKeyChar()>= 49 && e.getKeyChar() <= 54) {
                    campo.setText(String.valueOf(e.getKeyChar()));
                    Numeros.numeroGuardado = Integer.parseInt(campo.getText());
                    Numeros.movimientos.push(Numeros.numeroGuardado, filaGuardada, columnaGuardada);
                    
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
     * (facil, intermedio, dificil), y según por el tablero que haya salido aleatoriamente en esa dificultad,
     * al asignarle diferentes tamaños de bordes a cada uno de los JTextField, y numeros sobre algunos JTextField, junto con
     * algun signo (+, -, /, *), para indicar que numeros deben colocarse, para dar ese resultado mostrado.
     */
    public void generarKenKen(){
        limpiarTablero();
        kenken.generarKenKen();
        for (int fila = 0; fila < listaKenkenTxt.length; fila++) {
            for (int columna = 0; columna < listaKenkenTxt[0].length; columna++) {
                
                
                if (Configuraciones.dificultadFacil == true) {
                    
                
                if (Modelo.facil == 1) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    
                    if (fila == 0 && columna == 1 ) {
                    
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    
                    
                }
                if (fila == 1 && columna == 0) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 0 && columna == 2) {
                    PlaceHolders placeholder = new PlaceHolders("120x", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                }
                if (fila == 1 && columna == 2) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 1 && columna == 1) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                }
                if (fila == 0 && columna == 3) {
                    PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                }
                if (fila == 1 && columna == 3) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 0 && columna == 4) {
                    PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 0 && columna == 5) {
                    PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));   
                }
                if (fila == 1 && columna == 4) {
                    PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                }
                if (fila == 1 && columna == 5) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 4, 4, 1, colorPanel));
                }
                if (fila == 2 && columna == 0) {
                    PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                }
                if (fila == 2 && columna == 1) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 2 && columna == 2) {
                    PlaceHolders placeholder = new PlaceHolders("15X", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                }
                if (fila == 2 && columna == 3) {
                    PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                }
                if (fila == 2 && columna == 5) {
                    PlaceHolders placeholder = new PlaceHolders("6", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 4, 1, 1, colorPanel));
                }
                if (fila == 3 && columna == 0) {
                    PlaceHolders placeholder = new PlaceHolders("72X", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                }
                if (fila == 3 && columna == 1) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 3 && columna == 2) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 3 && columna == 3) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 3 && columna == 4) {
                    PlaceHolders placeholder = new PlaceHolders("8X", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(4, 1, 1, 1, colorPanel));
                }
                if (fila == 3 && columna == 5) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(4, 1, 4, 1, colorPanel));
                }
                if (fila == 4 && columna == 0) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 4 && columna == 1) {
                    PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                }
                if (fila == 4 && columna == 2) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 4 && columna == 3) {
                    PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                }
                if (fila == 4 && columna == 4) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                }
                if (fila == 4 && columna == 5) {
                    PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                }
                if (fila == 5 && columna == 0) {
                    PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                }
                if (fila == 5 && columna == 2) {
                    PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                    placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 4, 1, 4, colorPanel));
                }
                if (fila == 5 && columna == 5) {
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 4, 1, 1, colorPanel));
                }
                }
                if (Modelo.facil == 2) {
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));
                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("80x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    
                    if (fila == 0 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 3) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 5) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 1) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 3) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("5", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("14+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 3 && columna == 0) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 1) {
                        PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 2) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 3) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4) {
                        PlaceHolders placeholder = new PlaceHolders("8x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 0) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 1) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 3) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 4) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 5) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 5 && columna == 0) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 1) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 2) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 3) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 4) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 5) {
                        PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                }
                if (Modelo.facil == 3) {
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));
                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    
                    if (fila == 0 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("40x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("16+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("75x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                }
            }
             if (Configuraciones.dificultadIntermedio == true) {
                    
                
                if (Modelo.intermedio == 1) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 0 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("36x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("30x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 0 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 2 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("20x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 3 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 4 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    
              }
              if (Modelo.intermedio == 2) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 0 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("8x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 2 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 2 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("120x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 2 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 3 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 3 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 3 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 3 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 4 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 4 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 4 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("20x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                }
                 if (Modelo.intermedio == 3) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("8x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 0 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 0 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 1 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 3 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));             
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 3 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 4 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 4 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                    if (fila == 5 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));             
                    }
                }
            }
             
            if (Configuraciones.dificultadDificil == true) {
                    
                
                if (Modelo.dificil == 1) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 0 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("24x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("20x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("5", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
            }
            
            if (Modelo.dificil == 2) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("20x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 0 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 0 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("36x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 4 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("15x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 5 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    
            }
            if (Modelo.dificil == 3) {
                    
                    listaKenkenTxt[fila][columna].removeAll();
                    listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                    
                    if (fila == 0 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("15x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 0 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 0 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 1 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 1 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 1 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("90x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 2 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 2 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 2 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("48x", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 3 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 1 ) {
                        PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 3 && columna == 2 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 3 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 3 && columna == 5 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                    }
                    if (fila == 4 && columna == 0 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 2 ) {
                        PlaceHolders placeholder = new PlaceHolders("5", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 3 ) {
                        PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 4 ) {
                        PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 4 && columna == 5 ) {
                        PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 0 ) {
                        PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                        placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                    }
                    if (fila == 5 && columna == 1 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 3 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    if (fila == 5 && columna == 4 ) {
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                    }
                    
            }
          }
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
        int matrizRespuesta[][] = new int [6][6];
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
            JOptionPane.showMessageDialog(null, "¡FELICITACIONES, JUEGO COMPLETADO!");
            victoria = true;
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "HAY ERRORES EN EL JUEGO", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
