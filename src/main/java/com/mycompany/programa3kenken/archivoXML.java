
package com.mycompany.programa3kenken;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * Clase llamada archivoXML utilizada para cargar y mostrar información
 * acerca del archivo xml llamado kenken_partidas2023
 * @author Luis Arrieta Vïquez
 */
public class archivoXML {
    
    
    /**
     * Carga el archivo xml: kenken_partidas, y imprime su información
     */
    public void LeerDocumento() {
        try {
            File archivoXML = new File("C:\\Users\\Marce\\Desktop\\Programa3Kenken\\kenken_partidas2023.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivoXML);
            
            
            documento.getDocumentElement().normalize();
            
            System.out.println("Raiz: " + documento.getDocumentElement().getNodeName());
            
            NodeList partidasKenken = documento.getElementsByTagName("KenKen");
            
            System.out.println("Contenido del documento: ");
            System.out.println();
            
            for (int elem = 0; elem < partidasKenken.getLength(); elem++) {
                Node partida = partidasKenken.item(elem);
                
                System.out.println("Nombre del elemento actual: " +  partida.getNodeName());
                
                if (partida.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) partida;
                    
                    System.out.println("Tipo de cuadricula: " + elemento.getElementsByTagName("cuadricula").item(0).getTextContent());
                    System.out.println("Nivel de dificultad: " + elemento.getElementsByTagName("nivel_de_dificultad").item(0).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(0).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(1).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(2).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(3).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(4).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(5).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(6).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(7).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(8).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(9).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(10).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(11).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(12).getTextContent());
                    System.out.println("Jaula: " + elemento.getElementsByTagName("jaula").item(13).getTextContent());
                    System.out.println("Constantes: " + elemento.getElementsByTagName("constantes").item(0).getTextContent());
                }
                System.out.println();
            }
            
        } catch(IOException | ParserConfigurationException | SAXException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
}
