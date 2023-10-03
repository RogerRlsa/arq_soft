package dominio;

import java.util.List;

import dados.CamadaDados;
import dados.EmprestimoDTO;
import dados.LivroDTO;

public class LivroMDS {

	public static LivroMDS buscarLivro(int idLivro) {
		// TODO Auto-generated method stub
		LivroDTO livro = CamadaDados.buscaLivro(idLivro);
		return null;
	}

	public List<EmprestimoDTO> buscarEmprestimosNConcluidos() {
		// TODO Auto-generated method stub
		List<EmprestimoDTO> emprestimos = CamadaDados.buscarEmprestimosLivrosNConcluidos(idLivro);
		return null;
	}

}
