package com.example.democleansimple.service.mapper;

import com.example.democleansimple.entity.Game;
import com.example.democleansimple.model.GameDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-17T11:42:54+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class GameMapperImpl implements GameMapper {

    @Override
    public GameDTO toDto(Game entity) {
        if ( entity == null ) {
            return null;
        }

        GameDTO gameDTO = new GameDTO();

        gameDTO.setId( entity.getId() );
        gameDTO.setName( entity.getName() );

        return gameDTO;
    }

    @Override
    public Game toEntity(GameDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Game game = new Game();

        game.setId( dto.getId() );
        game.setName( dto.getName() );

        return game;
    }
}
