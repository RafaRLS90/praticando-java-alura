package sintaxes_variaveis_e_fluxos;

public class TesteIR {
	public static void main(String[] args) {

        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
        	System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        }else if(salario > 2800.0 && salario <= 3751.0 ) {
        	System.out.println("o IR é de 15% e pode deduzir na declaração o valor de R$ 350");
        }else if(salario > 3751.0 && salario <= 4664.0 ) {
        	System.out.println("o IR é de 22.5% e pode deduzir na declaração o valor de R$ 636");
        }
        
    }
}
