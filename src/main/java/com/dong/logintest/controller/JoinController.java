package com.dong.logintest.controller;

import com.dong.logintest.dto.JoinDTO;
import com.dong.logintest.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {

  private final JoinService joinService;

  public JoinController(JoinService joinService) {

    this.joinService = joinService;
  }

  @PostMapping("/join")
  public String joinProcess(JoinDTO joinDTO) {

    System.out.println(joinDTO.getUsername());
    joinService.joinProcess(joinDTO);

    return "ok";
  }
}
