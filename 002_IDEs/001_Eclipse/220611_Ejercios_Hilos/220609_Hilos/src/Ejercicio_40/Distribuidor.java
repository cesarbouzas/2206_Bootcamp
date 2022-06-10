package Ejercicio_40;
import java.util.ArrayList;
import java.util.Objects;
public class Distribuidor {
	
	private String nombre;
	private int tamano;
	private ArrayList<Coche> almacen=new ArrayList<>();
	
	Distribuidor(String nombre,int tamano){
		this.nombre=nombre;
		this.tamano=tamano;	
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public int getTamano() {
		return this.tamano;
	}
	public void recibirCoche(Coche c) {
		if(tamano>almacen.size()) {	
			almacen.add(c);
		}else {
			System.out.println("Almacen del distribuidor"+this.getNombre() + " esta lleno");
		}
		
	}
	public Coche venderCoche(Coche c) {
		if(isStock(c)){
				System.out.println("Vendido el coche "+c);
				return this.sacarCocheAlmacen(c);
				
		}else{
			System.out.println("Sin stock");
			return null;
		}
	}
	
	public boolean isStock (Coche c) {
		for(Coche calm:this.almacen) {
			if(Objects.equals(calm.toString(), c.toString())) {
				return true;
			}else {
				return false; 
			}
		}
		return false;
		}
	private Coche sacarCocheAlmacen(Coche c) {
		Coche cocheBuscado;
		if(almacen.contains(c)) {
				int pos=almacen.indexOf(c);
				cocheBuscado=almacen.get(pos);
				almacen.remove(pos);
				return cocheBuscado;
		}else {
			return null;
		}
	}
	public String toString(){
		String txt="";
		for(int i=0;i<almacen.size();i++) {
			txt+="Coche ["+(i+1)+"]="+almacen.get(i)+".\n";
		}
	return txt;
	}
	

	public void run() {
		
		
	}

}
