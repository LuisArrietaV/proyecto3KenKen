
package com.mycompany.programa2kenken;

import javax.swing.JOptionPane;

/**
 * 
 * Clase llamada Nodo que se utiliza para inicializar los atributos de numero, posFila, posColumna, y siguiente, necesarios
 * para la clase de Pilas
 * @author Luis Arrieta Viquez
 */

class Nodo {
    int numero;
    int posFila;
    int posColumna;
    Nodo siguiente;
    
    Nodo(int numero, int posFila, int posColumna) {
        this.numero = numero;
        this.posFila = posFila;
        this.posColumna = posColumna;
    }
}


/**
 *
 * Clase llamada Pilas que se utiliza para cada una de las funciones de pila como push, pop, necesarias para
 * deshacer y rehacer movimientos durante una partida del kenken
 * @author Luis Arrieta Viquez
 */

public class Pilas {
    
   
    Nodo pila;
    Nodo pilaRehacer;
    
    /**
     * Agrega el ultimo numero ingresado por el usuario en la pila
     * @param numero numero exacto en la pila, y columna
     * @param posFila numero de la fila
     * @param posColumna numero de la columna
     */
    public void push(int numero, int posFila, int posColumna) {
        Nodo nuevo = new Nodo (numero, posFila, posColumna);
        if (pila == null) {
            pila = nuevo;
            pila.siguiente = null;
        } else {
            nuevo.siguiente = pila;
            pila = nuevo;
        }
        
    }
    
    /**
     * Agrega el ultimo numero deshecho por el usuario, en esta pila, llamada:
     * pilaRehacer
     * @param numero numero exacto en la pila, y columna
     * @param posFila numero de la fila
     * @param posColumna numero de la columna
     */
    public void pushRehacer(int numero, int posFila, int posColumna) {
        Nodo nuevo2 = new Nodo (numero, posFila, posColumna);
        if (pilaRehacer == null) {
            pilaRehacer = nuevo2;
            pilaRehacer.siguiente = null;
        } else {
            nuevo2.siguiente = pilaRehacer;
            pilaRehacer = nuevo2;
        }
        
    }
    
    /**
     * Remueve el ultimo elemento en entrar en la pila, y le agrega ese elemento a la pila llamada:
     * pilaRehacer
     */
    public void pop() {
        if (pila != null) {
            Tablero.listaKenkenTxt[peek2()][peek3()].setText("");
            try {
                if (Integer.parseInt(peekSiguiente()) == 0) {
                Tablero.listaKenkenTxt[peekSiguiente2()][peekSiguiente3()].setText("");
                pushRehacer(pila.numero, peek2(), peek3());
                
            }
            else {
                Tablero.listaKenkenTxt[peekSiguiente2()][peekSiguiente3()].setText(peekSiguiente());
                pushRehacer(peek(), peek2(), peek3());
                
            }
            } catch (NullPointerException e) {
                pushRehacer(peek(), peek2(), peek3());
                JOptionPane.showMessageDialog(null, "No hay movimientos anteriores");
            }
            
            pila = pila.siguiente;
        }
    }
    
    
    /**
     * Remueve el ultimo elemento en entrar en la pilaRehacer, y le agrega ese elemento a la pila llamada:
     * pila
     */
    public void popRehacer() {
        if (pilaRehacer != null) {
            

            if (Integer.parseInt(peekRehacer()) == 0) {
                pilaRehacer = pilaRehacer.siguiente;
                return;
            }
              
            
            Tablero.listaKenkenTxt[peekRehacer2()][peekRehacer3()].setText(peekRehacer());
            push(Integer.parseInt(peekRehacer()), peekRehacer2(), peekRehacer3());
            try {
                if (Integer.parseInt(peekRehacerSiguiente()) == 0) {
                    Tablero.listaKenkenTxt[peekRehacerSiguiente2()][peekRehacerSiguiente3()].setText(peekRehacer());
                    push(Integer.parseInt(peekRehacer()), peekRehacer2(), peekRehacer3());
                    
            }
            
            } catch (NullPointerException e) {
                push(Integer.parseInt(peekRehacer()), peekRehacer2(), peekRehacer3());
                JOptionPane.showMessageDialog(null, "No hay movimientos posteriores");
            }
            
            pilaRehacer = pilaRehacer.siguiente;
        }
    }
    
    
    /**
     * Muestra el numero que se encuentra en la parte mas alta de la pila
     * @return retorna el numero más alto en la pila, en caso de que la pila sea diferente de null
     */
    public int peek() {
        if (pila != null) {
            return pila.numero;
        }
        return 0;
    }
    
    /**
     * Muestra el numero que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
    public String peekRehacer() {
        if (pilaRehacer != null) {
            return String.valueOf(pilaRehacer.numero);
        }
        return "";
    }
    
    /**
     * Muestra el numero de fila que se encuentra en la parte mas alta de la pila
     * @return retorna el numero de fila más alto en la pila, en caso de que la pila sea diferente de null
     */
    public int peek2() {
        if (pila != null) {
            return pila.posFila;
        }
        return 0;
    }
    
    
    /**
     * Muestra el numero de fila que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero de fila más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
     public int peekRehacer2() {
        if (pilaRehacer != null) {
            return pilaRehacer.posFila;
        }
        return 0;
    }
    
    /**
     * Muestra el numero de columna que se encuentra en la parte mas alta de la pila
     * @return retorna el numero de columna más alto en la pila, en caso de que la pila sea diferente de null
     */
    public int peek3() {
        if (pila != null) {
            return pila.posColumna;
        }
        return 0;
    }
    
    /**
     * Muestra el numero de columna que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero de columna más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
    public int peekRehacer3() {
        if (pila != null) {
            return pilaRehacer.posColumna;
        }
        return 0;
    }
    
    
    /**
     * Muestra el numero siguiente que se encuentra en la parte mas alta de la pila
     * @return retorna el numero siguiente más alto en la pila, en caso de que la pila sea diferente de null
     */
    public String peekSiguiente() {
        if (pila != null) {
            
            return String.valueOf(pila.siguiente.numero);
        }
        return "";
    }
    
    /**
     * Muestra el numero siguiente que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero siguiente más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
    public String peekRehacerSiguiente() {
        if (pilaRehacer != null) {
            
            return String.valueOf(pilaRehacer.siguiente.numero);
        }
        return "";
    }
    
    /**
     * Muestra el numero de fila siguiente que se encuentra en la parte mas alta de la pila
     * @return retorna el numero de fila siguiente más alto en la pila, en caso de que la pila sea diferente de null
     */
    public int peekSiguiente2() {
        if (pila != null) {
            return pila.siguiente.posFila;
        }
        return 0;
    }
    
    
    /**
     * Muestra el numero de fila siguiente que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero de fila siguiente más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
    public int peekRehacerSiguiente2() {
        if (pilaRehacer != null) {
            return pilaRehacer.siguiente.posFila;
        }
        return 0;
    }
    
    /**
     * Muestra el numero de columna siguiente que se encuentra en la parte mas alta de la pila
     * @return retorna el numero de columna siguiente más alto en la pila, en caso de que la pila sea diferente de null
     */
    public int peekSiguiente3() {
        if (pila != null) {
            return pila.siguiente.posColumna;
        }
        return 0;
    }
    
    
    /**
     * Muestra el numero de columna siguiente que se encuentra en la parte mas alta de la pilaRehacer
     * @return retorna el numero de columna siguiente más alto en la pilaRehacer, en caso de que la pilaRehacer sea diferente de null
     */
    public int peekRehacerSiguiente3() {
        if (pilaRehacer != null) {
            return pilaRehacer.siguiente.posColumna;
        }
        return 0;
    }
    
    /**
     * Muestra el numero, fila, y columna que contiene cada uno de los nodos de la pila
     */
    public void mostrar() {
        Nodo aux = pila;
        while (aux != null) {
            aux = aux.siguiente;
        }
    }
    
    /**
     * Muestra el numero, fila, y columna que contiene cada uno de los nodos de la pilaRehacer
     */
    public void mostrar2() {
        Nodo aux = pilaRehacer;
        while (aux != null) {
            aux = aux.siguiente;
        }
    }
    
    
}
