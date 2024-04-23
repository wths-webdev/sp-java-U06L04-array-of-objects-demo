// Now let’s look at the driver class (the class with the main method) to
// see how we can work with the array of objects.
import java.util.Scanner;
public class Santa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // array of Kids, default of null!
        Kid[] myKids = new Kid[5];

        // fill the Kids array with kids
        for(int i =0; i < myKids.length; i++){
            System.out.println("Enter a first name:");
            String first = input.next();
            myKids[i] = new Kid(first)	;

            // note if Kid is naughty or nice
            // remember nice attribute is set to true by default
            System.out.println("Add " + first + " to (1)Naughty List or (2)Nice List?");
            int choice = input.nextInt();
            if(choice == 1){
                myKids[i].setNice(false);
            }
        }
        // create santa's list with the Kids
        SantaList hohoho = new SantaList(myKids, false, false);

        Kid[] christmasList = hohoho.getChildren();
        System.out.println("\nSanta's List:");
        for(int k=0; k< christmasList.length; k++){
            System.out.print(k + 1 + " " + christmasList[k].getFirstName());
            if(christmasList[k].getNice() == true){
                System.out.println(" nice");
            } else {
                System.out.println(" naughty");
            }
        }
        hohoho.setReadTheList(true);

        boolean done = false; //flag variable, controls the loop while(!done){
        while(!done){
            System.out.print("Is there a kid who needs to change lists? If so, enter their number. ");
            System.out.println("If you are done, enter in any number not listed.");
            int numEntered = input.nextInt() - 1;
            if(numEntered < christmasList.length && numEntered >= 0){
                boolean what = christmasList[numEntered].getNice();
                hohoho.changeChild(numEntered, !what);

            } else {
                done = true;
            }
        }

        // print the list one last time (good candidate for a method...)
        System.out.println("\nSanta's List:");
        for(int k=0; k< christmasList.length; k++){
            System.out.print(k + 1 + " " + christmasList[k].getFirstName());
            if(christmasList[k].getNice() == true){
                System.out.println(" nice");
            } else {
                System.out.println(" naughty");
            }
        }
        hohoho.setCheckedItTwice(true);
    }
}

