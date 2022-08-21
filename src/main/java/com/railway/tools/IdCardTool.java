package com.railway.tools;

public class IdCardTool {
    public static String validateIdCard(String idCard){
        return idCard.matches("UA[a-zA-Z\\d]{10}ID") ? idCard : null;
    }
}
