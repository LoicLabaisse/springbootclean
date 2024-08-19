package com.example.democleansimple.controller;

import com.example.democleansimple.entity.Game;
import com.example.democleansimple.model.GameDTO;
import com.example.democleansimple.service.CommonService;
import com.example.democleansimple.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GameController extends CommonController<Long, Game, GameDTO> {
    @Autowired
    GameService gameService;

    @Override
    CommonService<Long, Game, GameDTO> service() {
        return gameService;
    }
}
