import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o salario: ");
        salario = sc.nextDouble();

        novoSalario = salario + (salario * 0.25);

        System.out.println("O novo salario eh: " + novoSalario);
        sc.close();
    }
}
