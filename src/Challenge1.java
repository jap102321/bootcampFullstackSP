import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AleatoryString ale = new AleatoryString();

        System.out.print("Please type in the type of data that you want (A & B): ");
        String type = sc.next();
        System.out.println(ale.generateNumber(type));



        //
        List<String> data;
        data = new ArrayList<>();
        data.add("PERÚ");
        data.add("PERU");
        data.add("BOLIVIA");
        data.add("CHILE");
        data.add("ARGENTINA");
        data.add("PARAGUAY");
        data.add("URUGUAY");
        data.add("BRASIL");
        data.add("MÉXICO");
        data.add("MEXICO");


        System.out.print("Give me the name of a wine producer country from latinamerica: ");
        String dataPos = sc.next();
        System.out.println(data.contains(dataPos.toUpperCase()));

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

