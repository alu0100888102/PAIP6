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

package controlador;

import modelo.*;
import vista.*;

public class Controller {
	
	public static void main(String args[]){
		int eur = Integer.parseInt(args[0]);
		EuroConversor eurConv = new EuroConversor(eur);
		GUI gui = new GUI();
		gui.addCPanel("USD", eur, eurConv.getUsdConversion(), eurConv.toUsd());
		gui.addCPanel("ARS", eur, eurConv.getArsConversion(), eurConv.toArs());
		gui.addCPanel("GBP", eur, eurConv.getGbpConversion(), eurConv.toGbp());
		gui.addCPanel("JPY", eur, eurConv.getJpyConversion(), eurConv.toJpy());
		gui.addCPanel("CHF", eur, eurConv.getChfConversion(), eurConv.toChf());
		gui.setVisible(true);

	}
	
}
