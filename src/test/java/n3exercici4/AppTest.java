package n3exercici4;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AppTest {
	
	@Test
	public void test() {
		List<Object> myArray = new ArrayList<Object>();
		
		Integer obj1 = 11;
		String obj2 = "hola";
		char[] obj3 = {'a', 'b', 'c'};
		Boolean obj4 = true;
		
		myArray.add(obj1);
		myArray.add(obj2);
		myArray.add(obj3);
		myArray.add(obj4);
		
		assertThat(myArray).as("verificar que hi són en l'ordre correcte").containsSequence(obj1, obj2, obj3, obj4);
		assertThat(myArray).as("verificar que hi són en qualsevol ordre").contains(obj2, obj3, obj1, obj4);
		assertThat(myArray).as("verificar que obj1 només hi és una vegada").containsOnlyOnce(obj1);
		myArray.remove(obj3);
		assertThat(myArray).as("verificar que obj3 no hi és").doesNotContain(obj3);
	}
	
	

}
