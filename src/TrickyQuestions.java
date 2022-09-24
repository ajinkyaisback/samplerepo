
public class TrickyQuestions {
	static {
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Initialization Block");
	}

	TrickyQuestions() {
		System.out.println("Constructor");
	}

	//Both Constructor and Instance block will be called when you create the object 
	
	public static void main(String args[]) {
		System.out.println("Main Method");
		// new TrickyQuestions();
	}

}
