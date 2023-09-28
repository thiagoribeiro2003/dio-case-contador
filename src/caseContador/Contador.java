package caseContador;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		
		int parametroUm;
		int parametroDois;
		
		System.out.print("Digite o primeiro parâmetro: ");
		parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException(); 
		}
		
		int contagem = parametroDois - parametroUm;
		
		for(int contador = 1; contador <= contagem; contador++) {
			System.out.println(contador);
		}
		
		
	}
	

}
