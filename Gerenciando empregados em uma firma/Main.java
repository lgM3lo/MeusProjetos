public class Main {
    public static void main(String[] args) {
        Empregados e1 = new Empregados(241,"Jose", 1400);
        Empregados e2 = new Empregados(242,"Joao", 1450);
        e1.getMatricula();
        e1.getNome();
        e1.setSalario(1500);
        e1.getSalario();
        e2.getMatricula();
        e2.getNome();
        e2.setSalario(1400);
        e2.getSalario();
        e2.getSalario();
        e1.exibirDados();
        e2.exibirDados();
        e1.forceneAumento();
    }
}
