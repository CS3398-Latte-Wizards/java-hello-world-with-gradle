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
   public void newest<JLM>GreeterPass() 
   {
      g.setName("Justin Massey");
      assertEquals(g.getName(),"Justin Massey");
      assertEquals(g.sayHello(),"Hello Justin Massey!");
   }
   
   /*@Test
   public void newest<JLM>GreeterFail() 
   {
      g.setName("Justin Massey");
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }*/
}