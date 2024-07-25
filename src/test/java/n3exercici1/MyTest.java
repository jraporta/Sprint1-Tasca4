package n3exercici1;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyTest {
	

	@Test
	public void intEqualitytest() {
		assertThat(3).isEqualTo(3);
	}
	
	@Test
	public void intInequalityTest() {
		assertThat(10).isNotEqualTo(2);
	}
	
	
	
}
