package OOP.Doubles;

import java.util.Random;

//CLASS
public class Die {
        int value;

        public void roll (){
            Random random = new Random();
            value = random.nextInt(6) + 1;
        }

    }
