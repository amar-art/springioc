package com.ghazala;

public class Facture {

    private int codeFacture;
    private String  produit;
    private Personne personne;

    public int getCodeFacture() {
        return codeFacture;
    }

    public void setCodeFacture(int codeFacture) {
        this.codeFacture = codeFacture;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }


}
