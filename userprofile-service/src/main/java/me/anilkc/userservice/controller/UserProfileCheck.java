package me.anilkc.userservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class UserProfileCheck {

  @GetMapping("/check")
  public Map<String, String> checkApp() {
    Map<String, String> map = new HashMap<>();
    map.put("message", "success");
    return map;
  }
}
