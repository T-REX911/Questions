package com.myTech.QuestionBook.QuestionBook.Repository;

import com.myTech.QuestionBook.QuestionBook.Entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {
    
    @Query("select count(*) from Questions q where q.subject = :subject")
    public int getLastQuestionNumber(@Param("subject") String subject);

    Questions findByQuestion(String question);

    @Query("select q.question from Questions q where q.subject = :subject and q.questionNumber = :questionNumber")
    String getQuestionBySubjectAndNumber(@Param("subject") String subject,
                                         @Param("questionNumber") int randomQuestionNumber);
}
