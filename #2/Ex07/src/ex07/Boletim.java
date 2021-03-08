package ex07;
class Boletim {
    
    private Nota notaNP1;
    private Nota notaNP2;
    
    //Utilizar um constructor para inicializar as variáveis
    public Boletim(){
        this.notaNP1 = new Nota(0);
        this.notaNP2 = new Nota(0);
    }
    
    public void setNotaNP1(double valor){
        this.notaNP1.setValor(valor);
    }
    
    public double getNotaNP1(){
        return this.notaNP1.getValor();
    }
    
    public void setNotaNO2(double valor){
        this.notaNP1.setValor(valor);
    }
    
    public double getNotaNP2(){
        return this.notaNP2.getValor();
    }
}
