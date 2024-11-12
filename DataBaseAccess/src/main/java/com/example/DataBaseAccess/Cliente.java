package com.example.DataBaseAccess;

public class Cliente {

	private long id;
	private String nome, sobreNome;
	
	public Cliente(long id, String nome, String sobreNome) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	@Override
	public String toString() {
		return String.format(
				"Cliente[id=%d, nome='%s', sobreNome='%s']", id, nome, sobreNome);
	}
}
