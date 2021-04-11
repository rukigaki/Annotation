package com.company;

public class MyMethSecond extends MyMethodFirst {

    @Override
    public void myMethod() {
        annotations = MyMethSecond.class.getAnnotations();
        AnnotationClass.getAnnotation();
    }
}

