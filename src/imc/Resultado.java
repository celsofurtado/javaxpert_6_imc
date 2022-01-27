package imc;

import java.util.Scanner;

public class Resultado {

	void executar() {
		// Declaração das variáveis
		int pesoDoUsuario;
		double alturaDoUsuario, valorImc;
		String nomeDoUsuario;
		Imc imc = new Imc();

		// Ler o teclado do usuário
		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual o o seu nome? ");
		nomeDoUsuario = leitor.nextLine();

		// Criando as variáveis para o cálculo
		System.out.print(nomeDoUsuario + " digite seu peso: "); // Concatenação
		pesoDoUsuario = leitor.nextInt();

		System.out.print("\nDigite a sua altura: ");
		alturaDoUsuario = leitor.nextDouble();

		leitor.close();

		valorImc = imc.calcularImc(pesoDoUsuario, alturaDoUsuario);

		System.out.println("\n" + nomeDoUsuario + ", seu imc é " + valorImc + ".");

		imc.classificarImc(valorImc);
	}

}
