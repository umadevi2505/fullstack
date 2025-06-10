import java.util.*; 
public class Distinct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        Set<Character> distinctChars=new HashSet<>();
        for (char ch:input.toCharArray()) {
            distinctChars.add(ch);
        }

        System.out.println("Distinct characters: " + distinctChars);

    }
}
