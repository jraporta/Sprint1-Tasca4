package n1exercici2;

public class CalculoDNI {

	public static char letra(int numDni) {
		final char[] LETRAS =
			{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		return LETRAS[numDni % 23];
	}
	
}
