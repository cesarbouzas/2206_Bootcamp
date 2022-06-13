package Ejercicio_41;
import java.util.*;


public class Futuro extends Thread{
	
	String[] frases={"Tio ¿Que pone en el mio?",
			"Mola! ¿Que pone le mio?"};
	
	
public void run() {
	System.out.println(frases[(int)Math.random()*frases.length]);		
	}
	
	
	
public static void main (String[] args) {
Timer t=new Timer();
Futuro f=new Futuro();

TimerTask tarea=new TimerTask(){
	public void run() {
		f.start();
		f.
	}
};
t.schedule(tarea,2000,5000);

}
}
