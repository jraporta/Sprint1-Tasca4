package n1exercici3;

public class Setmana {

	private static final String[] DIES = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};
	
	public String getDiaSetmana(int posicio) throws ArrayIndexOutOfBoundsException {
		try {
			return Setmana.DIES[posicio -1];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw e;
		}
	}
	
	public int size() {
		return Setmana.DIES.length;
	}
}
