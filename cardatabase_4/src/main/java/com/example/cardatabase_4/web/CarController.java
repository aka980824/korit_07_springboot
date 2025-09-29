package com.example.cardatabase_4.web;

import com.example.cardatabase_4.service.CarService;
import com.example.cardatabase_4.domain.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car savedCar = carService.addCar(car);
        return new ResponseEntity<>(savedCar, HttpStatus.CREATED);
    }
    @GetMapping("cars/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return carService.getCarById(id).map(car -> ResponseEntity.ok().body(car))
        .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/cars/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable Long id) {
        if (carService.getCarById(id).isPresent()) {
            carService.deleteCarById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car carDetails) {
        return carService.updateCar(id, carDetails)
                .map(updatedCar -> ResponseEntity.ok(updatedCar))
                .orElse(ResponseEntity.notFound().build());
    }
}
