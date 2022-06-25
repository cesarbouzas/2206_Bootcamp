package clases_Objeto;


import principal.Teclado;

public class Coche  {
	private static final int VEL_MAX=110;
	private static final int ACELERACION=10;
	
	
	private String marca;
	private String modelo;
	private int velocidad;
	private double tacometro=0;
	private String garaje=null;
	
	public Coche (String marca,String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}
	public int getVelocidad() {
		return this.velocidad;
	}
	public String getMarcaModelo() {
		return this.marca+"\t"+this.modelo;
	}
	
	public double getTacometro() {
		return this.tacometro;
	}
	
	public String getGaraje() {
		return this.garaje;
	}
	@Override
	public String toString() {
		String txt="";
		txt+="Marca ="+this.marca +" Modelo ="+this.modelo;
		txt+="\n Velocidad :"+this.velocidad;
		txt+=" Distacia (m) :"+this.getTacometro()+"\n";
		return txt;
	}
	public static void crearCocheTeclado() {
	String marca;String modelo;
	System.out.print("Introduce marca :");
		marca=Teclado.leerString();System.out.println();
	System.out.print("Introduce modelo :");
		modelo=Teclado.leerString();System.out.println();
	Coche c=new Coche(marca,modelo);
	System.out.println("\n++++++++Introduce el garaje para añadairlo de los disponible++++\n"+Garajes.getLista());
	int nGaraje=Teclado.leerInt();
	Garaje g= Garajes.getGaraje(nGaraje);
	g.anadirCoche(c);
	}
	
	
	
	public void setTacometro() {
		this.tacometro=this.getTacometro()+Math.round(this.velocidad*1000*(1.0/60.0));
	}
	
	
	public void setGaraje(String garaje) {
		if(this.garaje==null) {
			this.garaje=garaje;
		}else {
			System.out.println("no se pude registrar ya esta en el garaje"+this.getGaraje());
		}
	}
	

	
	private void acelerar() {
		if(this.velocidad==Coche.VEL_MAX) {
			this.velocidad=Coche.VEL_MAX;
		}else {
		this.velocidad+=Coche.ACELERACION;
		}
	}
	private void frenar() {
		if(this.velocidad==0) {
			this.velocidad=0;
		}else {
		this.velocidad-=Coche.ACELERACION;
		}
	}
	
	private void decidirAcelerarFrenar() {
		
		int decision=(int)((Math.random()*3));
		switch (decision) {
			case 1:
				this.frenar();
				break;
			case 2:
				this.acelerar();
				break;
			default:
				break;
		}
		this.setTacometro();
	
	}
	
	
	public void correr(int minutos) {
		for(int i=0;i<=minutos;i++) {
			this.decidirAcelerarFrenar();
			if(i%1==0||i==0) {
			System.out.print("\n"+this.getTacometro()+"m ,"+this.getVelocidad()+" km/h");
			}else {
			System.out.print(this.getTacometro()+",");
			}
		}
	}
}
