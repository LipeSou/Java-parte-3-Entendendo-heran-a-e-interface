
// Gerente é um Funcionario, Gerente herda da classe Funcionarios
public class  Gerente extends Funcionarios  {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica (int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
//	public double getBonificacao() {
//		return this.salario;
//	}
}
