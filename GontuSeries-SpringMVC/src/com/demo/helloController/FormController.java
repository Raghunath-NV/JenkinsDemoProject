package com.demo.helloController;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.model.StudentAddress;
import com.demo.model.StudentMultipleCourse;
import com.demo.model.SubjectMarks;

@Controller
public class FormController {

	@RequestMapping("/form")
		public String formPage()
		{
			return "studentForm";
		}
		
	@RequestMapping(value="/submitForm", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam Map<String,String> pathVars)
	{
		ModelAndView mv =new ModelAndView("success");
		mv.addObject("name",pathVars.get("studentName"));
		mv.addObject("hobby",pathVars.get("studentHobby"));
		return mv;
	}
	
	
/*All the common data of the pages can be written in this method*/
	
	@ModelAttribute
	public void addingCommonObjects(Model model)
	{
		model.addAttribute("headerMessage", "Welcome to My Application");
	}
	
	/*For @ModelAttribute*/
	
	@RequestMapping("/form2")
	public String form2Page()
	{
		System.out.print("hello");
		return "studentForm2";
	}
	
	
	@RequestMapping(value="/submitForm2", method=RequestMethod.POST)
	public ModelAndView submitForm2(@ModelAttribute("student") Student student)
	{
		ModelAndView mv =new ModelAndView("success2");
		mv.addObject("passedStudent", student);
		return mv;
	}
	
	
	
/*For @ModelAttribute using collections */
	
	@RequestMapping("/form3")
	public String form3Page()
	{
		return "studentForm3";
	}
	
	
	@RequestMapping(value="/submitForm3", method=RequestMethod.POST)
	public ModelAndView submitForm3(@ModelAttribute("student") StudentMultipleCourse student)
	{
		ModelAndView mv =new ModelAndView("success3");
		mv.addObject("passedStudent", student);
		return mv;
	}
	
	
	

/*For @ModelAttribute -studentAddress */
	
	@RequestMapping("/form4")
	public String form4Page()
	{
		return "studentForm4";
	}
	
	@RequestMapping(value="/submitForm4", method=RequestMethod.POST)
	public ModelAndView submitForm4(@ModelAttribute("student") StudentAddress student)
	{
		
		ModelAndView mv =new ModelAndView("success4");
		mv.addObject("passedStudent", student);
		return mv;
	}
	
	
	
/*For Handling errors using BindingResult */
	
	@RequestMapping("/form5")
	public String form5Page()
	{
		return "studentForm5";
	}
	
	@RequestMapping(value="/submitForm5", method=RequestMethod.POST)
	public ModelAndView submitForm5(@Valid @ModelAttribute("studentSubject") SubjectMarks student,BindingResult result)
	{
		if(result.hasErrors() ) //Checking if any errors. If yes then return to same page and display message
		{
			ModelAndView mv = new ModelAndView("studentForm5");
			return mv;
		}
		
		ModelAndView mv =new ModelAndView("success5");
		mv.addObject("passedStudent", student);
		return mv;
	}
	

	

}
