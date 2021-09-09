package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(FIELD)
@EnableFormBuilder
public @interface Table {

	String label() default "";
	
	boolean editable() default false;
	
	String color() default "white";

	String errorMessage() default "";
}
