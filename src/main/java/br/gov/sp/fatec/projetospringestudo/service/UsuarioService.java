
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospringestudo.entity.Usuario;
import br.gov.sp.fatec.projetospringestudo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario buscarPorId (Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isPresent()) {
            return usuarioOp.get();
        }
        throw new UsuarioNaoEncontradoException("Id inválido!");
    }

    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepo.save(usuario);
    }
}