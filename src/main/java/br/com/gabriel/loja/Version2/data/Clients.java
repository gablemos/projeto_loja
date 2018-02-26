package br.com.gabriel.loja.Version2.data;


import br.com.gabriel.loja.Version2.model.Client;

import java.util.ArrayList;
import java.util.List;

public class Clients {

    private final List<Client> clients;

    public Clients(){
        this.clients = new ArrayList<>();
        clients.add(new Client("Gabriel Lemos", "gabriel.lemos@focusnetworks.com.br"));
        clients.add(new Client("Lucas Rosa", "lucas.rosa@focusnetworks.com.br"));
        clients.add(new Client("Wu Yuan", "wu.yuan@focusnetworks.com.br"));
        clients.add(new Client("Maisa Ferreira", "maisa.ferreira@focusnetworks.com.br"));
        clients.add(new Client("Roberto Perillo", "roberto.perillo@focusnetworks.com.br"));
    }

    public Client getClientByEmail(String email){
        for (Client client : clients){
            if (client.getEmail().equals(email)){
                return client;
            }
        }
        return null;
    }
}
