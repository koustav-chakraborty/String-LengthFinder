import java.util.Scanner; 

public class string_length{
    public static void main(String args[]){

        int count = 0;
        int whitespace = 0;
        // System.out.println("Testing..");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        String indent = "^";
        String new_str = str+indent;

        // System.out.println(new_str);
        // System.out.println(new_str.indexOf("^"));

        for(int i = 0; new_str.indexOf("^")!=i; i++){
            if(new_str.indexOf(" ") == i){
                whitespace++;
            }

            count++;
        }

        System.out.println("Total Length : "+count);
        System.out.println("Letters: "+(count-whitespace));
        System.out.println("Whitespaces: "+whitespace);
    }
}