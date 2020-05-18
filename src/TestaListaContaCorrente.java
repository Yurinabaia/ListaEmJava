
public class TestaListaContaCorrente {

	public static void main(String[] args)
	{
		
		ContaCorrente	cc;
		ListaContaCorrente	banco,	bancoNovo,	bancoCopia;
		banco =	new ListaContaCorrente();
		cc =	new ContaCorrente("Eveline",	36,	707,	500.00);
		banco.inserirFinal(cc);
		cc =	new ContaCorrente("João",	45,	801,	500.00);
		banco.inserirFinal(cc);
		cc =	new ContaCorrente("José",	71,	917,	900.00);
		banco.inserirFinal(cc);
		System.out.println("Contas-correntes	presentes	no	banco:");
		banco.imprimir();
		bancoNovo =	new ListaContaCorrente();
		cc =	new ContaCorrente("Ana",	70,	17,	700.00);
		bancoNovo.inserirFinal(cc);
		cc =	new ContaCorrente("sss",	170,	16,	400.00);
		bancoNovo.inserirFinal(cc);
		banco.concatenar(bancoNovo);
		System.out.println("Contas-correntes presentes	no	banco:");
		banco.imprimir();	
		System.out.println("A	instituição	financeira	apresenta " +	
		banco.obterNumContasCorrentes()	+	"	contas-correntes.");
	}

}
