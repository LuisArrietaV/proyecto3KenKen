
package com.mycompany.programa2kenken;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase llamada Numeros que se utiliza para mostrar y utilizar de manera correcta, el panel
 * de numeros, durante una partida del kenken
 * @author Luis Arrieta Viquez
 */

public class Numeros extends JPanel{
    
    private int altura;
    private int ancho;
    private int margen;
    private int tamano;
    private Color panel;
    private Color colorFondo1;
    private Color colorLetra1;
    private Color colorFondo2;
    private Color colorLetra2;
    private Tablero tableroKenken;
    public static Pilas movimientos;
    public static int numeroGuardado;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Color getPanel() {
        return panel;
    }

    public void setPanel(Color panel) {
        this.panel = panel;
    }

    public Color getColorFondo1() {
        return colorFondo1;
    }

    public void setColorFondo1(Color colorFondo1) {
        this.colorFondo1 = colorFondo1;
    }

    public Color getColorLetra1() {
        return colorLetra1;
    }

    public void setColorLetra1(Color colorLetra1) {
        this.colorLetra1 = colorLetra1;
    }

    public Color getColorFondo2() {
        return colorFondo2;
    }

    public void setColorFondo2(Color colorFondo2) {
        this.colorFondo2 = colorFondo2;
    }

    public Color getColorLetra2() {
        return colorLetra2;
    }

    public void setColorLetra2(Color colorLetra2) {
        this.colorLetra2 = colorLetra2;
    }

    /**
     * Carga el panel de numeros, y el tableroKenken
     */
    public Numeros() {
        cargarComponentes();
        tableroKenken = interfazKenKen.tableroKenKen;
    }
    
    /**
     * Le asigna a cada uno de los atributos, un valor inicial, que tendrá al 
     * ejecutar el Jframe Form de interfazKenKen
     */
    public void cargarComponentes() {
        altura = 36;
        ancho = 35;
        margen = 4;
        tamano = 25;
        panel = Color.BLACK;
        colorFondo1 = Color.WHITE;
        colorLetra1 = Color.BLACK;
        colorFondo2 = Color.WHITE;
        colorLetra2 = Color.BLACK;
        movimientos = new Pilas();
        numeroGuardado = 0;
    }
    
    /**
     * Crea el panel de numeros, al asiganrle su tamaño, posicion, y color, además de crear
     * cada uno de los campos, llamando a la funcion crearCampos()
     */
    public void crearPanelNumeros() {
        this.setLayout(null);
        this.setSize(ancho+(2*margen), altura*6+(2*margen));
        this.setBackground(panel);
        crearCampos();
    }
    
    /**
     * Crear cada uno de los JTextField, que van del 1 al 6, con su color de fondo,
     * color de letra, tamaño del borde, tipo de letra, posicion, y ancho y alto
     */
    public void crearCampos() {
        int posX = margen;
        int posY = margen;
        
        for (int fila = 0; fila < 6; fila++) {
            JTextField campo = new JTextField();
            this.add(campo);
            campo.setBounds(posX, posY, ancho, altura);
            campo.setBackground(colorFondo1);
            campo.setForeground(colorLetra1);
            campo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            campo.setEditable(false);
            campo.setBorder(BorderFactory.createLineBorder(panel, 1));
            campo.setFont(new Font("Arial", Font.BOLD, tamano));
            campo.setText(String.valueOf(fila+1));
            posY = posY + altura;
            accionTableroNumeros(campo);
    }
    
}
 
    /**
     * Funcion que se utiliza para indicar que accion realizar al presionar el panel de numeros,
     * ya que si solo se pasa el mouse por encima del panel de numeros, este cambiara su color, 
     * y al dar click a un JTextField del tablero y luego a un JTextField de este panel de numeros,
     * agregar ese numero a ese JTextField del tablero
     * @param campo JTextField del panel de numeros (Del 1 al 6)
     */
    public void accionTableroNumeros(JTextField campo) {
        MouseListener accion = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (tableroKenken.campoSeleccionado == false) {
                    JOptionPane.showMessageDialog(null, "PRIMERO DEBE SELECCIONAR UNA CASILLA");
                }
                
                tableroKenken.seleccionar.setText(campo.getText());
                numeroGuardado = Integer.parseInt(campo.getText());
                movimientos.push(numeroGuardado, Tablero.filaGuardada, Tablero.columnaGuardada);
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                campo.setBackground(colorFondo2);
                campo.setForeground(colorLetra2);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                campo.setBackground(colorFondo1);
                campo.setForeground(colorLetra1);
                
            }
            
        };
        campo.addMouseListener(accion);
        
    }
    
    
}
