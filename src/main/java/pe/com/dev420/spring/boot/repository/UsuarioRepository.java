package pe.com.dev420.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.dev420.spring.boot.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
}
