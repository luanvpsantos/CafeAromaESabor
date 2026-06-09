package br.com.cafearomaesabor.repository;

import br.com.cafearomaesabor.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	java.util.List<Usuario> findByNomeContainingIgnoreCase(String nome);
	java.util.Optional<Usuario> findByEmail(String email);
}