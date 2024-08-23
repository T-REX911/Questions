package com.myTech.QuestionBook.QuestionBook.Controller;

import com.myTech.QuestionBook.QuestionBook.Entity.Questions;
import com.myTech.QuestionBook.QuestionBook.Service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionsController {
    @Autowired
    QuestionsService questionsService;
    @GetMapping("/subject/{subject}")
    public String getRandomQuestionBySubject(@PathVariable String subject){
        return questionsService.getRandomQuestionBySubject(subject);
    }

    @PostMapping("/add")
    public Questions AddQuestionController(@RequestBody Questions questions){
        return questionsService.addQuestionService(questions);
    }

}


