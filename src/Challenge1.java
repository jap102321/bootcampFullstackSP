public class Challenge1 {
    public static void main(String[] args) {
        int i=9;

        AleatoryString ale = new AleatoryString();

        System.out.println(ale.generateNumber(i));
    }
}

class AleatoryString{
    String aleatory;


    public AleatoryString(){

    }



    public String generateNumber(int i){
        String bank= "0123456789";
        StringBuilder builder;
        builder = new StringBuilder(i);
        for(int x = 0; x < i;x++){
            int index = (int) (bank.length()*Math.random());
            builder.append(bank.charAt(index));
        }

        return builder.toString();
    }

}