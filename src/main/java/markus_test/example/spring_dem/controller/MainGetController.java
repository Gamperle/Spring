package markus_test.example.spring_dem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.result.view.RedirectView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainGetController {
	
	
		@RequestMapping("/home")
		@ResponseBody  public String greeting() {
			System.out.println("Run");
			return "Hello User";  
		}
		@RequestMapping("/login")
		@ResponseBody  public String login() {
			System.out.println("Run");
			return "Hello User2";  
		}
		@RequestMapping("/logout")
		@ResponseBody  public String logout() {
			System.out.println("Run");
			return "Hello User2";  
		}
		@RequestMapping("/about")
		@ResponseBody  public String about() {
			System.out.println("Run");
			return "Hello User2";  
		}
		@RequestMapping("/article")
		@ResponseBody  public String article() {
			System.out.println("Run");
			return "Hello User2";  
		}
//		  @GetMapping("/*")
//		    public RedirectView redirectWithUsingRedirectView(
//		      RedirectAttributes attributes) {
//		        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
//		        attributes.addAttribute("attribute", "redirectWithRedirectView");
//		        return new RedirectView("/Home");
//		    }
	}

