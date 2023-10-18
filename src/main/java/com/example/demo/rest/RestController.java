package com.example.demo.rest;
import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.GenericArrayType;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private List<Student> thestudent;

    @PostConstruct
    public void loaddata() {
        thestudent = new ArrayList<>();
        thestudent.add(new Student("ram", "reddy", 1));
        thestudent.add(new Student("raj", "reddy", 2));
        thestudent.add(new Student("ravi", "reddy", 3));
    }


    @GetMapping(value = "/list")
    public List<Student> getlist() {
        return thestudent;
    }

    @GetMapping("/list/{id}")
    public Student getstudent(@PathVariable int id) {
        if ((id >= thestudent.size()) || (id < 0)) {
            System.out.println("ran");
            throw new StudentNotFoundException("user not found");

        }
        return thestudent.get(id);
    }


}