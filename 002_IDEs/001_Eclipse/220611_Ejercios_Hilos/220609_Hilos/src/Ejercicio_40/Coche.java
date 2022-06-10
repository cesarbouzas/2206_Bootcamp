package Ejercicio_40;

public class Coche {
	
	private String fabricante;
	private String modelo;
	
	public Coche(String fabricante,String modelo) {
		this.fabricante=fabricante;
		this.modelo=modelo;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String toString() {
		String txt="";
		txt+="{"+this.getFabricante()+","+this.getModelo()+"}";
		return txt;
	}

}
