import java.util.Scanner;


public class ManipuladorDeString {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite a frase que deseja ordenar:");
			String fraseDeEntrada = entrada.nextLine();
			
			String ordenado = ordenar(fraseDeEntrada);
			System.out.println("Sua frase ordenada ficou assim: "+ordenado);
			continuar();		
	}
	
	public static String ordenar(String frase) {

		String[] palavras = frase.split(" ");
					
		for(int i = 0; i < palavras.length; i++){	
			for(int j = 0; j < palavras.length-1; j++) {
				
				String palavraAtual = palavras[j];
				String palavraPosterior = palavras[j+1];
				
				if(palavraAtual.length() > palavraPosterior.length()) {
					String variavelAux = palavras[j+1];
					palavras[j+1] = palavras[j];
					palavras[j] = variavelAux;
				}	
			}
		}	
		String resultado ="";
		
		for(int k = 0; k < palavras.length; k++) {
			resultado += " "+palavras[k];
		}
		return resultado.trim();
	}
	private static void continuar(){
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ordenar outra frase?:");
		System.out.println("Digite \"1\" para SIM:");
		System.out.println("Digite \"2\" para NÃO:");
		int continua = entrada.nextInt(); 
		
		switch (continua) {
		case 1:
			main(null);
			break;
		case 2:
			System.out.print("\\-----Programa finalizado------\\");
			break;
		}
	}
}