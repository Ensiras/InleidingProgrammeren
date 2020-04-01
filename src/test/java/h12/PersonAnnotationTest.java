package h12;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class PersonAnnotationTest {

    @Test
    public void showAnnotations() {
        Annotation[] annotations = Person.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        Method[] methods = Person.class.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] methodAnnotations = method.getAnnotations();
            for (Annotation methodAnnotation : methodAnnotations) {
                System.out.println(methodAnnotation.toString());
            }
        }
    }

    @Test
    void showAnnotationValuesOnly() {
        int annotationAmountClass = Person.class.getAnnotations().length;
        System.out.println("Class annotations: ");
        for (int i = 0; i < annotationAmountClass - 1; i++) {
            System.out.println("Annotation type: " + Person.class.getAnnotation(MyInheritedAnnotation.class).annotationType());
            System.out.println("Annotation value: " + Person.class.getAnnotation(MyInheritedAnnotation.class).value());
        }
    }
}