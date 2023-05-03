public class ContaMain {
    public static void main(String[] args) {
        Conta c1;
        c1 = new Conta();
        //c2 = new Conta();

        c1.numero = 10;
        c1.ag = 305;
        c1.titular = "Brenda";

    
        c1.Depositar(1000);
        c1.Sacar(75);
        c1.Imprimir();
        

       }
}
