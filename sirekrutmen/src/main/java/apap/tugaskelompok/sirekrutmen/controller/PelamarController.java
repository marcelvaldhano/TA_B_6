package apap.tugaskelompok.sirekrutmen.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import apap.tugaskelompok.sirekrutmen.service.PelamarService;


@Controller
public class PelamarController {
	
	@Autowired
	PelamarService pelamarService;
	
	/*
	  Your code goes here.
	  
	  -Rian
	*/

}
