public class Aluno {
    public String ra;
    public String nome;
    public Nota notaNP1 = new Nota();
    public Nota notaNP2 = new Nota();
    
    public void relatorio (){
      double media = (this.notaNP1.valor + this.notaNP2.valor)/2;
      if(media >= 7){
          System.out.println("O aluno " + nome + " de R.A " + ra + " passou!");
      } else {
          System.out.println("O aluno " + nome + " de R.A " + ra + " não passou :c");
      }
    }
}