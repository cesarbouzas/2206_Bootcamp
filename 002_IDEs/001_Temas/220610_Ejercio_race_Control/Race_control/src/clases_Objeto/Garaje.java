package clases_Objeto;

import java.util.ArrayList;

import principal.Teclado;

public class Garaje {
	private String nombre;
	private ArrayList<Coche> cochesGaraje=new ArrayList<>();
	
	Garaje(String nombre){
		this.nombre=nombre;
	}
	
	public static void crear() {
		System.out.println("Introduce nombre Garaje :");
		String nombre=Teclado.leerString();
		Garaje g=new Garaje(nombre);
		if(Garajes.isGaraje(g)==false) {
			Garajes.addGaraje(g);
			System.out.println("Garaje "+nombre+" añadido correctamnete");
		}else {
			System.out.println("Error al añadir el garaje "+g.nombre +" nombre");
		}
	}
 
	public void anadirCoche(Coche c) {
		
		if(!this.contineCoche(c)) {
		this.cochesGaraje.add(c);
		c.setGaraje(this.nombre);
		System.out.println("El coche "+c.getMarcaModelo()+" añadido al garaje "+c.getGaraje());
		}else {
			System.out.println("\n"+c.getMarcaModelo()+" ya existe");
		}
	}
	public  Coche elegirCoche() {
		int nCoche;
			do {
			System.out.println("Introduce numero de coche:");
			nCoche=Teclado.leerInt();
			}while(nCoche>this.cantidadCoches());
			return this.getCoche(nCoche);
		}

	
	
	
	public void borrarCoche(Coche c) {
		if(this.contineCoche(c)) {
			this.cochesGaraje.remove(c);
			System.out.println("Coche "+c.getMarcaModelo()+" Borrado de el garaje "+this.getNombre());
		}else {
			System.out.println("coche no encontrado");
		}
		
	}
	public int cantidadCoches() {
		return this.cochesGaraje.size();
	}
	
	
public String getNombre() {
	return this.nombre;
}
public Coche getCoche(int i) {
	return this.cochesGaraje.get(i);
	
}
	
public String toString() {
	int i=0;
	String txt=this.nombre+"-> ";
		for(Coche c:this.cochesGaraje) {
			txt+="["+i+"]";
			txt+=(c.getMarcaModelo()+",");
			i++;
		}
		return txt;
}

public boolean contineCoche(Coche c) {
	for(int i=0;i<this.cantidadCoches();i++) {
		if(this.cochesGaraje.get(i).equals(c)) {
		return true;
		}
	}
	return false;
}
public boolean compareTo(Garaje g) {
	return (this.nombre.equalsIgnoreCase(g.nombre));
	}
}