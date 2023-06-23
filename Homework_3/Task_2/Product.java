package Homeworks.Homework_3.Task_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private String manufacturerCountry;
    private Double weight;
    private Double price;
    private Integer sort;
}
