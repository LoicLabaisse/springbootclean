package com.example.democleansimple.service.mapper;

import com.example.democleansimple.entity.GameUser;
import com.example.democleansimple.model.GameUserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-17T14:26:00+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public GameUserDTO toDto(GameUser entity) {
        if ( entity == null ) {
            return null;
        }

        GameUserDTO gameUserDTO = new GameUserDTO();

        gameUserDTO.setId( entity.getId() );
        gameUserDTO.setFirstName( entity.getFirstName() );
        gameUserDTO.setLastName( entity.getLastName() );
        gameUserDTO.setUsername( entity.getUsername() );
        gameUserDTO.setAge( entity.getAge() );
        gameUserDTO.setRole( entity.getRole() );

        return gameUserDTO;
    }

    @Override
    public GameUser toEntity(GameUserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        GameUser gameUser = new GameUser();

        gameUser.setId( dto.getId() );
        gameUser.setFirstName( dto.getFirstName() );
        gameUser.setLastName( dto.getLastName() );
        gameUser.setUsername( dto.getUsername() );
        gameUser.setAge( dto.getAge() );
        gameUser.setRole( dto.getRole() );

        return gameUser;
    }
}
