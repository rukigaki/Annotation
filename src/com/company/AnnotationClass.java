package com.company;

class AnnotationClass extends MyMethodFirst {

    public static void getAnnotation() {
        for (java.lang.annotation.Annotation a : annotations) {
            arr = a.toString().split("@com.company.");

            if (arr[1].equals("Marker()")) {
                System.out.println("Меркарная аннотация: @" + arr[1]);
            } else if (arr.length > 2){
                System.out.println("Повторяющаяся аннотация: ");
                String t = "";
                for (String c : arr) t += c + "@";
                System.out.println(t.substring(0, t.length() - 1));
            } else {
                System.out.println("@" + arr[1]);
            }
        }
    }
}
