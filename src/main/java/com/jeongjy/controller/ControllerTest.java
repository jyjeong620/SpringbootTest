package com.jeongjy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
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
    log.info("바디정보 : " + httpEntity.getBody().toString());
    return ResponseEntity.ok("good2");
  }
}
