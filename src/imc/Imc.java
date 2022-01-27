package imc;

public class Imc {

	double calcularImc(int peso, double altura) {

		double imc = (peso / (altura * altura));

		return imc;

	}

	void classificarImc(double imc) {

		// Determinar a classificação do IMC
		if (imc < 18.5) {
			System.out.println("Você está ABAIXO DO PESO!!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("PESO NORMAL");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("SOBREPESO");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("OBESIDADE GRAU 1");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("OBESIDADE GRAU 2");
		} else {
			System.out.println("OBESIDADE GRAU 3");
		}

	}

}
