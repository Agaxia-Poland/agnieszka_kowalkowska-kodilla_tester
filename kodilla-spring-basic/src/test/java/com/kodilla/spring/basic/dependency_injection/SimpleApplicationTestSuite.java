package com.kodilla.spring.basic.dependency_injection;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleApplicationTestSuite extends TestCase {

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}