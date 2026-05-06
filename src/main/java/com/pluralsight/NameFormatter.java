package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){

    }
    public static String format(String firstName, String lastName){
        return lastName + "," + firstName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix ){
        return lastName + "," + prefix +  firstName + middleName + ", " + suffix;


    }
    public static String format(String fullName){
        String[] name = fullName.split(" ");
        if (name.length == 5) {
            String prefix = name[0];
            String firstName = name[1];
            String middleName = name[2];
            String lastName = name[3];
            String suffix = name[4];

            return format(prefix, firstName, middleName, lastName, suffix);
        }else if (name.length== 4 ){
            String firstName = name[0];
            String middleName = name[1];
            String lastName = name[2];
            String suffix = name[3];
            return format()
        }
    }
}
