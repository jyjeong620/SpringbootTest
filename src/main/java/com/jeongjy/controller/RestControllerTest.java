package com.jeongjy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/rest")
public class RestControllerTest {

  @GetMapping("test")
  public ResponseEntity date(@RequestHeader HttpHeaders httpHeaders){

    log.info("헤더 정보 : " + httpHeaders.toSingleValueMap().toString());

    return ResponseEntity.ok("good");
  }
}
