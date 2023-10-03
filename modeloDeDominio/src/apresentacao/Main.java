package apresentacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import dados.SituacaoLeitorDTO;
import dominio.EmprestimoMDS;

public class Main {
	
public static void main(String[] args) {
		EmprestimoMDS md = EmprestimoMDS.getInstance();
		
		SituacaoLeitorDTO st = md.iniciarEmprestimo();
		
		List<Integer> livros = new ArrayList<Integer>();
		livros.add(2);
		livros.add(5);
		livros.add(6);
		
		for(int l : livros) {
			Date dataDev = md.emprestarLivro(l);
		}
	}
}
