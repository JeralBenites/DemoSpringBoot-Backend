package pe.com.dev420.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.dev420.spring.boot.domain.Album;
import pe.com.dev420.spring.boot.service.AlbumService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    public AlbumController() {
    }

    @GetMapping
    public List<Album> findAll() {
        try {
            return this.getAlbumService().findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @GetMapping("/by-nombre")
    public List<Album> findByNombre(@RequestParam("nombre") String nombre) {
        try {
            return this.getAlbumService().findByNombre("%" + nombre + "%");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/{id}")
    public Album findById(@PathVariable("id") Long id) {
        try {
            return this.getAlbumService().findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping
    public boolean insert(@RequestBody Album album) {
        try {
            return this.getAlbumService().insert(album);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @PutMapping
    public boolean update(@RequestBody Album album) {
        try {
            return this.getAlbumService().update(album);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        try {
            Album album = new Album();
            album.setCodigo(id);
            return this.getAlbumService().delete(album);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public AlbumService getAlbumService() {
        return albumService;
    }

    public void setAlbumService(AlbumService albumService) {
        this.albumService = albumService;
    }

}
