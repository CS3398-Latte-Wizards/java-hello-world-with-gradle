package hello;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



public class TestGreeter {

   private Greeter g;
	
   @Before
   public void setUp() throws Exception 
   {
      g = new Greeter();
   }

   @Test
   public void testGreeterEmpty() 
   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }
	
   @Test
   public void testGreeter() 
   {
      g.setName("World War");
      assertEquals(g.getName(),"World War");
      assertEquals(g.sayHello(),"Hello World War!");
   }
   
    @Test
   public void newestJAGreeterPass() 
   {
	  // will check if strings are equal 
      g.setName("Team Latte");
	  if(g.getName() == "Team Latte"){
		  System.out.print(g.sayHello());
	  }
	  else {
		  g.setName("Team Latte");
		  System.out.print(g.sayHello());
	  
	  }

    }
	
	@Test
   public void newestJAGreeterFail() 
   // will test if a string is already in getname
   {   
   
      assertEquals(g.getName(),"Juan");
	  System.out.print(g.sayHello());
	  
	  /*
      assertEquals(g.sayHello(),"Hello Juan!");
   
		if(g.getName().isEmpty()){
			System.out.print("getName() is empty");
		}
		else {
			
		} */
		
   }

   
  
}