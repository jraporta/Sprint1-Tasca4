package n2exercici1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.FeatureMatcher;

import static org.hamcrest.MatcherAssert.assertThat;



public class matcherTest {
	
	@DisplayName(value = "comprovar longitud de cadena")
	@Test
	public void test() {
		
		FeatureMatcher<String, Integer> myMatcher = new FeatureMatcher<String, Integer>(equalTo(8), "length", "length"){
			@Override
			protected Integer featureValueOf(String actual) {
				// TODO Auto-generated method stub
				return actual.length();
			}
		};
		
		assertThat("Mordor", myMatcher);
		
	}

}
