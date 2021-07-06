package com.jeongjy.controller;

import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/controller")
public class ControllerTest {

  @GetMapping("/data2")
  public ResponseEntity data2(HttpEntity httpEntity){
    log.info("헤더정보 : " + httpEntity.getHeaders().toString());
//    log.info("바디정보 : " + httpEntity.getBody().toString());

    asyncTest();

    System.out.println("data = : ");
    return ResponseEntity.ok("good2");
  }

  @Async
  public void asyncTest(){

    IntStream.range(0, 10000).filter(i -> i % 1000 == 0).mapToObj(i -> "test")
        .forEach(System.out::println);
  }
}
