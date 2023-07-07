package fr.dawan.springmaven.dto;

public class PersonneDto {
    private String nom;
    private String prenom;

    public PersonneDto() {
    }

    public PersonneDto(String nom, String prenom) {
        System.out.println("\u001B[36mPersonneDto.PersonneDto\u001B[0m");
        this.nom = nom;
        this.prenom = prenom;
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
