package com.blz.Algorithm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomizeName {
    public static void main(String[] args) {
        String message = "Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
        String firstName = "Shubham";
        String fullName = "Shubham Yadav";
        String contactNo = "91-4561237990";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(new Date());

        message = message.replaceAll("<<name>>", firstName);
        message = message.replaceAll("<<fullName>>", fullName);

        Pattern pattern = Pattern.compile("91-[0-9]{10}");
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll(contactNo);

         pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
         matcher = pattern.matcher(message);
        message = matcher.replaceAll(currentDate);

        System.out.println(message);

    }
}