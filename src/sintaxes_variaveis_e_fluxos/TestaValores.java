package sintaxes_variaveis_e_fluxos;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;

	      char letra = 'a';
	        System.out.println(letra);

	        char valor = 65;                    // Compila!
	        System.out.println(valor);

	        valor = (char) (valor + 1);         // Compila!
	        System.out.println(valor);

	        String palavra = "alura cursos online de tecnologia";
	        System.out.println(palavra);

	        palavra = palavra + 2020;
	        System.out.println(palavra);
	}
}
