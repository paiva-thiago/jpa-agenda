package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contato database table.
 * 
 */
@Entity
@NamedQuery(name="Contato.findAll", query="SELECT c FROM Contato c")
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CONTATO")
	private int idContato;

	@Column(name="CD_TELEFONE")
	private String cdTelefone;

	@Column(name="NM_CONTATO")
	private String nmContato;

	@Column(name="NM_EMAIL")
	private String nmEmail;

	public Contato() {
	}

	public int getIdContato() {
		return this.idContato;
	}

	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}

	public String getCdTelefone() {
		return this.cdTelefone;
	}

	public void setCdTelefone(String cdTelefone) {
		this.cdTelefone = cdTelefone;
	}

	public String getNmContato() {
		return this.nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}

	public String getNmEmail() {
		return this.nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

}