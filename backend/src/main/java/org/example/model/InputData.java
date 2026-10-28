package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Setter
@Getter
@Document(collation = "inputs")
public class InputData {

    @Id
    private String id;

    private String value;

    public InputData(){}
    public InputData(String value){
        this.value = value;
    }


}
