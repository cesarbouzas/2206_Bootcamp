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
		System.out.println("El coche "+c.getMarcaModelo()+" pertenece al garaje "+c.getGaraje());
		}else {
			System.out.println(c+" ya existe");
		}
	}
	public void borrarCoche(int n) {
		if(this.cochesGaraje.size()>n) {
			Coche c=this.cochesGaraje.get(n);
			this.cochesGaraje.remove(n);
			System.out.println("Coche "+c+" Borrado de el garaje"+this.getNombre());
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
	String txt="["+i+"]"+this.nombre+"-> ";
		for(Coche c:this.cochesGaraje) {
			txt+=(c.getMarcaModelo()+",");
		}
		return txt;
}

public boolean contineCoche(Coche c) {
	for(int i=0;i<this.cantidadCoches();i++) {
		if(this.cochesGaraje.get(i).getMarcaModelo().equals(c.getMarcaModelo())) {
		return true;
		}
	}
	return false;
}
public boolean compareTo(Garaje g) {
	return (this.nombre.equalsIgnoreCase(g.nombre));
	}
}