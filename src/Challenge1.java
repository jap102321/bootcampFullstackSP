import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=9;
        AleatoryString ale = new AleatoryString();

        System.out.println("Please type in the type of data that you want: A & B");
        String type = sc.next();
        System.out.println(ale.generateNumber(type));
    }
}

class AleatoryString {
    String aleatory;


    public AleatoryString() {

    }


    public String generateNumber(String typeOf) {

        String bank = "0123456789";
        int longitud = 8;
        StringBuilder builder;
        builder = new StringBuilder(longitud);

        if (typeOf.equalsIgnoreCase("A")) {
            aleatory = "54";
            builder = builder.append(aleatory);
            for (int x = 0; x < longitud; x++) {
                double Random = Math.random() * bank.length();
                int pos = (int) Random;
                char letter = bank.charAt(pos);
                builder = builder.append(letter);
            }
        } else if (typeOf.equalsIgnoreCase("B")) {
            aleatory = "08";
            builder = builder.append(aleatory);
            for (int x = 0; x < longitud; x++) {
                double Random = Math.random() * bank.length();
                int pos = (int) Random;
                char letter = bank.charAt(pos);
                builder = builder.append(letter);
            }
        }else{
            return "You didn't indicate the right type of n°";
        }
        return builder.toString();
    }
}