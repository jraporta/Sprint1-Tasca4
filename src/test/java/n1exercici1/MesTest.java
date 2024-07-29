package n1exercici1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MesTest {
	
	private List<String> llistaMesos;

	@BeforeEach
	public void creaLlistaMesos() {
		llistaMesos = Mes.creaLlistaMesos();
	}
	
	
	@Test
	@DisplayName(value = "El métode creaLlistaMesos ha de retornar una llista de tamany 12")
	public void CorrectSizeTest() {
	
		assertEquals(llistaMesos.size(), 12);
	}
	
	@Test
	@DisplayName(value = "creaLlistaMesos retorna una llista no buida")
	public void ListIsNotEmptyTest() {
		
		assertFalse(llistaMesos.isEmpty());	
	}
	
	@Test
	@DisplayName(value = "verificar que agost està situat a la posició 7ª")
	public void CheckAugustPositionTest() {
		
		assertEquals(llistaMesos.get(7), "agost");	
	}
}
