import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, percentual, aumento, novoSalario;

        System.out.print("Digite o salario: ");
        salario = sc.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        percentual = sc.nextDouble();

        aumento = salario * (percentual / 100);
        novoSalario = salario + aumento;

        System.out.println("O valor do aumento foi: " + aumento);
        System.out.println("O novo salario eh: " + novoSalario);
        sc.close();
    }
}
