public class Vetor {
    private Aluno[] alunos = new Aluno[100];

    private int totalDealunos = 0;

    public void Adiciona(Aluno aluno) {
        this.alunos[this.totalDealunos] = aluno;
        this.totalDealunos++;
    }

    public int getTotalDealunos() {
        return totalDealunos;
    }

    public void adicionaPosicao(int posicao, Aluno aluno) {
        if (posicao < 0 || posicao > totalDealunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = totalDealunos; i > posicao; i--) {
            alunos[i] = alunos[i - 1];
        }

        alunos[posicao] = aluno;
        totalDealunos++;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= totalDealunos) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < totalDealunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }

        alunos[totalDealunos - 1] = null;
        totalDealunos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDealunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDealunos;
    }

    public String toString() {
        if (this.totalDealunos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDealunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDealunos - 1]);
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDealunos;
    }

    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicão inválida");
        }
        return this.alunos[posicao];
    }
}
