package com.noon.librarymanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:20
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ISBN;
    private String title;
    private String subject;
    private int numberOfPage;

    public Book2(long ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }
}
