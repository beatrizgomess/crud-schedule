package br.recife.ifpe.edu.agenda.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.recife.ifpe.edu.agenda.model.classes.Contato;
import br.recife.ifpe.edu.agenda.model.repositorios.RepositorioContato;

@Controller
public class AgendaController {
	
	
	@RequestMapping("/")
	public String inicial(Model m) {
		return "index";
	}
	
	@RequestMapping("/cadastro")
	public String pagCadastro(Model M) {
		return "cadastrocontato";
	}
	
	
	@RequestMapping("/cadContato") //notação 
	public String relCadastro(Model M, Contato cont) {
		
		RepositorioContato.getCurrentInstance().inserir(cont);
		
		M.addAttribute("msg", "Contato cadastrado com sucesso");
		
		return "index";
	}
	
	
	@RequestMapping("/contatos")
	public String apresentaContatos(Model m) {
		
		List<Contato> contatos = RepositorioContato.getCurrentInstance().lerTodos();
		m.addAttribute("contatos", contatos);
		
		
		return "contatos";
	}
	
	@RequestMapping("/contato/visualiza/{codigo}")
	public String visualizaContato(Model m, @PathVariable("codigo") int codigo) {
		
		Contato cont = RepositorioContato.getCurrentInstance().ler(codigo);
		m.addAttribute("contato", cont);
		
		return "unicoContato";
	}
	
	
	@RequestMapping("/contato/telaAtualiza/{codigo}")
	public String telaAtualiza(Model m, @PathVariable("codigo") int codigo) {
		
		Contato cont = RepositorioContato.getCurrentInstance().ler(codigo);
		m.addAttribute("contato", cont);
		
		return "cadastrocontato";
	}
	
	
	@RequestMapping("/contato/atualiza")
	public String atualiza(Model m, Contato cont) {
		
		RepositorioContato.getCurrentInstance().atualizar(cont);
		m.addAttribute("msg", "Contato alterado com sucesso");
		
		List<Contato> contatos = RepositorioContato.getCurrentInstance().lerTodos();
		m.addAttribute("contatos", contatos);
		
		return "contatos";
	}
	
	
	@RequestMapping("/contato/deletar/{codigo}")
	public String deletar(Model m, @PathVariable("codigo") int codigo) {
		
		RepositorioContato.getCurrentInstance().deletar(RepositorioContato.getCurrentInstance().ler(codigo));
		m.addAttribute("msg", "O contato foi removido com sucesso");
		
		List<Contato> contatos = RepositorioContato.getCurrentInstance().lerTodos();
		m.addAttribute("contatos", contatos);
		
		return "contatos";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
