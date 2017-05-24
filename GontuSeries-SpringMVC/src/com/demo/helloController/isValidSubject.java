package com.demo.helloController;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

	@Documented
	@Constraint(validatedBy = SubjectValidator.class)
	@Target({ElementType.FIELD})					//Field - means this annotation can be applied to only field
	@Retention(RetentionPolicy.RUNTIME)
	public @interface isValidSubject {
		String listOfValidSubjects();
		
		String message() default "Please provide a valid subject ; Accepted values are Maths,Physics,Chemistry (Choose anyone)";
		
		 // Required by validation runtime
		Class<?>[] groups() default {};
		
		 // Required by validation runtime
		Class<? extends Payload>[] payload() default {};
		
		
	}


