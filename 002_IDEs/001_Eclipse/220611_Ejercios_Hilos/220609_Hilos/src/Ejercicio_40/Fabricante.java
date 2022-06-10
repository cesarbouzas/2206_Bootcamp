package Ejercicio_40;
import java.util.ArrayList;
public class Fabricante extends Thread {
	
	private String marca;
	private ArrayList<String> modelos=new ArrayList<>();
	private Distribuidor distribuidor;
	public Fabricante(String marca, Distribuidor d) {
		this.marca=marca;
		this.distribuidor=d;
		this.setModelos();
		
		
	}
	public void setModelos() {
		this.modelos.add("Ibiza");
		this.modelos.add("malaga");
		this.modelos.add("Toledo");
		this.modelos.add("Turquia");
		this.modelos.add("Vigo No");
		this.modelos.add("malaga");
	}
	public String getModelo(int n) {
		return modelos.get(n);
		
	}
	public String getMarca() {
		return this.marca;
	}
	
	
	
	
	
	public void run() {
			
		for(int i=1;i<this.distribuidor.getTamano()+4;i++) {
			Coche cocheNuevo=new Coche(this.getMarca(),this.getModelo(i%6));
			distribuidor.recibirCoche(cocheNuevo);
			System.out.println("Enviando coche"+cocheNuevo+" a "+ this.distribuidor.getNombre());
		}
		
		
	}
	
	
}
