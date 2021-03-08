package ex08;
public class Aluno {

    private static int quantidadeDeAlunos = 0;
    private String ra;
    private String nome;
    private Boletim boletim = new Boletim();
    
    public Aluno(String aRa, String aNome){
        quantidadeDeAlunos += 1;
        this.ra = aRa;
        this.nome = aNome;
    }
    
    public void setNotaNP1(double valor){
        this.boletim.setNotaNP1(valor);
    }
    
    public double getNotaNP1(){
        return this.boletim.getNotaNP1();
    }
    
    public void setNotaNP2(double valor){
        this.boletim.setNotaNP2(valor);
    }
    
    public double getNotaNP2(){
        return this.boletim.getNotaNP2();
    }
    
    public void relatorio (){
      double media = (this.getNotaNP1() + this.getNotaNP2())/2;
      if(media >= 7){
          System.out.println("O aluno " + nome + " de R.A " + ra + " passou!");
      } else {
          System.out.println("O aluno " + nome + " de R.A " + ra + " não passou :c");
      }
    }
    
    public static void relatorioDaClasse(){
        System.out.println("A quantidade de alunos construída foi " + Aluno.quantidadeDeAlunos);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "R.A: " + this.ra + "\n";
        res += "Nome: " + this.nome + "\n";
        res += "NP1: " + this.getNotaNP1() + "\n";
        res += "NP2: " + this.getNotaNP2() + "\n";
        return res;
    }
    
}
