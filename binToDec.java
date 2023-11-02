import java.util.Scanner;
import java.util.Stack;




public class binToDec {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your binary");
        String binary = input.nextLine();
        System.out.println("Your number is " + bin2Dec(binary));
        input.close();
    }


    public static int bin2Dec(String binaryString){
        try{

        Stack<Character> binaryDigits = new Stack<>();
        int total = 0;
        int j = 0;
        for(int i = 0; i < binaryString.length(); i++){
            if (binaryString.charAt(i) != '1' && binaryString.charAt(i) != '0'){
                throw new BinaryFormatException("Not a binary number");        
    
            }
            binaryDigits.push(binaryString.charAt(i));

        }
    
    
        while(!binaryDigits.empty()){
            total += Character.getNumericValue(binaryDigits.peek()) * Math.pow(2,j);
            binaryDigits.pop();
            j++;
        }
        return total;
    
    }
    catch(BinaryFormatException ex){
        System.out.println("Not a binary number");
        System.exit(0);
        return 0;
    }
                    
}




}


