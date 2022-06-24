package clases_Objeto;


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
	
	public double getTacometro() {
		return this.tacometro;
	}
	
	public String getGaraje() {
		return this.garaje;
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
	
	@Override
	public String toString() {
		String txt="";
		txt+="Marca ="+this.marca +" Modelo ="+this.modelo;
		txt+="\n Velocidad :"+this.velocidad;
		txt+=" Distacia (m) :"+this.getTacometro()+"\n";
		return txt;
	}

	
	public void acelerar() {
		if(this.velocidad==Coche.VEL_MAX) {
			this.velocidad=Coche.VEL_MAX;
		}else {
		this.velocidad+=Coche.ACELERACION;
		}
	}
	public void frenar() {
		if(this.velocidad==0) {
			this.velocidad=0;
		}else {
		this.velocidad-=Coche.ACELERACION;
		}
	}
	
	public void decidirAcelerarFrenar() {
		
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

}
