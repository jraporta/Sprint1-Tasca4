package n3exercici7;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyTest {
	
	@DisplayName(value = "comprova null")
	@Test
	public void assertObjectIsNullTest() {
		Object object = null;
		assertThat(object).isNull();
	}

}
