package principal;
import clases_Objeto.Coche;

public class Principal {

	public static void main(String[] args) {
	
		Coche c1=new Coche("Nissan","Xtrial");
		for(int i=0;i<=180;i++) {
		
			c1.decidirAcelerarFrenar();
			if(i%1==0||i==0) {
				
				System.out.print("\n"+c1.getTacometro()+"m ,"+c1.getVelocidad()+" km/h");
				}else {
				System.out.print(c1.getTacometro()+",");}
		}
		
		System.out.println( "media de :"+(60.0/180.0)*(c1.getTacometro()/1000)+" km/h");

}
}
