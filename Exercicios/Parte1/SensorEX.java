/*
 * Trata o uso de variaveis e tipos basicos
 */

 import java.util.Scanner;

public class SensorEX {
    public static void main(String [] args)
    {
        SensorEX p = new SensorEX();
        p.Executar();
    }
    
    public class Sensor
    {
        int     id;
        String  grandeza;
        float   valor;
    }

    public void Executar()
    {
        Scanner sc = new Scanner(System.in); //criando Scanner

        Sensor s_umidade = new Sensor(); //obj 
        
        System.out.println(" Digite o ID : ");
        s_umidade.id = sc.nextInt();
        System.out.println(" Digite a Grandeza : ");
        s_umidade.grandeza = sc.next();
        System.out.println(" Digite o valor : ");
        s_umidade.valor = sc.nextFloat();
        
        System.out.println(" --- Sensor : --- ");
        System.out.printf(" ID       : %d\n", s_umidade.id);
        System.out.printf(" Grandeza : %s\n", s_umidade.grandeza);
        System.out.printf(" Valor    : %f\n", s_umidade.valor);
        System.out.println(" ---------------- ");

        sc.close(); //fechando Scanner
    }
    
    
}
