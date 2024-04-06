public class ListaLigada {

    private Celula primeira;
    private Celula ultima;

    private int totalDeAlunos;

    public void adiciona(Object elemento) {
        if (this.totalDeAlunos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeAlunos++;
        }
    }
    public void adiciona(int posicao, Object elemento) {}
    public Object pega(int posicao) {return null;}
    public void remove(int posicao){}
    public int tamanho() {return this.totalDeAlunos;}
    public boolean contem(Object o) {return false;}

    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(this.primeira, elemento);
        this.primeira = nova;

        if(this.totalDeAlunos == 0){
            this.ultima = this.primeira;
        }
        totalDeAlunos++;
    }
    public void removeDoComeco() {}
    public void removeDoFim() {}

    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if(this.totalDeAlunos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeAlunos-1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}
