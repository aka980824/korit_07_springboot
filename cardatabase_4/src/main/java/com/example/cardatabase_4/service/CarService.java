package com.example.cardatabase_4.service;

import com.example.cardatabase_4.domain.Car;
import com.example.cardatabase_4.domain.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll(); // findAll() 사용
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    @Transactional
    public Optional<Car> updateCar(Long id, Car cardetails) {
        return carRepository.findById(id)
                .map(car -> {
                    car.setBrand(cardetails.getBrand());
                    car.setModel(cardetails.getModel());
                    car.setColor(cardetails.getColor());
                    car.setPrice(cardetails.getPrice());
                    car.setModelYear(cardetails.getModelYear());
                    car.setRegistrationNumber(cardetails.getRegistrationNumber());
                    return car;
                });
    }


}
