package n1exercici3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.ArrayIndexOutOfBoundsException;

public class ExempleTest {

	@DisplayName( value = ("verifica ArrayIndexOutOfBoundsException al preguntar pel mes 13"))
	@Test
	public void testArrayIndexOutOfBoundsException() {
		
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {Exemple.getMes(13);});
		
	}
	
	
}
