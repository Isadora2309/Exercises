public class TesteGato {
    public static void main(String[] args){
        Gato gato01 = new Gato();
        gato01.nome = "Brutus";
        gato01.idade = 2;
        gato01.peso = 5.5;
        gato01.miar();
        
        Gato gato02 = new Gato();
        gato02.nome = "Ligeirinho";
        gato02.idade = 7;
        gato02.peso = 6;
        gato02.miar();
        
        Gato gato03 = new Gato();
        gato03.nome = "Mia";
        gato03.idade = 5;
        gato03.peso = 5;
        gato03.miar();
    }
}
