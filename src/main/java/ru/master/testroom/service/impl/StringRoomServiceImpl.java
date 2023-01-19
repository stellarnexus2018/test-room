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
    sbuff.append("Игорь");
    sbuff.append("Игоряша");
    sbuff.append("Игорямба");

    log.info("sbuff: {}", sbuff);
  }
}