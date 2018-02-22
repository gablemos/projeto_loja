package br.com.gabriel.loja.dados;

import br.com.gabriel.loja.model.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clientes {

    private final List<Cliente> clientes;

    public Clientes(){
        this.clientes = new ArrayList<>();
        clientes.add(new Cliente("Gabriel Lemos", "gabriel.lemos@focusnetworks.com.br"));
        clientes.add(new Cliente("Lucas Rosa", "lucas.rosa@focusnetworks.com.br"));
        clientes.add(new Cliente("Wu Yuan", "wu.yuan@focusnetworks.com.br"));
        clientes.add(new Cliente("Maisa Ferreira", "maisa.ferreira@focusnetworks.com.br"));
        clientes.add(new Cliente("Roberto Perillo", "roberto.perillo@focusnetworks.com.br"));
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

    public Cliente getCliente(String email){
        for (Cliente cliente : clientes){
            if (cliente.getEmail().equals(email)){
                return cliente;
            }
        }
        return null;
    }
}
