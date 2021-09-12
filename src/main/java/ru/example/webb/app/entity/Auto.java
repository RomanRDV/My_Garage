package ru.example.webb.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Auto {
    private Long parentId;
    private String vin;
    private String brand;
    private Date release;

}
