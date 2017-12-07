package inheritance.test;

public class B
{
int a = 10;
int b = 20;
public void addition () {
	System.out.println("addition of a, b is :"+ (a+b));
}
public static void main(String []args)
{
	B myObject = new B();
	myObject.addition();
}
}
