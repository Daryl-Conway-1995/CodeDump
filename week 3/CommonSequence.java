public class CommonSequence {
    private String foundSequence ="";
    private String secondSequence ="";
    private int i =0;
    private int j=0;


    public void findCommonSequence(String firstString,String secondString)
    {
        foundSequence ="";
        for (i=0; i<=firstString.length();i++)
        {
            for(j=i+1;j<=firstString.length();j++)
            containsSequence(firstString.substring(i,j),secondString);
        }
        if(secondSequence.length()==0)
        {
            System.out.println("The longest common sequence was: " + foundSequence +" with "+foundSequence.length());
        }else
        {
            System.out.println("There was two longest sequences, they where: ");
            System.out.println(foundSequence +" with "+foundSequence.length());
            System.out.println(secondSequence +" with "+secondSequence.length());
        }
    }


    private void containsSequence(String sequence,String fullWord)
    {
        if(fullWord.contains(sequence)&&sequence.length()>foundSequence.length())
        {
            foundSequence = sequence;
        }else if (fullWord.contains(sequence)&&sequence.length()==foundSequence.length()) {
            secondSequence = sequence;
        }
    }
}

