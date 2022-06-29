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
		txt+="\n 3) Carrera.";
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
			
			System.out.println("introduce valor válido");
			
			break;
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}

	public static void  garaje()  {
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
				if(Garajes.numeroDeGarajes()!=0) {
				System.out.println(Garajes.getLista());
				break;
				}else {
					System.out.println("Introduce Garajes... ");
				break;
				}
			
			case 3:
				
				System.out.println(Garajes.getLista());
				System.out.println("Introduce nº garaje para ver los coches :");
				ngaraje=Teclado.leerInt();
				while(ngaraje+1>Garajes.numeroDeGarajes()){ 
				System.out.println("Introduce nº garaje para ver los coches :");
				ngaraje=Teclado.leerInt();
				}
				if(Garajes.getGaraje(ngaraje).cantidadCoches()!=0) {
				Garajes.getGaraje(ngaraje).toString();
				}else {
					System.out.println("Garaje Vacio.....Introduce coches");
					break;
				}
			case 4:
				if(Garajes.numeroDeGarajes()!=0) {
				System.out.println(Garajes.getLista());
					ngaraje=Teclado.leerInt();
					while(ngaraje+1>Garajes.numeroDeGarajes()) {
					System.out.println("Introduce nº garaje para borrar :");
					ngaraje=Teclado.leerInt();
					}
					System.out.println("Garaje "+Garajes.getGaraje(ngaraje)+" borrado");
					Garajes.removeGaraje(ngaraje);
				}else {
					System.out.println("Introduce Garajes... ");
				}
				
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
				System.out.println(Garajes.elegirGaraje());
				break;
				
			case 3:
				System.out.print("Garajes existentes");
				System.out.println(Garajes.getLista());
				Garaje g=(Garajes.elegirGaraje());
				System.out.println(g);
				Garajes.elegirCocheGarajes(g));
				break;
			case 4:
			Menu.principal();
			break;
				
		}
		}while(op!=0);
		}

	
public static void carrera(){
	int op;
	do {
		String txt="******************Carrera****************";
		txt+="\n 1) Entreno";
		//txt+="\n 2) Menu Coche.";
		//txt+="\n 3) Carrera.";
		//txt+="\n 0) Salir.";
		txt+="\n Introduce una opcion :";
		System.out.println(txt);
		op=Teclado.leerInt();
	
	switch (op) {
		case 1:
			System.out.println("Elige un coche");
			Menu.garaje();
			break;
		case 2:
			
			Menu.coche();
			
			System.out.println("introduce valor válido");
			
			break;
		default:
			System.out.println("opcion no válidas");
			break;
	}
	}while(op!=0);
	}
	
	
	
	
	
	
	
	}
		
	

