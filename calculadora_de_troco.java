package atividades;

import java.util.Locale;
import java.util.Scanner;

public class calculadora_de_troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor total da compra: R$");
		double valor_compra = sc.nextDouble();
		
		System.out.println("Digite o valor que foi pago: R$");
		double valor_pago = sc.nextDouble();
		
		
		double troco = valor_pago - valor_compra;
		
		System.out.printf("O seu troco é: R$ %.2f%n", troco);
		

		sc.close();

	}

}
