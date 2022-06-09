package practica_000;

public class Hilo extends Thread {
	
	Hilo(Thread t){
		super(t);
	}
	Hilo(String name){
		super(name);
	}
	
	public String toString(){
			String txt="El nombre del hilo es :"+getName()+"\n";
		  txt+="Su prioridad es de :"+getPriority()+"\n";
		  txt+="Su grupo es :"+getThreadGroup()+"\n";
		  return txt;
	}
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(toString());
	}	
		
	}
	
public static void main(String[] args) throws InterruptedException {
	
	
	Hilo hiloPrincipal=new Hilo(Thread.currentThread());
	hiloPrincipal.sleep(2000);
	Hilo hilo1=new Hilo("1");
	Hilo hilo2=new Hilo("2");
	
	hilo1.setPriority(1);
	hilo1.start();
	hilo2.start();
	
	System.out.println(hiloPrincipal.toString());

}}
