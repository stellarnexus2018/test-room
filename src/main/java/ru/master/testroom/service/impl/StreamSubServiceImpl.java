package ru.master.testroom.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.master.testroom.service.StreamSubService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StreamSubServiceImpl implements StreamSubService {
  @Override
  public void enrollOne() {
    log.info("enrollOne: start");
    final var collect = List.of(1, 2, 3).stream().map(String::valueOf).collect(Collectors.toList());
    collect.forEach(log::info);
    collect.forEach(n -> log.info("Проверка: {}", n));
    log.info("enrollOne: end");
  }
}