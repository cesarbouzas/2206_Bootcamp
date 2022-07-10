package clases_Objeto;
import java.util.List;
import java.util.ArrayList;

public class Carrera {
	private String nombre;
	private ArrayList<Garaje> garajesInscritos=new ArrayList<>();
	private ArrayList<Coche> cochesInscritos=new ArrayList<>();
	private ArrayList <Coche> podio=new ArrayList<>(3);
	
	
	
	public Carrera(String nombre, ArrayList garajes) {
		this.nombre=nombre;
		this.garajesInscritos=garajes;
	};
	
	public String getNombre() {
		return this.nombre;
	} 
	public ArrayList<Garaje> getGarajes(){
		return this.garajesInscritos;
	}
	
	
	
	public void setNombre(String n) {
		this.nombre=n;
	}
}
