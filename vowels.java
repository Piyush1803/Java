import java.util.Scanner;
class vowels{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("Enter a letter");
        c=sc.next().charAt(0);
        if(c=='A'|| c=='E' || c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("VOWEL");
        }
        else if((c>=65)&&(c<=90) || (c>=97)&&(c<=122))
        {
            System.out.println("Consonants");
        }
            else{
                System.out.println("Error");
            }
        sc.close();
        }
    }