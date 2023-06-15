package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        ContaAbstrata[] contas = new ContaAbstrata[6];

        contas[0] = new ContaAbstrata();
        contas[1] = new ContaCorrente();
        contas[2] = new ContaPoupança();
        contas[3] = new ContaAbstrata();
        contas[4] = new ContaCorrente();
        contas[5] = new ContaPoupança();

        for(ContaAbstrata c : contas){
            c.Sacar(5.0);
        }
    }


}
