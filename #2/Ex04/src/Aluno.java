public class Aluno {
    
    public String ra;
    public String nome;
    public Boletim boletim = new Boletim();
    
    public void relatorio (){
      int media = (int) ((this.boletim.notaNP1.valor + this.boletim.notaNP2.valor)/2);
      if(media >= 7){
          System.out.println("O aluno " + nome + " de R.A " + ra + " passou!");
      } else {
          System.out.println("O aluno " + nome + " de R.A " + ra + " não passou :c");
      }
    }
}
