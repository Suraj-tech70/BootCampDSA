// Find all vowels in an array
import java .util.Scanner;
public class  FindVowel{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        for ( int i = 0; i<str.length(); i++){
           
            char ch = str.charAt(i);
            if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'
               || ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'
            )
          
            {
                System.out.println(ch +" ");
            }
        }
    }
}