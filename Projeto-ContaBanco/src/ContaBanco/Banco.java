package ContaBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<ContaPoupanca> contasPoupanca = new ArrayList<>();
    private List<ContaCorrente> contasCorrente = new ArrayList<>();

    public void adicionarContaPoupanca(ContaPoupanca conta) {
        contasPoupanca.add(conta);
    }

    public void adicionarContaCorrente(ContaCorrente conta) {
        contasCorrente.add(conta);
    }
    
    public void deletarConta (ContaPoupanca conta) {
    	contasPoupanca.remove(conta);
    }
    
    public void deletarConta (ContaCorrente conta) {
    	contasCorrente.remove(conta);
    }

    public List<ContaPoupanca> getContasPoupanca() {
        return contasPoupanca;
    }

    public List<ContaCorrente> getContasCorrente() {
        return contasCorrente;
    }

    @Override
    public String toString() {
        return "Banco " + contasPoupanca + contasCorrente;
    }
	
}
