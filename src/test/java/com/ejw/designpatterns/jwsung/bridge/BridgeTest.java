package com.ejw.designpatterns.jwsung.bridge;

import com.ejw.designpatterns.jwsung.bridge.func.Display;
import com.ejw.designpatterns.jwsung.bridge.impl.DecorateDisplayImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SpringBootTest
public class BridgeTest {

    @Test
    @DisplayName("Decorate Display Test")
    public void DecorateDisplayTest(){

        /*
        given
         */
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        Display display = new Display(new DecorateDisplayImpl("*", "Test Text", "#"));
        PrintStream outputStreamOrg = System.out;
        System.setOut(stream);

        /*
        when
         */
        display.display();

        /*
        then
         */
        String print = outputStream.toString().trim();
        System.setOut(outputStreamOrg);
        Assertions.assertEquals(print, "*Test Text#");

    }
}
