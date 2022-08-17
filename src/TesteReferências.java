
public class TesteReferências {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("thiago");
		g1.setSalario(1500.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());

	}

}
