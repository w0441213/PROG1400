package OOP.Excuse;

import java.util.Random;

public class Excuse {

    public static void generateExcuse(String teacher, String day) {

        String[] excuses = {
                "my dog ate my homework",
                "aliens kidnapped my baby sister",
                "I was stuck in time paradox",
                "my new calendar didn't come with " + day,
                "I just came out of a Cheetos coma"
        };

        Random random = new Random();
        int excuseNum = random.nextInt(excuses.length);

        System.out.println("Dear " + teacher + ",");
        System.out.println();
        System.out.println("I was unable to hand in my homework,");
        System.out.println("on " + day + ", as " + excuses[excuseNum] + ".");
        System.out.println();
        System.out.println("Best Regards,");
        System.out.println("Stew Dent");
    }

    public static void main(String[] args) {

        String teacher = "Brian Shewan";
        String day = "Tuesday";
        generateExcuse(teacher, day);

        // outputs the following

        // Dear <teacher>,
        //
        //    I was unable to hand in my homework,
        //    on <day>, as I was <excuse>.
        //
        // Best Regards,
        // Stew Dent

    }

}