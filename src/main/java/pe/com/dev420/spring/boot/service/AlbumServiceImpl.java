package pe.com.dev420.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.dev420.spring.boot.domain.Album;
import pe.com.dev420.spring.boot.repository.AlbumRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public AlbumServiceImpl() {
    }

    @Override
    public List<Album> findAll() throws ServiceException {
        return this.getAlbumRepository().findAll();
    }

    @Override
    public List<Album> findAll(Album t) throws ServiceException {
        return null;
    }

    @Override
    public Album findById(Long id) throws ServiceException {
        Album album = null;
        Optional<Album> optAlbum = this.getAlbumRepository().findById(id);
        if (optAlbum != null && optAlbum.isPresent()) {
            album = optAlbum.get();
        }
        return album;
    }

    @Override
    public boolean insert(Album album) throws ServiceException {
        Album ret = this.getAlbumRepository().save(album);
        return ret != null;
    }

    @Override
    public boolean update(Album album) throws ServiceException {
        Album ret = this.getAlbumRepository().save(album);
        return ret != null;
    }

    @Override
    public boolean delete(Album album) throws ServiceException {
        Album objAlbum = this.findById(album.getCodigo());
        objAlbum.setEstado("0");
        return this.update(objAlbum);
    }

    @Override
    public boolean validate(Album t) throws ServiceException {
        return false;
    }

    public AlbumRepository getAlbumRepository() {
        return albumRepository;
    }

    public void setAlbumRepository(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findByNombre(String nombre) throws ServiceException {
        try {
            return this.getAlbumRepository().findByNombre(nombre);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
