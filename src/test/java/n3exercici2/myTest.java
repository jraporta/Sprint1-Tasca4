package n3exercici2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class myTest {

	@DisplayName(value = "Testos de referències")
	@Test
	public void test() {
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3 = object1;
		
		
		assertThat(object1).isNotSameAs(object2);
		assertThat(object1).isSameAs(object3);
	}
}
