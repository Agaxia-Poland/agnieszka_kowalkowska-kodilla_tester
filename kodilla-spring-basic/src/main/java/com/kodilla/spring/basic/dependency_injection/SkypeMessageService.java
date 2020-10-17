package com.kodilla.spring.basic.dependency_injection;

@Component
public class SkypeMessageService implements MessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }

    public String processMessage(String test, String any_receiver) {
        return test;
    }
}
