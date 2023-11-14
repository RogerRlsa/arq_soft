package dominio;

import java.util.Date;
import java.util.List;

import dados.EmprestimoDTO;
import dados.SituacaoLeitorDTO;

public class EmprestimoMDS {

	private static EmprestimoMDS instance;
	private List<Integer> emprestimos;
	
	private EmprestimoMDS() {
	}
	
	public static EmprestimoMDS getInstance() {
		if (instance == null) {
			return new EmprestimoMDS();
		}
		return instance;
	}

	public SituacaoLeitorDTO iniciarEmprestimo() {
		// TODO Auto-generated method stub
		int idLeitor = 5000;
		LeitorMDS leitor = LeitorMDS.buscarLeitor(idLeitor);
		
		SituacaoLeitorDTO st = leitor.getSituacaoAtual();
		return st;
	}

	public Date emprestarLivro(int idLivro) {
		// TODO Auto-generated method stub
		LivroMDS livro = LivroMDS.buscarLivro(idLivro);
		
		List<EmprestimoDTO> nc = livro.buscarEmprestimosNConcluidos();
		
		if(!(nc.isEmpty())) {
			emprestimos.add(idLivro);
			
		}
		return null;
	}

}
