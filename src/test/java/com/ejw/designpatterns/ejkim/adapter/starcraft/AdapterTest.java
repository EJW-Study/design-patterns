package com.ejw.designpatterns.ejkim.adapter.starcraft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdapterTest {
    @Test
    @DisplayName("셔틀에 탄 리버의 이름은 '셔틀에 탄 [지상유닛]리버'")
    void testReaverOnTheShuttle() {
        // Given
        Shuttle reaverOnTheShuttle = new InShuttleAdapter(new Reaver());

        // When
        String result = reaverOnTheShuttle.name();

        // Then
        Assertions.assertEquals("셔틀에 탄 [지상유닛]리버", result);
    }
}