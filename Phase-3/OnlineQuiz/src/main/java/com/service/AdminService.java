package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.entity.Question;
import com.entity.Quiz;
import com.entity.Statistics;
import com.repository.AdminRepository;
import com.repository.QuestionRepository;
import com.repository.QuizRepository;
import com.repository.UserRepository;

@Service
public class AdminService {
	@Autowired
	QuestionRepository qr;
	@Autowired
	QuizRepository qur;
	@Autowired
	UserRepository ur;
	@Autowired
	Statistics stat;
	@Autowired
	AdminRepository adr;
	
	public String adminLogin(Admin u)
	{
		Admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername()) && u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin";
		}
		else
		{
			return "invalid Credentials";
		}
	}
	public String adminupdate(Admin a)
	{
		Admin ad= adr.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getPassword());
		adr.saveAndFlush(ad);
			return "Updated";
	

	}
	
	public String addQuestion(Question q)
	{
		if(q!=null)
		{
			qr.save(q);
			return "question added";
		}
		else
		{
			return "failed to add";
		}
		
	}
	
	public String addQuiz(Quiz q)
	{
		
		if(q!=null)
		{
			qur.save(q);
			return "quiz added";
		}
		else
		{
			return "failed to add";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return qur.findAll();
	}
	
	public Statistics quizInfo()
	{
		stat.setUsers(ur.findAll().size());
		stat.setQuestions(qr.findAll().size());
		stat.setQuiz(qur.listOfQuiz());
		
		return stat;

	}
	
	

}
