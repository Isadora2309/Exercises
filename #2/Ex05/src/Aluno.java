public class Aluno {
    
    public String ra;
    public String nome;
    public Boletim boletim = new Boletim();
    
    public Aluno(String aRa, String aNome){
        
        this.ra = aRa;
        this.nome = aNome;
        this.boletim = new Boletim();
        
    }
    
    public void setNotaNP1(double aValor){
        this.boletim.notaNP1.valor = aValor;        
    }
    
    public void setNotaNP2(double aValor){
        this.boletim.notaNP2.valor = aValor;
    }
    
    public void relatorio (){
      int media = (int) ((this.boletim.notaNP1.valor + this.boletim.notaNP2.valor)/2);
      if(media >= 7){
          System.out.println("O aluno " + this.nome + " de R.A " + this.ra + " passou!");
      } else {
          System.out.println("O aluno " + this.nome + " de R.A " + this.ra + " não passou :c");
      }
    }
}