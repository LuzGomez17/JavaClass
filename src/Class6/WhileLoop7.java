package Class6;

public class WhileLoop7 {
    public static void main(String[] args) {

        // Print below sequence with the help of loop
       // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

        /*
        int number=1;
        while (number<=16){
        }else {
        System.out.println(number);
        }
        number++;
        }
         */
        System.out.println("***********");

        int number2=1;
        while (number2<=16){

            if(number2%5!=0){
                System.out.println(number2);
            }
            number2++;
        }
    }
}
