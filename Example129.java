interface Animal{
	void shout();
}
class Cat implements Animal{
	public void shout(){
		System.out.println("ß÷ß÷......");
	}
}
class Dog implements Animal{
	public void shout(){
		System.out.println("ÍôÍô...");
	}
}
public class Example129{
	public static void main(String[] args){
		Animal an1=new Cat();
		Animal an2=new Dog();
		AnimalShout(an1);
		AnimalShout(an2);
	}
	public static void AnimalShout(Animal an){
		an.shout();
	}
}
		