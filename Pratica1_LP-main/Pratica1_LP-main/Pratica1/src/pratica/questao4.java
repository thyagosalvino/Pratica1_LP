	package pratica;

	import java.util.Random;
	import java.util.Scanner;
	import pratica.questao4.string;
	
	public class questao4 {

		
		public class system {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}
		public class Ramdom {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}
		public class string {
				
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		long CPF,CPF2,nVoo,CPF3,nVoo3;
		String nome;
		String data;
		string voo;
		String horario;
				
		System.out.print ("Painel de controle SALVINOAIR \n");
		System.out.print ("Cadastro de passageiro\n");
		System.out.print ("Op��o 1 (Exerc�cio)\n");
		System.out.print ("Nome: ");
		nome = ler.nextLine();
		System.out.print ("CPF: (Informe apenas os n�meros)");
		CPF = entrada.nextLong();
		System.out.print ("Data do Voo: (Informe no padr�o: DIA/M�S/ANO (4dig�tos para ano))");
		data = ler.nextLine();
		System.out.print ("Horario do Voo: (Informe no padr�o XX:XX)");
		horario = ler.nextLine();
		
		Random random = new Random();
		int nvoo = random.nextInt(1000);
        System.out.println("N�mero do voo �: " + nvoo);
        
        System.out.print ("\nCadastro efetuado com sucesso:\n");
        System.out.print ("Passageiro: "+nome+"\n");
        System.out.print ("CPF: " +CPF+ "\n");
        System.out.print ("Data do Voo: " +data+ "\n");
        System.out.print ("Hor�rio: " +horario+ "\n");
        System.out.println("N�mero do voo �: " + nvoo);
        
        System.out.println("\n\n______________________________________\n");
        System.out.print ("Op��o 2 (Exerc�cio)\n");
        System.out.print ("CPF: (Informe apenas os n�meros)");
		CPF2 = entrada.nextLong();
		System.out.print ("N�mero do V�o: (Informe apenas os n�meros)");
		nVoo = entrada.nextLong();
		System.out.println("\nCheck in relizado com sucesso, bom v�o\n");
		
		System.out.println("\n\n______________________________________\n");
        System.out.print ("Op��o 3 (Exerc�cio)\n");
        System.out.print ("CPF: (Informe apenas os n�meros)");
		CPF3 = entrada.nextLong();
		System.out.print ("N�mero do V�o: (Informe apenas os n�meros)");
		nVoo3 = entrada.nextLong();
		System.out.println("\nVoo Cancelado, lamentamos o ocorrido\n");
	}

}
