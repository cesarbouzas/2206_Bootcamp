package Ejercicio_40;

public class Principal {
	
	
	public static void main(String[] args) {
		Distribuidor d1=new Distribuidor("CesarCars.sl", 10);
		Fabricante fabrica=new Fabricante("seat",d1);
		Comprador pardillo1=new Comprador(d1,"pardillo1");
		fabrica.start();
		pardillo1.start();
		
	}

}
