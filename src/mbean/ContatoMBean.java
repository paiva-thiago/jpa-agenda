package mbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import service.ContatoImpl;

import model.Contato;

@RequestScoped
@ManagedBean(name="contatoMBean")
public class ContatoMBean {
	private Contato 		contato;
	private ContatoImpl 	qryContato;
	private List<Contato> 	contatos;
	
	public ContatoMBean(){
		contato    = new Contato();
		qryContato = new ContatoImpl();
		contatos   = qryContato.listarContatos();
	}
	
	public void buscarContato(){
		contato = qryContato.porId(contato.getIdContato());
	}
	
	public void gravar(){
		qryContato.gravarContato(contato);
		contatos=qryContato.listarContatos();
	}

}
