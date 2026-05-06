package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){

    }
    public static String format(String firstName, String lastName){
        return firstName + lastName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix ){
        return prefix + firstName + middleName + lastName + suffix;


    }
    public static String format(String fullName){
        String[] name = fullName.split(" ");
        if (name.length == 5){
            String prefix = name[0];
            Stri
        }
    }
}
