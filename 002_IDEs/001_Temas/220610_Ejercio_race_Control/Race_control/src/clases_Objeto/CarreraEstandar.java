package clases_Objeto;

import java.util.ArrayList;

public class CarreraEstandar extends Carrera{
	private  static  int duracion=180;
	
	public CarreraEstandar(String nombre,ArrayList<Garaje> garajes) {
		super(nombre,garajes);
	}
	public CarreraEstandar(String nombre,ArrayList<Garaje> garajes,int duracion) {
		super(nombre,garajes);
		this.duracion=duracion;
	}
	
	public ArrayList<Coche> elegirCocheGaraje(){
		ArrayList<Coche> coches;
		
		for(int i=0;i<this.getGarajes().size();i++) {
			coches.add(this.getGarajes().indexOf(i))
		}
		
	}
	

}
