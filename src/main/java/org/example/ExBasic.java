package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ExBasic {

    public void AllMethode(){
        System.out.println("donner nue chaine de cara");
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();

        System.out.println("Longueur du texte " + longeurText(str));

        System.out.println("Nombre de mots "+ nembreDeMot(str));
        System.out.println("mot plus grand est :"+motPlusLong(str));
        System.out.println("mot plus petit est: "+motPluPetit(str));
        System.out.println("la liste avec des mot sans repe :"+nonRepetition(str));
        System.out.println("la chaine des caractere avec c'est repetition est "+ frequence(str));
        System.out.println("Inversion des mots :"+ inversterString(str));
        System.out.println("CamelCase :"+ camelClass(str));
        System.out.println("Texte sans voyelles :"+ textsansVoellle(str));
        System.out.println("Indices de la sous-chaîne "+ indiceChaine(str));
        System.out.println("exte après remplacement est "+ remplaceParUnivers(str));

        System.out.println("les souchaine palindrome est "+ sousChainePalindrome(str));
    }


    private  List<String> sousChainePalindrome(String str) {
        String text = str.replace(" ", "");
        List<String> palindromes = new ArrayList<>();

        // Trouver toutes les sous-chaînes
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j <= text.length(); j++) {
                String subStr = text.substring(i, j);
                // Vérifier si la sous-chaîne est un palindrome
                if (isPalindrome(subStr)) {
                    palindromes.add(subStr);
                }
            }
        }

        return palindromes.stream().filter(mot->mot.length()>3).distinct().collect(Collectors.toList());
    }

    private  boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private  String remplaceParUnivers(String str) {
        System.out.println("donner une chaine de caractere");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("donner une chaine de caractere");
        Scanner scanner1=new Scanner(System.in);
        String s1 = scanner1.nextLine();

        return str.replace(s,s1);
    }

    private  int indiceChaine(String str) {
        System.out.println("donner une chaine de caractere");
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();

        return str.indexOf(s);
    }

    private  String textsansVoellle(String str) {

        return str.replaceAll("[EUIOAeuioa]","");
    }

    private  String camelClass(String str) {
        String[] split = str.split("\\s+");
        return Arrays.stream(split).map(mot->mot.substring(0,1).toUpperCase()+mot.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }

    private  List<String> inversterString(String str) {
        String[] split = str.split("\\b");

        return Arrays.stream(split).map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.toList());
    }

    private  Map<Character, Integer> frequence(String str) {
        Map<Character,Integer> list=new LinkedHashMap<>();
        for (char c:str.toCharArray()
        ) {
            list.put(c,list.getOrDefault(c,0)+1);
        }
        return list;
    }

    private  Set<String> nonRepetition(String str) {
        Set<String> list=new LinkedHashSet<>(Arrays.asList(str.split("\\s+")));
        return list;
    }

    private  String motPluPetit(String str) {
        return Arrays.stream(str.split("\\s+")).min(Comparator.comparingInt(String::length)).orElse("");
    }

    private  String motPlusLong(String str) {
        return Arrays.stream(str.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse("");
    }

    private  int nembreDeMot(String str) {
        String[] split = str.split("\\s+");
        return split.length;
    }

    int longeurText(String str) {
        return str.length();
    }
}
