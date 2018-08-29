abstract class Animals{
	String color,breed,name;
	abstract void eat();
	void speak(){
		System.out.print("Speaking\n");
	}
}
class concrete extends Animals{
	void eat(){
		System.out.print("Overridden eat\n");
	}
}
class abstract1{
	public static void main(String args[]){
		concrete a=new concrete();
		a.eat();
		a.speak();
	}
}


