package test;

class Parent{
	int x = 100;
	
	Parent(){
		this(500);
	}
	Parent(int x){
		this.x = x;
	}
	int getX() {
		return x;
	}
}
class Child extends Parent{
	int x = 4000;
	
	Child(){
		this(5000);
	}
	Child(int x){
		this.x = x;
	}
}

public class Main {
	public static void main(String[] args) {
		Child ob = new Child();
		System.out.println(ob.getX());
	}
}

// 1
// 1
// 4
// 1



