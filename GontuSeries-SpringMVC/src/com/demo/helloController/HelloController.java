package com.demo.helloController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView mv = new ModelAndView("Hello");    //This says the data is for hello.jsp
		mv.addObject("msg","Hello This is Raghunath. Welcome");
		return mv;
	}
	
	//using @Path Variable indivually
	@RequestMapping("/welcome/{country}/{name}")
	public ModelAndView helloUser(@PathVariable("country") String countryName, @PathVariable("name") String userName)
	{
		ModelAndView mv = new ModelAndView("Hello");    //This says the data is for hello.jsp
		mv.addObject("msg","Hello This is "+userName+". You are from "+countryName);
		return mv;
	}
	
	
	//using @PathVariable once for all
		@RequestMapping("/welcome/{country}/{name}/{age}")
		public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars)
		{
			String userName = pathVars.get("name");
			String countryName = pathVars.get("country");
			String age = pathVars.get("age");
			ModelAndView mv = new ModelAndView("Hello");    //This says the data is for hello.jsp
			mv.addObject("msg","Hello This is "+userName+". You are from "+countryName +" and your age is "+age);
			return mv;
		}
	

}
