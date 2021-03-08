import java.util.Scanner;

public class Ex4 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite a temperatura em graus Fahrenheit: ");
  float fahrenheit = leia.nextFloat();

  float celsius = ((fahrenheit * 5)/9);
  
  System.out.println("A temperatura em graus Celsius é: " + celsius + "ºC");
  
 }
}
