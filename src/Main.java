public class Main {
    public static void main(String[] args) {
        Vetor lista = new Vetor();

        System.out.println("Hello and welcome!");

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();

        a1.setNome("Glevson");
        a2.setNome("Francisco");
        a3.setNome("Maria");
        a4.setNome("João");
        a5.setNome("José");
        a6.setNome("Miguel");
        a7.setNome("Jo");

        lista.Adiciona(a1);
        lista.Adiciona(a2);
        lista.Adiciona(a3);
        lista.Adiciona(a4);
        lista.Adiciona(a5);
        lista.Adiciona(a6);
        lista.Adiciona(a7);

        // Adicionando os alunos restantes
        Aluno a8 = new Aluno();
        a8.setNome("Jorge");
        lista.Adiciona(a8);

        Aluno a9 = new Aluno();
        a9.setNome("Andy");
        lista.Adiciona(a9);

        Aluno a10 = new Aluno();
        a10.setNome("Ellie");
        lista.Adiciona(a10);

        Aluno a11 = new Aluno();
        a11.setNome("Gau");
        lista.Adiciona(a11);

        Aluno a12 = new Aluno();
        a12.setNome("Pedro");
        lista.Adiciona(a12);

        Aluno a13 = new Aluno();
        a13.setNome("Moe");
        lista.Adiciona(a13);

        Aluno a14 = new Aluno();
        a14.setNome("Beth");
        lista.Adiciona(a14);

        Aluno a15 = new Aluno();
        a15.setNome("Andre");
        lista.Adiciona(a15);

        System.out.println("Total de alunos: " + lista.getTotalDealunos());
        System.out.println("Lista de alunos: " + lista);
    }
}
