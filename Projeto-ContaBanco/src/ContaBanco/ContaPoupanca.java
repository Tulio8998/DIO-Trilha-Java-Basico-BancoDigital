package ContaBanco;

public class ContaPoupanca extends Conta{
	
	private Usuario usuario;
	private double saldo = 0.0;	
	
	public ContaPoupanca(Usuario usuario) {
        this.usuario = usuario;
    }
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void depositarDinheiro(double moeda) {
		System.out.println("Valor depositado: " + (saldo += moeda));
	}

	@Override
	public void sacarDinheiro(double moeda){
		if (saldo < moeda) {
			System.out.println("O valor é maior que o saldo em sua conta.");
        }
		else {
			this.saldo -= moeda;
		}
	}

	@Override
	public double visualizarDinheiro() {
		return saldo;
	}
	
	@Override
	public void transferirDinheiro(Conta contaDestino, double moeda){
		
		if (saldo < moeda) {
			System.out.println("O valor é maior que o saldo em sua conta.");
        }
		else {
			this.sacarDinheiro(moeda);
			contaDestino.depositarDinheiro(moeda);
		}
	
	}

	@Override
	public String toString() {
		return "\nContaPoupanca (usuario: " + usuario + ", saldo: " + saldo + ")";
	}
	
	
}
