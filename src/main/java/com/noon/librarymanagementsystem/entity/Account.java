package com.noon.librarymanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:25
 */

@Getter
@Setter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "accountStatus")
    private AccountStatus accountStatus;

}
