package imc;

import java.util.Scanner;

public class Resultado {

	void executar() {
		// Declara��o das vari�veis
		int pesoDoUsuario;
		double alturaDoUsuario, valorImc;
		String nomeDoUsuario;
		Imc imc = new Imc();

		// Ler o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);

		System.out.print("Qual o o seu nome? ");
		nomeDoUsuario = leitor.nextLine();

		// Criando as vari�veis para o c�lculo
		System.out.print(nomeDoUsuario + " digite seu peso: "); // Concatena��o
		pesoDoUsuario = leitor.nextInt();

		System.out.print("\nDigite a sua altura: ");
		alturaDoUsuario = leitor.nextDouble();

		leitor.close();

		valorImc = imc.calcularImc(pesoDoUsuario, alturaDoUsuario);

		System.out.println("\n" + nomeDoUsuario + ", seu imc � " + valorImc + ".");

		imc.classificarImc(valorImc);
	}

}
