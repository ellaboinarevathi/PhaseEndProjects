package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Results;
import com.entity.Test;
import com.entity.User;
import com.repository.QuizRepository;
import com.repository.TestRepository;
import com.repository.UserRepository;

@Service
public class UserService {
	
	
	List<Results> finalList=new ArrayList<>();
	@Autowired
	UserRepository ur;
	@Autowired
	QuizRepository qr;
	@Autowired
	TestRepository tr;
	@Autowired
	User u;
	@Autowired
	Test t;

	Results r= new Results();
	
	public String userLogin(String email,String password)
	{
		u=ur.findByEmailid(email);
		if(u!=null)
		{
			
		
		if(u.getEmailid().equals(email)&&u.getPassword().equals(password))
		{
			return "logged sucessfull";
		}
		else
		{
			return "invalid credentials";
		}
		
		
	}
	else
	{
		return "User not found";
	}
		

  }
	
	
	public String userRegister(User u)
	{
		if(ur.findByEmailid(u.getEmailid())==null)
		{
			ur.save(u);
			return " User Registered";
		}
		else
		{
			return "User already exists";
		}
	}
	
	public List<Object> viewAllQuiz()
	{
		return qr.listOfQuiz();
	}
	
	public String takeTest(Test t)
	{
		if(t!=null)
		{
			tr.save(t);
			return "submitted";
		}
		
		else
		{
			return "submission failed";
		}
			
	}
	
	public List<Test> getTestList()
	{
		return tr.findAll();
	}
	
	public List<Results> result()
	{	
		String email="";
		int mark=0;
		List<Test> obj=tr.findAll();
		List<User> u= ur.findAll();
		for (User user : u) {
			mark=0;
			email=user.getEmailid();
			System.out.println(user.getEmailid());
			
			for(Test ob :obj)
			{
				if(user.getUid()==ob.getUserid().getUid())
				{
					
					if(ob.getTestans()==ob.getQuestionid().getAns())
					{
						mark++;
					}
					System.out.println("inside"+mark);
					
				}
			}
			System.out.println("outside"+mark);
		
			
			finalList.add(new Results(email,mark));
			
			
			
		}
		System.out.println("final :"+mark);
		
		Collections.sort(finalList);
		
		return finalList;
		
	}
}
