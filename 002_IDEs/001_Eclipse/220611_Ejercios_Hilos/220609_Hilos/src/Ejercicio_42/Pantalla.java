package Ejercicio_42;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Pantalla extends Thread {
	
	Thread hilo=new Thread();
	 public void run() {
		System.out.println("hola"+numeroAtomico);
		 
		 
	 }

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Timer timier=new Timer();
		 TimerTask Tarea=new TimerTask() {
			 public void run()
			 
		 }
		AtomicInteger numeroAtomico=new AtomicInteger(0);
		Pantalla p=new Pantalla();
		
		
	}

}
