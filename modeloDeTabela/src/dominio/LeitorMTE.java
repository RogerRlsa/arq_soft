package dominio;

import java.util.List;

import dados.Linha;
import dados.ResultSet;

public class LeitorMTE {

	public static ResultSet getSituacaoAtual(ResultSet rs, int idLeitor) {
		// TODO Auto-generated method stub
		rs.set("situacaoLeitor",true);
		List<Linha>it = rs.getLinhas("emprestimo");

		for(Linha i : it) {
			boolean siti = EmprestimoMTE.getSituacaoAtual(rs,i.getint(0));
			if (siti == false) {
				rs.set("situacaoLeitor",false);
				break;
			}
		}
		return rs;
	}

}
