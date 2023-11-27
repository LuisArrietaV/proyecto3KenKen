
package com.mycompany.programa3kenken;

import static com.mycompany.programa3kenken.Tablero.listaKenkenTxt;
import static com.mycompany.programa3kenken.Tablero.colorPanel;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 * Clase llamada Cuadricula_7x7, utilizada para generar el juego del tablero del kenken 7x7, 
 * implementando la funcion crearCuadriculaKenken de la interfaz Cuadricula, al tener una asociacion
 * @author Luis Arrieta
 */
public class Cuadricula_7x7 implements Cuadricula{
    
    
    /**
     * Funcion que genera el juego del Kenken 7x7 según por el tipo de dificultad seleccionada,
     * y el numero aleatorio del 1 al 3, al asignarle a cada campo del tablero un borde o numero
     * a modo de Place holder
     * @param fila numero de fila del tablero
     * @param columna numero de columna del tablero
     */
    @Override
    public void crearCuadriculaKenken(int fila, int columna)  {
        
        listaKenkenTxt[fila][columna].setForeground(colorPanel);
                    
                if (Configuraciones.dificultadFacil == true) {
                    
                
                        if (Modelo.facil == 1) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("112x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 0 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 3 ) {
                                PlaceHolders placeholder = new PlaceHolders("90x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 4 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }

                            if (fila == 1 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("6", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("48x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("30", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("140x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("80x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("18+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("18x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                        }
                        
                        if (Modelo.facil == 2) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("45x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }

                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
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
                                PlaceHolders placeholder = new PlaceHolders("42x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("40x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("8x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("40x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("54x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("10x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 6 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("6", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("40x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                        }
                        
                        if (Modelo.facil == 3) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("140x", listaKenkenTxt[fila][columna]);
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
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("30x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
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
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("126x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("10x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("15x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                        }
                        
                    }
                    
                    if (Configuraciones.dificultadIntermedio == true) {
                    
                
                        if (Modelo.intermedio == 1) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("56x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }

                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 3 ) {                               
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 4 ) {
                                PlaceHolders placeholder = new PlaceHolders("24x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 0 && columna == 5 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("14x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 3 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("5-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 5 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 6 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("5", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                        }
                        
                        if (Modelo.intermedio == 2) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 0 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 3 ) {                               
                                PlaceHolders placeholder = new PlaceHolders("14+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 0 && columna == 4 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("28x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 3 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("35x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("4x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 6 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("70x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                        }
                        
                        if (Modelo.intermedio == 3) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
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
                                PlaceHolders placeholder = new PlaceHolders("35x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("6", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("14x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("72x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 3 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("60x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("35x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("18x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("3-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 6 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            
                        }
                        
                    }
                    
                    if (Configuraciones.dificultadDificil == true) {
                    
                
                        if (Modelo.dificil == 1) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("84x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }

                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
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
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("175x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("120x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("36x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("10+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("40x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("7+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("13+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("35x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                        }
                        
                        if (Modelo.dificil == 2) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            if (fila == 0 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 3 ) {
                                PlaceHolders placeholder = new PlaceHolders("10x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 4 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                PlaceHolders placeholder = new PlaceHolders("168x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 0 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("11+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("21x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("14+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("7", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("15+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 6 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("7", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                        }
                        
                        if (Modelo.dificil == 3) {

                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));


                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("84x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }

                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 3 ) {
                                PlaceHolders placeholder = new PlaceHolders("4-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 4 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 5 ) {
                                PlaceHolders placeholder = new PlaceHolders("6-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("4", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }

                            if (fila == 1 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("12+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            
                            if (fila == 1 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1) {
                                PlaceHolders placeholder = new PlaceHolders("15x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 3 && columna == 0) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 3 && columna == 5) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 3 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 2) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 3) {
                                PlaceHolders placeholder = new PlaceHolders("35x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 4 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("24x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 4 && columna == 6) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("15x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 5 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("168x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 5 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 4) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 5) {
                                PlaceHolders placeholder = new PlaceHolders("6", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 5 && columna == 6) {
                                PlaceHolders placeholder = new PlaceHolders("9+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 0) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 6 && columna == 1) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 3) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 6 && columna == 4) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }

                            
                        }
                        
                    }
                
            }
        
    
}
