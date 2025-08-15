import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner prompt = new Scanner(System.in);
        ArrayList<Alunos> alunos = new ArrayList<>();
        System.out.print("Digite o número de estudantes: ");
        int qtdEstudantes = prompt.nextInt();
        prompt.nextLine();
        for (int i = 0; i < qtdEstudantes; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + " :");
            String matricula = prompt.nextLine();
            System.out.print("Digite o nome do aluno " + (i + 1) + " :");
            String nome = prompt.nextLine();
            System.out.print("Digite a nota do aluno " + (i + 1) + " :");
            double nota = prompt.nextDouble();
            prompt.nextLine();
            alunos.add(new Alunos(matricula, nome, nota));
        }
        System.out.print("Digite a matrícula do aluno para aplicar o bônus: ");
        String matriculaBonus = prompt.nextLine();
        System.out.print("Digite o valor do bônus: ");
        double bonus = prompt.nextDouble();
        boolean encontrado = false;
        for (Alunos aluno : alunos) {
            if (aluno.getMatricula().equals(matriculaBonus)) {
                aluno.aplicarBonus(bonus);
                System.out.println("Bônus aplicado com sucesso!");
            }
        }
        System.out.println("Erro: matrícula não encontrada!");
        if (!encontrado) {
            System.out.println("Erro: matrícula não encontrada!");
        }
        System.out.println("\nLista de alunos atualizada:");
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
        prompt.close();
    }
}
