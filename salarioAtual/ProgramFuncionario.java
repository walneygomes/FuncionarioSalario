package salarioAtual;

import java.util.Scanner;

public class ProgramFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario _1f = new Funcionario();

		Scanner sr = new Scanner(System.in);
		System.out.println(" Seu sal�rio ");
		double _1teclado = sr.nextDouble();
		System.out.print("Seu nome");
		Scanner sr1 = new Scanner(System.in);

		String nome = sr1.nextLine();

		_1f.setNome(nome);
		_1f.setSalario(_1teclado);

		System.out.printf(" Atual sal�rio %.2f %n", _1f.getSalario());
		System.out.printf(" Salario reajustado %.2f %n", _1f.salarioReajustado());
		System.out.printf(" Diferen��a entre o sal�rio Reajuste e Atual %.2f %n",
				_1f.diferencaSalarioReajustadoAtual());

	}

}
