
public class TestaGerente {
	public static void main (String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("felipe");
		g1.setCpf("231165460");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		
		g1.setSenha(22222);
		boolean autenticou = g1.autentica(2222);
		System.out.println(autenticou);
	}
}
