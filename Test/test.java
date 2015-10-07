/////////////////////////////////////////////////////////////////////////////////////////////////
//Winston La
// a test dummy




import java.util.Scanner;
public class test{
  public static void main(String []arg){
    int k = 22;
   char x = 'l';
      switch (x){
  case 'y':
    System.out.println('y');
  case 'Y': 
    System.out.println('Y'); 
    k /= 2;
  case 'n':
    break;
  case 'N':
    System.out.println('N');
    k += 5;
    break;
  default:
    System.out.println("default ");
    k /=22 ;
}
System.out.printf("k = %2.2f\n", (double)k);
  
  
  
  }
}