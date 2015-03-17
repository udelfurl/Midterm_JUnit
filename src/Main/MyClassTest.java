package Main;

import static org.junit.Assert.*;
import main.MyClass;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void ReturnTrue() {
		int dogs=10;
		int cats=10;
		assertTrue(dogs==cats);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void AddTwoNumbers(){
		int nbr1=1;
		int nbr2=2;
		int nbr3=3;
		int result=0;
		MyClass c= new MyClass();
		result= c.AddTwoNumbers(nbr1, nbr2);
		
		assertEquals(nbr3,result);
		
	}
}
