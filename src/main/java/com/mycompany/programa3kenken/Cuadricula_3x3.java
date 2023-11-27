
package com.mycompany.programa3kenken;

import static com.mycompany.programa3kenken.Tablero.colorPanel;
import static com.mycompany.programa3kenken.Tablero.listaKenkenTxt;
import java.awt.Font;
import javax.swing.BorderFactory;


/**
 * Clase llamada Cuadricula_3x3, utilizada para generar el juego del tablero del kenken 3x3, 
 * implementando la funcion crearCuadriculaKenken de la interfaz Cuadricula, al tener una asociacion
 * @author Luis Arrieta
 */
public class Cuadricula_3x3 implements Cuadricula{
    
    /**
     * Funcion que genera el juego del Kenken 3x3 según por el tipo de dificultad seleccionada,
     * y el numero aleatorio del 1 al 3, al asignarle a cada campo del tablero un borde o numero
     * a modo de Place holder
     * @param fila numero de la fila del tablero
     * @param columna numero de la columna del tablero
     */
    @Override
    public void crearCuadriculaKenken(int fila, int columna) {
        
        listaKenkenTxt[fila][columna].setForeground(colorPanel);
        
        if (Configuraciones.dificultadFacil == true) {
                                    
                        if (Modelo.facil == 1) {
                    
                        listaKenkenTxt[fila][columna].removeAll();
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                        if (fila == 0 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 0 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("3/", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                        }
                        if (fila == 0 && columna == 2 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                        }
                        if (fila == 1 && columna == 0 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 2 ) {
                            PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        }
                        if (fila == 2 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 2 && columna == 1 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        
                        }
                        
                        if (Modelo.facil == 2) {
                    
                        listaKenkenTxt[fila][columna].removeAll();
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                        if (fila == 0 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                        }
                        if (fila == 0 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 0 && columna == 2 ) {
                            PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        }
                        if (fila == 1 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 1 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 2 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                        }
                        if (fila == 2 && columna == 0 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 2 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        }
                        
                        }
                        
                        if (Modelo.facil == 2) {
                    
                        listaKenkenTxt[fila][columna].removeAll();
                        listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                        if (fila == 0 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                        }
                        if (fila == 0 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 0 && columna == 2 ) {
                            PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        }
                        if (fila == 1 && columna == 0 ) {
                            PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 1 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                        }
                        if (fila == 1 && columna == 2 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                        }
                        if (fila == 2 && columna == 0 ) {
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                        }
                        if (fila == 2 && columna == 1 ) {
                            PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                            placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                        }
                        
                        }
                        
                        if (Modelo.facil == 3) {
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("3+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                             }
                        }
                        
                    }
                    
                    if (Configuraciones.dificultadIntermedio == true) {
                        
                        if (Modelo.intermedio == 1) {
                    
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
                                PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 2) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                                
                        }
                        
                        if (Modelo.intermedio == 2) {
                    
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("3x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 0 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("6+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                                
                        }
                        
                        if (Modelo.intermedio == 3) {
                    
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 1 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 2 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                                
                        }
                        
                        
                    }
                    
                    if (Configuraciones.dificultadDificil == true) {
                        
                        if (Modelo.dificil == 1) {
                    
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("12x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));

                            }
                            if (fila == 1 && columna == 0 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("8+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                                
                        }
                        
                        if (Modelo.dificil == 2) {
                    
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));

                            }
                            if (fila == 1 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("2/", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("2-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 0 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 2 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("3", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                        }
                        
                        if (Modelo.dificil == 3) {
                    
                            listaKenkenTxt[fila][columna].removeAll();
                            listaKenkenTxt[fila][columna].setBorder(BorderFactory.createLineBorder(colorPanel, 1));

                            if (fila == 0 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("1", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 0 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("1-", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));
                            }
                            if (fila == 0 && columna == 2 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 1, colorPanel));

                            }
                            if (fila == 1 && columna == 0 ) {
                                PlaceHolders placeholder = new PlaceHolders("6x", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 1 ) {
                                PlaceHolders placeholder = new PlaceHolders("2", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 4, 4, colorPanel));
                            }
                            if (fila == 1 && columna == 2 ) {
                                PlaceHolders placeholder = new PlaceHolders("5+", listaKenkenTxt[fila][columna]);
                                placeholder.setFont(new Font("Arial", Font.BOLD, 9));
                            }
                            if (fila == 2 && columna == 0 ) {
                                listaKenkenTxt[fila][columna].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 4, colorPanel));
                            }
                            
                        }
                        
                    }
        
    }
    
}