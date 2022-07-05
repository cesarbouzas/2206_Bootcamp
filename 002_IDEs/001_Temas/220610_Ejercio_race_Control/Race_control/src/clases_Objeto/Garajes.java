package clases_Objeto;

import java.util.ArrayList;

import principal.Teclado;


public abstract class Garajes {

private static ArrayList<Garaje> listaGarajes=new ArrayList<>();
		
public static void addGaraje(Garaje g) {
	 listaGarajes.add(g);
}
public static void removeGaraje(int g) {
	 listaGarajes.remove(g);
}
public static Garaje getGaraje(int i) {
	return listaGarajes.get(i);
}
public static boolean isGaraje(Garaje g) {
	for(Garaje ga:listaGarajes) {
		if(ga.compareTo(g)) {
			return true;
		}
	}
	return false;
}

public static String getLista(){
	String txt="{";
	for(int i=0;i<listaGarajes.size();i++) { 
		
		if(i<(listaGarajes.size()-1)){
			txt+="["+i+"]"+listaGarajes.get(i).getNombre()+",";
		}else {
				txt+="["+i+"]"+listaGarajes.get(i).getNombre();
			}
		}
	return txt+"}";
}
public static int numeroDeGarajes() {
	return listaGarajes.size();
}
public static Garaje elegirGaraje() {
int nGaraje;
	do {
		System.out.println("Introduce numero de Garaje :");
		nGaraje=Teclado.leerInt();
	}while(nGaraje+1>Garajes.getLista().length());
	return Garajes.getGaraje(nGaraje);

}
public static Coche elegirCocheGarajes(Garaje g) {
int nCoche;
	do {
	System.out.println("Introduce numero de coche a borrar :");
	nCoche=Teclado.leerInt();
	}while(nCoche>g.cantidadCoches());
	return g.getCoche(nCoche);
}
}