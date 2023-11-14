package domain;

import java.util.Date;
import java.util.List;

import data.CamadaDados;
import data.EmprestimoDTO;
import data.LeitorDTO;
import data.LivroDTO;
import data.SituacaoLeitorDTO;

public class EfetuarEmprestimoRT {

	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		// TODO Auto-generated method stub
		CamadaDados dados = new CamadaDados();
		LeitorDTO leitor = dados.buscarLeitor(idLeitor);
		List<EmprestimoDTO> nc = dados.buscarNConcluidos(idLeitor);
		
		String nome = leitor.getNome();
		
		if(nc==null) {
			
			return new SituacaoLeitorDTO(nome, true);
		}
		return new SituacaoLeitorDTO(nome, false);
	}

	public Date emprestarLivro(int idLivro, List<Integer> emprestimo) {
		// TODO Auto-generated method stub
		CamadaDados dados = new CamadaDados();
		
		LivroDTO livro = dados.buscarLivro(idLivro);
		
		List<EmprestimoDTO> nc = dados.buscaEmprestimoLivroNConcluidos(idLivro);
		if(nc==null) {
			emprestimo.add(idLivro);
		}
		Date date = new Date();
		if (date.getMonth()<11) {
			date.setMonth(date.getMonth()+1);
		}else {
			date.setYear(date.getYear()+1);
			date.setMonth(0);
		}
		return date;
	}

	public void encerrarEmprestimo(int idLeitor, List<Integer> emprestimo) {
		// TODO Auto-generated method stub
		CamadaDados dados = new CamadaDados();
		for (int idLivro: emprestimo) {
			LivroDTO livro = dados.buscarLivro(idLivro);
			List<EmprestimoDTO> nc = dados.buscaEmprestimoLivroNConcluidos(idLivro);
			if(nc == null) {
				Date dataEmprestimo = new Date();
				Date dataDevolucao = dataEmprestimo;
				dados.armazenarEmprestimoLivro(idLeitor,idLivro,dataEmprestimo,dataDevolucao);
			}
		}
		
	}

}
