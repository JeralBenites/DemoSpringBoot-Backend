package pe.com.dev420.spring.boot.service;

import pe.com.dev420.spring.boot.domain.Album;

import java.util.List;

public interface AlbumService extends GenericService<Album> {
    List<Album> findByNombre(String nombre) throws ServiceException;
}
