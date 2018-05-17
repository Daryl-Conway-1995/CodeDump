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


        results =0;

        length = input.length();

        //check for first letter repeated.
        front = input.charAt(0);
        for (int i = 1; i < (length); i++) {
            back = input.charAt(i);
            //if found it is possible
            if (front == back) {
                possible = true;
            }
        }
        //if not possible return 0
        if (possible == false) {
            System.out.println("0 not a garland word.");
            return 0;
        }
        calculateGarland(input);
        createChain(input);
        return  0;
    }

    private void calculateGarland(String input)
    {
        //check for longest chain
        for (int i = 0; i < length-1; i++) {
            results++;
            frontEnd = frontEnd + input.charAt(i);
            backEnd = input.charAt((length - 1) - i) + backEnd;
            if (frontEnd.equals(backEnd)) {
                highestResults = results;
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
        System.out.print(input+"");
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
