public class Nota {
    
    public double valor;
    
    public Nota(double aValor){
        if(valor >= 0 && valor <= 10){
            this.valor = aValor;
            if (aValor < 0){
                this.valor = 0;
            } else if (aValor > 10){
                this.valor = 10; 
            }
        }
    }
}