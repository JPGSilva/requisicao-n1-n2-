package edu.ifms.tads6.dsd_web_spring_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Add {
    private int number1;
    private int number2;

    public int getResult() {
        return number1 + number2;
    }
}
