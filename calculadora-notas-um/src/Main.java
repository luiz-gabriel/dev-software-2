import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		float n1, n2;
		short idade;
		String nome = null;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		nome = ler.next();
		
		System.out.print("\nDigite a idade do aluno: ");
		idade = ler.nextShort();
		
		System.out.print("\nDigite a primeira nota do aluno: ");
		n1 = ler.nextFloat();
		
		System.out.print("\nDigite a segunda nota do aluno: ");
		n2 = ler.nextFloat();

		System.out.println("\nO aluno: " + nome + "\nIdade: " + idade + "\nMédia: " + (n1 + n2)/2);
		
	}

}
