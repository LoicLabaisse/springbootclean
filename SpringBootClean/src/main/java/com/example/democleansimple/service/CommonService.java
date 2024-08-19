package com.example.democleansimple.service;

import com.example.democleansimple.service.mapper.CommonMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class CommonService<I, E, T> {
    abstract JpaRepository<E, I> repository();
    abstract boolean checkEntity(E entity);

    abstract CommonMapper<E, T> mapper();



    public List<T> getAll() {
        return repository().findAll().stream().map(mapper()::toDto).collect(Collectors.toList());
    }

    public E save(E toSave) throws Exception {
        return repository().save(toSave);
    }

    public void delete(T toDelete) {
        repository().delete(mapper().toEntity(toDelete));
    }

    public void update(E toUpdate) throws Exception{

        if(checkEntity(toUpdate)){
            repository().save(toUpdate);
            return;

        }
        throw new Exception("non");
    }
}
