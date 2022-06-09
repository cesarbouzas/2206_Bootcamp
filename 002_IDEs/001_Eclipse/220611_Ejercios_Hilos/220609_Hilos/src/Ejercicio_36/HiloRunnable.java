
package Ejercicio_36;

public class HiloRunnable implements Runnable{


	
	private String nombre;
	public HiloRunnable(String nom) {
		this.nombre=nom;
	}
	public String getName() {
		return nombre;
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
					
					Thread.sleep(HiloExtends.sgRandom(1,4));
					System.out.println(Thread.currentThread());
				}
		}catch (InterruptedException e) {
					e.printStackTrace();
		}		
	System.out.println("Final de "+Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 Thread hiloPrincipal=Thread.currentThread();
		 Thread.sleep(HiloExtends.sgRandom(1, 4));
		 System.out.println(hiloPrincipal);
		 Thread hilo1=new Thread(new HiloRunnable("hilo1"));
		
		hilo1.start();
	
		
		
		
		
		
		
		
	}

}
