package principal;

import java.util.Scanner;

import clases_Objeto.Coche;
import clases_Objeto.Garaje;
import clases_Objeto.Garajes;

public abstract class Menu {
	
	public static void principal(){
	int op=0;
	do {
		String txt="******************Menu Principal****************";
		txt+="\n 1) Menu Garaje.";
		txt+="\n 2) Menu Coche.";
		txt+="\n 0) Salir.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=Teclado.leerInt();
	
	switch (op) {
		case 1:
			Menu.garaje();
			break;
		case 2:
			Menu.coche();
			break;
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}

	public static void  garaje() {
		int op=0;
		int ngaraje;
		do {
			Pantalla.borrar();
			String txt="******************Menu Garaje****************";
			txt+="\n 1) Crear Garaje.";
			txt+="\n 2) Listar Garajes.";
			txt+="\n 3) Ver Coches por garaje .";
			txt+="\n 4) Borrar Garaje.";
			txt+="\n 5) Menu principal.";
			txt+="\n 0) Salir.";
			txt+="\n Introduce una opcion :";
			System.out.println(txt);
			op=Teclado.leerInt();
		
		switch (op) {
			case 1:
				Garaje.crear();
			break;
			case 2:
				System.out.println(Garajes.getLista());
			break;
			case 3:
				System.out.println("Introduce nº garaje para ver los coches :");
				ngaraje=Teclado.leerInt();
				Garajes.getGaraje(ngaraje).toString();
				break;
			case 4:
				System.out.println("Introduce nº garaje a Borrar :");
				ngaraje=Teclado.leerInt();
				Garajes.getGaraje(ngaraje).toString();
				break;
				
			case 5:
				Menu.principal();
				break;
		}
		}while(op!=0);
		}	
	public static void coche(){
		int op=0;
		do {
			Pantalla.borrar();
			String txt="******************Menu Coche****************";
			txt+="\n 1) Crear coche por garaje.";
			txt+="\n 2) Ver coches por garaje.";
			txt+="\n 3) Borrar coche por garaje.";
			txt+="\n 4) Menu principal.";
			txt+="\n 0) Salir.";
			txt+="\n Introduce una opcion :";
			System.out.println(txt);
			op=Teclado.leerInt();
		
		int nGaraje;
		int nCoche;
		switch (op) {
			case 1:
				System.out.print("Garajes existentes");
				System.out.println(Garajes.getLista());
				Coche.crearCocheTeclado();				
			break;
			case 2:
				System.out.print("Garajes existentes");
				System.out.println(Garajes.getLista());
				do {
				System.out.println("Introduce numero de Garaje :");
				 nGaraje=Teclado.leerInt();
				}while(nGaraje+1<Garajes.getLista().length());
				System.out.println(Garajes.getGaraje(nGaraje));
				
			case 3:
				System.out.print("Garajes existentes");
				System.out.println(Garajes.getLista());
				do {
				System.out.println("Introduce numero de Garaje :");
				nGaraje=Teclado.leerInt();
				}while(nGaraje<Garajes.getLista().length());
				System.out.print("Los coches existentes");
				Garajes.getGaraje(nGaraje);
				do {
				System.out.println("Introduce numero de coche a borrar :");
				nCoche=Teclado.leerInt();
				}while(nCoche<Garajes.getGaraje(nGaraje).cantidadCoches());
				Garajes.getGaraje(nGaraje).borrarCoche(nCoche);
				System.out.println(Garajes.getGaraje(nGaraje));
			case 4:
			Menu.principal();
			break;
				
		}
		}while(op!=0);
		}
	
	}
		
	

