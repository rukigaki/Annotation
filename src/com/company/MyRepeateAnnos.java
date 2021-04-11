package com.company;

import java.lang.annotation.*;

@Inherited
@SuppressWarnings("all")
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeateAnnos {
    MyAnn[] value();
}
