package n1exercici3;

public class Exemple {

	
	public static String getMes(int i) {
		String[] mesos = n1exercici1.Mes.creaLlistaMesos().toArray(new String[0]);
		
		
		return mesos[i - 1];
	}
}
