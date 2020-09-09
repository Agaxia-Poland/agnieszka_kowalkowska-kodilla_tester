package com.kodilla.parametrized_tests.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<String>();
        // valid usernames
        usernames.add("alice89");
        usernames.add("aliceZOR_123");
        usernames.add("ALICE_ZOR-$4");
        //invalid usernames
        usernames.add("# .,");
        usernames.add("----0o-@");
        usernames.add("^ A A a a _ _*");

        List<String> emails = new ArrayList<String>();
        // valid email addresses
        emails.add("alice@example.com");
        emails.add("alice.bob@example.co.in");
        emails.add("alice#@example.me.org");
        //invalid email addresses
        emails.add("alice.example.com");
        emails.add("alice#example.com");
        emails.add("@example.me.org");

    }

    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }

}
