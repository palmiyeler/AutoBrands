import java.util.Locale;

public class autoGallery {

    public static void main(String[] args){

        Opel opel1 = new Opel(1, "second hand");
        opel1.setColor("black");
        String output = opel1.getColor().substring(0,1).toUpperCase()+opel1.getColor().substring(1); //?????????????????
        opel1.setColor(output);
        System.out.println(opel1.getColor());
    }

}
