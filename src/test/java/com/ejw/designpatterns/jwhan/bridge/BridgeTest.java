package com.ejw.designpatterns.jwhan.bridge;

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
        RotemMetro rotemMetro = new RotemMetro(new MetroActionImpl("Hyundai Rotem"));

        // When
        rotemMetro.fastMetro(20);

        // Then
        Assertions.assertEquals("급행역 도착 Hyundai Rotem DoorOpen Hyundai Rotem DoorClose", rotemMetro.fastMetro(4));
    }
}
