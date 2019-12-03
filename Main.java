import mv.*;
import ct.*;
import rt.*;
public class Main{
  public static void main(String[] args) {
      Customer c=new Customer("张三");
      c. addRental(new Rental(new Movie("栀子花开",2),9));
      c. addRental(new Rental(new Movie("山楂树之恋" ,2),8));
      c. addRental(new Rental(new Movie("战狼",1),7));
      System. out.print(c. statement());
  }
}