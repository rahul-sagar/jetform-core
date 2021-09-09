package com.adjecti.jetform.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.adjecti.jetform.enums.ValidationType;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Validations {
	Validation[] validations() default @Validation(type = ValidationType.REQUIRED,value = "true");
}
