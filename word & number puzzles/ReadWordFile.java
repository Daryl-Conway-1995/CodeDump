import java.io.*;
import java.util.*;


/*
  to run this simply create an object of class readWordFile and run findMax()
  it will run through a given text file and find the most anagramed word in the list,
  favoring longer words. 

  ReadWordFile rwf = new ReadWordFile();
        rwf.findMax();


 */
public class ReadWordFile {

    private ArrayList<String> words = new ArrayList<>();
    private HashMap<String,String> scrabbled = new HashMap<String,String>();
    private int stringLength = 0;
    private String wordMostAnagram ="";
    private int numberOfMostAnagram =0;

    public ReadWordFile()
     {
         readTheFile();
     }

    private void readTheFile()
    {
        File file = new File("Words.txt");
        try
        {
            String line = "";
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                addAnagram(line);
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

    private String alphabetise(String inputWord)
    {
        //alphabetise an string inputted.
        char tempArray[] = inputWord.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    private void addAnagram(String line)
    {
        //add to the hash map
        String value = alphabetise(line);
        scrabbled.put(line,value);
    }

    private void findInMap(String searchFor)
    {
        String result ="";
        int numbOfResults =0;
        //check all pairs for the scrambled word match.
            for (Object o : scrabbled.keySet()) {
                if (scrabbled.get(o).equals(alphabetise(searchFor))) {

                    //for each match increase the count and add to the output string.
                    numbOfResults++;
                    result =result+o+"\n";
                }
            }
        //output the count
        if (numberOfMostAnagram<numbOfResults)
        {
            numberOfMostAnagram = numbOfResults;
            wordMostAnagram = result;
            stringLength = searchFor.length();
        }
        else if (numberOfMostAnagram == numbOfResults)
        {
            if(stringLength<searchFor.length())
            {
                stringLength = searchFor.length();
                wordMostAnagram = result;
            }
            else if(stringLength==searchFor.length())
            {
                wordMostAnagram = wordMostAnagram +"\n"+ result;
            }
        }

    }

    public void findMax()
    {
        //add rest functionality
        wordMostAnagram ="";
        numberOfMostAnagram =0;
        stringLength =0;

        //for all words in the hash map
        for (Map.Entry e:scrabbled.entrySet())
        {
            //has the word or an anagram has been covered?
            //if yes
            if (words.contains(e.getValue()))
            {
                //DO NOTHING!
            }
            else
            {
                //if not then find all matches within the map.
                findInMap(e.getValue().toString());
                words.add(e.getValue().toString());
            }
        }

        System.out.println("The max number of anagrams was "+ numberOfMostAnagram + " matches.");
        System.out.println("Those results are: \n" +wordMostAnagram);
    }
}

