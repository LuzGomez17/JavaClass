package Class6;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        String country="USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){ // converts the text to lower case

            case "usa":
                System.out.println("Burgers");
            case "Italy":
                System.out.println("Pasta");
            case "El Salvador":
                System.out.println("Pupusas");
            default:
                System.out.println("Wrong country");
        }

    }
}
