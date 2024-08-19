package com.example.democleansimple.service.mapper;

import org.mapstruct.Mapping;

public interface CommonMapper<E, T> {
    T toDto(E entity);
    E toEntity(T dto);
}
