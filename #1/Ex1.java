import javax.swing.JOptionPane;

public class aula1 {

 public static void main(String[] args) {
  
  String qtdMin = JOptionPane.showInputDialog("Digite quantidade mínima: ");
  float quantidadeMinima = Float.parseFloat(qtdMin);
  
  String qtdMax = JOptionPane.showInputDialog("Digite quantidade mínima: ");
  float quantidadeMaxima = Float.parseFloat(qtdMax);

  float estoque = ((quantidadeMinima + quantidadeMaxima) / 2);
  
  JOptionPane.showMessageDialog(null, "Estoque: " + estoque);
  
 }
}
