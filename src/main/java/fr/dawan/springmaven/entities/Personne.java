package fr.dawan.springmaven.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Personne {
    private String nom;
    private String prenom;

    public Personne() {
        System.out.println("\u001B[36mPersonne.Personne\u001B[0m");
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
