import java.util.*;

public class Challenge1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AleatoryString ale = new AleatoryString();
        LineDatabase ld = new LineDatabase();
        List <String> db = new ArrayList<>();



        System.out.print("How many new lines do you want to generate and add to " +             //Choose how many new lines there'll be
                "the database: ");
        int newLines = sc.nextInt();



        for(int i = 0 ; i < newLines; i++){                                                     //Iterate and add new lines to the internal DB
            System.out.print("Please type in the type of data that you want (A & B): ");
            String type = sc.next();
            db.add(ale.generateNumber(type));
            System.out.println(db.get(i));
        }


        System.out.println("The numbers in the DB are " + db);
        System.out.print("Check is a number is available: ");
        String numberInDB= sc.next();
        System.out.println(ld.getInfoDB(numberInDB, db));





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

        if(typeOf.equalsIgnoreCase("a")){
            this.aleatory="54";
            builder.append(aleatory);
        }else if (typeOf.equalsIgnoreCase("b")) {
            this.aleatory="08";
            builder.append(aleatory);
        }

        for (int x = 0; x < longitud; x++) {
            double Random = Math.random() * bank.length();
            int pos = (int) Random;
            char letter = bank.charAt(pos);
            builder.append(letter);
        }
         return builder.toString();
    }

}

       /* for (int x = 0; x < longitud; x++) {
        double Random = Math.random() * bank.length();
        int pos = (int) Random;
        char letter = bank.charAt(pos);
        builder = builder.append(letter); */

class LineDatabase{
    private String aleatory,numberInDB;
                                                                                        //Adding number to the DB
    public boolean getInfoDB(String numberInDB, List<String> list){
        if(list.contains(numberInDB)){
            return false;
        }
        return true;
    }


}

