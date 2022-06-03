import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Saludar_Usuario {	
	public static final String USR="CesarBouzas";
	public static final String PASS="manuelymateo";
	
	//M�todp para saludar , dado un nombre :
	public static String saludarPorNombre(String nombre) {
		return "Hola "+ nombre+".";
	}
	//M�todo que de un mesaje de error.
	public static void mensajeError() {
		Logger error=Logger.getLogger("err");
		error.log(Level.INFO, "!Usuario no encontrado�.");
	}
	//M�todo qe reciba el nombre y verifica si es v�lido o no
	public static String comprobarUsuario(String user) {
		
		return (Objects.equals(USR, user))?"Usuario v�lido":"Usuario inv�lido";
	}
	
	public static String comprobarPassword(String passw) {
		return (Objects.equals(PASS, passw))?"Contrase�a correcta":"Contrase�a incorrecta";		
	}
	public static void comprobarAcceso(String usr,String pass) {
		if (Objects.equals(usr,USR)&& Objects.equals(pass,PASS)) {
			System.out.println ("Acceso permitido");
		}else {
			System.out.println(comprobarUsuario(usr));
			System.out.println(comprobarPassword(pass));
		}
	}		
	public static void main(String[] args) {
		System.out.println(saludarPorNombre("C�sar"));
		System.out.println("**********");
		mensajeError();
		System.out.println("**********");
		System.out.println(comprobarUsuario("pedro"));//no v�lido
		System.out.println(comprobarUsuario("CesarBouzas"));//v�lido
		System.out.println("**********");
		comprobarAcceso("Pedro","manuelymateo");
		System.out.println("-----------");
		comprobarAcceso("CesarBouzas","mateoymanuel");
		System.out.println("-----------");
		comprobarAcceso("CesarBouzas","manuelymateo");				
	}
}
