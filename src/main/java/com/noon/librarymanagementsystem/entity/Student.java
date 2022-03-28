package com.noon.librarymanagementsystem.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:27
 */
@Entity
@NoArgsConstructor
public class Student extends Account{
    @Column(name = "totalBooksBorrowed")
    private int totalBooksBorrowed;

}
