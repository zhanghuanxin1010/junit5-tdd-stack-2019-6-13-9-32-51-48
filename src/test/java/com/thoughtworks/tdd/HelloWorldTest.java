package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;




public class HelloWorldTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

/* 
    @Test
    @DisplayName("try display name")
    public void hello_world_test() {
        //given
        Dependency dependency = new Dependency();
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Leave me alone."));
    }

    @Test
    public void should_be_mocked() {
        //given
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        //when
        String actual = helloWorld.beenCalled();

        //then
        assertThat(actual, is("Hello World"));
    }*/
    
    @Test
    public void should_be_return_number_when_input_i() {
    	HelloWorld helloWorld=new HelloWorld();
    	String result= helloWorld.fizzBuzz(1);
    	Assertions.assertEquals( "1",result);
        
        
    }
    @Test
    public void should_be_return_Fizz_when_input_3() {
    	HelloWorld helloWorld=new HelloWorld();
    	String result= helloWorld.fizzBuzz(3);
    	Assertions.assertEquals( "Fizz",result);
        
        
    }
    @Test
    public void should_be_return_Buzz_when_input_5() {
    	HelloWorld helloWorld=new HelloWorld();
    	String result= helloWorld.fizzBuzz(5);
    	Assertions.assertEquals( "Buzz",result);
        
        
    }
    @Test
    public void should_be_return_Whizz_when_input_7() {
    	HelloWorld helloWorld=new HelloWorld();
    	String result= helloWorld.fizzBuzz(7);
    	Assertions.assertEquals( "Whizz",result);
    }
    	@Test
        public void should_be_return_Whizz_when_input_15() {
        	HelloWorld helloWorld=new HelloWorld();
        	String result= helloWorld.fizzBuzz(15);
        	Assertions.assertEquals( "BuzzFizz",result);
        
    	}
    	@Test
        public void should_be_return__WhizzFizz_when_input_21() {
        	HelloWorld helloWorld=new HelloWorld();
        	String result= helloWorld.fizzBuzz(21);
        	Assertions.assertEquals( "WhizzFizz",result);
        
    	}
    	@Test
        public void should_be_return__WhizzBuzz_when_input_35() {
        	HelloWorld helloWorld=new HelloWorld();
        	String result= helloWorld.fizzBuzz(35);
        	Assertions.assertEquals( "WhizzBuzz",result);
        
    	}
    	@Test
        public void should_be_return__WhizzBuzzFizz_when_input_105() {
        	HelloWorld helloWorld=new HelloWorld();
        	String result= helloWorld.fizzBuzz(105);
        	Assertions.assertEquals( "WhizzBuzzFizz",result);
        
    	}
  
}
