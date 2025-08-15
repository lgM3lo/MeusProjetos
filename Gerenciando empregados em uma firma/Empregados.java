public class Empregados {
    private int matricula;
    private String nome;
    private double salario;

    public Empregados(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if (this.salario <= 0) {
            System.out.println("Salário não pode ser negativo " +
                    "o mínimo é 1400");
            salario = 1400;
        }
    }
    public void exibirDados() {
        System.out.println("--------------------------");
        System.out.println("Matrícula = " + matricula);
        System.out.println("Nome = " + nome);
        System.out.println("Salario = " + salario);
    }
    public void forceneAumento() {
        salario += salario * (10/100);
    }
}
