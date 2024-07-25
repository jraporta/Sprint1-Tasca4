package n3exercici5;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

import java.util.HashMap;
import java.util.Map;



public class AppTest {
	
	@Test
	public void mapContainsKeyTest() {
		Map<String, String> myMap = new HashMap<String,String>();
		myMap.put("Maria", "12345");
		myMap.put("Jordi", "54321");
		myMap.put("Laia", "11111");
		
		assertThat(myMap).as("Verifica que conté key 'Jordi'").containsKey("Jordi");
	}

}
