package n3exercici6;

public class Setmana {

	private static final String[] DIES = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};

	public static String getDiaSetmana(int posicio) {
		try {
			return Setmana.DIES[posicio -1];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}

	public static int size() {
		return Setmana.DIES.length;
	}
}

