package pe.com.dev420.spring.boot.service;

import java.util.List;

public interface GenericService<T> {
    List<T> findAll() throws ServiceException;

    List<T> findAll(T t) throws ServiceException;

    T findById(Long id) throws ServiceException;

    boolean insert(T t) throws ServiceException;

    boolean update(T t) throws ServiceException;

    boolean delete(T t) throws ServiceException;

    boolean validate(T t) throws ServiceException;
}
