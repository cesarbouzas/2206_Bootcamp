
package Ejercicio_37;

public class HiloRunnable implements Runnable{
	private String nombre;
	
	public HiloRunnable(String nom) {
		this.nombre=nom;
	}
	
	


	public static long sgRandom(int min , int max) {
		long sg=Math.round((Math.random()*(max-min))+min);
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
					System.out.println(this);
				}
		}catch (InterruptedException e) {
					e.printStackTrace();
		}		
	System.out.println("Final de "+Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		HiloRunnable objeto1Runnable0=new HiloRunnable("hilo0");
		Thread hilo0=new Thread(objeto1Runnable0,"hilo0");
		HiloRunnable objetoRunnable1=new HiloRunnable("hilo1");
		Thread hilo1=new Thread(objetoRunnable1,"hilo1");
		
		Thread hilo2=new Thread(new HiloRunnable("hilo2"));
		 
		hilo2.start();
		 hilo0.start();
		 hilo1.start();
		 
	}

}
