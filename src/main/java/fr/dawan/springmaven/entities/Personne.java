package fr.dawan.springmaven.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Personne {
    private String nom;
    private String prenom;

    public Personne() {
        System.out.println("\u001B[36mPersonne.Personne\u001B[0m");
        this.nom = "ADEKALOM";
        this.prenom = "Yanis";
    }
}
