package pe.com.dev420.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.com.dev420.spring.boot.domain.Album;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    @Query("SELECT a FROM Album a where a.nombre like :nombre")
    List<Album> findByNombre(@Param("nombre") String nombre) throws RepositoryException;
}
