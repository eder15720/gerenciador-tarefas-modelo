package com.example.demo.business;

import com.example.demo.business.converter.UsuarioConverter;
import com.example.demo.business.dto.UsuarioDTO;
import com.example.demo.infraestructure.entity.Usuario;
import com.example.demo.infraestructure.exceptions.ConflictExeption;
import com.example.demo.infraestructure.exceptions.ResourceNotFoundException;
import com.example.demo.infraestructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // para inserir construtores e não precisar injetar dependencias com @Autowierd (necessário incluir como final o repository)
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO){
            Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
            usuario = usuarioRepository.save(usuario);

            return usuarioConverter.paraUsuarioDTO(usuario);
    }

}
