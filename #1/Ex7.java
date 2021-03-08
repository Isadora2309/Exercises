import java.util.Scanner;

public class Ex7 {

 public static void main(String[] args) {
  
  Scanner leia = new Scanner(System.in);
  
  System.out.print("Digite um valor para x: ");
  int codigo = leia.nextInt();
  
  switch(codigo){
      case 1:
          System.out.println("Um");
          break;
      case 2:
          System.out.println("Dois");
          break;
      case 3:
          System.out.println("Três");
          break;
      default:
          System.out.println("Código inválido");
  }
  
 }
}