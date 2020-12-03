package com.company;

import com.company.Exceptions.EmptyStringException;
import com.company.ProperCase.ProperCase;

import java.util.*;

public class MainController {

    public void runProgram() {
        Scanner sc = new Scanner(System.in);

        //ArrayList
        /*
        GetList gl = new GetList();
        gl.addStringToList(gl.stringArrayList, "Abe");
        gl.addStringToList(gl.stringArrayList, "Hval");
        gl.addStringToList(gl.stringArrayList, "Krokodille");
        gl.addStringToList(gl.stringArrayList, "Flodhest");
        gl.addStringToList(gl.stringArrayList, "Dovendyr");
        Collections.sort(gl.stringArrayList);
        System.out.println(gl.stringArrayList);

         */

        //Bog
        /*
        Bibliotek bibliotek = new Bibliotek();
        bibliotek.addBook(new Bog(123, "Bog1", 2020));
        bibliotek.addBook(new Bog(321, "Bog2", 2021));
        Bog bog = new Bog(425, "Bog3", 2022);
        System.out.println(bibliotek.containsBook(bog));

         */
        //Græs
        /*
        Græs græs = new Græs();
        System.out.println(græs.daysToMowing(sc.nextDouble(), 50));
        }

         */

        //Kvadrat
        /*
        Kvadrat kvadrat = new Kvadrat();
        System.out.println("Type number, then sign");
        try {
            kvadrat.printSquare(sc.nextInt(), sc.next());
        } catch(IllegalArgumentException e) {
            e.printErrorKvadrat();

         */

        //Menuvalg


        //Proper Case
        /*
        ProperCase word = new ProperCase();
        System.out.println("Type a full sentence");
        try {
            word.changeSentence(sc.nextLine());
        } catch (EmptyStringException e) {
            e.printErrorMessage();
        }

         */
    //Regning
    //Regning regning = new Regning();

    //Sortering
        /*
        GetUserStrings gus = new GetUserStrings();
        gus.readStrings();
        List<String> strings = gus.getStrings();
        System.out.println(strings);

         */


    //Stort Bogstav
        /*
        StortBogstav stortBogstav = new StortBogstav();
        int choice = 0;

        while (choice != 9) {
            System.out.println("(1) Type Sentence: ");
            System.out.println("(2) Check for uppercase");
            System.out.println("(9) Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String sentence = sc.nextLine();
                    stortBogstav.addSentence(sentence);
                    break;
                case 2:
                    List<String> sentences = stortBogstav.getSentences();
                    System.out.println(stortBogstav.checkForUpperCase());
                    break;
                case 9:
                    System.out.println("(9) Exiting...");
                    break;
                default:
                    choice = 9;
            }
        }
         */
    //Strenge


    //Søgning
        /*
        Søgning søgning = new Søgning();
        String[] strings = {"Rasmus er shit til cod", "xD", "Rapper_D"};
        try {
            System.out.println(søgning.hasString(strings, "xD"));
        } catch (NotFoundInArrayException e) {
            e.printErrorMessage();
        }

         */
    }
}