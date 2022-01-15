package com.namankhurpia.synonymit.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class DataSource {
	
	public String getsource(String word)
	{
		

	Document doc;
	try {
		doc = Jsoup.connect("https://www.google.co.in/search?q=what+is+the+synonym+of+" +word).get();
		 	String content = doc.wholeText();  
	        //System.out.println("content is: " + content);  
	        
	        int start = content.indexOf("Search ResultsFeatured snippet from the web");
	        int end = content.indexOf(".", start);
	        //System.out.println("Start at "+start +"end at "+ end);
	        String synonym = content.substring(start +43 , end);
	        System.out.println(synonym);
	        
 
			return synonym;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		return "It seems my source blocked me";
	}
	
	}

}
