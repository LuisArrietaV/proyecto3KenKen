
package com.mycompany.programa2kenken;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.text.*;



/**
 * Clase llamda PlaceHolders que muestra un mensaje sobre un JTextField
 * @author Luis Arrieta Víquez
 */
public class PlaceHolders extends JLabel
	implements FocusListener, DocumentListener
{
    
    
	public enum Show
	{
		ALWAYS,
		FOCUS_GAINED,
		FOCUS_LOST;
	}

	private JTextComponent component;
	private Document document;

	private Show show;
	private boolean showPromptOnce;
	private int focusLost;

        
        /**
         * Muestra el valor ingresado en text en el JTextComponent
         * @param text valor ingresado para mostrarlo en el JTextField
         * @param component recibe una posicion especifica donde hay un JTextField
         */ 
	public PlaceHolders(String text, JTextComponent component)
	{
		this(text, component, Show.ALWAYS);
	}

        
        /**
         * Carga los componentes ingresados, al darles un color de fondo, un borde, y alinea el valor
         * ingresado en texto, en la parte superior izquierda del JTextField
         * @param texto valor ingresado para mostrarlo en el JTextField
         * @param campo recibe una posicion especifica donde hay un JTextFiekd
         * @param mostrar valor utilizado para mostrar el "texto"
         */
	public PlaceHolders(String texto, JTextComponent campo, Show mostrar)
	{
		this.component = campo;
		setShow( mostrar );
		document = campo.getDocument();

		setText( texto );
		setFont( campo.getFont() );
		setForeground( campo.getForeground() );
		setBorder( new EmptyBorder(campo.getInsets()) );
		setHorizontalAlignment(JLabel.LEADING);
                setVerticalAlignment(JLabel.TOP);
                

		campo.addFocusListener( this );
		document.addDocumentListener( this );

		campo.setLayout( new BorderLayout() );
		campo.add( this );
		checkForPrompt();
	}

	/**
	 *  Cambia el valor alpha del color de primer plano actual al valor específicado.
	 *
	 *  @param alpha recibe un valor en un rango de 0 a 1.0
	 */
	public void changeAlpha(float alpha)
	{
		changeAlpha( (int)(alpha * 255) );
	}

	/**
	 *  Cambia el valor alpha del color de primer plano actual, al valor específico.
	 *
	 *  @param alpha recibe un valor en un rango de 0 a 255
	 */
	public void changeAlpha(int alpha)
	{
		alpha = alpha > 255 ? 255 : alpha < 0 ? 0 : alpha;

		Color foreground = getForeground();
		int red = foreground.getRed();
		int green = foreground.getGreen();
		int blue = foreground.getBlue();

		Color withAlpha = new Color(red, green, blue, alpha);
		super.setForeground( withAlpha );
	}

	/** 
	 *  Cambia el tipo de letra actual
	 *  @param tipoLetra recibe un valor que es el nuevo tipo de letra 
	 */
	public void changeStyle(int tipoLetra)
	{
		setFont( getFont().deriveFont( tipoLetra ) );
	}

	
	public Show getShow()
	{
		return show;
	}

	
	public void setShow(Show show)
	{
		this.show = show;
	}

	
	public boolean getShowPromptOnce()
	{
		return showPromptOnce;
	}

	
	public void setShowPromptOnce(boolean showPromptOnce)
	{
		this.showPromptOnce = showPromptOnce;
	}

	/**
	 * Comprueba si el mensaje deberá ser visible o no
	 */
	private void checkForPrompt()
	{

		if (document.getLength() > 0)
		{
			setVisible( true );  //
			return;
		}


		if (showPromptOnce && focusLost > 0)
		{
			setVisible(true); //
			return;
		}


        if (component.hasFocus())
        {
        	if (show == Show.ALWAYS
        	||  show ==	Show.FOCUS_GAINED)
        		setVisible( true );
        	else
        		setVisible( false ); //
        }
        else
        {
        	if (show == Show.ALWAYS
        	||  show ==	Show.FOCUS_LOST)
        		setVisible( true );
        	else
        		setVisible( false ); //
        }
	}


        /**
         * Llama a la funcion checkForPrompt
         * @param e 
         */
	public void focusGained(FocusEvent e)
	{
		checkForPrompt();
	}

        
        /**
         * Llama a la funcion checkForPrompt, y aumenta el valor de focusLost
         * @param e 
         */
	public void focusLost(FocusEvent e)
	{
		focusLost++;
		checkForPrompt();
	}


        /**
         * Llama a la funcion checkForPrompt(), pero utilizando un DocumentEvent
         * @param e 
         */
	public void insertUpdate(DocumentEvent e)
	{
		checkForPrompt();
	}

        /**
         * Llama a la funcion checkForPrompt(), pero utilizando un DocumentEvent
         * @param e 
         */
	public void removeUpdate(DocumentEvent e)
	{
		checkForPrompt();
	}

	public void changedUpdate(DocumentEvent e) {}
}
