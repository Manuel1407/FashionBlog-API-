//package com.ikechukwu.week9.controller;
//
//
//import com.ikechukwu.week9.UserService;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@AllArgsConstructor
//@RequestMapping(value = "/api")
//public class UserApiController {
//
//    public final UserService userService;
//
//    @GetMapping("/login")
//    public String login(){
//        return "Hi Week9";
//    }
//
//    @PostMapping("/setup")
//    public String calculate(){
//        int x = 30;
//        int y = 20;
//        int sum = userService.setsum(x,y);
//        return "This is sum: "+sum;
//    }
//}
