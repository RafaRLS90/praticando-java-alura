package sintaxes_variaveis_e_fluxos;

public class TestaSomatoria {
	  public static void main(String[] args) {
	        int contador = 0;
	        int total = 0;
// iniciando antes do laço, o escopo da variável só será no final do código.
	        while(contador <= 10) {
	            total = total + contador;
	            contador++;
	            }
	            System.out.println(total);
	    }
}
