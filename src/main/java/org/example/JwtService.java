package org.example;

import org.example.domain.entity.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Value("${security.jwt,expiracao}")
    private String expiracao;

    @Value("${security.jwt.chave-assinatura}")
    private String ChaveAssinatura;

    public String gerarToken(Usuario usuario){

    }
}
