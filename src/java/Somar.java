package java;

public class Somar {

	public static int somatorio (int numero[]) {
		int somatorio = 0;
		
		for(int i = 0; i < numero.length; i++) {
			somatorio += numero[i];
		}
		
		return somatorio;
	}
}
