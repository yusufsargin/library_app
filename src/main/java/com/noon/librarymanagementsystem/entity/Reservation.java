package com.noon.librarymanagementsystem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created By Yusuf Sargin on 28/03/2022 - 22:24
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

    @Column(name = "reservedStudent")
    private Student reservedStudent;
}
