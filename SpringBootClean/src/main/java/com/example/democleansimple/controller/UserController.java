package com.example.democleansimple.controller;

import com.example.democleansimple.entity.GameUser;
import com.example.democleansimple.model.GameUserDTO;
import com.example.democleansimple.service.CommonService;
import com.example.democleansimple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController extends CommonController<Long, GameUser, GameUserDTO> {
    @Autowired
    UserService userService;

    @Override
    CommonService<Long, GameUser, GameUserDTO> service() {
        return userService;
    }
}
