package exercicios.aula20;

/*Modifique o programa anterior de maneira a guardar os
compromissos de todo o ano, organizados por mês, dia e hora
(só 8 horas por dia).*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromisso = new String[12][31][8];

		boolean sair = false;
		byte opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();

			if (opcao == 1) {
				
				boolean mesValido = false;
				int mes = 0;
				
				while(!mesValido) {
					System.out.println("Digite o mês do compromisso");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido");
					}
				}
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do compromisso:");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 8 && hora <= 16) {
						horaValida = true;
					} else {
						System.out.println("hora inválida");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromisso[mes][dia][hora] = scan.next();
				

			} else if (opcao == 2) {
				
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido) {
					System.out.println("Digite o mês do compromisso");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido");
					}
				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do compromisso");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("dia inválido");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Digite a hora");
					hora = scan.nextInt();
					if (hora >= 8 && hora <= 16) {
						horaValida = true;
					} else {
						System.out.println("hora inválida");
					}
				}
				mes--;
				dia--;
				System.out.println("Compromisso agendado é: ");
				System.out.println(compromisso[mes][dia][hora]);
				
				
			} else if (opcao == 0) {
				sair = true;
				
			} else {
				System.out.println("Opção inválida, digite novamente");
			}

		}
	}
}
