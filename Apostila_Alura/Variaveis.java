
/*
 * Na	 empresa	 em	 que	trabalhamos,	 há	tabelas	 com	 o	 gasto	 de	 cada	 mês.	 Para	 fechar	 o	
 * balanço	 do primeiro	trimestre,	 precisamos	 somar	 o	 gasto	total.	Sabendo	 que,	em	janeiro,	 foram	 
 * gastos	 15	mil reais,	em	fevereiro,	23	mil	reais	e,	em	março,	17	mil	reais,	faça	um	programa	que	
 * calcule	e	imprima a	despesa	total	no	trimestre	e	a	média	mensal	de	gastos
 */

public class Variaveis{
    int	gastosJaneiro	=	15000;
    int	gastosFevereiro	=	23000;
    int	gastosMarco	=	17000;
    int	gastosTrimestre	=	gastosJaneiro	+	gastosFevereiro	+	gastosMarco;

    public void imprimirDespesas() {
        System.out.println(String.format("Gasto do trimestre: R$%,.2f", (double) gastosTrimestre));
        int mediaPorMes = gastosTrimestre / 3;
        System.out.println(String.format("Média mensal: R$%,.2f", (double) mediaPorMes));
    }
}



