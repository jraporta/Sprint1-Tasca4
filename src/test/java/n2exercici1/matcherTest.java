package n2exercici1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;



public class matcherTest {
	
	
	private Matcher<String> personalizedMatcher(Matcher<Integer> someMatcher){
		return new FeatureMatcher<String, Integer>(someMatcher, "length", "length"){
			@Override
			protected Integer featureValueOf(String actual) {
				// TODO Auto-generated method stub
				return actual.length();
			}
		};
	}
	
	
	@DisplayName(value = "comprovar longitud de cadena")
	@Test
	public void test() {
		
		assertThat("Mordor", personalizedMatcher(equalTo(8)));
		
	}

}
