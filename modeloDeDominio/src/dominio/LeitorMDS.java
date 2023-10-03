package dominio;

import java.util.List;

import dados.CamadaDados;
import dados.EmprestimoDTO;
import dados.LeitorDTO;
import dados.SituacaoLeitorDTO;

public class LeitorMDS {
	
	private int idLeitor;
	private String nome;
	
	public static LeitorMDS buscarLeitor(int idLeitor) {
		// TODO Auto-generated method stub
		
		LeitorDTO leitor = CamadaDados.buscaLeitor(idLeitor);
		return null;
	}

	public SituacaoLeitorDTO getSituacaoAtual() {
		// TODO Auto-generated method stub
		List<EmprestimoDTO> nc = CamadaDados.buscarEmprestimosNConcluidos(idLeitor);
		
		if(!(nc.isEmpty())) {
			SituacaoLeitorDTO st = SituacaoLeitorDTO.cria(nome,true);
			return st;
		}
		return null;
	}

}
