package data;

import java.util.Date;
import java.util.List;

public class CamadaDados {

	public LeitorDTO buscarLeitor(int idLeitor) {
		// TODO Auto-generated method stub
		LeitorDTO leitor = new LeitorDTO();
		return leitor;
	}

	public List<EmprestimoDTO> buscarNConcluidos(int idLeitor) {
		// TODO Auto-generated method stub
		return null;
	}

	public LivroDTO buscarLivro(int idLivro) {
		// TODO Auto-generated method stub
		LivroDTO livro = new LivroDTO();
		return livro;
	}

	public List<EmprestimoDTO> buscaEmprestimoLivroNConcluidos(int idLivro) {
		// TODO Auto-generated method stub
		return null;
	}

	public void armazenarEmprestimoLivro(int idLeitor, int idLivro, Date dataEmprestimo, Date dataDevolucao) {
		// TODO Auto-generated method stub
		System.out.printf("%d %d %d %d\n",idLeitor, idLivro, dataEmprestimo.getMonth(), dataDevolucao.getMonth()+1);
	}

}
