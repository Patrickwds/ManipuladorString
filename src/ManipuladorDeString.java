import java.util.Scanner;


public class ManipuladorDeString {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a frase desejada: ");
		
		String fraseDeEntrada = entrada.nextLine();
		
		String ordenado = ordenar(fraseDeEntrada);
		System.out.println(ordenado);
		
	}
	
	public static String ordenar(String frase) {

		String[] palavras = frase.split(" ");
		
		int quantidadeDePalavras = palavras.length;
		
		for(int i = 0; i < quantidadeDePalavras - 1; i++) {	
		String palavraAtual = palavras[i];
		
		String palavraAtualDois = palavras[i+1];
		
			boolean estaOrdenado = true;
			
			for(int j = 0; j < quantidadeDePalavras - 1 - i; j++) {
				
				if(palavraAtual.length() > palavraAtualDois.length()) {
					String aux = palavras[j];
					palavras[j] = palavras[j + 1];
					palavras[j + 1] = aux;
					estaOrdenado = false;
				}
				
			}
			if(estaOrdenado)
				break;
		}
		
		String resultado = "";
		
		for(int k = 0; k < palavras.length; k++) {
			resultado += palavras[k] + " ";
		}
		
		return resultado;
	}
}
