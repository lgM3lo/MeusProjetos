import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            Scanner prompt = new Scanner(System.in);
            System.out.println("Quantos alunos na turma?");
            int n = prompt.nextInt();
            Alunos[] alunos = new Alunos[n];
            int nota = 0, somaNotas = 0, maiorNota = 0;
            for (int i = 0; i < n; i++) { //ou i < alunos.length
                System.out.println("Qual o nome do aluno " + (i + 1) + "?");
                String nome = prompt.next();
                System.out.println("Qual a nota do aluno " + (i + 1) + "?");
                nota = prompt.nextInt();
                alunos[i] = new Alunos(nome, nota);
                somaNotas += nota;
                if (maiorNota < nota) {
                    maiorNota = nota;
                }
            }
            double media = (double) somaNotas/n;
            for (Alunos a : alunos) {
                a.exibirDados();
            }
            System.out.println("A média da turma é " + media);
            System.out.println("A maior nota da turma é " + maiorNota);
            prompt.close();
        }
    }


