package n1exercici2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculoDNITest {

	
	@DisplayName(value = "Comprobar la letra del dni")
	@ParameterizedTest
	@MethodSource(value = "testDniParams")
	public void test(int dni, char lletra) {
		assertEquals(CalculoDNI.letra(dni), lletra);
	}
	
	private static Stream<Arguments> testDniParams(){
		return Stream.of(
				Arguments.of(95063906, 'F'),
				Arguments.of(86029357, 'L'),
				Arguments.of(15438917, 'Y'),
				Arguments.of(708604, 'C'),
				Arguments.of(7278437, 'H'),
				Arguments.of(32648521, 'K'),
				Arguments.of(62207078, 'J'),
				Arguments.of(80096955, 'F'),
				Arguments.of(6677390, 'F'),
				Arguments.of(90620221, 'Z')
				);
	}
	
	
}
