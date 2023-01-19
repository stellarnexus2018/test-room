package ru.master.testroom.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.master.testroom.service.StringRoomService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringRoomServiceImplTest {
  @Autowired
  private StringRoomService stringRoomService;

  @Test
  void enrollOne() {
    stringRoomService.enrollOne();
  }
}