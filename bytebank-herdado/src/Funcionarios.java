
//nao pode instanciar dessa, pq � abstrata 
public abstract class Funcionarios {
	private String cpf;
	private String nome;
	private double salario;
	
	
	
	public abstract double getBonificacao();
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
}
