package com.example.democleansimple.service;

import com.example.democleansimple.entity.Game;
import com.example.democleansimple.entity.GameUser;
import com.example.democleansimple.model.GameUserDTO;
import com.example.democleansimple.repository.UserRepository;
import com.example.democleansimple.service.mapper.CommonMapper;
import com.example.democleansimple.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends CommonService<Long, GameUser, GameUserDTO> {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    @Override
    JpaRepository<GameUser, Long> repository() {
        return userRepository;
    }

    @Override
    boolean checkEntity(GameUser entity) {
        return userRepository.findById(entity.getId()).isPresent();
    }

    @Override
    CommonMapper<GameUser, GameUserDTO> mapper() {
        return userMapper;
    }

    @Override
    public GameUser save(GameUser toSave) throws Exception {
        var userByUsername = userRepository.findByUsername(toSave.getUsername());
        if(userByUsername.isPresent()){
            throw new Exception("non");
        }else {
            return super.save(toSave);
        }

    }

}
