package com.myTech.QuestionBook.QuestionBook.Repository;

import com.myTech.QuestionBook.QuestionBook.Entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {
}
