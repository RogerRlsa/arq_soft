package apresentacao;

import dominio.LeitorMTE;
import dados.CamadaDados;
import dados.ResultSet;

public class Main {
	public static void main(String[] args) {
		
		int idLeitor = 6;
		
		ResultSet rs = CamadaDados.buscarEmprestimosLeitor(idLeitor);
		rs = LeitorMTE.getSituacaoAtual(rs, idLeitor);
	}
}
