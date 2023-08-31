package br.com.poo.ExerciciosAula;

/*Declare dois caracteres : ‘A’ e ‘Z’, depois realize sua soma
e armazene em uma variável do tipo int.
•Qual é o resultado apresentado?
•Por que você acha que esse foi o resultado apresentado?*/
		
public class ExercicioAula4 {
	
	
	public static void main(String[] args) {
		char tipo = 'A';
		char tipo2 = 'Z';
		int soma = tipo + tipo2;
		System.out.println("A soma é: "+ soma);
		

	}

}



























/*Na tabela ASCII, 'A' tem o valor numérico 65 e 'Z' tem o valor numérico 90. Somando esses valores, temos 65 + 90 = 155.
No entanto, você pode se perguntar por que o resultado não é a concatenação dos caracteres 'A' e 'Z' (ou seja, "AZ").
 Isso ocorre porque, quando você realiza operações matemáticas com variáveis do tipo char,
  os valores numéricos correspondentes aos caracteres são usados.
 Portanto, a soma dos valores numéricos é realizada, não a concatenação dos caracteres em si.*/