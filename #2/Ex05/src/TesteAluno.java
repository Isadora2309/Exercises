public class TesteAluno {
    public static void main(String[] args){
        Aluno aluno03 = new Aluno("LAD456789", "Lucas");
        aluno03.boletim.notaNP1.valor = 8;
        aluno03.boletim.notaNP2.valor = 5;
        aluno03.relatorio();
    }
}
