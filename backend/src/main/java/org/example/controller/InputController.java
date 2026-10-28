package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.InputData;
import org.example.repository.InputRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins ="http://localhost:63342")
public class InputController {
    private final InputRepository inputRepository;

    public InputController(InputRepository repository){this.inputRepository = repository;}

    @PostMapping("/input")
    public String receiveInput(@RequestBody String input){
        if(input==null || input.isBlank()){
            throw new IllegalArgumentException("Input should not be empty");
        }
        InputData data = new InputData(input);
        inputRepository.save(data);
        return "Saved Succesfully";
    }

}
