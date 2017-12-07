package Polymorphism;

public class ClassB extends ClassA {
public void mymethod() {
	System.out.println("Vipinbhai Patel");
}
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.mymethod(); // Vipinbhai patel
	
		ClassA obj1 = new ClassA();
		obj1.mymethod(); // Patel Akash
	}
	

}
