package ClassesAbstratas;

public class ContaCorrente extends ContaAbstrata{
    private double limite;

    @Override
    public void Sacar(double pSaque){
        if(pSaque < (this.saldo + this.limite))
        this.saldo = this.saldo - pSaque;
    }
    
}
