package com.myTech.QuestionBook.QuestionBook.Service;

import com.myTech.QuestionBook.QuestionBook.Entity.Questions;
import com.myTech.QuestionBook.QuestionBook.Repository.QuestionsRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class QuestionsService {
    @Autowired
    QuestionsRepository questionsRepository;
    @Autowired
    Logger logger;

    public Questions addQuestionService(Questions questions){
        int currectQuestionNumber = questionsRepository.getLastQuestionNumber(questions.getSubject());
        logger.info("currectQuestionNumber=" + currectQuestionNumber);
        questions.setQuestionNumber(currectQuestionNumber + 1);
        logger.info(questions.getId() +","+
                    questions.getQuestionNumber()+","+
                    questions.getSubject()+","+
                    questions.getQuestion()+","+
                    questions.getAnswer());
        return questionsRepository.save(questions);
    }


    public String getRandomQuestionBySubject(String subject){
        int questionsCount = questionsRepository.getLastQuestionNumber(subject);
        Random random = new Random();
        int randomQuestionNumber = random.nextInt((questionsCount - 1) + 1) + 1;

        return questionsRepository.getQuestionBySubjectAndNumber(subject,randomQuestionNumber);
    }

    public Questions getQuestionByQuestionService(String Question){
        return questionsRepository.findByQuestion(Question);
    }
}
