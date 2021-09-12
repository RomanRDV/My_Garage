package ru.example.webb.app.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.example.webb.app.entity.Auto;
import ru.example.webb.app.entity.Employee;
import ru.example.webb.app.entity.Relative;
import ru.example.webb.app.service.GarageService;

@Slf4j
@RequestMapping(value = "/garage")
@RequiredArgsConstructor
@RestController
@Tag(name = "Контроллер по обработке карт работников")
public class GarageController {

    private GarageService garageService;

    @PostMapping("/employee")
    public void sendData(@RequestBody @Parameter(description = "Данные сотрудника из формы") Employee employee) {
        garageService.sendDataFromKafka(employee);
    }

    @PostMapping("/auto")
    public void sendData(@RequestBody @Parameter(description = "Данные об авто сотрудника") Auto auto) {
        garageService.sendDataFromKafka(auto);
    }

    @PostMapping("/relative")
    public void sendData(@RequestBody @Parameter(description = "Данные родственниках сотрудника") Relative relative) {
        garageService.sendDataFromKafka(relative);
    }

}
