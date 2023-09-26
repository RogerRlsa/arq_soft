package domain;

import java.util.List;

import data.SituacaoLeitorDTO;

public class FronteiraEmp {
	public static void main(String[] args) {
		EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
		int idLeitor = 5;
		
		SituacaoLeitorDTO st = roteiro.iniciarEmprestimo(idLeitor);
		
		List<Integer> livrosHaEmprestar;
		List<Integer> emprestimo;
		
		for(int idLivro: livrosHaEmprestar) {
			Date dataDev = roteiro.emprestarLivro(idLivro, emprestimo);
		}
	}
}
