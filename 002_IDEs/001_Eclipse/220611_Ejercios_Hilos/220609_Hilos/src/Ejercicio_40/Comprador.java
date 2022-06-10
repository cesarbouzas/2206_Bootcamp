package Ejercicio_40;

public class Comprador extends Thread {
	
	private Distribuidor distribuidor;
	private String nombre;
	private Coche cocheElegido=new Coche("seat","malaga");
	public Comprador(Distribuidor d,String nombre) {
		this.distribuidor=d;
		this.nombre=nombre;
	}
	public Coche getCocheElegido() {
		return this.cocheElegido;
	}
	public String getNombre() {
		
	return this.nombre;
	}
	
	
	
	public void run() {
		
		for(int i=1;i<10;i++) {
			if(distribuidor.isStock(cocheElegido)) {
				System.out.println("Comprador "+this.nombre+" ha comprado un "+cocheElegido);
				distribuidor.venderCoche(this.cocheElegido);
				System.out.println();
		}else {
			System.out.println(this.getNombre()+" se quedo con las ganas de un "+cocheElegido);
			
		}	
	}
	}
}
