package com.noon.librarymanagementsystem.service;

import com.noon.librarymanagementsystem.entity.BookItem;
import com.noon.librarymanagementsystem.entity.Student;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:34
 */
public interface ReservationService {
    boolean reserveBook(BookItem bookItem, Student student);
    boolean deliverBook(BookItem bookItem);
}
