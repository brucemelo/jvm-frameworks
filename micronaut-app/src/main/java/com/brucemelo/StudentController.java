package com.brucemelo;


import io.micronaut.core.annotation.Blocking;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@Controller
public class StudentController {

    @ExecuteOn(TaskExecutors.BLOCKING)
    @Get
    Student get() {
        return new Student("Tom");
    }

}
