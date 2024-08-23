package com.myTech.QuestionBook.QuestionBook.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Questions")
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,unique = true)
    private int id;
    @Column(nullable = false,unique = true)
    private int questionNumber;
    @Column(nullable = false)
    private String subject;
    private String question;
    private String answer;

}
