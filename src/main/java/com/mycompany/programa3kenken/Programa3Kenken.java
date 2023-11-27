package com.mycompany.programa3kenken;

/**
 * 
 * Esta clase contiene el main que se va a utilizar para mostrar el menu principal
 * e imprimir el archivo XML
 * @author Luis Arrieta Viquez
 * 
 */

public class Programa3Kenken {

    /**
     *  Es la funcion main del programa
     * @param args 
     */
    
    public static void main(String[] args) {
        
        menuPrincipal menu = new menuPrincipal();
        menu.setVisible(true);
        archivoXML xml = new archivoXML();
        xml.LeerDocumento();
        
       
        
        
    }
    
    
    
}
