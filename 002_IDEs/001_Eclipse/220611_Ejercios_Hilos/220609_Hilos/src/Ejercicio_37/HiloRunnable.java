
package Ejercicio_37;

public class HiloRunnable implements Runnable{


	
	private String nombre;
	public HiloRunnable(String nom) {
		this.nombre=nom;
	}
	public String getName() {
		return nombre;
	}
	public static long sgRandom(int min , int max) {
		long sg=Math.round(Math.random()*(max-min));
		System.out.println("A dormir el "+Thread.currentThread().getName()+" "+ sg+" Segundos\n");
		return (sg*1000);
	}
	public String toString() {
		String txt="***********"+Thread.currentThread().getName()+"***********\n";
			  txt+="La prioridad es de :"+Thread.currentThread().getPriority()+"\n";
			  txt+="Su estado es :"+Thread.currentThread().getState()+"\n";
			  txt+="************************************\n";
			  return txt;
		
	}
	
	@Override
	public void run() {
		
		
		try {
				for(int i=0;i<5;i++) {
					
					Thread.sleep(HiloRunnable.sgRandom(3,4));
					System.out.println(Thread.currentThread());
				}
		}catch (InterruptedException e) {
					e.printStackTrace();
		}		
	System.out.println("Final de "+Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		 Thread hilo1=new Thread(new HiloRunnable("hilo_1"));
		 Thread hilo2=new Thread(new HiloRunnable("hilo_2"));
		 Thread hilo3=new Thread(new HiloRunnable("hilo_3"));
		 hilo1.start();
		 hilo2.start();
		 hilo3.start();
		 
		
		 
	
		
		
		
		
		
		
		
	}

}
