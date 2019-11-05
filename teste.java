package questao9;

import java.util.Scanner;

public class teste {
	public void main(String[] args) {
		double nota01 = 0;
		double nota02 = 0;
		double nota03 = 0;
		double nota04 = 0;
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota01 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota02 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno: ");
		nota03 = sc.nextDouble();
		
		System.out.println("Digite a quarta nota do aluno: ");
		nota04 = sc.nextDouble();
		
		System.out.println(media);
		
		if(media <= 5.9) {
			System.out.println("Insuficiente");
		}else if(media > 5.9 && media < 6.9) {
			System.out.println("Suficiente");
		}else if(media > 6.9 && media < 8.9) {
			System.out.println("Bom");
		}else {
			System.out.println("Ótimo");
		}
	}
}
