package n3exercici2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class myTest {
	
	private Object object1 = new Object();
	private Object object2 = new Object();
	private Object object3 = object1;
	
	@DisplayName(value = "Comparem les referències de objectes")
	@Test
	public void objectsAreNotTheSameTest() {
		assertThat(object1).isNotSameAs(object2);
	}
	
	@DisplayName(value = "Comparem les referències de objectes")
	@Test
	public void objectsAreTheSameTest() {
		assertThat(object1).isSameAs(object3);
	}
}
