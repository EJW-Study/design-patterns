package com.ejw.designpatterns.jwhan.bridge;

import com.ejw.designpatterns.ejkim.bridge.apple.Macbook;
import com.ejw.designpatterns.ejkim.bridge.apple.MacbookAir;
import com.ejw.designpatterns.ejkim.bridge.apple.MacbookPro;
import com.ejw.designpatterns.ejkim.bridge.apple.Spacegray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BridgeTest {
    @Test
    @DisplayName("해당 지하철 급행 기능 추가")
    void testMetroForHyundaiRotem() {
        // Given
        RotemMetro

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
