package n1exercici3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.ArrayIndexOutOfBoundsException;

public class ExempleTest {

	@DisplayName( value = ("verifica ArrayIndexOutOfBoundsException"))
	@Test
	public void test() {
		
		Executable executable = new Executable() {
			@Override
			public void execute() {
				Exemple.throwException();
			}
			
		};
		
		assertThrows(ArrayIndexOutOfBoundsException.class, executable);
		
		
	}
	
	
}
