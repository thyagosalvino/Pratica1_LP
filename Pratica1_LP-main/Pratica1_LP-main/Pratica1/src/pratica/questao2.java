package pratica;

import java.util.Scanner;

import pratica.questao2.string;

public class questao2 {

	public class string {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		int ano, velho, seminovo;
		String placa;
		
		System.out.print ("Informe o ano do seu veículo: \n"); // ler o ano do veículo
		ano = entrada.nextInt(); // recebe o valor o ano do veículo
		velho = (2022-ano); //calcula o tempo de idade do veículo
		seminovo = (2022-ano); //calcula o tempo de idade do veículo
		
		if(ano<=2010) //identifica em que faixa o veículo se encontra
			System.out.print("Seu veículo é velho, ele possui " + velho + " anos");
			else if (ano <=2021)
			System.out.print("Seu veículo é semi novo, ele possui " + seminovo + " anos");
			else if (ano >= 2022)
			System.out.print("Seu veíuclo é novo.");
		
		System.out.print ("\n\nInforme a placa do seu veículo: \n"); //recebe a placa do veíuculo
		placa = ler.nextLine();
			placa = placa.replace('A','*'); //se a placa tiver a letra A subistitui por *
			placa = placa.replace('E','*');
			placa = placa.replace('I','*');
			placa = placa.replace('O','*');
			placa = placa.replace('U','*');
			placa = placa.replace('a','*');
			placa = placa.replace('e','*');
			placa = placa.replace('i','*');
			placa = placa.replace('o','*');
			placa = placa.replace('u','*');
			
					
			System.out.print("A placa do seu veíuculo é: " +placa); // imprimi a placa removendo as vogais.
		
	}

}
