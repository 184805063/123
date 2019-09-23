class Student{
	final String name="李芳";
	public void instroduce(){
		System.out.println("我是一个学生，我叫"+name);
	}
}
public class Example123{
	public static void main(String[] args){
		Student stu=new Student();
		stu.instroduce();
	}
}
