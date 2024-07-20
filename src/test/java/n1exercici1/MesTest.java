package n1exercici1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MesTest {

	@Test
	@DisplayName(value = "El meu test")
	public void Test() {
		
		List<String> llistaMesos = Mes.creaLlistaMesos(new ArrayList<String>());
		
		assertEquals(llistaMesos.size(), 12);
		assertFalse(llistaMesos.isEmpty());
		assertEquals(llistaMesos.get(7), "agost");
		
		
		
	}
	
	
}
