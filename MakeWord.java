
import java.util.Scanner;
import java.util.LinkedList;

public class MakeWord {
    public static void main(String[] args) {
        MakeWord makeWord = new MakeWord();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("enter your word : ");
            String word = sc.nextLine();
            makeWord.permute(word, 0, word.length() - 1);
        }
    }
    private void permute(String word, int l, int r){
        if(l == r){
            System.out.println(word);
        }
        else {
            for(int i = l;i <= r; i++){
                word = swap(word, l, i);
                permute(word,l + 1, r);
                word = swap(word,l,i);
            }
        }
    }
    public String swap(String word,int i,int j){

        char[] charArray = word.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
//        System.out.println("temp : "+temp+" charArray[j]:"+charArray[j]);

        return String.valueOf(charArray);
    }
}