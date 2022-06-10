package Ejercicio_40;

public class Principal {
	
	
	public static void main(String[] args) {
		Distribuidor d1=new Distribuidor("CesarCars.sl", 10);
		
		Coche c1= new Coche("Nissan","Xtrail");
		Coche c2= new Coche("volvo","Xtrail");
		Coche c3= new Coche("Audi","Xtrail");
		Coche c4= new Coche("Nissan","Xtrail");
		Coche c5= new Coche("Nissan","Xtrail");
		Coche c6= new Coche("Nissan","Xtrail");
		Coche c7= new Coche("Nissan","Xtrail");
		Coche c8= new Coche("Nissan","Xtrail");
		Coche c9= new Coche("Nissan","Xtrail");
		Coche c10= new Coche("Nissan","Xtrail");
		Coche c11= new Coche("Porche","Panamera");
		
		d1.recibirCoche(c1);
		d1.recibirCoche(c2);
		d1.recibirCoche(c3);
		d1.recibirCoche(c4);
		d1.recibirCoche(c5);
		d1.recibirCoche(c6);
		d1.recibirCoche(c7);
		d1.recibirCoche(c8);
		d1.recibirCoche(c9);
		d1.recibirCoche(c10);
		
		
		d1.recibirCoche(c10);
		
		System.out.println(d1);
		d1.venderCoche(c11);
		d1.venderCoche(c10);
		System.out.println(d1);
		d1.recibirCoche(c11);
	
	}

}
