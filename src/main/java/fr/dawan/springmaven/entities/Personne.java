package fr.dawan.springmaven.entities;

import org.springframework.stereotype.Component;

@Component
public class Personne {
    private String nom;
    private String prenom;

    public Personne() {
        this.nom = "ADEKALOM";
        this.prenom = "Yanis";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
