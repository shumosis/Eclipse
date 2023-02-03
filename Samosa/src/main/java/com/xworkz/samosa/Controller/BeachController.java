package com.xworkz.samosa.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.samosa.Dto.BeachDto;

@Component
@RequestMapping("/abc")
public class BeachController {
	
	public BeachController() {
    System.out.println("creating " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBeach(BeachDto beachDto,Model model) {
		
		System.out.println("running onbeach");
		
		model.addAttribute("beachName", beachDto.getBeachName());
		model.addAttribute("location", beachDto.getLocation());
		model.addAttribute("clean", beachDto.isClean());
		model.addAttribute("games", beachDto.getGames());
		return "Succes.jsp";
	}

}
