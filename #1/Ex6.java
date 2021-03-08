import java.util.Scanner;

public class Ex6 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite um valor para x: ");
  float x = leia.nextFloat();
  
  if (x >= 0) {
   System.out.println("O módulo de x (|x|) é:  " + x);   
  } else {
   
   float y =(float) (x * (-1));
   System.out.println("O módulo de x (|x|) é:  " + y);
  }
  
 }
}
