import java.io.IOException;
import java.util.Scanner;




public class Reverzovani {
    private StringBuffer sb;

    static Scanner sc = new Scanner(System.in);

    public void zadani() throws IllegalArgumentException {
        System.out.println("Zadej větu: ");
        String text = sc.nextLine();

        if (text.charAt(text.length()-1) == '.' || text.charAt(text.length()-1) == '!' || text.charAt(text.length()-1) == '?') {
            if (Character.isUpperCase(text.charAt(0))) {
                sb = new StringBuffer(text);
            }
        }
        else {
           throw new IllegalArgumentException();
        }
    }

    public void vetaReverzor(){
        StringBuffer sb1 = sb;
        sb1.reverse();
        System.out.println(sb1.toString());
    }

    public void slovoReverzor(){
        StringBuffer sb2 = new StringBuffer(sb.substring(0, sb.length()-2));
        StringBuffer sb4 = new StringBuffer("");
        StringBuffer sb5 = new StringBuffer(sb.substring(sb.length()-2,sb.length()-1));
        sb2.trimToSize();
        int cislo = 0;
        int counter = 0;
        while (true){
            if (sb2.indexOf(" ") != 1){
                StringBuffer sb3 = new StringBuffer(sb2.substring(cislo, sb2.indexOf(" ")));
                cislo =  sb2.indexOf(" ");
                sb3.reverse();

                if (counter != 0){
                    sb4.append(" " + sb3);
                }
                else {
                    sb4.append(sb3);
                }
                counter++;
            }



            break;
        }

        sb4.append(sb5);
        System.out.println(sb4.toString());
    }
}
