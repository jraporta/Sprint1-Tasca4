package n3exercici6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;



public class SetmanaTest {
	
	@Test
	public void arrayIndexOutOfBoundsExceptionTest() {
		assertThatThrownBy(() -> {Setmana.getDiaSetmana(10);}).as("generates exception when called with argument not 1-7")
		.isExactlyInstanceOf(ArrayIndexOutOfBoundsException.class);
		
		
	}

}
