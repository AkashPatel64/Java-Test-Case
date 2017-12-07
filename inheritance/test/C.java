package inheritance.test;

public class C extends B{
int a= 100;
int b =200;
public void addition()
{
	System.out.println("Addition of a , b number is :"+(a+b) );

}
public static void main(String []args) {
	C myobject = new C();
	myobject.addition();
	}
}
