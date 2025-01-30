public class CriarPilha {
    private No topo;

    private static class No {
        char dado;
        No proximo;
        No(char dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    public void push(char dado) {
        No novoNo = new No(dado);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public char pop() {
        if (topo == null) {
            return '\0';
        }
        char dado = topo.dado;
        topo = topo.proximo;
        return dado;
    }

    public boolean isEmpty() {
        return topo == null;
    }
}
