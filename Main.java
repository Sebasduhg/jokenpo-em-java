import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        String[] computador = {"pedra", "papel", "tesoura"};

        System.out.println("#################### JOKENPO ####################");
        System.out.println("(0) para pedra");
        System.out.println("(1) para papel");
        System.out.println("(2) para tesoura");
        System.out.println("Digite a sua opção: ");
        int escolhajogador = sc.nextInt();
        int indice = rd.nextInt(computador.length);
        String escolhacomputador = computador[indice];

        System.out.println("Sua escolha: " + computador[escolhajogador]);
        System.out.println("Escolha do computador: " + escolhacomputador);

        if (escolhajogador == indice) {
            System.out.println("Empate");
        } else if ((escolhajogador == 0 && indice == 2) ||
                (escolhajogador == 1 && indice == 0) ||
                (escolhajogador == 2 && indice == 1)) {
            System.out.println("Você ganhou!!!");
        } else {
            System.out.println("O computador ganhou!!!");
        }

        sc.close();
    }
}