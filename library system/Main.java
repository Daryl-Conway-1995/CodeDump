import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //populate the library and register
        Library library = new Library();
        library.readRegister();
        library.readStorage();
        library.currentRegister();
        library.currentStorage();

        Book the_hungry_caterpillar = new Book("the hungry caterpillar", "Hamish Hamilton ", 23, true, " 3 June 1969");
        Maps map = new Maps("map of UK","MapMakers", 1, "UK", "20 april 1743");
        NewsPaper newsPaper = new NewsPaper("Current news", "YourNews", 100, "True madness in the world", "20 december 2016");
        Person sam = new Person("sam", 23, "cleaner");
        Person bob = new Person("bob", 23, "cleaner");
        Person lucy = new Person("lucy", 28, "doctor");
        Person thor = new Person("thor", 485, "superhero");

        /*
        //store books in library
        library.addBook(newsPaper);
        library.addBook(the_hungry_caterpillar);
        library.addBook(map);

        //register and people
        library.registerPerson(sam);
        library.registerPerson(lucy);
        library.registerPerson(thor);
        library.registerPerson(bob);
        */


        //test for all functions
        //library and books
/*
        library.checkOut(the_hungry_caterpillar);
        library.currentStorage();
        library.libraryStorage();

        library.checkIn(the_hungry_caterpillar);
        library.currentStorage();

        library.removeBook("the hungry caterpillar");
        library.currentStorage();
        library.libraryStorage();

        library.updateItem(newsPaper, "changing names");
        library.currentStorage();

        library.updateItem("changing names", "23 june 1995");
        library.currentStorage();

        //deleting a person
        library.deletePerson(sam);
        library.deletePerson(bob);
        library.currentRegister();

        //updating a person
        library.updatePerson("thor",48);
        library.updatePerson("thor","shapeshifter");
        library.updatePerson("thor",48, "Loki");
        library.currentRegister();

        library.registerPerson(bob);
        library.registerPerson(sam);
        library.currentRegister();

*/
    }
}
