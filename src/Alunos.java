public class Alunos {
    private String nome;
    private int nota;

    public Alunos (String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public void exibirDados() {
        System.out.println("Nome = " + nome + " e nota = " + nota);
    }
}
