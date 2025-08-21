import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, p1, p2, p3, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        p1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        p2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        p3 = sc.nextDouble();

        media = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);

        System.out.println("A media ponderada eh: " + media);
        sc.close();
    }
}
