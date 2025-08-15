
import java.util.Scanner;

public class CalculadoraDeVolumes {
    static Scanner prompt = new Scanner(System.in);
    static final double pi = 3.14159;
    public static void CalculosVolume() {
        double r;
        int h;
        double cilindro;
        double cone;
        double esfera;
        System.out.println("Escolha a opção:");
        System.out.println("1 para cilindro");
        System.out.println("2 para cone");
        System.out.println("3 para esfera");
        int a = prompt.nextInt();
        if (a == 1) {
            System.out.println("Digite o valor do raio:");
            r = prompt.nextDouble();
            System.out.println("Digite o valor da altura:");
            h = prompt.nextInt();
            cilindro = pi * Math.pow(r, 2) * h;
            System.out.println("Volume do cilindro é: " + cilindro);
        }
        if (a == 2) {
            System.out.println("Digite o valor do raio:");
            r = prompt.nextDouble();
            System.out.println("Digite o valor da altura:");
            h = prompt.nextInt();
            cone = (1.0/3) * pi * Math.pow(r, 2) * h;
            System.out.println("Volume do cone é: " + cone);
        }
        if (a == 3) {
            System.out.println("Digite o valor do raio:");
            r = prompt.nextDouble();
            esfera = (4.0/3) * pi * Math.pow(r, 3);
            System.out.println("Volume da esfera é: " + esfera);
        }
    }
    public static void main(String[] args) {
        CalculosVolume();
        prompt.close();
    }
}