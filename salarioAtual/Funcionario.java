package salarioAtual;

public class Funcionario {
	private String nome;
	private double salario;
	private static final double _25ACRESCIMO = 0.25;
	private static final double _20ACRESCIMO = 0.20;
	private static final double _15ACRESCIMO = 0.15;
	private static final double _10ACRESCIMO = 0.1;

	public double salarioReajustado() {
		double funcionario;

		if (this.getSalario() <= 150) {

			funcionario = this.getSalario() * _25ACRESCIMO;

		} else if (this.getSalario() > 150 && this.getSalario() <= 300) {
			funcionario = this.getSalario() * _20ACRESCIMO;
		} else if (this.getSalario() > 300 && this.getSalario() <= 600) {
			funcionario = this.getSalario() * _15ACRESCIMO;

		} else {
			funcionario = this.getSalario() * _10ACRESCIMO;

		}
		return funcionario;

	}

	public double diferencaSalarioReajustadoAtual() {
		return  this.getSalario()-salarioReajustado() ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
