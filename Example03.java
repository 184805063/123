
public class Example03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Teacher tc=new Teacher();
		new Thread(tc,"老师1").start();
		new Thread(tc,"老师2").start();
		new Thread(tc,"老师3").start();

	}

}
class Teacher implements Runnable{
	private int homeworks=80;
	public void run(){
		while(true){
		if(homeworks>0){
			Thread tc=Thread.currentThread();
			String tc_name=tc.getName();
			System.out.println(tc_name+"正在发第"+homeworks--+"本作业");
		}
	}
	}
	
}