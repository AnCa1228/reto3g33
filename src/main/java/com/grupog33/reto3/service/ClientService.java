package com.grupog33.reto3.service;

import com.grupog33.reto3.model.ClientModel;
import com.grupog33.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> obtener(){
        return clientRepository.findAll();
    }

    public void guardar(ClientModel client){
        clientRepository.save(client);
    }
}
