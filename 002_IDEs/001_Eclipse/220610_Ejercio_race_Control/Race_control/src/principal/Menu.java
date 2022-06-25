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
		//txt+="\n 9) Volver.";
		txt+="\n 0) Salir.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=Teclado.leerInt();
	
	switch (op) {
		case 1:
			Menu.garaje();
			break;
		case 3:
			Menu.coche();
			break;
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}

	
	public static void coche(){
		int op=0;
		do {
			String txt="******************Menu Coche****************";
			txt+="\n 1) Crear coche.";
			txt+="\n 2) Ver coche .";
			txt+="\n 3) Borrar coche.";
			txt+="\n 0) Salir.";
			txt+="\n Introduce una opcion :";
			System.out.println(txt);
			op=Teclado.leerInt();
		
		switch (op) {
			case 1:
			
				int nGaraje;
				Coche.crearCocheTeclado();
				
			break;
			case 3:
				Menu.garaje();
		}
		}while(op!=0);
		}
	public static void  garaje() {
			int op=0;
			do {
				String txt="******************Menu Garaje****************";
				txt+="\n 1) Crear Garaje.";
				txt+="\n 2) Listar Garaje.";
				txt+="\n 3) Ver Coches .";
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
					int ngaraje=Teclado.leerInt();
					Garajes.getGaraje(ngaraje).toString();
				case 3:
					Menu.garaje();
					break;
				case 4:
					Menu.principal();
					break;
			}
			}while(op!=0);
			}
	}
		
	

