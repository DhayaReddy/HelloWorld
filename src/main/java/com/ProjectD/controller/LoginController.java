package com.ProjectD.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectD.persistance.data.User;
import com.ProjectD.service.ProjectDService;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

@RestController
public class LoginController {
	@Autowired
	ProjectDService service;
	
	private static final String VOICENAME = "kevin16";
	@RequestMapping("/signup.go")
	public String signUp(@ModelAttribute() User user)
	{
		String id=service.signUp(user);
		
		System.out.println("signup page"+id);
System.out.println("haii its in controller");
		
		
		
		Voice voice;
		  // Taking instance of voice from VoiceManager factory.
		  VoiceManager voiceManager = VoiceManager.getInstance();
		  voice = voiceManager.getVoice(VOICENAME);
		  // Allocating voice
		  voice.allocate();
		  // word per minute
		  voice.setRate(100);
		  voice.setPitch(100);
		  System.out.print("Enter your text: ");
		  int i=0;
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  // open up standard input
		  try {
		  
			  String str="hello daya how are you";
			 
		 

		   // Ready to speak
		   voice.speak(str);
		 
		  } catch (Exception e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		return id;
	}

}
