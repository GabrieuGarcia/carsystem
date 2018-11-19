package com.carsystem.persistence.repository;

import java.util.Collection;
import java.util.Optional;

public interface CrudRepository<E>{ //E = Entidade

    Optional<E> get(int id);
    Collection<E> getAll();
    int save(E e);
    void update(E e);
    void delete(E e);

}
