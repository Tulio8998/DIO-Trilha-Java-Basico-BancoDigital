package ContaBanco;

public class Usuario {
	
	private int numeroConta;
	private String palavraChave;
	
	public Usuario(int numeroConta, String palavraChave) {
		this.numeroConta = numeroConta;
		this.palavraChave = palavraChave;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(String palavraChave) {
		this.palavraChave = palavraChave;
	}

	public void recuperarConta(int novoNumero, String palavraChave) {
		
		if (getPalavraChave().equals(palavraChave)) {
			setNumeroConta(novoNumero);
		} else {
			System.out.println("ERRO! A palavra chave está errada");
		}
		
	}
	
	@Override
	public String toString() {
		return "(numeroConta: " + numeroConta + ")";
	}
    
    
}
