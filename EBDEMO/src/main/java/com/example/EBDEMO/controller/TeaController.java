package com.example.EBDEMO.controller;

import java.util.Date;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.format.annotation.DateTimeFormat;


import com.example.EBDEMO.model.Tea;
import com.example.EBDEMO.Repository.TeaRepository;

@Controller 
@RequestMapping(path="/tea")
public class TeaController {
	
	@Autowired
	private TeaRepository teaRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewTea (@RequestParam String TeaName
		      , @RequestParam BigDecimal UnitPrice, @RequestParam Integer TeaSpan) {
		    
		
		// @ResponseBody means the returned String is the response, not a view name
		    // @RequestParam means it is a parameter from the GET or POST request

		    Tea n = new Tea();
		    n.setTeaName(TeaName);
		    n.setUnitPrice(UnitPrice);
		    n.setTeaSpan(TeaSpan);
		    teaRepository.save(n);
		    return "Saved";
		  }
	
	
	@GetMapping(path="/all")
	  public @ResponseBody Iterable<Tea> getAllTea() {
	    // This returns a JSON or XML with the users
	    return teaRepository.findAll();
	  }

}
