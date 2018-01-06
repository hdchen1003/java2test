package tw.edu.nuk.java2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	 @RequestMapping("welcome/{member}")
	 public String welcomeMember(Model model,
			 					@PathVariable("member") String MemberName) {
		 
		 model.addAttribute("member",MemberName);
		 
		 return "WelcomeView";
	 }
}
