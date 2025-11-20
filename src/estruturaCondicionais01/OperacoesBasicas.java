package estruturaCondicionais01;

import java.util.Locale;

public class OperacoesBasicas {

	public static void main(String[] args) {
		// OPERAÇÕES BÁSICAS DE PROGRAMAÇÃO
		
		// ENTRADA DE DADOS, TAMBÉM CHAMADA DE LEITURA: "O PROGRAMA ESTÁ LENDO OS DADOS"
		
		// PROCESSAMENTO DE DADOS: QUANDO UM PROGRAMA REALIZA OS CÁLCULOS. O PROCESSAMENTO DE DADOS SE DÁ POR UM COMANDO CHAMOS DE ATRIBUIÇÃO.
			// EXEMPLO:
				// media = (x + y) / 2.0;
		
		// SAÍDA DE DADOS, TAMBÉM CHAMADA DE ESCRITA: "O PROGRAMA ESTÁ ESCREVENDO DADOS"
		
		
		// SAÍDA DE DADOS EM JAVA: PARA MOSTRAR NA TELA UM TEXTO QUALQUER
		
		System.out.print("Sem quebra de linha");
		System.out.println("Com quebra de linha");
		
		// PARA ESCREVER O CONTEÚDO DE UMA VARIÁVEL DE ALGUM TIPO
		
		String name = "Jaqueline";
		
		System.out.println(name);
		
		// PARA ESCREVER O NÚMERO DE UMA VARIÁVEL COM PONTO FLUTUANTE UTILAMOS:
		
		Locale.setDefault(Locale.US);
		
		double number = 10.6648343;
		
		System.out.println(number);
		System.out.printf("%.2f%n", number);
		System.out.printf("%.4f\n", number);
		System.out.println(number);
		
		// SE OBSERVA QUE AO EXECUTAR NESSA FORMATAÇÃO DE PONTO FLUTUANTE, O PONTO É TROCADO POR VÍRGULA. CASO QUEIRA QUE EM SEU PROGRAMA APAREÇA COM "." IRÁ SER NECESSÁRIO IMPORTAR O LOCALE ANTES DA DECLARAÇÃO DO SCANNER
		// Locale.setDefault(Locale.US);
		
		
		// PARA CONCATENAR VÁRIOS ELEMENTOS EM UM MESMOO COMANDO DE ESCRITA:
			// REGRA GERAL PARA print e println:
		
			// elemento1 + elemento2 + elemento3
		
		System.out.println("NOME: " + name);
		
		
		// REGRA GERAL PARA printf:
			// "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		
		System.out.printf("NÉMERO = %.2f%n", number);
		
		// %f = ponto flutuante
		// %n ou \n = quebra de linha
		// %d = inteiro
		// %s = string
		// %c = char
		
		
		// : COMENTÁRIO DE LINHA
		
		// ATALHOS:
			// • Importar classes: CTRL + SHIFT + O
			// • Autoendentação: CTRL + SHIFT + F
		    // • sysout CTRL + espaço
	}

}