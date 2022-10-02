package com.hayatitastan;
/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 * */
public class Main {
    public static void main(String[] args) {

        // Bir sayı dizi içinde var mı yok mu?
        int[] numbers = new int[]{1,2,5,7,9};
        int aranacak = 5;
        boolean varMi=false;

        for (int number: numbers){
            if (number == aranacak ) {
                varMi = true;
                break;
            }
        }

        if(varMi){
            System.out.println(aranacak + " SAYISI dizi İÇİNDE VARDIR.");
        }else{
            System.out.println(aranacak + " SAYISI dizi İÇİNDE YOKTUR.");
        }
    }
}
