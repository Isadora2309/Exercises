import java.util.Scanner;

public class Ex5 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite a área da base do cilindro: ");
  float a = (float) leia.nextDouble();
  
  System.out.print("Digite o raio da base do cilindro: ");
  float r = (float) leia.nextDouble();

  float v = (float) (3.14159 * r * r * a);
  
  System.out.println("O volume do cilindro é: " + v);
  
 }
}
