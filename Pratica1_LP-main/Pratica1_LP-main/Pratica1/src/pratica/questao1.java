package pratica;
import java.util.Scanner	;
public class questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int tempo, combustivel, velmed, eficiencia;
		System.out.println ("Qual o tempo gasto na viagem?");
		tempo = entrada.nextInt();
	
		System.out.println ("Qual a sua velocidade média?");
		velmed = entrada.nextInt();
		
		System.out.println ("Qual é a eficiência do automóvel (km/litro) ?");
		eficiencia = entrada.nextInt();
	
		combustivel = (tempo*velmed)/eficiencia;
		System.out.println ("A quantidade de combustível a ser gasto é: " + combustivel);
		
	}
	

}