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

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
	public GUI (){
		setLayout(new GridLayout(5, 1, 5, 20));
		this.setSize(400,600);
		this.setResizable(true);
		this.setTitle("Currency Converter");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
	}
	
	public void addCPanel(String currency, int euros, double conversion, double eurTo){
		ConvertPanel cpanel = new ConvertPanel();
		cpanel.initializeValues( currency, euros, conversion, eurTo);
		this.add(cpanel);
	}
}