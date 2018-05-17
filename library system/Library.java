import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class Library implements CheckIns{

    //create ID and two arrays, one for reading material and one for people.
     private  static int bookID =0;
     private  static int personID =0;
     private ArrayList<ReadingMaterial> storage = new ArrayList<>();
     private ArrayList<Person> people = new ArrayList<>();



     //book methods
     public void addBook(ReadingMaterial material)
     {
         for(ReadingMaterial r:storage)
         {
             if (r.getIndex()== bookID)
             {
                 bookID++;
             }
         }
         material.setIndex(bookID);
         bookID++;
        storage.add(material);
     }

     public void removeBook(ReadingMaterial material)
     {
        storage.remove(material);
        bookID=0;
     }

     public void removeBook(String name)
     {
        for (int i = 0; i<storage.size();i++)
        {
            if (storage.get(i).getName().equals(name))
            {
                System.out.println("\n"+name+" has been removed from the library.");
                storage.remove(i);
            }
        }
        bookID=0;
    }

     public void updateItem(ReadingMaterial material,String name)
     {
         String oldname ="";
         int location = storage.indexOf(material);
         oldname = storage.get(location).getName();
         storage.get(location).setName(name);
         System.out.println("");
         System.out.println(oldname+" has been changed to: "+ storage.get(location).getName() );
     }

     public  void updateItem(String name, String date)
     {
        for (int i = 0; i<storage.size();i++)
        {

            if (storage.get(i).getName().equals(name))
            {
                System.out.println("\nDate has been updated.");
                storage.get(i).setDatePublished(date);
            }
        }
    }




    //storage methods
     public void currentStorage()
     {
        String output = "";
        for(ReadingMaterial material:storage)
        {
            if (material.isInLibrary()) {
                output = output + "\n" + material.getBasicInfo();
            }
        }
        System.out.println(output);
    }

     public void libraryStorage()
     {
        String output = "";
        System.out.println("\nAll material in the library:");
        for(ReadingMaterial material:storage)
        {
            output = output + "\n" + material.toString();
        }
        System.out.println(output);
    }

     public void writeStorage()
     {
         File file = new File("storage.txt");
         try {
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             for(ReadingMaterial readingMaterial:storage)
             {
                 bufferedWriter.write(readingMaterial.toStringData());
                 bufferedWriter.newLine();
             }

             bufferedWriter.close();
             fileWriter.close();
         } catch (IOException ex) {
             System.out.println("Error writing to file '" + file + "'");
         }
     }

     public void readStorage()
     {
         File file = new File("storage.txt");
         try
         {
             storage.clear();
             String line = "";
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             while((line = bufferedReader.readLine()) != null) {
                 String[] details =line.split(":");
                 if (details[0].equals("1"))
                 {
                     //(String name, String publisher , int noPages, boolean hardBack, String date)
                     Book book = new Book(details[2],details[5],Integer.parseInt(details[3]),Boolean.parseBoolean(details[6]),details[4]);
                     book.setIndex(Integer.parseInt(details[1]));
                     storage.add(book);
                 }
                 if (details[0].equals("2"))
                 {
                     //(String name, String publisher , int noPages, String mainArticle, String date)
                     NewsPaper np = new NewsPaper(details[2], details[5], Integer.parseInt(details[3]), details[6], details[4]);
                     np.setIndex(Integer.parseInt(details[1]));
                     storage.add(np);

                 }
                 if (details[0].equals("3"))
                 {
                     //(String name, String publisher , int noPages, String country, String date)
                     Maps map = new Maps(details[2], details[5], Integer.parseInt(details[3]), details[6], details[4]);
                     map.setIndex(Integer.parseInt(details[1]));
                     storage.add(map);
                 }
             }
             bufferedReader.close();
             fileReader.close();
         }
         catch (FileNotFoundException ex)
         {
             System.out.println("Unable to open file '" + file + "'");
         }
         catch(IOException ex)
         {
             System.out.println("Error reading file '" + file + "'");
         }
     }

     public void checkIn(ReadingMaterial book)
     {
         int location = storage.indexOf(book);
         storage.get(location).checkedIn();
         System.out.println("");
         System.out.println(book.getName()+" has been returned.");
     }

     public void checkOut(ReadingMaterial book)
     {
         int location = storage.indexOf(book);
         storage.get(location).checkedOut();
         System.out.println("");
         System.out.println(book.getName()+" has been booked out.");

     }




     //people methods
     public void registerPerson(Person person)
     {
         for(Person p:people)
         {
             if (p.getIndex()== personID)
             {
                 personID++;
             }
         }
         person.setIndex(personID);
         personID++;
         people.add(person);
     }

     public void deletePerson(Person person)
     {
         people.remove(person);
         personID=0;
     }

     public void deletePerson(String name)
     {
        for (int i = 0; i<people.size();i++)
        {
            if (people.get(i).getName().equals(name))
            {
                System.out.println(name +" has been removed.");
                people.remove(people.get(i));
            }
        }
        personID=0;
    }

     public void updatePerson(String nameBefore,int age, String nameAfter)
     {
         for (int i = 0; i<people.size();i++)
         {
             if (people.get(i).getName().equals(nameBefore) && people.get(i).getAge() == age )
             {
                 people.get(i).setName(nameAfter);
             }
         }
     }

     public void updatePerson(String name, int age)
     {
        for (int i = 0; i<people.size();i++)
        {

            if (people.get(i).getName().equals(name))
            {
                people.get(i).setAge(age);
            }
        }
    }

     public void updatePerson(String name, String job)
     {
        for (int i = 0; i<people.size();i++)
        {

            if (people.get(i).getName().equals(name))
            {
                people.get(i).setJobTitle(job);
            }
        }
    }

     public void currentRegister()
     {
         String output = "";
         for(Person person:people)
         {
                 output = output + "\n" + person.toString();
         }
         System.out.println(output);
     }

     public void readRegister()
     {
         //(String name, int age, String jobTitle)
         File file = new File("register.txt");
         try
         {
             people.clear();
             String line = "";
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             while((line = bufferedReader.readLine()) != null) {
                 String[] details =line.split(":");
                 //(String name, int age, String jobTitle)
                 Person person = new Person(details[1],Integer.parseInt(details[2]),details[3]);
                 person.setIndex(Integer.parseInt(details[0]));
                 people.add(person);
             }
             bufferedReader.close();
             fileReader.close();
         }
         catch (FileNotFoundException ex)
         {
             System.out.println("Unable to open file '" + file + "'");
         }
         catch(IOException ex)
         {
             System.out.println("Error reading file '" + file + "'");
         }
     }

     public void writeRegister()
     {
         File file = new File("register.txt");
         try {
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

             for(Person p:people)
             {
                 bufferedWriter.write(p.toString());
                 bufferedWriter.newLine();
             }
             bufferedWriter.close();
             fileWriter.close();
         } catch (IOException ex) {
             System.out.println("Error writing to file '" + file + "'");
         }
     }
}
