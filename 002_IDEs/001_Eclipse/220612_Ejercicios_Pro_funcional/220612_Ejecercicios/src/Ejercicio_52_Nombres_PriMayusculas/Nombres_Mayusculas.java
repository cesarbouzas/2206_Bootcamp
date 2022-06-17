package Ejercicio_52_Nombres_PriMayusculas;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Nombres_Mayusculas {
	public static void main(String[] args) {
		int contador=0;
		List<String> nombres= Arrays.asList("MANUEL","CESAR","MATEO","NATIVIDAD");
		Stream<String> stream=nombres.stream().map(s->{
				s=s.toLowerCase();
				s=s.substring(0, 1).toUpperCase()+ s.substring(1);
						return s;
		}).peek(s->{
			
			//s=s + (contador++>nombres.size()-1?"":",");
			
//			int tam=nombres.size()-1;
//		switch (contador) {
//			case 0:
//				System.out.print("["+s+",");
//				break;
//			case tam:
//				System.out.print(s+"]");
//				break;
//			default:
//			System.out.printf(s+",");
//			break;
//				
//				
//		}
			});
		List <String> resultado=stream.collect(Collectors.toList());
		System.out.println("\n"+resultado);
	}
}
