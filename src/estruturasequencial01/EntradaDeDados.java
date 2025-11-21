package estruturasequencial01;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		// ENTENDENDO CONCEITOS
		// O QUE É UMA class: Uma classe é um molde, um modelo que descreve coisas (objetos).
		
			// EXEMPLOS: Scanner, String, ArrayList, Math
			
			// UMA CLASSE PODE TER:
				// atributos (características)
				// métodos (ações → funções dentro da classe)
		
		// O QUE É UMA BIBLIOTECA: É o conjunto de pacotes e classes prontas.
			
			// EXEMPLOS DESSES PACOTES:
				// java.util → pacote com classes úteis (Scanner, Random, ArrayList...)
				// java.lang → pacote básico (String, Math, System...)
		
		// O QUE É UM PACOTE? (package): Um pacote é como uma pasta onde as classes ficam organizadas.
			
			// EXEMPLOS:
		
				// java.util → um pacote com classes úteis (Scanner, Random, ArrayList...)
		
		// O QUE É UM MÉTODO? FUNÇÃO?
			// No Java, a palavra usada é método, mas é a mesma ideia de função: É uma ação que a classe sabe fazer.
		
			// EXEMPLO: Dentro da class Scanner, existe um método chamado:
				// nextLine() → serve para ler uma linha inteira de texto digitada pelo usuário.
		
		// Scanner
			// PARA FAZER ENTRADA DE DADOS EM NOSSO PROGRAMA, É NECESSÁRIO A CRIAÇÃO DE UM OBJETO DO TIPO Scanner:
		// import java.util.Scanner	= para importar a classe Scanner: Ela permite ler dados digitados pelo usuário (teclado), arquivos, strings, etc.
		
		Scanner sc = new Scanner(System.in);
		
		// PARA LER UMA PALAVRA (TEXTO SEM ESPAÇOS)
		
		String x;
		
		x = sc.next();
		
		System.out.println(x);
		
		// PARA LER UM NÚMERO INTEIRO
		
		int y;
		y = sc.nextInt();
		
		System.out.println(y);
		
		// PARA LER UM NÚMERO COM PONTO FLUTUANTE
		
		double z;
		z = sc.nextDouble();
				
		System.out.println(z);
		
		// PARA LER UM CARACTERE
		
		char a;
		
		a = sc.next().charAt(0);
		
		System.out.println(a);
		
		// PARA LER VÁRIOS DADOS DE UMA MESMA LINHA
		
		String X;
		int Y;
		double Z;
		
		X = sc.next();
		Y = sc.nextInt();
		Z = sc.nextDouble();
		
		System.out.println(X + Y + Z);
		System.out.printf("%s %d %f%n", X, Y, Z);
		
		// PARA LER UM TEXTO ATÉ QUEBRAR A LINHA
		
		String s1, s2, s3;
		
		sc.nextLine(); // <<< MUITO IMPORTANTE: limpa o buffer!
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// faça sc.close() quando não precisar mais do objeto sc
		sc.close();

	}

}

