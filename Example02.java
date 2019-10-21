
public class Example02 {

	public static void main(String[] args) {
		 int i=100;
		// TODO 自动生成的方法存根
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		while(true){
			if(i>0){
				i--;
			 System.out.println("main");
			}
	
		}

	}

}
class MyThread implements Runnable{
	public void run(){
		 int j=50;
		while(true){
			if(j>0){
				j--;
				System.out.println("new");
			}
			
		}
	}
}