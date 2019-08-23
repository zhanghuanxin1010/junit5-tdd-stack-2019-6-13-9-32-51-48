package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
//public class HelloWorld {
//    private Dependency dependency;
//
//    public HelloWorld(Dependency dependency) {
//
//        this.dependency = dependency;
//    }
//    public String beenCalled() {
//        return dependency.say();
//    }
//}
public class HelloWorld {
	public HelloWorld() {}

	@SuppressWarnings("unused")
	public String fizzBuzz(int i) {
		String result="";
		String Fizz="Fizz";
		String Whizz="Whizz";
		String Buzz="Buzz";
		if(i<1||i>120)
		{
			return "valid";
		}
			
		if(i%7==0) {
			result+=Whizz;
		}
		if(i%5==0)
		{
			result+=Buzz;
		}
		if(i%3==0)
		{
			result+=Fizz;
		}
		if(result=="")
			
			{return String.valueOf(i);}
		else
		
		{return result;}
		
	}
	
	
}