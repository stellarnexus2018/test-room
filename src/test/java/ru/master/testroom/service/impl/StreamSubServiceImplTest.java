package ru.master.testroom.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.master.testroom.service.StreamSubService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StreamSubServiceImplTest {
  @Autowired
  private StreamSubService streamSubService;

  @Test
  void enrollOne() {
    streamSubService.enrollOne();

  }
}