import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


//        //2nd way
//        ArrayList<String> words = new ArrayList<>();
//        for (int i=0; i<=s.length()-k;i++){
//
//            words.add(s.substring(i,i+k));
//
//        }
//        Collections.sort(words);
//        smallest= words.get(0);
//        largest= words.get(words.size()-1);

        for(int i = 0; i<s.length()-k+1; ++i){
            String word =s.substring(i,i+k);
            largest = word.compareTo(largest) > 0 ? s.substring(i,i+k) : largest;
            smallest = word.compareTo(smallest) < 0 || i == 0 ? s.substring(i,i+k) : smallest;


        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
