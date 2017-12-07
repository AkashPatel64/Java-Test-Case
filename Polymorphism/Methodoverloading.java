package Polymorphism;
// MethodoverLoading
public class Methodoverloading{
public void add (int a, int b)
{
	System.out.println(a+b);
}
public void add(int a, int b,int c) {

	System.out.println(a+b+c);

}
public void add(double a, double b, double c) {
	System.out.println(a+b+c);
	
}
public static void main (String[]args) {
	Methodoverloading obj = new Methodoverloading();
	obj.add(3, 4);
	obj.add(2.3, 2.5, 2.6);
}
}