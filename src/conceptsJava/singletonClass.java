package conceptsJava;

public class singletonClass {

	public static void main(String[] args) {
		SingletonTest st1 =SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
	System.out.println(st1);
	System.out.println(st2);
		 

	}
}
	class SingletonTest{
		 static SingletonTest ob1 = new SingletonTest();
		 
		 private SingletonTest() {
			 System.out.println("Contructor will invoke for only one object");
		 }
		 
		 public static  SingletonTest getInstance() {
			 return ob1;
			 
		 }
	}
	
	
	
	/*In object-oriented programming, a singleton class is a class
	 *  that can have only one object (an instance of the class) at a time.
	 *   After the first time, if we try to instantiate the Singleton class, 
	 *   the new variable also points to the first instance created. 
	 *   So whatever modifications we do to any variable inside the
	 *    class through any instance, affects the variable of the 
	 *    single instance created and is visible if we access that 
	 *    variable through any variable of that class type defined. 

	Remember the key points while defining class
	 as a singleton class that is while designing a singleton class: 

	Make a constructor private.
	Write a static method that has 
	the return type object of this singleton class.
	 Here, the concept of Lazy initialization is used to write this static method.
	Purpose of Singleton Class
	The primary purpose of a Singleton class is to 
	restrict the limit of the number of object creation to only one. 
	This often ensures that there is access control to resources, 
	for example, socket or database connection.

	The memory space wastage does not occur with the use of the 
	singleton class because it restricts the instance creation.
	 As the object creation will take place only once 
	 instead of creating it each time a new request is made.

	We can use this single object repeatedly as per the requirements. 
	This is the reason why the multi-threaded and database
    applications mostly make use of the Singleton pattern in Java
   for caching, logging, thread pooling, configuration settings, and much more.

	For example, there is a license with us,
	 and we have only one database connection or 
	 suppose if our JDBC driver does not allow us
to do multithreading, then Singleton class comes 
into the picture and makes sure that at a time, 
only a single connection or a single thread can 
access the connection.

	How to Design/Create a Singleton Class in Java?
	To create a singleton class, we must follow the steps, given below:

	1. Ensure that only one instance of the class exists.

	2. Provide global access to that instance by

	Declaring all constructors of the class to be private.
	Providing a static method that returns a reference to the instance. The lazy initialization concept is used to write the static methods.
	The instance is stored as a private static variable.
	Example of singleton classes is Runtime class, Action Servlet, Service Locator. Private constructors and factory methods are also an example of the singleton class.

	Difference between Normal Class and Singleton Class
	We can distinguish a Singleton class from the usual classes with respect to the process of instantiating the object of the class. To instantiate a normal class, we use a java constructor. On the other hand, to instantiate a singleton class, we use the getInstance() method.

	The other difference is that a normal class vanishes at the end of the lifecycle of the application while the singleton class does not destroy with the completion of an application.

	Forms of Singleton Class Pattern
	There are two forms of singleton design pattern, which are:

	Early Instantiation: The object creation takes place at the load time.
	Lazy Instantiation: The object creation is done according to the requirement.
	*/


