package Inheritance;

public class child_class extends Base_Class{

	public void mult()
	{
		System.out.println("Multiplication");
	}
	
	public void div()
	{
		System.out.println("Division");
	}
	
	public static void main(String []args)
	{
		child_class obj = new child_class();
		obj.add();
		obj.div();
		obj.mult();
		obj.sub();
		System.out.println("==============================");
		Base_Class obj1 = new Base_Class();
		obj1.add();
		obj1.sub();
		
		
		
	}
	
}
