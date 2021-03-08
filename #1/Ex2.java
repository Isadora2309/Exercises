import java.util.Scanner;

public class aula12 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite a cotação do dólar: ");
  float cotacao = leia.nextFloat();
  
  System.out.print("Digite o valor em dólares: ");
  float valorDolar = leia.nextFloat();

  float valorReal = (cotacao * valorDolar);
  
  System.out.println("Valor em reais: R$ " + valorReal);
  
 }
}
