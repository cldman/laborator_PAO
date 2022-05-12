package com.example.lab12.controller;

import com.example.lab12.model.AccountType;
import com.example.lab12.model.Student;
import com.example.lab12.service.BusinessLogicService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
@RestController
public class BusinessController {
    private final BusinessLogicService businessLogicService;

    @GetMapping("/business")
    public Map<AccountType, Set<Student>> getAccountsAndStudents() {
        return businessLogicService.getAccountsAndStudents();
    }

}
