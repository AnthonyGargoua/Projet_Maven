package fr.diginamic.gson;

public class Personne {
    // Attributs
    private String nom;
    private int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Pour afficher la personne
    @Override
    public String toString() {
        return "Personne{nom='" + nom + "', age=" + age + "}";
    }
}