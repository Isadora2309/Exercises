import java.util.Scanner;

public class Ex3 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite os graus em Celsius: ");
  float celsius = leia.nextFloat();

  float fahrenheit = (((9 * celsius)+160)/5);
  
  System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + "ºF");
  
 }
}
