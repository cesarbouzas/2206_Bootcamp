package Ejercicio_36;

public class HiloExtends extends Thread {
	
	
	public HiloExtends(String nom){
		super(nom);
	}
	public HiloExtends(Thread hilo,String name) {
		super(hilo,name);
	}
	public static long sgRandom(int min , int max) {
		long sg=Math.round(Math.random()*(max-min));
		System.out.println("A dormir el "+Thread.currentThread().getName()+" "+ sg+" Segundos\n");
		return (sg*1000);
	}
	
	public String toString() {
		String txt="***********"+getName()+"***********\n";
			  txt+="La prioridad es de :"+getPriority()+"\n";
			  txt+="Su estado es :"+getState()+"\n";
			  txt+="************************************\n";
			  return txt;
		
	}
	
	public void run() {
		
		try {
			for(int i=0 ;i<3;i++) {
				Thread.sleep(sgRandom(1, 5));
				System.out.println(this);
				
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hilo :"+this.getName()+" ha terminado./n");
	}
public static void main(String[] args) throws InterruptedException {
		
	HiloExtends principal=new HiloExtends(Thread.currentThread(),"principal");
	HiloExtends h1=new HiloExtends("Hilo1");
	h1.start();
	//principal.join();
	principal.sleep(HiloExtends.sgRandom(1,5));
	System.out.println(principal);
	principal.sleep(HiloExtends.sgRandom(1,1));
	System.out.println(principal);
	principal.join();
	System.out.println(principal);
	
	
}

}
