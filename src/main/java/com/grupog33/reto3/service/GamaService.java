package com.grupog33.reto3.service;

import com.grupog33.reto3.model.GamaModel;
import com.grupog33.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> obtener(){
        return gamaRepository.findAll();
    }

    public void guardar(GamaModel gama){
        gamaRepository.save(gama);
    }
}
