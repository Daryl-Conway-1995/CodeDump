import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Garland {

    private boolean possible = false;
    private int results = 0;
    private int highestResults = 0;
    private int length;
    private char front;
    private char back;
    private String frontEnd = "";
    private String backEnd = "";
    private int longestResult=0;
    private String longestWord ="";

    public int isItGarland(String input) {

        //reset all starting variables
        results =0;
        possible = false;

        //get length of string
        length = input.length();

        //check for first letter repeated.
        front = input.charAt(0);
        for (int i = 1; i < (length); i++) {
            back = input.charAt(i);
            if (front == back) {                       //if found it is possible
                possible = true;
            }
        }

        if (possible == false) {                       //else return 0 and exit program.
            System.out.println("0 not a garland word.");
            return 0;
        }
        calculateGarland(input);
        createChain(input);
        return  0;
    }

    private void calculateGarland(String input)
    {
        //reset all variables.
        results= 0;
        highestResults =0;
        frontEnd="";
        backEnd="";

        //check for longest chain
        for (int i = 0; i < length-1; i++) {
            results++;                                                  //increase for each letter
            frontEnd = frontEnd + input.charAt(i);                      //front = front + new letter
            backEnd = input.charAt((length-1) - i) + backEnd;           //back = new letter + back
            if (frontEnd.equals(backEnd)) {                             // if they match
                highestResults = results;                               //set to highest result.
            }
        }
        System.out.println(highestResults+" is a garland word.");
    }

    private void createChain(String input)
    {
        //gets the repeating letters
        String chaining="";

        for (int i=0;i<(input.length()-highestResults);i++)
        {
            chaining = chaining + input.charAt(i);
        }

        //prints out the chain one more then the for loop max
        for (int j= 0;j<8;j++) {
            System.out.print(chaining);
        }
        System.out.print(input+"\n");
    }

    public  void garlandTxtFile()
    {
        try {
            File file = new File("enable1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            System.out.println("Contents of file:");
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
