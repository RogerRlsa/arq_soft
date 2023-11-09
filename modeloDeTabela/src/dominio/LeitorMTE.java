package dominio;

import java.util.Iterator;

import dados.Linha;
import dados.ResultSet;

public class LeitorMTE {

	public static ResultSet getSituacaoAtual(ResultSet rs, int idLeitor) {
		// TODO Auto-generated method stub
		rs.set("situacaoLeitor",true);
		Iterator<Linha>it = rs.getLinhas("emprestimo");

		while(it.hasNext()) {
			Linha l = it.next();
			boolean siti = EmprestimoMTE.getSituacaoAtual(rs, l.getInt(0));
			if (siti == false) {
				rs.set("situacaoLeitor",false);
				break;
			}
		}
		return rs;
	}

	public static ResultSet getSituacaoAtual(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

}
