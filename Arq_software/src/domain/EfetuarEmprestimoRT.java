package domain;

import java.util.List;

import data.CamadaDados;
import data.EmprestimoDTO;
import data.LeitorDTO;
import data.SituacaoLeitorDTO;

public class EfetuarEmprestimoRT {

	public SituacaoLeitorDTO iniciarEmprestimo(int idLeitor) {
		// TODO Auto-generated method stub
		CamadaDados dados = new CamadaDados();
		LeitorDTO leitor = dados.buscarLeitor(idLeitor);
		List<EmprestimoDTO> nc = dados.buscarNConcluidos(idLeitor);
		
		SituacaoLeitorDTO st = new SituacaoLeitorDTO();
		
		if(nc==null) {
			String nome = leitor.getNome();
			st.cria(nome, true);
		}
			
		return st;
	}

}
