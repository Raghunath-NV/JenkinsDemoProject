package com.demo.helloController;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//if this method returns true then - application will further handle the request
		//if this method returns false then - application will not further handle the request
		Calendar cal =Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek == 6)
		{
			response.getWriter().write("Website is closed as it is Sunday.Please try on another day");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		//This method will be called after Spring MVC executes the request handler method for request
		
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		//This method will be called after the response object is produced by the view for the request i.e. after loading jsp
		
		super.afterCompletion(request, response, handler, ex);
	}
	
	

}
