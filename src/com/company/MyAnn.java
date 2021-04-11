package com.company;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeateAnnos.class)
public @interface MyAnn {
    String str() default "Class";
    int value();
}
