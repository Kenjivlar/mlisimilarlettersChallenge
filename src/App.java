import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lets check if the letters you introduce, there is a similar letter between 2 strings or bunch or pair of letters");

        Scanner scanner = new Scanner(System.in);
        String[][] myTwoDimentionalArray = new String[2][2];
        String[] wordsL1 = new String[2];
        String[] wordsL2 = new String[2];
        String word1 = "";
        String word2 = "";
        String word3 = "";
        String word4 = "";
        String tof1 = "False";
        String tof2 = "False";
        


        for (int i = 0; i < myTwoDimentionalArray.length; i++) {
            for (int j = 0; j < myTwoDimentionalArray.length; j++) {
                System.out.println("Introduce a pair or a bunch of letters:");
                myTwoDimentionalArray[i][j] = scanner.nextLine();                
            }
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < myTwoDimentionalArray.length; i++) {
            for (int j = 0; j < myTwoDimentionalArray.length; j++) {
                System.out.println(myTwoDimentionalArray[i][j]);                
            }
        }

        System.out.println("----------------------------------------");
        for (int j = 0; j < myTwoDimentionalArray.length; j++) {
            wordsL1[j] = myTwoDimentionalArray[0][j]; 
            System.out.print(myTwoDimentionalArray[0][j] + " ");
        }
        word1 = wordsL1[0];
        word2 = wordsL1[1];
        for(int i = 0; i < word1.length(); i++){
            
            for (int j = 0; j < word2.length(); j++){
                
                if( word1.charAt(i) == word2.charAt(j)){
                    tof1 = "True";
                }
            }
        }
        System.out.println(tof1);

        for (int i = 0; i < myTwoDimentionalArray.length; i++) {
            wordsL2[i] = myTwoDimentionalArray[1][i]; 
            System.out.print(myTwoDimentionalArray[1][i] + " ");
        }

        word3 = wordsL2[0];
        word4 = wordsL2[1];
        for(int k = 0; k < word3.length(); k++){
            
            for (int l = 0; l < word4.length(); l++){
                
                if( word3.charAt(k) == word4.charAt(l)){
                    tof2 = "True";
                }
            }
        }
        System.out.println(tof2);
        
        scanner.close();
        
    }
}
