import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        float rec = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();
        System.out.print("Digite o valor da primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.printf("O " + nome + " foi aprovado com a media de %.2f", media);
        } else {
            System.out.printf("O " + nome + " foi reprovado com a media de %.2f", media);
            System.out.println();
            System.out.print("Digite o valor da sua recuperação: ");
            rec = sc.nextFloat();
            if (rec >= 6) {
                System.out.printf("O " + nome + " foi aprovado na recuperação com a media de %.2f", rec);
            } else {
                System.out.printf("O " + nome + " foi reprovado com a media na recuperação de %.2f", rec);
            }
        }
    }
}
