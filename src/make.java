import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class make {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        //Random random = new Random();
        boolean done = false;
/*
        for (int i = 0; i < 12; i++) {
            int randomInteger = random.nextInt(13) + 18;
            list.add(randomInteger);
        }

 */
        System.out.println(" ");
        System.out.println("There is nothing in this array list, please add something to the list before using the delete option.");
        do {


            Scanner in = new Scanner(System.in);
            String prompt = "Which operation do you want to carry out on the list: A - add, D - delete, P - preview, Q - quit";

            String userInput = SafeInput.getRegExString(in, prompt, "[AaDdPpQq]");


            userInput = userInput.toUpperCase();
            switch (userInput) {
                case "A":
                    add(list);
                    display(list);
                    break;
                case "P":
                    display(list);
                    break;
                case "D":
                    delete(list);
                    display(list);
                    break;
                case "Q":
                    done = SafeInput.getYNConfirm(in,"Are you sure you want to quit?");
                    break;
                default:
                    System.out.println("Invalid operation value entered!");
            }
        } while (!done);
        display(list);


    }
/*
    private static void exit(ArrayList<String> list) {

    }
*/
    private static void display(ArrayList<String> list) {
        System.out.println("Here is a new preview of the array list.");
        System.out.println("**********************************************************************");
        int counter = 0;
        for (String value : list) {
            System.out.printf("%d %s ",counter, value);
            counter++;
        }
        System.out.println("\n**********************************************************************");


    }

    private static void delete(ArrayList<String> list) {

        Scanner del = new Scanner(System.in);
        int remove = SafeInput.getRangedInt(del,"Please select the index you would like to delete.",0,(list.size()-1));
        list.remove(remove);

    }

    private static void add(ArrayList<String> list) {

        System.out.println(" ");
        System.out.println("What would you like to add to the list?");
        Scanner ad = new Scanner(System.in);


        String userAdd = "";
        if (ad.hasNext()) {

            userAdd = ad.nextLine();

        }
        else {

            System.out.println("You entered an incorrect string value: " + userAdd + " Please try again.");

        }
        list.add(userAdd);



    }
}






