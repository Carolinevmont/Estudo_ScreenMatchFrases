package br.com.alura.demo.service;

import br.com.alura.demo.DTO.FraseDTO;
import br.com.alura.demo.model.Frase;
import br.com.alura.demo.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        FraseDTO fraseDTO = new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
        return fraseDTO;
    }
}
