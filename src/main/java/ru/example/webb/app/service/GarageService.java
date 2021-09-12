package ru.example.webb.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.example.webb.app.config.kafka.KafkaProducer;
import ru.example.webb.app.entity.Auto;
import ru.example.webb.app.entity.Employee;
import ru.example.webb.app.entity.Relative;

@Service
@RequiredArgsConstructor
public class GarageService {


    private KafkaProducer kafkaProducer;

    public void sendDataFromKafka(Employee employee) {
        kafkaProducer.send("employee", employee.toString());
    }

    public void sendDataFromKafka(Auto auto) {
        kafkaProducer.send("auto", auto.toString());
    }

    public void sendDataFromKafka(Relative relative) {
        kafkaProducer.send("relative", relative.toString());
    }

}
