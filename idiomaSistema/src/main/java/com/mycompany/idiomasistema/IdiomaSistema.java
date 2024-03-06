package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("Linguagem do sistema: "+ (loc.getDisplayLanguage()).toUpperCase());
        System.out.println(("Abreviação: "+loc.getLanguage()).toUpperCase());
    }
}
