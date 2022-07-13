package clases_Objeto;

import java.util.ArrayList;

import Servicios.GarajesService;
import Servicios.TecladoService;

public class CarreraEstandar extends Carrera{
	private  static  int duracion=180;

	
	public CarreraEstandar(String nombre,ArrayList<Garaje> garajes) {
		super(nombre,garajes);
	}
	public CarreraEstandar(String nombre,ArrayList<Garaje> garajes,int duracion) {
		super(nombre,garajes);
		this.duracion=duracion;
	}
	public void correrCochesUnGaraje(Coche e) {
		
		for(int i=0;i<this.cochesInscritos.size();i++) {
			cochesInscritos.get(i).correr(CarreraEstandar.duracion);
		}
		
	}
	
	
	

}
