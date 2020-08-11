
public class testeFuncionario {
	
	public static void main(String[] args) {
		
		Funcionarios felipe = new Gerente();
		felipe.setNome("Felipe Souto");
		felipe.setCpf("5462156456 00");
		felipe.setSalario(2600.00);
		
		
		System.out.println(felipe.getNome());
		System.out.println(felipe.getSalario());
		
		System.out.println(felipe.getBonificacao());
		
	}
}
