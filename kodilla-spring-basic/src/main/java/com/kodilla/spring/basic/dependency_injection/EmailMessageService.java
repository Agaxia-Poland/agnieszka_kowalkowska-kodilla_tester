package com.kodilla.spring.basic.dependency_injection;

@Component
public class EmailMessageService implements MessageService {

    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " via Email";
    }
}
