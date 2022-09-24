
public class Contructoroutsideclass {
	int age;

	private Contructoroutsideclass() {
		age = 30;
	}

	static {
		Contructoroutsideclass obj1 = new Contructoroutsideclass();
	}

	public static int Createobject() {
		Contructoroutsideclass obj1 = new Contructoroutsideclass();
          obj1.age=40;
          return obj1.age;
	}

	public static void main(String[] args) {
		Contructoroutsideclass obj = new Contructoroutsideclass();
		System.out.println(obj.age);

	}

}
