package com.ghazala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {

    /*    Personne personne=new Personne();

        personne.setFirstName("ali");
        personne.setLastName("maghraoui");
        personne.setAge(40);

        Facture facture=new Facture(1,"Laptop",personne);*/

        ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("file:src/com/ghazala/bean.xml");

          Personne personne=applicationContext.getBean("personneId",Personne.class);

          Facture facture=applicationContext.getBean("factureId",Facture.class);

    System.out.println("contenair of bean created");

    personne.affiche();
        System.out.println(personne.getFirstName());
        System.out.println(personne.getLastName());
        System.out.println(personne.getAge());

        System.out.println(facture.getCodeFacture());
        System.out.println(facture.getProduit());
       System.out.println(facture.getPersonne().getFirstName());

    }
}
