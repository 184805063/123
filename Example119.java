class Animal{
	public Animal(String name){
		System.out.println("����һֻ"+name);
	}
}
class Dog extends Animal{
	public Dog(){
		super("ɳƤ��");
	}
}
public class Example119{
	public static void main(String[] args){
		Dog dog=new Dog();
	}
}