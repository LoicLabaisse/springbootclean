package com.example.democleansimple.service.mapper;

import com.example.democleansimple.entity.Game;
import com.example.democleansimple.model.GameDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface GameMapper extends CommonMapper<Game, GameDTO> {

}
