package com.kgisl.zigwheels.service;

import java.util.List;

import com.kgisl.zigwheels.model.Car;
import com.kgisl.zigwheels.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarServiceImpl
 */
@Service
public class CarServiceImpl implements CarService {
   @Autowired
   private CarRepository carRepository;
   public List<Car> getCars()
   {
       System.out.println(""+carRepository.findAll());
       return carRepository.findAll();
   }
}