package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import data.SituacaoLeitorDTO;

public class FronteiraEmp {
	public static void main(String[] args) {
		EfetuarEmprestimoRT roteiro = new EfetuarEmprestimoRT();
		int idLeitor = 5;
		
		SituacaoLeitorDTO st = roteiro.iniciarEmprestimo(idLeitor);
		
		List<Integer> livrosHaEmprestar = new ArrayList<Integer>();
		livrosHaEmprestar.add(2);
		livrosHaEmprestar.add(5);
		livrosHaEmprestar.add(6);
		
		List<Integer> emprestimo = new ArrayList<Integer>();
		
		for(int idLivro: livrosHaEmprestar) {
			Date dataDev = roteiro.emprestarLivro(idLivro, emprestimo);
		}
		
		roteiro.encerrarEmprestimo(idLeitor, emprestimo);
	}
}
