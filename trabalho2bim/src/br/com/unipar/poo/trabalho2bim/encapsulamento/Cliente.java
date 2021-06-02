package br.com.unipar.poo.trabalho2bim.encapsulamento;

public class Cliente extends Object {
	private String name;
	private String cpf;
	private long clienteId;
	
	public Cliente(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public long getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
}
