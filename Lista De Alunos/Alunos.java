public class Alunos {
    private String matricula;
    private String nome;
    private double nota;

    public Alunos(String matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void aplicarBonus(double bonus) {
        if (bonus > 0) {
            this.nota += bonus;
        }
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Nota: " + nota;
    }
}
