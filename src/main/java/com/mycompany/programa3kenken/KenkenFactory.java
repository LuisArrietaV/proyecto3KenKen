
package com.mycompany.programa3kenken;

/**
 * Clase llamada KenkenFactory, utilizada para aplicar el patron de diseño Factory, al implementar un metodo
 * que va a retornar cual tipo de cuadricula se va a utilizar para jugar al Kenken, de una forma 
 * organizada
 * @author Luis Arrieta
 */
public class KenkenFactory {
  
    /**
     * Funcion llamada construirCuadricula que se utiliza para indicar cual cuadricula se va a utilizar
     * para jugar el Kenken, creando un nuevo objeto, de acuerdo al "TipoDeCuadricula"
     * @param tipo indica cual cuadricula se eligió, y retorna con base al case del switch
     * @return 
     */
    public Cuadricula construirCuadricula(TipoDeCuadricula tipo) {
        
        return switch (tipo) {
            case C3x3 -> new Cuadricula_3x3();
            case C4x4 -> new Cuadricula_4x4();
            case C5x5 -> new Cuadricula_5x5();
            case C6x6 -> new Cuadricula_6x6();
            case C7x7 -> new Cuadricula_7x7();
            case C8x8 -> new Cuadricula_8x8();
            case C9x9 -> new Cuadricula_9x9();
        };
        
    }
    
}
