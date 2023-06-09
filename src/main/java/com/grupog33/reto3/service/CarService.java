package com.grupog33.reto3.service;

import com.grupog33.reto3.model.CarModel;
import com.grupog33.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> obtener(){
        return carRepository.findAll();
    }

    public void guardar(CarModel car){
        carRepository.save(car);
    }
}
