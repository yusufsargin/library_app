package com.noon.librarymanagementsystem.service.impl;

import com.noon.librarymanagementsystem.entity.Book;
import com.noon.librarymanagementsystem.entity.BookItem;
import com.noon.librarymanagementsystem.entity.Reservation;
import com.noon.librarymanagementsystem.entity.Student;
import com.noon.librarymanagementsystem.repository.BookRepository;
import com.noon.librarymanagementsystem.service.ReservationService;

import java.util.Optional;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:35
 */
public class ReservationServiceImpl implements ReservationService {

    private final BookRepository bookRepository;
    private final Reservation reservation;

    public ReservationServiceImpl(BookRepository bookRepository, Reservation reservation) {
        this.bookRepository = bookRepository;
        this.reservation  = reservation;
    }


    @Override
    public boolean reserveBook(BookItem bookItem, Student student) {
        return false;
    }

    @Override
    public boolean deliverBook(BookItem bookItem) {
        return false;
    }
}
