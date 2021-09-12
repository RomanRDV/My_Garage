package ru.example.webb.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Relative {

    private Long id;
    private Long parentId;
    private String firstName;
    private String lastName;

}
