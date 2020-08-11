
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Gerente g1= new Gerente();
		g1.setNome("felipe");
		g1.setSalario(5000);
		
		Funcionarios f = new Gerente();
		f.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}
	
}
