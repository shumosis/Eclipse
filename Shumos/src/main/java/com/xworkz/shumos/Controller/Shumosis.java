package com.xworkz.shumos.Controller;



import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shumos.Dto.BevergersDto;
import com.xworkz.shumos.Dto.ChatsDto;
import com.xworkz.shumos.Dto.EducationDto;
import com.xworkz.shumos.Dto.FamilyDto;
import com.xworkz.shumos.Dto.MobileDto;

@Component
@RequestMapping("/")
public class Shumosis {
	
	public Shumosis() {
		System.out.println("creating " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/ab")
	public String onEmail(Model model) {
		System.out.println("running onEmail");
		String gmail = "garveshubham@gmail.com" ;
		model.addAttribute("gmail",gmail);
		return "index.jsp";
	}
	@GetMapping("/cd")
	public String onMobile(Model model) {
		System.out.println("running onMobile");
		double num = 8867114944d;
		model.addAttribute("MobileNUmber",num);
		return "index.jsp";
	}
	@GetMapping("/ef")
	public String onAadhar(Model model) {
		System.out.println("running onAadhar");
		double aad=829136518000d;
		model.addAttribute("Aadhar",aad);
		return "index.jsp";
	}
	@GetMapping("/gh")
	public String onAge(Model model) {
		System.out.println("running onAge");
		int age = 25;
		model.addAttribute("Age",age);
		return "index.jsp";
	}
	@GetMapping("/ij")
	public String onDob(Model model) {
		System.out.println("running onDob");
		
		model.addAttribute("Dob",LocalDateTime.of(1997,12,30,8,30));
		return "index.jsp";
	}
	@GetMapping("/kl")
	public String onSalary(Model model) {
		System.out.println("running onSalary");
		double sal =886711;
		model.addAttribute("Salary",sal);	
		return "index.jsp";
	}
	@GetMapping("/mn")
	public String onFriends(Model model) {
		System.out.println("running onFriends");
		ArrayList<String> fr = new ArrayList<String>(Arrays.asList("vaibhav","nadeem","Akshay","manu"));
		model.addAttribute("fr",fr);
		return "index.jsp";
	}
	@GetMapping("/op")
	public String onPlaces(Model model) {
		System.out.println("running onPlaces");
		
		ArrayList<String> pla = new ArrayList<String>(Arrays.asList("mysore","pune","delhi","kenia"));
		
		model.addAttribute("pla", pla);
		return "index.jsp";
	}
	@GetMapping("/qr")
	public String onSkill(Model model) {
		System.out.println("running onSkills");
		ArrayList<String> skil = new ArrayList<String>(Arrays.asList("java","html","sql","bootstrap","css","jpa","jdbc"));
		model.addAttribute("skil", skil);
		return "index.jsp";
	}
	@GetMapping("/st")
	public String onEducationDto(Model model) {
		System.out.println("running EDdto");
		EducationDto eddto = new EducationDto();
		eddto.setDegreeField("enc");
		eddto.setDegrMar(60);
		eddto.setDegrre("BE");
		eddto.setHappy(false);
		eddto.setHighMar(90);
		eddto.setPriMar(78);
		eddto.setHighShcool("rbvidylay");
		eddto.setPrimShcool("KVMS");
		eddto.setPuc("BKclg");
		eddto.setPucField("Sci");
		eddto.setPucMar(65);
		model.addAttribute("eddto", eddto);
		return "index.jsp";
	}
	@GetMapping("/uv")
	public String onFamily(Model model) {
		System.out.println("running onFamily");
		FamilyDto fadto = new FamilyDto("sasane","sakshi", "ranjit", "indu","swarup","yogitha","aananappa","shivani",78,70);
		
		model.addAttribute("fadto", fadto);
		return "index.jsp";
	}
	@GetMapping("/wx")
	public String onMoblie(Model model) {
		System.out.println("running onMObile");
		 
		MobileDto Modto = new MobileDto("notePro","vaibhav","shumos", 10000, 8);
		model.addAttribute("Modto", Modto);
		return "index.jsp";
	}
	@GetMapping("/yz")
	public String onBeverges(Model model) {
		System.out.println("running onBevergers");
		
		BevergersDto bedto= new BevergersDto("bindu", "itc", "jeera", "more",30,200, false, false);
		
		model.addAttribute("bedto", bedto);
		return "index.jsp";
	}
	@GetMapping("/abc")
	public String onChats(Model model) {
		System.out.println("running onChats");
		ChatsDto chdto = new  ChatsDto("panupuri", "maharashtara","ramu","sagar", "rajajinagr","puri","imli", 30, false, false, 3, false);
		model.addAttribute("chdto", chdto);
		return "index.jsp";
	}
}
