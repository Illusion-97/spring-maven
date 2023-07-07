package fr.dawan.springmaven.mapper;

import fr.dawan.springmaven.dto.PersonneDto;
import fr.dawan.springmaven.entities.Personne;
import org.mapstruct.Mapper;

@Mapper
public interface PersonneMapper {
    PersonneDto toDto(Personne personne);

    Personne toEntity(PersonneDto personneDto);
}
