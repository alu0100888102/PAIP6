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

package modelo;

public class EuroConversor {
	int euros;
	double usdConversion; // dolar estadounidense
	double gbpConversion; // libra británica
	double arsConversion; // peso argentino
	double chfConversion; // franco suizo
	double jpyConversion; // yen japones
	
	public EuroConversor(){
		setEuros(0);
		initializeConversors();
	}
	public EuroConversor(int e){
		setEuros(e);
		initializeConversors();
	}
	private void initializeConversors(){
		setUsdConversion(1.08062);
		setGbpConversion(0.8664);
		setArsConversion(16.8908);
		setChfConversion(1.07413);
		setJpyConversion(120.538);
	}
	
	// Setters y getters
	public int getEuros() {
		return euros;
	}
	public void setEuros(int euros) {
		this.euros = euros;
	}
	public double getUsdConversion() {
		return usdConversion;
	}
	public void setUsdConversion(double usdConversion) {
		this.usdConversion = usdConversion;
	}
	public double getGbpConversion() {
		return gbpConversion;
	}
	public void setGbpConversion(double gbpConversion) {
		this.gbpConversion = gbpConversion;
	}
	public double getArsConversion() {
		return arsConversion;
	}
	public void setArsConversion(double arsConversion) {
		this.arsConversion = arsConversion;
	}
	public double getChfConversion() {
		return chfConversion;
	}
	public void setChfConversion(double chfConversion) {
		this.chfConversion = chfConversion;
	}
	public double getJpyConversion() {
		return jpyConversion;
	}
	public void setJpyConversion(double jpyConversion) {
		this.jpyConversion = jpyConversion;
	}

	// Conversores
	public double toUsd(){
		return getEuros() * getUsdConversion();
	}
	public double toGbp(){
		return getEuros() * getGbpConversion();
	}
	public double toArs(){
		return getEuros() * getArsConversion();
	}
	public double toChf(){
		return getEuros() * getChfConversion();
	}
	public double toJpy(){
		return getEuros() * getJpyConversion();
	}
}
