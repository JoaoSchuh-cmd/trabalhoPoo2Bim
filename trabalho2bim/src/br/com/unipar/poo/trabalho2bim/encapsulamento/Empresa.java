package br.com.unipar.poo.trabalho2bim.encapsulamento;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private String name;
	private List<Cliente> clientes = new ArrayList();

	public Empresa(String name) {
		this.name = name;
		System.out.println("Empresa: " + name);
	}

	public void cadastroCliente(String name, String cpf, long clienteId) {
		Cliente cliente = new Cliente(name);
		cliente.setName(name);
		cliente.setCpf(cpf);
		cliente.setClienteId(clienteId);
		clientes.add(cliente);
		System.out.println("Cliente: " + toString(cliente.getName(), cliente.getCpf(), cliente.getClienteId()));
	}
	
	public String toString(String name, String cpf, long clienteId) {
        return "\nNome: " + name + "\n" + "cpf: " + cpf + "\n" + "Cliente ID: " + clienteId;
    }
}
