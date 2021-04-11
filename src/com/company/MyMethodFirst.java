package com.company;

import java.lang.annotation.*;

@Marker
@What("Class Description")
@MyAnn(1)
@MyAnn(2)
public class MyMethodFirst {
    static String[] arr;
    static Annotation[] annotations;

    @Marker
    @What("Method Description")
    @MyAnn(str = "Method", value = 1)
    @MyAnn(3)
    public void myMethod() {
        try {
            System.out.println("\nАннотации класса");
            annotations = MyMethodFirst.class.getAnnotations();
            AnnotationClass.getAnnotation();
            System.out.println("\nАннотации метода");
            annotations = MyMethodFirst.class.getMethod("myMethod").getAnnotations();
            AnnotationClass.getAnnotation();
        } catch (NoSuchMethodException e) {
            System.out.println("Method is not found");
        }
    }
}
