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
		
		System.out.print ("Informe o ano do seu ve�culo: \n"); // ler o ano do ve�culo
		ano = entrada.nextInt(); // recebe o valor o ano do ve�culo
		velho = (2022-ano); //calcula o tempo de idade do ve�culo
		seminovo = (2022-ano); //calcula o tempo de idade do ve�culo
		
		if(ano<=2010) //identifica em que faixa o ve�culo se encontra
			System.out.print("Seu ve�culo � velho, ele possui " + velho + " anos");
			else if (ano <=2021)
			System.out.print("Seu ve�culo � semi novo, ele possui " + seminovo + " anos");
			else if (ano >= 2022)
			System.out.print("Seu ve�uclo � novo.");
		
		System.out.print ("\n\nInforme a placa do seu ve�culo: \n"); //recebe a placa do ve�uculo
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
			
					
			System.out.print("A placa do seu ve�uculo �: " +placa); // imprimi a placa removendo as vogais.
		
	}

}
