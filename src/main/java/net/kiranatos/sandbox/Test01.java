package net.kiranatos.sandbox;

import net.kiranatos.model.Word;
import net.kiranatos.model.NamePartLanguage;

public class Test01 {
//    public static void main(String[] args) {
//        System.out.println("Inputing words:");
//        
//        Word word1 = new Word("pearl barley", new String[]{"перловая крупа"});
//        word1
//        
//    }
    
    public static void main(String[] args) {
        // check correct copy of arrays NamePartLanguage
        Word word1 = new Word("pearl barley", new String[]{"перловая крупа"});
        word1.addNamePartLanguage(NamePartLanguage.NOUN);
    }
}
