package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pontos = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o placar do jogo %d: ", i + 1);
			String placar = sc.nextLine();
			String[] gols = placar.split(": ");
			int golsTime = Integer.parseInt(gols[0]);
			int golsAdversario = Integer.parseInt(gols[1]);
			while (golsTime < 0 || golsTime > 4 || golsAdversario < 0 || golsAdversario > 4) {
				System.out.println("Digite apenas placares entre 0 e 4.");
				System.out.printf("Digite o placar do jogo %d: ", i + 1);
				placar = sc.nextLine();
				gols = placar.split(": ");
				golsTime = Integer.parseInt(gols[0]);
				golsAdversario = Integer.parseInt(gols[1]);
			}
			if (golsTime > golsAdversario) {
				pontos = pontos + 3;
			} else if (golsTime == golsAdversario) {
				pontos = pontos + 1;
			}
		}
		System.out.println("\nPontuação final do time: " + pontos);
		sc.close();
	}
}
