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
	return listaGarajes.contains(g);
}

public static String getLista(){
	String txt="";
	for(int i=0;i<listaGarajes.size();i++) {
		if(i==0) {
			txt+="{"+listaGarajes.get(i)+",";
			}
		else{
			txt+=listaGarajes.get(i);
			}
		}
	return txt+"}";
}
 	

}

