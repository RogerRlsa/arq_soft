package dominio;

import java.util.Date;

import dados.ResultSet;
import dados.Tabela;

public class EmprestimoMTE {

	public static boolean getSituacaoAtual(ResultSet rs, int idEmprestimo) {
		// TODO Auto-generated method stub
		Tabela emprestimo = rs.getTabela("emprestimo");
		Date dataDevolucao = emprestimo.getLinha(idEmprestimo).getDate("dataDevolucao");
		
		return dataDevolucao == null;
	}

}
