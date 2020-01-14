package PersonalInformation;

public class PersonalInformation {

    public static void main(String[]args){

            //Write a program that displays the following information,
            // each on a separate line:
            // Your name,
            // Your address, with city, state, and ZIP
            // Your telephone number
            // Your college major
            // Although these items should be displayed on separate output lines,
            // use only a single println statement in your program.


            String name = "Jamie Lu";
            String address = "1-88 Boland Road";
            String city = "Dartmouth";
            String province = "Nova Scotia";
            String postalCode = "B3A 1R1";
            String phone = "1-902-292-1699";
            String diploma = "Database Administration";

            System.out.println("Personal Info: " +name);
            System.out.println(name + "\n" + address + "\n" + city + "\n" + province + "\n"
                    + postalCode + "\n" + phone + "\n" + diploma);

        }
}