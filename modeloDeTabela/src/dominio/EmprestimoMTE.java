package dominio;

import java.util.Date;
import java.util.List;

import dados.Linha;
import dados.ResultSet;
import dados.Tabela;

public class EmprestimoMTE {

	public static boolean getSituacaoAtual(ResultSet rs, int idEmprestimo) {
		// TODO Auto-generated method stub
		Tabela emprestimo = rs.getTabela("emprestimo");
		Date dataDevolucao = emprestimo.getLinha(idEmprestimo).getDate("dataDevolucao");
		
		return dataDevolucao == null;
	}

	public static ResultSet emprestarLivro(ResultSet rs, int idLeitor, int idLivro) {
		// TODO Auto-generated method stub
		rs = LivroMTE.getSituacaoAtual(rs, idLivro);
		return rs.sit();
	}

	public static void encerrarEmpretimos(ResultSet rs) {
		// TODO Auto-generated method stub
		rs = LeitorMTE.getSituacaoAtual(rs);
		
		if (rs.getLinhas("leitor").get(0).getBoolean("situacaoLeitor")) {
			List<Linha> it = rs.getLinhas("novosEmpretimos");
			for (Linha l : it) {
				int idLivro = Linha.getLivro();
				
				rs = LivroMTE.getSituacaoAtual(rs,idLivro);
				List<Linha> it1 = rs.getLinhas("livro");
				
				if (it1.get(0).getBoolean("situacaoLivro") == false) {
					System.out.println("Livro Indisponivel"); 
				}
			}
		}
	}

}
