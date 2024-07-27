package ContaBanco;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Usuario usuario1 = new Usuario(1, "A");
		ContaPoupanca poupanca1 = new ContaPoupanca(usuario1);
		banco.adicionarContaPoupanca(poupanca1);
		poupanca1.depositarDinheiro(5);
		
		Usuario usuario2 = new Usuario(2, "B");
		ContaPoupanca poupanca2 = new ContaPoupanca(usuario2);
		banco.adicionarContaPoupanca(poupanca2);
		poupanca2.depositarDinheiro(4);
		
		Usuario usuario3 = new Usuario(1, "A");
		ContaCorrente corrente1 = new ContaCorrente(usuario3);
		banco.adicionarContaCorrente(corrente1);
		corrente1.depositarDinheiro(9);
		
		System.out.println();
		
		System.out.println(banco.getContasPoupanca());
		banco.deletarConta(poupanca1);
		
		System.out.println();
		
		System.out.println(banco.getContasPoupanca());
		
		System.out.println();
		
		System.out.println(banco.getContasCorrente());
	}

}
