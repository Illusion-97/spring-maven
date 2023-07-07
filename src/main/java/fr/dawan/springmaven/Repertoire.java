package fr.dawan.springmaven;

import fr.dawan.springmaven.dto.PersonneDto;
import fr.dawan.springmaven.entities.Personne;
import fr.dawan.springmaven.mapper.PersonneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Repertoire {
    private List<PersonneDto> contacts;
    private PersonneMapper mapper;

    @Autowired
    public Repertoire(Personne personne, PersonneMapper mapper) {
        this.mapper = mapper;

        contacts = List.of(
                mapper.toDto(personne),
                new PersonneDto(),
                new PersonneDto("Boutry", "Maxime"));
    }
}
