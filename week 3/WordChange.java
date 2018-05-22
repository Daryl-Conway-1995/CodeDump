import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class WordChange {
    public void changeWord(String first, String second){
        //convert words to char arrays
        char[] word1 = first.toCharArray();
        char[] word2 = second.toCharArray();

        //create altering array
        char[] wordChange1 = word1.clone();
        char[] wordChange2 = word2.clone();
        char[] lettersToAdd = word1.clone();
        for(int i =0; i<wordChange2.length;i++)
        {
            //blank array with -
            wordChange2[i]='-';
        }
        for(int i =0; i<wordChange1.length;i++)
        {
            //blank array with -
            wordChange1[i]='-';
        }

        //for each letter in word 1
        for ( int i =0; i<word1.length;i++){
            //search through letters in word 2
            for(int j =0; j<word2.length;j++)
            {
                //if there is a match
                if (word1[i]==word2[j])
                {
                    //add the matching letter back into the altering array.
                    wordChange2[j] = word2[j];
                    word2[j] ='-';
                    wordChange1[i] = word1[i];
                    lettersToAdd[i] ='-';
                    break;
                }
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println("We first remove all the none common letters:");
        System.out.println(wordChange2);
        System.out.println("We then rearrange the common letters:");
        System.out.println(wordChange1);
        System.out.println("We then add the following missing letters:");
        System.out.println(lettersToAdd);
        System.out.println("add we are left with the word: "+first);
    }
}
