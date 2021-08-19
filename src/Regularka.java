import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularka {
    static String emailPool="petr@mail.ru ivanov.1992@gmail.com d.petrov77@yandex.ru @petsdDSDr@mail.ru";

    public static ArrayList<String> emailRegularka(String emailPool) {
        ArrayList<String> bibliotekaEmail=new ArrayList<>() ;
        //emailPool.matches("[a-z@?.0-9]+");
        ArrayList<String> validEmailON=new ArrayList<>() ;

        Pattern poiskEmaik =Pattern.compile("[a-z@?.0-9]+");
        Matcher matcher1= poiskEmaik.matcher(emailPool);
        while (matcher1.find()){
            matcher1.group();

            if (matcher1.group().matches("[a-zA-Z0-9-?.]{1,64}@[a-z0-9]{1,32}\\.[a-z0-9]{2,5}")){
                System.out.println(matcher1.group()+" Валидный email");
                bibliotekaEmail.add(matcher1.group());
            }
            else
                System.out.println(matcher1.group()+" Не валидный email");
        }
        System.out.println("------Валидные email:");
        for (int i = 0; i < bibliotekaEmail.size(); i++) {
            System.out.println(bibliotekaEmail.get(i));
        }

        return bibliotekaEmail;
    }

    public static void main(String[] args) {
        Regularka.emailRegularka(emailPool);
    }
}
