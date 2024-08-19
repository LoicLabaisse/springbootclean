package com.example.democleansimple.service;

import com.example.democleansimple.entity.Game;
import com.example.democleansimple.model.GameDTO;
import com.example.democleansimple.repository.GameRepository;
import com.example.democleansimple.service.mapper.CommonMapper;
import com.example.democleansimple.service.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService extends CommonService<Long, Game, GameDTO> {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    GameMapper gameMapper;

    @Override
    JpaRepository<Game, Long> repository() {
        return gameRepository;
    }

    @Override
    boolean checkEntity(Game entity) {
        return gameRepository.findById(entity.getId()).isPresent();
    }

    @Override
    CommonMapper<Game, GameDTO> mapper() {
        return gameMapper;
    }
}
