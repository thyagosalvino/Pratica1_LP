package pratica;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String frase, frasea, frasee, frasei, fraseo, fraseu;
		int cont, conta, conte, conti, conto, contu;
		
		System.out.println ("Digite uma frase:");
		
		frase=entrada.nextLine();
				
		frasea = frase.replace("a","");
		frasee = frase.replace("e","");
		frasei = frase.replace("i","");
		fraseo = frase.replace("o","");
		fraseu = frase.replace("u","");
		
		cont=frase.length();
		
		int auxa, auxe, auxi, auxo, auxu;
		
		auxa=cont-frasea.length();
		auxe=cont-frasee.length();
		auxi=cont-frasei.length();
		auxo=cont-fraseo.length();
		auxu=cont-fraseu.length();
		
		int contadordevogal=0;
		if (auxa>0)
			contadordevogal++;
		if(auxe>0)
			contadordevogal++;
		if(auxi>0)
			contadordevogal++;
		if(auxo>0)
			contadordevogal++;
		if(auxu>0)
			contadordevogal++;
		
				
		System.out.println ("A quantidade de vogais sem repetições na frase é: "+contadordevogal );
	}

}
