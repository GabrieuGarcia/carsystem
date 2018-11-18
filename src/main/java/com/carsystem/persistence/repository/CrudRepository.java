package com.carsystem.persistence.repository;

import java.util.List;

public interface CrudRepository<E>{ //E = Entidade

    public void save(E entity) throws Error;

    public void delete(E entity) throws Error;

    public List<E> find() throws Error;

}
