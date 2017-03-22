/**
 * PRACTICA 7
 * 
 * En esta practica implementamos MVC para hacer un conversor de monedas
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package vista;

import java.awt.*;
import javax.swing.*;

class ConvertPanel extends JPanel {
	String name;
	int eur;
	double convertConstant;
	double convertedCurrency;
	
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEur() {
		return eur;
	}
	public void setEur(int eur) {
		this.eur = eur;
	}
	public double getConvertConstant() {
		return convertConstant;
	}
	public void setConvertConstant(double convertConstant) {
		this.convertConstant = convertConstant;
	}
	public double getConvertedCurrency() {
		return convertedCurrency;
	}
	public void setConvertedCurrency(double convertedCurrency) {
		this.convertedCurrency = convertedCurrency;
	}
	
	public void initializeValues(String currency, int euros, double conversion, double eurTo){
		setName(currency);
		setEur(euros);
		setConvertConstant(conversion);
		setConvertedCurrency(eurTo);
	}
	
	protected void paintComponent( Graphics g ) {
		super.paintComponent( g );
		g.setColor(Color.BLUE);
		Font text =new Font("Comic Sans MS", Font.BOLD, 20); 
		g.setFont(text);
		g.drawString ( "Un euro son [ " + getConvertConstant() + " ] "+ getName()  , 5 , 20 );
		g.drawString ( "[ " + getEur() + " ] euros son [ " + getConvertedCurrency() + " ] "+ getName()  , 5 , 60 );
	}
}