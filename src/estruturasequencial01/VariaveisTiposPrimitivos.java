package estruturasequencial01;

public class VariaveisTiposPrimitivos {

	public static void main(String[] args) {
		// EM PROGRAMAÇÃO, UMA VARIÁVEL É UMA PORÇÃO DE MEMÓRIA (RAM) UTILIZADA PARA ARMAZENAR DADOS DURANTE A EXECUÇÃO DOS PROGRAMAS.
		
		// DECLARAÇÃO DE VARIÁVEIS
		
		int idade = 25;
		double altura = 1.66;
		char sexo;
		sexo = 'F';
		
		System.out.println(idade + altura + sexo);
		
		// UMA VARIÁVEL POSSUI: NOME (OU IDENTIFICADOR) - TIPO - VALOR - ENDEREÇO
		
		// TIPOS PRIMITIVOS EM JAVA
		
		// TIPOS NUMÉRICOS INTEIROS:
		
			// TIPO: byte
				// TAMANHO: 8 BITS
				// VALORES: -128 A 127
				// VALOR PADRÃO: 0
		
			// TIPO: short
				// TAMANHO: 16 BITS
				// VALORES: -32768 A 32767
				// VALOR PADRÃO: 0
			
			// TIPO: int
				// TAMANHO: 32 BITS
				// VALORES: -2147483648 A 2147483647
				// VALOR PADRÃO: 0
		
			// TIPO: long
				// TAMANHO: 64 BITS
				// VALORES: -9223372036854770000 A 9223372036854770000
				// VALOR PADRÃO: 0L
		
		
		// TIPOS NUMÉRICOS COM PONTO FLUTUANTE:
				
			// TIPO: float
				// TAMANHO: 32 BITS
				// VALORES: -1,4024E-37 A 3,4028E+38
				// VALOR PADRÃO: 0.0f

			// TIPO: double
				// TAMANHO: 64 BITS
				// VALORES: -4,94E-307 a 1,79E+308
				// VALOR PADRÃO: 0.0

		
		// UM CARACTERE UNICODE:
		
			// TIPO: char
				// TAMANHO: 16 BITS
				// VALORES: '\u0000' A '\uFFFF'
				// VALOR PADRÃO: '\u0000'
			// TABELA UNICODE: unicode-table.com

		
		// VALOR LÓGICO:
		
			// TIPO: boolean
				// TAMANHO: 1 BIT
				// VALORES: {false, true}
				// VALOR PADRÃO: false
		
		// String:
			
			// CADEIA DE CARACTERES (PALAVRAS OU TEXTOS)
		
		char unicode = '\u2794';
		
		System.out.println(unicode);
		
		
		// REGRAS PARA DECLARAÇÃO DE VARIÁVEIS
		
			// NÃO PODE COMEÇAR COM DÍGITO: USE UMA LETRA OU _
			// NÃO PODE TER ESPAÇO EM BRANCO
			// NÃO USAR ACENTOS OU TIL
			//SUGESTÃO: USE O PADRÃO CAMEL CASE
		
				// ERRADO:                                        CORRETO:
					// int 5minutos;                                 int _5minutos;
					// int salário;                                  int salario;
					// int salário do funcionario;                   int salarioFuncionario;
		
	}

}
