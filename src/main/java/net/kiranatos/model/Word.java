package net.kiranatos.model;

import java.util.Arrays;
import java.util.Objects;

public class Word {
    private String nativeWord;
    private String transcription;
    private String[] meaning;
    private String[] forms;
    private String[] differentInformation;
    private NamePartLanguage[] namePartLanguage;

    public Word(String nativeWord, String[] meaning) {
        this.nativeWord = nativeWord;
        this.meaning = meaning;
    }
    
    public Word(String nativeWord, String meaning) {
        this.nativeWord = nativeWord;
        this.meaning = new String[]{meaning};
    }
    
    public void addNamePartLanguage(NamePartLanguage[] namePartLanguage) {
        if (Objects.isNull(namePartLanguage) || this.namePartLanguage.length == 0) {
            this.namePartLanguage = namePartLanguage;
        } else {
            NamePartLanguage[] temp = new NamePartLanguage[this.namePartLanguage.length + namePartLanguage.length];
            System.arraycopy(this.namePartLanguage, 0, temp, 0, this.namePartLanguage.length);
            System.arraycopy(namePartLanguage, 0, temp, this.namePartLanguage.length, namePartLanguage.length);
            this.namePartLanguage = temp;
        }        
    }
    
    public void addNamePartLanguage(NamePartLanguage namePartLanguage) {
        addNamePartLanguage(new NamePartLanguage[] { namePartLanguage });
    }   

    public NamePartLanguage[] getNamePartLanguage() {
        return namePartLanguage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nativeWord);
        hash = 53 * hash + Objects.hashCode(this.transcription);
        hash = 53 * hash + Arrays.deepHashCode(this.meaning);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Word other = (Word) obj;
        if (!Objects.equals(this.nativeWord, other.nativeWord)) {
            return false;
        }
        if (!Objects.equals(this.transcription, other.transcription)) {
            return false;
        }
        return Arrays.deepEquals(this.meaning, other.meaning);
    }
}
