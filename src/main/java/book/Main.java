package book;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Phonebook phonebookOne = new Phonebook();

        phonebookOne.add("Taylor", "302-555-1234");
        phonebookOne.add("Chatyra", "302-555-5789");
        phonebookOne.add("Will", "302-555-0987");
        phonebookOne.add("Malachi", "302-555-3216");
        phonebookOne.add("Avonte", "302-555-7089");
        System.out.println("===========================");
        phonebookOne.remove("Taylor");
        System.out.println("===========================");
        System.out.println(phonebookOne.hasEntry("Will"));
        System.out.println(phonebookOne.hasEntry("hannah"));
        System.out.println("===========================");
        System.out.println(phonebookOne.getAllContactNames());
        phonebookOne.lookUp("Chatyra");
        System.out.println("===========================");
        phonebookOne.reverseLookUp("302-555-7089");








    }
}
