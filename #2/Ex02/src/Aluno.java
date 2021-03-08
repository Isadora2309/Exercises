public class Aluno{
    public String ra;
    public String nome;
    public double notaNP1;
    public double notaNP2;
    
    public void relatorio(){
      int media = (int) ((notaNP1+notaNP2)/2);
      if(media >= 7){
          System.out.println("O aluno " + nome + " de R.A " + ra + " passou!");
      } else {
          System.out.println("O aluno " + nome + " de R.A " + ra + " não passou :c");
      }
    }
}