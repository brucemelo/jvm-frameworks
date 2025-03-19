package com.brucemelo.springwebflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping
    Student get() {
        return new Student("Tom");
    }

}
