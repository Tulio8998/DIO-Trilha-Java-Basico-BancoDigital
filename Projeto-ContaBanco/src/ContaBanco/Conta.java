package ContaBanco;

abstract class Conta {

    public abstract void depositarDinheiro(double moeda);
    public abstract void sacarDinheiro(double moeda);
    public abstract void transferirDinheiro(Conta usuario, double moeda);
    public abstract double visualizarDinheiro();
       
}
