package com.namankhurpia.synonymit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.namankhurpia.synonymit.util.DataSource;

import entity.SearchString;

@RestController
public class Controller {
	
	@Autowired
	DataSource datasource;

	@GetMapping("/")
	public String getmapping(@RequestBody SearchString str)
	{
		try {
			if(str.getWord().equals("") || str.getWord().equals(null))
			{
				return "Text searched is empty!";
			}
			return datasource.getsource(str.getWord());
		}
		catch(Exception e)
		{
			System.out.println("Excetion is"+e.getCause());
			return "ERROR from server";
		}
		
       
	}
}
