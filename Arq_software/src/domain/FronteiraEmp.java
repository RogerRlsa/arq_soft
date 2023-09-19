package domain;

import data.SituacaoLeitorDTO;

public class FronteiraEmp {
	public static void main(String[] args) {
		EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
		int idLeitor = 5;
		
		SituacaoLeitorDTO st = roteiro.iniciarEmprestimo(idLeitor);
	}
}
