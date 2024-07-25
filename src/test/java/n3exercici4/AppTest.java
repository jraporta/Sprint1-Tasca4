package n3exercici4;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AppTest {
	
	private List<Object> myArray = null;
	
	private Integer obj1 = 11;
	private String obj2 = "hola";
	private char[] obj3 = {'a', 'b', 'c'};
	private Boolean obj4 = true;
	
	{
		myArray = new ArrayList<Object>();
		myArray.add(obj1);
		myArray.add(obj2);
		myArray.add(obj3);
		myArray.add(obj4);
	}
	
	@DisplayName (value = "Verify correct order of objects in ArrayList")
	@Test
	public void objAreInOrderInListTest() {
		assertThat(myArray).containsSequence(obj1, obj2, obj3, obj4);
	}
	
	@DisplayName (value = "Verify that the objects are in the list regardless of their order")
	@Test
	public void objAreInListTest() {
		assertThat(myArray).contains(obj2, obj3, obj1, obj4);
	}
	
	@DisplayName (value = "Verify that the object is only contained once in the list")
	@Test
	public void containsOnlyOnceTest() {
		assertThat(myArray).containsOnlyOnce(obj1);
	}
	
	@DisplayName (value = "Verify that the object is no longer in the list once removed")
	@Test
	public void doesNotContainTest() {
		myArray.remove(obj3);
		assertThat(myArray).doesNotContain(obj3);
	}
	
	

}
