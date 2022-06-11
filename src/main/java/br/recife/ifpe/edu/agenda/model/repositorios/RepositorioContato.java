package br.recife.ifpe.edu.agenda.model.repositorios;

import java.util.ArrayList;
import java.util.List;

import br.recife.ifpe.edu.agenda.model.classes.Contato;

public class RepositorioContato {
	
	private static RepositorioContato myself = null;
	private List<Contato> contatos = null;
	
	private RepositorioContato() {
		
		this.contatos = new ArrayList<Contato>();
	}
	
	public static RepositorioContato getCurrentInstance() {
		if(myself == null) {
			myself = new RepositorioContato();
		
		}
		return myself;
	}
	
	public void inserir(Contato c) {
		this.contatos.add(c);
	}
	
	public void atualizar(Contato c) {
		for(Contato cAux: this.contatos) {
			if(cAux.getCodigo() == c.getCodigo()) {
				cAux.setDescricao(c.getDescricao());
				cAux.setEmail(c.getEmail());
				cAux.setEndereco(c.getEndereco());
				cAux.setTelefone1(c.getTelefone1());
				cAux.setTelefone2(c.getTelefone2());
				
				return;
			}
		}
	}
	
	public Contato ler(int codigo) {
		for(Contato cAux: this.contatos) {
			if(cAux.getCodigo() == codigo) {
				
				return cAux;
			}
				
		}
		
		return null;
	}
	
	
	public void deletar(Contato c) {
		this.contatos.remove(c);
	}
	
	public List<Contato> lerTodos(){
		return this.contatos;
	}

}
