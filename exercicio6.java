import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBase, gratificacao, imposto, salarioFinal;

        System.out.print("Digite o salario base: ");
        salarioBase = sc.nextDouble();

        gratificacao = salarioBase * 0.05;
        imposto = salarioBase * 0.07;

        salarioFinal = salarioBase + gratificacao - imposto;

        System.out.println("O salario a receber eh: " + salarioFinal);
        sc.close();
    }
}
