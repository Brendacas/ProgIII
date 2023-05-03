
/*
 *  Trata o uso de variáveis e tipos básicos
 */


import java.util.Scanner;
public class Principal {
    
    public static void main(String [] args)
    {
        float umidade;

        System.out.println(" Digite a umidade : ");
        Scanner sc = new Scanner(System.in) ;
         umidade = sc.nextFloat();
        
        System.out.println(" Valor lido : ");
        System.out.print(umidade);
        
        sc.close();

    }
}