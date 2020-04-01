package h12;

@MyInheritedAnnotation
@MyAnnotation("I will not be inherited")
public abstract class Human {

    public abstract String greet();
}
