package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i, alunos;
		double media;
		String respostaString;

		System.out.println("-------------------------------------------");
		System.out.println("                NOTAS FINAIS");
		System.out.println("-------------------------------------------");

		System.out.println("");
		System.out.println("Quantos alunos você deseja cadastrar?");
		alunos = teclado.nextInt();

		String[][] nomes = new String[alunos][2];
		double[][] notas = new double[alunos][5];

		System.out.println("Deseja iniciar o cadastro? (s/n)");
		respostaString = teclado.next();

		while (respostaString.equals("s")) {

			for (i = 0; i < alunos; i++) {

				System.out.print("Nome do aluno: ");
				nomes[i][0] = teclado.next();
				System.out.println();

				System.out.print("Nota do 1º bimestre: ");
				notas[i][0] = teclado.nextDouble();
				System.out.println();

				System.out.print("Nota do 2º bimestre: ");
				notas[i][1] = teclado.nextDouble();
				System.out.println();

				System.out.print("Nota do 3º bimestre: ");
				notas[i][2] = teclado.nextDouble();
				System.out.println();

				System.out.print("Nota do 4º bimestre: ");
				notas[i][3] = teclado.nextDouble();
				System.out.println();

				media = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
				notas[i][4] = media;

				System.out.println("Deseja cadastrar mais um aluno? (s/n)");
				respostaString = teclado.next();
			}

			for (int z = 0; z < alunos; z++) {
				media = (notas[z][0] + notas[z][1] + notas[z][2] + notas[z][3]) / 4;
				notas[z][4] = media;
				nomes[z][1] = getStatus(media);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %n", "Nome", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Média", "Status");
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %n", nomes[z][0], notas[z][0], notas[z][1],notas[z][2], notas[z][3], notas[z][4], nomes[z][1]);
			}

			System.out.println("Não deseja cadastrar mais alunos. Encerrando o programa.");
			break;

		}
	}

	public static String getStatus(double media) {
		if (media >= 5.0) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
}
