package com.xworkz.samosa.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.samosa.Dto.CasinoDto;

@Component
@RequestMapping("/def")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("creating " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDto casinoDto,Model model) {
		System.out.println("running oncasino");
		
		model.addAttribute("casinoName",casinoDto.getCasinoName());
		model.addAttribute("cruiseName",casinoDto.getCruiseName());
		model.addAttribute("entryFee",casinoDto.getEntryFee());
		model.addAttribute("freeFood",casinoDto.isFreeFood());
		model.addAttribute("freeAlcohol",casinoDto.isFreeAlcohol());
		return "Succes.jsp";
	}

}
