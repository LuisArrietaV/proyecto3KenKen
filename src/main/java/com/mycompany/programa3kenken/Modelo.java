
package com.mycompany.programa3kenken;

import java.awt.Color;
import java.util.Random;

/**
 * Clase llamada Modelo, que se utiliza para comprobar que las filas, columnas y la matriz resultante esten correctan para
 * poder ganar la partida
 * @author Luis Arrieta
 */

public class Modelo {
    
    private int kenken[][];
    public static int facil = 0;
    public static int intermedio = 0;
    public static int dificil = 0;
    public static int matriz1[][];
    public static int matriz2[][];
    public static int matriz3[][];
    public static int matriz4[][];
    public static int matriz5[][];
    public static int matriz6[][];
    public static int matriz7[][];
    public static int matriz8[][];
    public static int matriz9[][];
    
    public int matriz1_3x3[][] = {
            {2,1,3},
            {3,2,1},
            {1,3,2},
        };
    public int matriz2_3x3[][] = {
            {3,2,1},
            {1,3,2},
            {2,1,3},
        };
    public int matriz3_3x3[][] = {
            {1,3,2},
            {2,1,3},
            {3,2,1},
        };
    public int matriz4_3x3[][] = {
            {2,1,3},
            {1,3,2},
            {3,2,1},
        };
    public int matriz5_3x3[][] = {
            {1,2,3},
            {3,1,2},
            {2,3,1},
        };
    public int matriz6_3x3[][] = {
            {3,1,2},
            {2,3,1},
            {1,2,3},
        };
    public int matriz7_3x3[][] = {
            {3,2,1},
            {2,1,3},
            {1,3,2},
        };
    public int matriz8_3x3[][] = {
            {3,1,2},
            {1,2,3},
            {2,3,1},
        };
    public int matriz9_3x3[][] = {
            {1,3,2},
            {3,2,1},
            {2,1,3},
        };
    
    public int matriz1_4x4[][] = {
            {2,4,3,1},
            {4,2,1,3},
            {3,1,4,2},
            {1,3,2,4},
        };
    
    public int matriz2_4x4[][] = {
            {1,3,4,2},
            {4,2,1,3},
            {2,4,3,1},
            {3,1,2,4},
        };
    
    public int matriz3_4x4[][] = {
            {1,2,4,3},
            {2,4,3,1},
            {3,1,2,4},
            {4,3,1,2},
        };
    
    public int matriz4_4x4[][] = {
            {3,2,4,1},
            {1,3,2,4},
            {2,4,1,3},
            {4,1,3,2},
        };
    
    public int matriz5_4x4[][] = {
            {2,4,1,3},
            {4,3,2,1},
            {1,2,3,4},
            {3,1,4,2},
        };
    
    public int matriz6_4x4[][] = {
            {1,2,3,4},
            {2,1,4,3},
            {4,3,2,1},
            {3,4,1,2},
        };
    
    public int matriz7_4x4[][] = {
            {4,2,1,3},
            {2,1,3,4},
            {1,3,4,2},
            {3,4,2,1},
        };
    
    public int matriz8_4x4[][] = {
            {2,4,3,1},
            {1,3,2,4},
            {4,2,1,3},
            {3,1,4,2},
        };
    
    public int matriz9_4x4[][] = {
            {3,2,1,4},
            {1,4,2,3},
            {4,1,3,2},
            {2,3,4,1},
        };
    
    public int matriz1_5x5[][] = {
            {2,5,3,1,4},
            {3,1,4,5,2},
            {1,3,2,4,5},
            {4,2,5,3,1},
            {5,4,1,2,3},
        };
    
    public int matriz2_5x5[][] = {
            {3,5,2,4,1},
            {1,3,4,2,5},
            {5,2,1,3,4},
            {2,4,5,1,3},
            {4,1,3,5,2},
        };
    
    public int matriz3_5x5[][] = {
            {2,5,1,4,3},
            {3,4,5,2,1},
            {1,3,4,5,2},
            {5,1,2,3,4},
            {4,2,3,1,5},
        };
    
    public int matriz4_5x5[][] = {
            {1,5,4,3,2},
            {3,4,1,2,5},
            {4,3,2,5,1},
            {5,2,3,1,4},
            {2,1,5,4,3},
        };
    
    public int matriz5_5x5[][] = {
            {1,4,2,3,5},
            {2,3,5,4,1},
            {5,1,3,2,4},
            {4,2,1,5,3},
            {3,5,4,1,2},
        };
    
    public int matriz6_5x5[][] = {
            {5,4,1,3,2},
            {2,5,4,1,3},
            {4,2,3,5,1},
            {3,1,2,4,5},
            {1,3,5,2,4},
        };
    
    public int matriz7_5x5[][] = {
            {4,1,5,2,3},
            {5,4,2,3,1},
            {2,3,4,1,5},
            {3,5,1,4,2},
            {1,2,3,5,4},
        };
    
    public int matriz8_5x5[][] = {
            {2,3,4,1,5},
            {5,4,2,3,1},
            {3,5,1,2,4},
            {1,2,5,4,3},
            {4,1,3,5,2},
        };
    
    public int matriz9_5x5[][] = {
            {3,4,5,1,2},
            {1,2,3,4,5},
            {2,1,4,5,3},
            {4,5,2,3,1},
            {5,3,1,2,4},
        };
    
    public int matriz1_6x6[][] = {
            {5,4,6,2,3,1},
            {2,5,4,1,6,3},
            {1,2,3,4,5,6},
            {4,6,5,3,1,2},
            {3,1,2,6,4,5},
            {6,3,1,5,2,4},
    };
    
    public int matriz2_6x6[][] = {
            {5,4,6,2,3,1},
            {4,1,5,3,6,2},
            {2,6,1,4,5,3},
            {3,2,4,5,1,6},
            {1,3,2,6,4,5},
            {6,5,3,1,2,4},
    };

    public int matriz3_6x6[][] = {
            {1,3,5,2,4,6},
            {5,2,3,4,6,1},
            {2,1,4,6,3,5},
            {4,6,2,1,5,3},
            {6,5,1,3,2,4},
            {3,4,6,5,1,2},
    };
    
    public int matriz4_6x6[][] = {
            {1,4,2,3,6,5},
            {5,3,4,6,2,1},
            {6,1,3,2,5,4},
            {2,6,5,1,4,3},
            {4,2,1,5,3,6},
            {3,5,6,4,1,2},
    };
    
    public int matriz5_6x6[][] = {
            {1,6,5,4,3,2},
            {3,4,1,5,2,6},
            {2,1,3,6,4,5},
            {4,2,6,3,5,1},
            {5,3,2,1,6,4},
            {6,5,4,2,1,3},
    };
    
    public int matriz6_6x6[][] = {
            {1,4,2,3,5,6},
            {4,1,6,2,3,5},
            {6,5,3,1,2,4},
            {5,3,4,6,1,2},
            {3,2,5,4,6,1},
            {2,6,1,5,4,3},
    };
    
    public int matriz7_6x6[][] = {
            {6,1,2,3,4,5},
            {1,3,5,6,2,4},
            {4,6,1,5,3,2},
            {3,5,4,2,6,1},
            {2,4,3,1,5,6},
            {5,2,6,4,1,3},
    };
    
    public int matriz8_6x6[][] = {
            {5,1,6,3,2,4},
            {4,6,1,2,3,5},
            {3,5,2,4,1,6},
            {6,3,5,1,4,2},
            {1,2,4,6,5,3},
            {2,4,3,5,6,1},
    };
    
    public int matriz9_6x6[][] = {
            {2,4,3,5,1,6},
            {1,5,6,4,2,3},
            {6,1,2,3,5,4},
            {5,3,4,1,6,2},
            {3,6,5,2,4,1},
            {4,2,1,6,3,5},
    };
    
    public int matriz1_7x7[][] = {
            {4,7,1,6,3,5,2},
            {7,4,5,1,6,2,3},
            {5,6,2,3,1,4,7},
            {1,5,3,7,2,6,4},
            {6,2,4,5,7,3,1},
            {2,3,7,4,5,1,6},
            {3,1,6,2,4,7,5},
    };
    
    public int matriz2_7x7[][] = {
            {3,5,1,2,6,7,4},
            {7,3,5,1,4,2,6},
            {1,7,2,4,3,6,5},
            {2,1,3,6,5,4,7},
            {4,6,7,3,1,5,2},
            {5,4,6,7,2,3,1},
            {6,2,4,5,7,1,3},
    };
    
    public int matriz3_7x7[][] = {
            {5,7,3,6,1,4,2},
            {4,6,5,2,7,1,3},
            {2,5,1,4,6,3,7},
            {1,2,4,3,5,7,6},
            {3,1,2,7,4,6,5},
            {7,3,6,1,2,5,4},
            {6,4,7,5,3,2,1},
    };
    
    public int matriz4_7x7[][] = {
            {7,2,3,6,1,4,5},
            {4,3,7,5,6,1,2},
            {1,7,2,3,4,5,6},
            {3,4,6,1,5,2,7},
            {5,6,4,7,2,3,1},
            {2,1,5,4,7,6,3},
            {6,5,1,2,3,7,4},
    };
    
    public int matriz5_7x7[][] = {
            {3,7,4,2,6,1,5},
            {5,2,1,6,3,4,7},
            {6,5,2,1,4,7,3},
            {2,3,6,7,1,5,4},
            {4,6,5,3,7,2,1},
            {7,1,3,4,5,6,2},
            {1,4,7,5,2,3,6},
    };
    
    public int matriz6_7x7[][] = {
            {1,2,3,6,7,5,4},
            {6,4,2,7,5,3,1},
            {7,5,6,2,1,4,3},
            {2,1,7,4,3,6,5},
            {4,7,5,3,2,1,6},
            {5,3,4,1,6,2,7},
            {3,6,1,5,4,7,2},
    };
    
    public int matriz7_7x7[][] = {
            {3,4,2,7,6,1,5},
            {7,5,1,2,3,6,4},
            {5,7,4,3,1,2,6},
            {4,2,5,6,7,3,1},
            {6,3,7,1,5,4,2},
            {1,6,3,4,2,5,7},
            {2,1,6,5,4,7,3},
    };
    
    public int matriz8_7x7[][] = {
            {7,1,3,2,5,6,4},
            {1,2,5,4,3,7,6},
            {2,3,7,1,6,4,5},
            {6,5,4,3,7,1,2},
            {5,6,1,7,4,2,3},
            {4,7,6,5,2,3,1},
            {3,4,2,6,1,5,7},
    };
    
    public int matriz9_7x7[][] = {
            {2,6,4,1,5,7,3},
            {7,4,6,2,3,1,5},
            {4,3,5,7,6,2,1},
            {6,1,2,3,4,5,7},
            {1,2,3,5,7,4,6},
            {3,5,7,4,1,6,2},
            {5,7,1,6,2,3,4},
    };
    
    public int matriz1_8x8[][] = {
            {2,1,6,8,4,3,5,7},
            {7,5,8,4,2,6,1,3},
            {3,4,5,7,8,1,2,6},
            {6,2,1,3,5,8,7,4},
            {4,8,3,1,7,2,6,5},
            {8,6,4,5,1,7,3,2},
            {1,7,2,6,3,5,4,8},
            {5,3,7,2,6,4,8,1},
    };
    
    public int matriz2_8x8[][] = {
            {3,6,2,5,7,4,1,8},
            {7,8,5,6,1,2,4,3},
            {1,7,8,4,3,6,5,2},
            {2,3,4,8,6,5,7,1},
            {6,5,3,7,2,1,8,4},
            {4,1,6,2,8,7,3,5},
            {5,2,1,3,4,8,6,7},
            {8,4,7,1,5,3,2,6},
    };
    
    public int matriz3_8x8[][] = {
            {6,3,4,5,7,1,8,2},
            {5,7,8,3,1,4,2,6},
            {3,2,7,6,4,8,5,1},
            {2,4,3,7,5,6,1,8},
            {4,5,2,1,8,7,6,3},
            {1,6,5,8,3,2,7,4},
            {8,1,6,4,2,5,3,7},
            {7,8,1,2,6,3,4,5},
    };
    
    public int matriz4_8x8[][] = {
            {7,4,1,3,5,6,2,8},
            {5,2,6,7,3,1,8,4},
            {2,7,8,1,4,5,6,3},
            {4,5,3,2,6,8,7,1},
            {8,6,5,4,7,3,1,2},
            {1,3,4,8,2,7,5,6},
            {3,8,7,6,1,2,4,5},
            {6,1,2,5,8,4,3,7},
    };
    
    public int matriz5_8x8[][] = {
            {8,1,3,5,4,7,2,6},
            {3,6,4,7,2,8,5,1},
            {5,7,8,2,1,3,6,4},
            {2,4,5,3,8,6,1,7},
            {4,8,6,1,3,5,7,2},
            {7,3,1,6,5,2,4,8},
            {6,5,2,4,7,1,8,3},
            {1,2,7,8,6,4,3,5},
    };
    
    public int matriz6_8x8[][] = {
            {1,2,7,6,4,8,3,5},
            {5,6,3,2,8,7,4,1},
            {6,4,8,1,5,3,7,2},
            {4,5,6,8,7,2,1,3},
            {8,1,2,3,6,4,5,7},
            {3,7,5,4,2,1,8,6},
            {2,3,4,7,1,5,6,8},
            {7,8,1,5,3,6,2,4},
    };
    
    public int matriz7_8x8[][] = {
            {2,4,3,7,6,8,5,1},
            {4,6,5,3,2,7,1,8},
            {8,5,4,6,1,3,7,2},
            {1,3,6,4,7,2,8,5},
            {3,7,2,1,8,5,6,4},
            {7,8,1,2,5,6,4,3},
            {5,1,7,8,3,4,2,6},
            {6,2,8,5,4,1,3,7},
    };
    
    public int matriz8_8x8[][] = {
            {2,3,4,6,7,5,1,8},
            {7,1,8,5,2,6,3,4},
            {4,2,1,7,8,3,5,6},
            {5,4,2,8,3,1,6,7},
            {1,5,7,3,6,8,4,2},
            {8,6,5,4,1,2,7,3},
            {6,8,3,1,4,7,2,5},
            {3,7,6,2,5,4,8,1},
    };
    
    public int matriz9_8x8[][] = {
            {7,5,1,3,6,4,8,2},
            {2,6,7,5,3,8,4,1},
            {3,4,5,1,8,6,2,7},
            {4,8,6,7,5,2,1,3},
            {1,2,3,6,4,5,7,8},
            {6,7,4,8,2,1,3,5},
            {8,1,2,4,7,3,5,6},
            {5,3,8,2,1,7,6,4},
    };
    
    public int matriz1_9x9[][] = {
            {4,6,3,9,8,5,1,2,7},
            {5,9,1,6,4,8,3,7,2},
            {1,8,6,3,5,7,2,9,4},
            {7,1,4,8,6,2,9,3,5},
            {3,7,8,2,9,6,5,4,1},
            {2,5,7,1,3,9,4,6,8},
            {9,4,5,7,2,3,8,1,6},
            {6,3,2,5,1,4,7,8,9},
            {8,2,9,4,7,1,6,5,3},
    };
    
    public int matriz2_9x9[][] = {
            {2,1,7,5,3,6,8,9,4},
            {8,3,6,2,1,7,4,5,9},
            {4,8,9,7,5,3,2,1,6},
            {7,9,5,3,2,8,6,4,1},
            {9,6,8,4,7,2,1,3,5},
            {6,2,3,9,4,1,5,7,8},
            {3,7,4,1,6,5,9,8,2},
            {1,5,2,8,9,4,3,6,7},
            {5,4,1,6,8,9,7,2,3},
    };
    
    public int matriz3_9x9[][] = {
            {5,8,1,2,9,3,6,7,4},
            {7,5,8,6,3,9,2,4,1},
            {1,6,2,7,4,8,3,9,5},
            {6,2,3,8,1,4,7,5,9},
            {9,1,6,3,5,7,4,8,2},
            {8,3,4,1,2,5,9,6,7},
            {2,4,7,9,8,1,5,3,6},
            {4,7,9,5,6,2,8,1,3},
            {3,9,5,4,7,6,1,2,8},
    };
    
    public int matriz4_9x9[][] = {
            {2,4,8,9,3,1,6,5,7},
            {7,2,1,8,9,3,4,6,5},
            {5,1,6,3,8,2,7,4,9},
            {8,5,7,1,4,9,3,2,6},
            {1,6,3,2,5,4,9,7,8},
            {9,8,4,7,2,6,5,3,1},
            {6,9,5,4,7,8,2,1,3},
            {3,7,2,6,1,5,8,9,4},
            {4,3,9,5,6,7,1,8,2},
    };
    
    public int matriz5_9x9[][] = {
            {7,3,9,5,4,1,2,6,8},
            {6,4,3,2,8,5,1,9,7},
            {8,2,1,4,6,9,5,7,3},
            {5,6,2,9,3,8,7,1,4},
            {9,5,8,1,2,7,4,3,6},
            {2,7,4,8,1,3,6,5,9},
            {1,8,5,3,7,6,9,4,2},
            {4,9,7,6,5,2,3,8,1},
            {3,1,6,7,9,4,8,2,5},
    };
    
    public int matriz6_9x9[][] = {
            {5,7,2,8,3,4,6,9,1},
            {6,5,3,2,9,7,8,1,4},
            {8,3,7,4,2,5,1,6,9},
            {4,8,5,9,1,6,3,2,7},
            {9,4,6,3,8,1,7,5,2},
            {1,9,8,5,4,3,2,7,6},
            {7,2,1,6,5,9,4,3,8},
            {3,1,4,7,6,2,9,8,5},
            {2,6,9,1,7,8,5,4,3},
    };
    
    public int matriz7_9x9[][] = {
            {6,4,8,1,2,3,7,9,5},
            {5,3,6,9,7,8,1,2,4},
            {9,1,2,6,3,5,4,7,8},
            {3,8,4,5,9,6,2,1,7},
            {7,9,1,2,6,4,8,5,3},
            {1,6,5,4,8,7,9,3,2},
            {8,5,3,7,1,2,6,4,9},
            {4,2,7,8,5,9,3,6,1},
            {2,7,9,3,4,1,5,8,6},
    };
    
    public int matriz8_9x9[][] = {
            {7,9,8,6,1,2,4,5,3},
            {3,4,2,8,9,6,7,1,5},
            {6,2,3,7,8,4,5,9,1},
            {2,6,5,3,7,1,9,8,4},
            {1,3,7,4,2,5,8,6,9},
            {9,1,4,5,6,8,2,3,7},
            {5,7,6,9,4,3,1,2,8},
            {8,5,9,1,3,7,6,4,2},
            {4,8,1,2,5,9,3,7,6},
    };
    
    public int matriz9_9x9[][] = {
            {5,2,7,6,4,8,1,3,9},
            {7,8,1,2,9,5,4,6,3},
            {9,5,2,3,7,1,8,4,6},
            {4,9,5,8,2,6,3,7,1},
            {6,1,8,9,3,7,2,5,4},
            {8,3,6,7,1,4,9,2,5},
            {2,6,4,1,8,3,5,9,7},
            {1,7,3,4,5,9,6,8,2},
            {3,4,9,5,6,2,7,1,8},
    };
    
    
    
    public int[][] getKenken() {
        return kenken;
    }

    public void setKenken(int[][] kenken) {
        this.kenken = kenken;
    }
    
    /**
     * Funcion que se utiliza para asignarle al atributo kenken y matriz, 
     * un valor según por el tipo de cuadricula seleccionada en Configuraciones, y limpia el tablero
     */
    
    public Modelo() {
        
        if (Configuraciones.cuadricula3x3 == true) {
            kenken = new int [3][3];
            matriz1 = matriz1_3x3;
            matriz2 = matriz2_3x3;
            matriz3 = matriz3_3x3;
            matriz4 = matriz4_3x3;
            matriz5 = matriz5_3x3;
            matriz6 = matriz6_3x3;
            matriz7 = matriz7_3x3;
            matriz8 = matriz8_3x3;
            matriz9 = matriz9_3x3;
        }
        
        if (Configuraciones.cuadricula4x4 == true) {
            kenken = new int [4][4];
            matriz1 = matriz1_4x4;
            matriz2 = matriz2_4x4;
            matriz3 = matriz3_4x4;
            matriz4 = matriz4_4x4;
            matriz5 = matriz5_4x4;
            matriz6 = matriz6_4x4;
            matriz7 = matriz7_4x4;
            matriz8 = matriz8_4x4;
            matriz9 = matriz9_4x4;
        }
        
        if (Configuraciones.cuadricula5x5 == true) {
            kenken = new int [5][5];
            matriz1 = matriz1_5x5;
            matriz2 = matriz2_5x5;
            matriz3 = matriz3_5x5;
            matriz4 = matriz4_5x5;
            matriz5 = matriz5_5x5;
            matriz6 = matriz6_5x5;
            matriz7 = matriz7_5x5;
            matriz8 = matriz8_5x5;
            matriz9 = matriz9_5x5;
        }
        
        if (Configuraciones.cuadricula6x6 == true) {
            kenken = new int [6][6];
            matriz1 = matriz1_6x6;
            matriz2 = matriz2_6x6;
            matriz3 = matriz3_6x6;
            matriz4 = matriz4_6x6;
            matriz5 = matriz5_6x6;
            matriz6 = matriz6_6x6;
            matriz7 = matriz7_6x6;
            matriz8 = matriz8_6x6;
            matriz9 = matriz9_6x6;
            
            
        }
        
        if (Configuraciones.cuadricula7x7 == true) {
            kenken = new int [7][7];
            matriz1 = matriz1_7x7;
            matriz2 = matriz2_7x7;
            matriz3 = matriz3_7x7;
            matriz4 = matriz4_7x7;
            matriz5 = matriz5_7x7;
            matriz6 = matriz6_7x7;
            matriz7 = matriz7_7x7;
            matriz8 = matriz8_7x7;
            matriz9 = matriz9_7x7;
        }
        
        if (Configuraciones.cuadricula8x8 == true) {
            kenken = new int [8][8];
            matriz1 = matriz1_8x8;
            matriz2 = matriz2_8x8;
            matriz3 = matriz3_8x8;
            matriz4 = matriz4_8x8;
            matriz5 = matriz5_8x8;
            matriz6 = matriz6_8x8;
            matriz7 = matriz7_8x8;
            matriz8 = matriz8_8x8;
            matriz9 = matriz9_8x8;
        }
        
        if (Configuraciones.cuadricula9x9 == true) {
            kenken = new int [9][9];
            matriz1 = matriz1_9x9;
            matriz2 = matriz2_9x9;
            matriz3 = matriz3_9x9;
            matriz4 = matriz4_9x9;
            matriz5 = matriz5_9x9;
            matriz6 = matriz6_9x9;
            matriz7 = matriz7_9x9;
            matriz8 = matriz8_9x9;
            matriz9 = matriz9_9x9;
        }
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
