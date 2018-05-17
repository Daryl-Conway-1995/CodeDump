import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Map;

public class Library implements CheckIns{

    //create ID and two arrays, one for reading material and one for people.
     private  static int ID =0;
     private ArrayList<ReadingMaterial> storage = new ArrayList<>();
     private ArrayList<Person> people = new ArrayList<>();


     //book methods
     public void addBook(ReadingMaterial material)
     {
        storage.add(material);
     }

     public void removeBook(ReadingMaterial material)
     {
        storage.remove(material);
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

     public void currentStorageWrite()
     {
         File file = new File("storage.txt");
         try
         {
             FileWriter fw = new FileWriter(file);
             for (ReadingMaterial material:storage)
             {
                 //add data to text file
                 fw.write(material.getBasicInfo()+"\n");
                 fw.flush();
             }
             fw.close();
         }
         catch
                 (Exception e)
         {e.printStackTrace();}
     }

     public void currentStorageRead(String location)
     {
         char[] message = new char[200];
         String concatenateMessage = "";
         int size =0;
         try
         {
             File file = new File("storage.txt");
             FileReader fr = new FileReader(file);
             size = fr.read(message);
             //System.out.println(size);
             for (char c:message)
             {
                 //read data from text file
                 concatenateMessage = concatenateMessage + c;
             }
             fr.close();
         }
         catch (Exception e)
         {}
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
        people.add(person);
     }

     public void deletePerson(Person person)
     {
         people.remove(person);
     }

     public void updatePerson(Person person, int age)
     {
         int location = people.indexOf(person);
         Person p = people.get(location);
         p.setAge(age);
         people.set(location,p);

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

}
