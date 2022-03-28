package com.noon.librarymanagementsystem.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:16
 */
@Getter
@Setter
public class BookItem extends Book2 {
    LocalDateTime borrowedDate;
    int price;
    BookStatus bookStatus;

    public BookItem(long ISBN, String title) {
        super(ISBN, title);
    }



    public boolean checkout() {
      return false;
    };
}
