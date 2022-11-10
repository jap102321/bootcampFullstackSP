import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AleatoryString ale = new AleatoryString();
        LineDatabase ld = new LineDatabase();



        System.out.print("How many new lines do you want to generate and add to " +
                "the database: ");
        int newLines = sc.nextInt();

        String [] linesData = new String[newLines];

        for(int i = 0 ; i < newLines; i++){
            System.out.print("Please type in the type of data that you want (A & B): ");
            String type = sc.next();
            linesData[i]=ale.generateNumber(type);
            ld.addLineToDatabase(linesData[i]);
            System.out.println(linesData[i]);
        }


        System.out.println("The numbers in the DB are " + Arrays.toString(linesData));
        System.out.print("Check is a number is available: ");
        String numberInDB= sc.next();
        System.out.println(ld.getInfoDB(numberInDB));





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

class LineDatabase{
    private String aleatory,numberInDB;
    private ArrayList<String> line = new ArrayList<>();

    public boolean getInfoDB(String numberInDB){
        if(line.contains(numberInDB)){
            return false;
        }

        return true;
    }
    public void addLineToDatabase(String aleatory){
        this.numberInDB=aleatory;
        line.add(aleatory);

    }

}

