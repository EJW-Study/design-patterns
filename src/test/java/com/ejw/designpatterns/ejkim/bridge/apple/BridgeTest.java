package com.ejw.designpatterns.ejkim.bridge.apple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class BridgeTest {
    @Test
    @DisplayName("MacbookPro 에 스페이스그레이 컬러 주입")
    void testMacbookProWithSpacegray() {
        // Given
        Macbook macbookPro = new MacbookPro(new Spacegray());

        // When
        String result = macbookPro.getMacbook();

        // Then
        Assertions.assertEquals("MacbookPro 스페이스그레이", result);
    }

    @Test
    @DisplayName("MacbookAir 에 실버 컬러 주입")
    void testMacbookAirWithSpacegray() {
        // Given
        Macbook macbookAir = new MacbookAir(new Spacegray());

        // When
        String result = macbookAir.getMacbook();

        // Then
        Assertions.assertEquals("MacbookAir 스페이스그레이", result);
    }
}
