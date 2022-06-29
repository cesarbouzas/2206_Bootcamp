package clases_Objeto;

import java.util.ArrayList;


public abstract class Garajes {

private static ArrayList<Garaje> listaGarajes=new ArrayList<>();
		
public static void addGaraje(Garaje g) {
	 listaGarajes.add(g);
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
 	

}

