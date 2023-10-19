package dominio;

import java.util.List;

import dados.Linha;
import dados.ResultSet;

public class LivroMTE {

	public static ResultSet getSituacaoAtual(ResultSet rs, int idLivro) {
		// TODO Auto-generated method stub
		rs.set("situacaoLivro", true);
		
		List<Linha> it = rs.getLinhas("emprestimo");
		
		if (!it.isEmpty()) {
			rs.set("situacaoLivro", false);
		}
		return rs;
	}

}
