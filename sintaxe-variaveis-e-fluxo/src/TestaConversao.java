public class TestaConversao{
	
	
	//Conversão, Tipos de Dados
	// Inteiro. Float. Double
	//Ponto flutuante - Tipo de dados Reais
	//Sem ponto flutuante, Inteiro.

    public static void main(String[] args){

        float pontoFlutuante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}