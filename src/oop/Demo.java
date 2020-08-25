package oop;


class person{
	
	String name;
	String email;
	String phone;
	
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
	System.out.println(email); 
	}
	void sleep() {
	System.out.println(name + " is sleeping"); 
	}
}



public class Demo {
	
	public static void main(String[] args ) {
		//Instantatig an object
		person person1 = new person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "7897894564";
		
		//Abstraction
		person1.walk(); 
		///
		person person2 = new person();
		person2.name = "Sarah";
		person2.sleep();
		/*
		//Person
		
		//attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7897894564";
		
		//Action activity, behavoir
		//System.out.println(name + " is walking");
		walking (name);
		System.out.println(name + " is eating");
		
		
		//What if we wanted to do this for another person?
		
		
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "3213216548";
				
		//Action activity, behavoir
		//System.out.println(name2 + " is walking");
		walking (name2);
		System.out.println(name2 + " is eating");
		//What about binding attributes and properties together?
	}

	//Enhance by adding funtions to minimize code
	static void walking (String name) {
		System.out.println(name + " is walking");
		
		*/
	}
	
}








