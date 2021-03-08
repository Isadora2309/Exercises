public class TesteAluno {
    public static void main(String[] args){
        Aluno aluno01 = new Aluno ();
        aluno01.ra = "LU66666";
        aluno01.nome = "Karol";
        aluno01.boletim.notaNP1.valor = 3;
        aluno01.boletim.notaNP2.valor = 3;
        aluno01.relatorio();
    } 
}
