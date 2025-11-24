package GabrielaSousa;

public class GSL28 {

	public static void main(String[] args) {
		System.out.println("********************************************************************************");
		System.out.println("* Aluno: Gabriela de Sousa Loura - RA 0024145");
		System.out.println("* Classe GSL 28 - Soma dos pares entre 1 e 100.");
		System.out.println("********************************************************************************");
			
		int numero = 2; // começamos pelo primeiro número par
        int soma = 0;

        while (numero <= 100) {
            soma += numero;  // soma apenas os pares
            numero += 2;     // pula para o próximo par
        }

        System.out.println("A soma de todos os números pares de 1 a 100 é: " + soma);
	    }
	

	

}
