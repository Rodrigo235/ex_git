package topicos;

public class RaizQuadrada {
	
	public static Double calcular(Double num) {
		
		if (num == null || num < 0)
			return null;
		
		if (num == 0)
			return num;
		
		System.out.println("Buiatchaca");
		
		return Math.sqrt(num);
	}

}
