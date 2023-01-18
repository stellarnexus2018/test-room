package ru.master.testroom.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.master.testroom.service.StringRoomService;

@Service
@Slf4j
public class StringRoomServiceImpl implements StringRoomService {
  @Override
  public void enrollOne() {
    StringBuffer sbuff = new StringBuffer();
    sbuff.append("Игорь\n\r");
    sbuff.append("Игоряша\n\r");
    sbuff.append("Игорямба\n\r");

    log.info("sbuff: {}", sbuff);
  }
}