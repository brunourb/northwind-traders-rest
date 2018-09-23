package br.eti.urbano.northwind.interfaces;

import java.util.List;

public interface GenericDefaultInterface<E> {

    //CRUD GENERICO PARA E
    public void create(E model);
    public E read(Integer id);
    public void update(E model);
    public void delete(E model);

    //CRUD GENERICO PARA LISTA DE <E>
    public void create(List<E> models);
    public List<E> read(List<Integer> ids);
    public void update(List<E> models);
    public void delete(List<E> models);
}
