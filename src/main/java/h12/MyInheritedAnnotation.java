package h12;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Inherited
public @interface MyInheritedAnnotation {
    String value() default "Am I being inherited or what?";
    int number() default 100;
    String somethingElse() default "Three parameters!";

}


