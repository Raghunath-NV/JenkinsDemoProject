package com.demo.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {
	
	@RequestMapping("/admissionform")
	public ModelAndView getAdmission() throws Exception{
		
		String exceptionOccured = "NULL_POINTER";
		if(exceptionOccured.equals("NULL_POINTER"))
		{
			throw new NullPointerException("Null Pointer");
		}
		ModelAndView mv= new ModelAndView("AdmissionPage");
		return mv;
	}
	
	
/*	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e)
	{
		System.out.print("handling Null Pointer Exception");
		
		return "NullPointerExceptionPage";
	}
*/  //used in GLobalExceptionHandler Class
}
