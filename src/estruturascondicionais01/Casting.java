package estruturascondicionais01;

public class Casting {

	public static void main(String[] args) {
		
		// PROCESSAMENTO DE DADOS
		
		// SINTAXE:
		
			// tipo nomeDaVariavel = expressão;
		
			// O SINAL DE IGUAL LÊ-SE "RECEBE"
			// A ESPRESSÃO É CALCULADA E O RESULTADO É ARMAZENADO EM "nomeDavariavel"
		
		// EXEMPLOS:
		
		int x, y;
		x = 5;
		y = 20 / x;
		
		System.out.println(x);
		System.out.println(y);
		
		int r = 5;
		double s;
		
		s = 20 / r;
		
		System.out.println(r);
		System.out.println(s);
		
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		// Uma boa prática é sempre indicar com ".0" quando a expressão for de ponto flutuante. Caso seja do tipo float, só mudaria o ".0" para o "f" no final do numero:
		
		float a, A, H, area1;
		
		a = 6f;
		A = 8f;
		H = 5f;
		
		area1 = (a + A) / 2f * H;
		
		System.out.println(area1);
		
		// CASTING: É A CONVERSÃO EXPLÍCITA DE UM TIPO PARA O OUTRO. É NECESSÁRIO QUANDO O COMPILADOR NÃO É CAPAZ DE "ADIVINHAR" QUE O RESULTADO DE UMA EXPRESSÃO DEVE SER DE OUTRO TIPO.
		
		int v, z;
		double resultado;
		
		v = 5;
		z = 2;
		
		resultado = (double) v / z;
		System.out.println(resultado);
	}

}
