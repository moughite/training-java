package org.example;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.stream.Collectors;

public class ExCollections {

    public  void allMethode(){
        
        System.out.println("les des valeur impaire est " + nbImpaire());
        System.out.println("convertir une list a une Map " + convertList());
        System.out.println("la list trier est " + triListWithPrice());



    }

    private Map<String,Long> triListWithPrice() {
        List<Produit> list = Arrays.asList(
                new Produit("test5", 22, Status.UNSED),
                new Produit("test2", 11, Status.NEW),
                new Produit("test3", 32, Status.UNSED),
                new Produit("test1", 1, Status.NEW),
                new Produit("test8",44,Status.NEW)
        );

       return  list.stream().sorted(Comparator.comparing(Produit::nom))
                .collect(Collectors.toMap(
                        p->p.nom(),
                        p->p.prix(),
                        (oldVal,newVal)->oldVal,
                        LinkedHashMap::new
                ));
    }

    public Map<String,Integer> convertList() {
        List<String> list = Arrays.asList("moughite", "sanae", "jawad", "malika");

        return list.stream().collect(Collectors.toMap(
                name -> capitalezFirstLettre(name),
                name -> name.length()
        ));
    }

    private String capitalezFirstLettre(String name) {
        return name.substring(0,1).toUpperCase()+name.substring(1,name.length()-1)+name.substring(name.length()-1).toUpperCase();
    }

    public Set<Integer> nbImpaire() {

        List<Integer> list = Arrays.asList(3, 5, 7, 4, 8, 1);

        return list.stream().filter(val->val%2!=0).collect(Collectors.toSet());
    }


}
