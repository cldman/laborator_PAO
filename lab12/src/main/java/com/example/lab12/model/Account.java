package com.example.lab12.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "accountnumber")
    private String accountNumber;
    @Column(name = "balance")
    private double balance;
    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private AccountType type;
    @Column(name = "cardnumber")
    private String cardNumber;
    @Column(name = "studentid")
    private Long studentId;
}
