package apresentacao;

import dominio.EmprestimoMTE;
import dominio.LeitorMTE;
import dados.CamadaDados;
import dados.ResultSet;

public class Main {
	public static void main(String[] args) {
		
		int idLeitor = 6;
		int livrosHaEmprestar[] = {1,2,3,4}; 
		
		ResultSet rs = CamadaDados.buscarEmprestimosLeitor(idLeitor);
		rs = LeitorMTE.getSituacaoAtual(rs, idLeitor);
		
		for (int idLivro: livrosHaEmprestar) {
			rs = CamadaDados.buscarEmprestimosLivroNConcluidos(idLivro);
			rs = EmprestimoMTE.emprestarLivro(rs, idLeitor, idLivro);
			
		}
		
		rs = CamadaDados.buscaEmprestimosNConcluidos(rs);
		
		EmprestimoMTE.encerrarEmpretimos(rs);
	}
}
