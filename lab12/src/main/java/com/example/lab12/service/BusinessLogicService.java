package com.example.lab12.service;

import com.example.lab12.model.AccountType;
import com.example.lab12.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class BusinessLogicService {
    private final StudentService studentService;
    private final AccountService accountService;


    public long getNumberOfAccountsByStudentId(Long studentId){
       return accountService.getAllAccounts().stream()
                .filter(account -> account.getStudentId().equals(studentId))
                .count();
    }

    public Map<AccountType, Set<Student>> getAccountsAndStudents(){
        final HashMap<AccountType, Set<Student>> map = new HashMap<>();
        accountService.getAllAccounts().forEach( account -> {
                    if(map.containsKey(account.getType())) {
                       Set<Student> students = map.get(account.getType());
                       students.add(studentService.getStudentById(account.getStudentId()));
                    } else {
                        Set<Student> students= new HashSet<>();
                        students.add(studentService.getStudentById(account.getStudentId()));
                        map.put(account.getType(), students);
                    }
                });
        return map;
    }
}
