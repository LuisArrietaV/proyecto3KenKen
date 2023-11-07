
package com.mycompany.programa2kenken;

import java.awt.Color;
import java.util.Random;

/**
 * Clase llamada Modelo, que se utiliza para comprobar que las filas, columnas y la matriz resultante esten correctan para
 * poder ganar la partida
 * @author Marce
 */

public class Modelo {
    
    private int kenken[][];
    public static int facil = 0;
    public static int intermedio = 0;
    public static int dificil = 0;
    public int matriz1[][] = {
            {5,4,6,2,3,1},
            {2,5,4,1,6,3},
            {1,2,3,4,5,6},
            {4,6,5,3,1,2},
            {3,1,2,6,4,5},
            {6,3,1,5,2,4},
        };
    public int matriz2[][] = {
            {5,4,6,2,3,1},
            {4,1,5,3,6,2},
            {2,6,1,4,5,3},
            {3,2,4,5,1,6},
            {1,3,2,6,4,5},
            {6,5,3,1,2,4},
        };
    public int matriz3[][] = {
            {1,3,5,2,4,6},
            {5,2,3,4,6,1},
            {2,1,4,6,3,5},
            {4,6,2,1,5,3},
            {6,5,1,3,2,4},
            {3,4,6,5,1,2},
        };
    public int matriz4[][] = {
            {1,4,2,3,6,5},
            {5,3,4,6,2,1},
            {6,1,3,2,5,4},
            {2,6,5,1,4,3},
            {4,2,1,5,3,6},
            {3,5,6,4,1,2},
        };
    public int matriz5[][] = {
            {1,6,5,4,3,2},
            {3,4,1,5,2,6},
            {2,1,3,6,4,5},
            {4,2,6,3,5,1},
            {5,3,2,1,6,4},
            {6,5,4,2,1,3},
        };
    public int matriz6[][] = {
            {1,4,2,3,5,6},
            {4,1,6,2,3,5},
            {6,5,3,1,2,4},
            {5,3,4,6,1,2},
            {3,2,5,4,6,1},
            {2,6,1,5,4,3},
        };
    public int matriz7[][] = {
            {6,1,2,3,4,5},
            {1,3,5,6,2,4},
            {4,6,1,5,3,2},
            {3,5,4,2,6,1},
            {2,4,3,1,5,6},
            {5,2,6,4,1,3},
        };
    public int matriz8[][] = {
            {5,1,6,3,2,4},
            {4,6,1,2,3,5},
            {3,5,2,4,1,6},
            {6,3,5,1,4,2},
            {1,2,4,6,5,3},
            {2,4,3,5,6,1},
        };
    public int matriz9[][] = {
            {2,4,3,5,1,6},
            {1,5,6,4,2,3},
            {6,1,2,3,5,4},
            {5,3,4,1,6,2},
            {3,6,5,2,4,1},
            {4,2,1,6,3,5},
        };

    public int[][] getKenken() {
        return kenken;
    }

    public void setKenken(int[][] kenken) {
        this.kenken = kenken;
    }
    
    /**
     * Funcion que se utiliza asignarle al atributo kenken el valor de [6][6], y limpi el tablero
     */
    
    public Modelo() {
        kenken = new int [6][6];
        limpiar();
    }
    
    /**
     * Funcion que se utiliza para comprobar si el kenken digitado por el usuario es el correcto,
     * en cada fila, columna
     * @return false, si el kenken es incorrecto, o true, si es correcto
     */
    public boolean resolverKenKen() {
        for (int fila = 0; fila < kenken.length; fila++) {
            for (int columna = 0; columna < kenken[0].length; columna++) {
                if(kenken[fila][columna] == 0) {
                    for (int numero = 1; numero <= 6; numero++){
                        if(comprobarFila(fila, numero) && comprobarColumna(columna, numero)) {
                            kenken[fila][columna] = numero;
                            if(resolverKenKen()) {
                                return true;
                            }
                            kenken[fila][columna] = 0;
                        }
                        
                    }
                    return false;
                }
            }
    }
        return true;
    }
    
    
    /**
     * Funcion que se utiliza para comprobar si el kenken digitado por el usuario es el correcto,
     * en cada fila, columna, y matriz dependiendo de la dificultad elegida
     * @return Retorna false, si el kenken es incorrecto, o true, si es correcto
     */
    public boolean comprobarKenKen() {
        for (int fila = 0; fila < kenken.length; fila++) {
            for (int columna = 0; columna < kenken[0].length; columna++) {
                int auxiliar = kenken[fila][columna];
                kenken[fila][columna] = 0;

                if (Configuraciones.dificultadFacil == true) {
                    if (comprobarFacil(fila, columna, auxiliar) == false) {
                        comprobarErrores();
                        return false;
                    }
                }
                if (Configuraciones.dificultadIntermedio == true) {
                    if (comprobarIntermedio(fila, columna, auxiliar) == false) {
                        comprobarErrores();
                        return false;
                    }
                }
                if (Configuraciones.dificultadDificil == true) {
                    if (comprobarDificil(fila, columna, auxiliar) == false) {
                        comprobarErrores();
                        return false;
                    }
                }
                
                if (!comprobarFila(fila, auxiliar) || !comprobarColumna(columna, auxiliar)) {
                    kenken[fila][columna] = auxiliar;
                    comprobarErrores();
                    return false;
                }
                
                kenken[fila][columna] = auxiliar;
            }
        }
        
        return true;
    }
    
    
    /**
     * Limpia el tablero del kenken, dejandolo vacio
     */
    public void limpiar() {
        for (int fila = 0; fila < kenken.length; fila++) {
            for (int columna = 0; columna < kenken[0].length; columna++) {
                kenken[fila][columna] = 0;
            }
        }
    }
    
    /**
     * Comprueba que cada fila no tenga numeros repetidos
     * @param fila Numero de la fila
     * @param numero numero exacto en esa fila
     * @return Retorna false, si la fila tiene numeros repetidos, o true en caso contrario
     */
    public boolean comprobarFila(int fila, int numero) {
        for (int i = 0; i < kenken[fila].length; i++) {
            if(kenken[fila][i] == numero) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Comprueba que cada columna no tenga numeros repetidos
     * @param columna Numero de la columna
     * @param numero Numero exacto en esa columna
     * @return Retorna false, si la columna tiene numeros repetidos, o true en caso contrario
     */
    public boolean comprobarColumna(int columna, int numero) {
        for (int i = 0; i < kenken.length; i++) {
            if(kenken[i][columna] == numero) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Comprueba que numeros del tablero kenken son los correctos, en caso contrario, pinta de color
     * rojo los numeros en posiciones incorrectas
     */
    public void comprobarErrores() {
        if (Configuraciones.dificultadFacil == true) {
            if (facil == 1) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz1[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {       
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (facil == 2) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                       
                        if(kenken[fila][columna] != matriz2[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (facil == 3) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        
                        if(kenken[fila][columna] != matriz3[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            System.out.println("Numero: " + kenken[fila][columna]);
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
                    
        
        }
        if (Configuraciones.dificultadIntermedio == true) {
            if (intermedio == 1) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz4[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (intermedio == 2) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz5[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (intermedio == 3) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz6[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
        }
        if (Configuraciones.dificultadDificil == true) {
            if (dificil == 1) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz7[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (dificil == 2) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz8[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
            if (dificil == 3) {
                for (int fila = 0; fila < kenken.length; fila++) {
                    for (int columna = 0; columna < kenken[0].length; columna++) {
                        if(kenken[fila][columna] != matriz9[fila][columna] && !Tablero.listaKenkenTxt[fila][columna].getText().isEmpty()) {
                            Tablero.listaKenkenTxt[fila][columna].setBackground(Color.RED);
                        }
                        
                    }
                    
                
                }
            }
        }
          
    }
    
    
    /**
     * Comprueba que los numeros ingresados por el usuario en el tablero del kenken
     * en dificultad facil sea la correcta dependiendo de cual tablero de esa dificultad haya salido
     * @param fila Numero de la fila
     * @param columna Numero de la columna
     * @param numero numero exacto a comparar en la fila y columna
     * @return Retorna false si el numero en la posicion exacta es incorrecto, o true en caso contrario
     */
    public boolean comprobarFacil(int fila, int columna, int numero) {
        if (facil == 1) {
                if(matriz1[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (facil == 2) {
                if(matriz2[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (facil == 3) {
                if(matriz3[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }  
          
        return true;
    }
    
    /**
     * Comprueba que los numeros ingresados por el usuario en el tablero del kenken
     * en dificultad intermedio sea la correcta dependiendo de cual tablero de esa dificultad haya salido
     * @param fila Numero de la fila
     * @param columna Numero de la columna
     * @param numero numero exacto a comparar en la fila y columna
     * @return Retorna false si el numero en la posicion exacta es incorrecto, o true en caso contrario
     */
    
    public boolean comprobarIntermedio(int fila, int columna, int numero) {
        if (intermedio == 1) {
                if(matriz4[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (intermedio == 2) {
                if(matriz5[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (intermedio == 3) {
                if(matriz6[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        
          
        return true;
    }
    
    
    /**
     * Comprueba que los numeros ingresados por el usuario en el tablero del kenken
     * en dificultad dificil sea la correcta dependiendo de cual tablero de esa dificultad haya salido
     * @param fila Numero de la fila
     * @param columna Numero de la columna
     * @param numero numero exacto a comparar en la fila y columna
     * @return Retorna false si el numero en la posicion exacta es incorrecto, o true en caso contrario
     */
    
    public boolean comprobarDificil(int fila, int columna, int numero) {
        if (dificil == 1) {
                if(matriz7[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (dificil == 2) {
                if(matriz8[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
        if (dificil == 3) {
                if(matriz9[fila][columna] != numero) {
                    return false;
                }
                
            return true;
           }
          
        return true;
    }
    
    /**
     * 
     * Imprime los numeros del tablero kenken
     * 
     */
    public void mostrarKenken() {
        resolverKenKen();
        for (int fila = 0; fila < kenken.length; fila++) {
            for (int columna = 0; columna < kenken[0].length; columna++) {
                System.out.print(kenken[fila][columna]);
                if(!(columna==kenken[0].length-1)) System.out.print(" - ");
                
            }
            System.out.println();
        }
    }
    
    /**
     * Genera un tablero nuevo dependiendo de la dificultad escogida por el usuario (facil, intermedio, dificil)
     */
    public void generarKenKen() {
        limpiar();
        Random random = new Random();
        int aleatorio = random.nextInt(3)+1;
        if (interfazKenKen.otroJuego != 0) {
            if (interfazKenKen.otroJuego == 1) {
                aleatorio = random.nextInt(2, 3);
            }
            if (interfazKenKen.otroJuego == 2) {
                aleatorio = 2;
                while (aleatorio == 2) {
                    aleatorio = random.nextInt(3)+1;
                }
            }
            if (interfazKenKen.otroJuego == 3){
                aleatorio = random.nextInt(2)+1;
            }
        }
        if (Configuraciones.dificultadFacil == true) {
            facil = aleatorio;
            System.out.println("Facil: " + facil);
        }
        if (Configuraciones.dificultadIntermedio == true) {
            intermedio = aleatorio;
            System.out.println("Intermedio: " + intermedio);
        }
        if (Configuraciones.dificultadDificil == true) {
            dificil = aleatorio;
            System.out.println("Dificil: " + dificil);
        }
        
        
    
}
    
    
    
}
