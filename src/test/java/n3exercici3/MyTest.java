package n3exercici3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MyTest {

	@Test
	public void arrayAreEqualCauseContentsAreTheSameTest() {
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {1, 2, 3, 4};
		
		assertThat(array1).isEqualTo(array2);
	}
}
