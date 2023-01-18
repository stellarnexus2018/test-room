package ru.master.testroom;


import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class TestRoomApplicationTests {
  @Test
  void contextLoads() {
    System.out.println("Проверка поднятия контекста");
  }

  @Test
  void testExp() {
    var exp = 1673339791L;
    var iat = 1673338591L;

    LocalDateTime ldtExp = Instant
        .ofEpochSecond(exp)
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime();

    LocalDateTime ldtIat = Instant
        .ofEpochSecond(iat)
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime();

    System.out.println("ldtExp: " + ldtExp);
    System.out.println("ldtIat: " + ldtIat);
  }

  @Test
  void testList() {
    var lst = List.of("doca", "boca", "joca");
    var actual = lst.stream().filter(n->n.startsWith("b")).collect(Collectors.toList());
    var expected = List.of("boca");

    System.err.println ("проверка какой-то ошибки");

    System.out.println("actual: " + actual);
    System.out.println("expected: " + expected);

    Assertions.assertEquals(expected, actual, "Фигня какая-то");
  }

  @Test
  void testBigDecimal() {
    double d = 123.0001;
    /*double d = 123.1111;*/
    /*double d = 123.0000;*/

    BigDecimal val = BigDecimal.valueOf(d);
    BigDecimal rounded = val.setScale(0, RoundingMode.CEILING);
    double ceil = Math.ceil(d);
    double ceilbd = Math.ceil(val.doubleValue());

    System.out.println("val: " + val);
    System.out.println("rounded: " + rounded);
    System.out.println("ceil: " + ceil);
    System.out.println("ceilbd: " + ceilbd);

    Assertions.assertEquals(rounded, BigDecimal.valueOf(124), "Фигня какая-то");
  }

  @Test
  void testContext() {
    System.out.println("out");
    System.err.println("err");

    Assertions.assertEquals(true, true, "Фигня какая-то");
  }
}