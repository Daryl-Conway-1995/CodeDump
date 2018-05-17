
public class GarlandWords {



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

        //if not possible return 0 and exit current itteration.
        if (possible == false) {
            System.out.println("0 not a garland word.");
            return 0;
        }
	
	//will only activate if garland is possible
        calculateGarland(input);
        
	//empty return to stop errors. (ignore)
        return  0;
    }



 private void calculateGarland(String input)
    {
        //check for the longest chain
	//goes to length-1 to stop matching first letter. 
        for (int i = 0; i < length-1; i++) {
            results++;
            frontEnd = frontEnd + input.charAt(i);                         //front = front + next letter
            backEnd = input.charAt((length - 1) - i) + backEnd;            //back = next letter + back 
            if (frontEnd.equals(backEnd)) {                                //compare front to back. 
                highestResults = results;                                  //if match set to highest result. 
            }
        }
        System.out.println(highestResults+" is a garland word.");   
    }
}