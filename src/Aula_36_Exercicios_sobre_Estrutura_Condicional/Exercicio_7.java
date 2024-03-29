package Aula_36_Exercicios_sobre_Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
			de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
			ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
			Se o ponto estiver na origem, escreva a mensagem “Origem”.
			Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
			situação.
		 */

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite um valor com uma casa decimal para a coordenada X:");
		double x = sc.nextDouble();
		
		System.out.println("Digite um valor com uma casa decimal para a coordenada Y:");
		double y = sc.nextDouble();
		
		if (x==0 && y==0) {
			System.out.println("ORIGEM!");
		}else if (x==0 && y!=0) {
			System.out.println("EIXO Y!");
		}else if (x!=0 && y==0) {
			System.out.println("EIXO X!");
		}else if (x>0 && y>0) {
			System.out.println("Q1!");
		}else if (x>0 && y<0) {
			System.out.println("Q4!");
		}else if (x<0 && y>0) {
			System.out.println("Q2!");
		}else if (x<0 && y<0) {
			System.out.println("Q3!");
		}
	
	}

}
