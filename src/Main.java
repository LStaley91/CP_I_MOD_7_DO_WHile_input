import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int favNum = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;

        double itemPrice =0;
        double totalPrice = 0;
        double averagePrice =0;
        int numItems = 0;
        String anotherYN = "";

        int grade = -1;
        int totalGrades = 0;
        int numGrades = 0;
        double averageGrade = 0;
        final int SENTINAL = -1;


        do {
            // FAV NUMBER 1-10
            System.out.println("Enter your fa num [1-10]: ");
            if (in.hasNextInt())
            {
                favNum = in.nextInt();
                in.nextLine(); // c;ear the newline form buffer
                if (favNum >= 1 && favNum <= 10)
                {
                    System.out.println("\nYou said your fav num is" + favNum);
                    done = true;
                }
                else
                {
                    System.out.println("\nYou said your fav num is" + favNum + "But that is out of the range");
                }
            }
            else  // dont have an int
            {
                trash = in.nextLine();
                System.out.println("Yo u must enter an integer not " + trash);
            }

        }while (!done);
        //get a series of prices simulated a shopping basket
        // calculate the total , the average and the number of items

        done = false; // reset the done control cariable to sue again

        do
        {
            System.out.println("Enter the cost of your item: ");
            if (in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine();

                totalPrice += itemPrice; //totalPrice = totalprice + item price
                numItems++;

                // do u have another
                System.out.print("Do u have more items Y/N: ");
                anotherYN = in.nextLine();

                if (anotherYN.equalsIgnoreCase("N"))
                {
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("you must enter a valid number not "+trash);
            }
        }while(!done);
        averagePrice = totalPrice / numItems;

        System.out.println("You have a total of " + numItems + " Items.");
        System.out.println("You have a total cost of " + totalPrice);
        System.out.println("You have an average price of " + averagePrice);

        //Sentinal
        done = false;
        do
        {
            System.out.println("Enter your grades [0-100] or -1 to quit");
            if(in.hasNextInt())
            {
                grade = in.nextInt();
                in.nextLine(); // clear buffer
                if(grade == -1)
                {
                    done = true;
                }
                else if(grade >= 0 && grade <= 100)
                {
                    totalGrades += grade; // totalGrades = totalGrades + grade
                    numGrades++;
                }
                else /// int that is out of range
                {
                    System.out.println("Grade value is out of range must be [0-100] You: " + grade);
                }
            }
            else //not an int
            {
                trash = in.nextLine();
                System.out.println(" You must enter a Valid int [0-100] or -1");
            }
        }while(!done);

        averageGrade = totalGrades / numGrades;

        System.out.println("You have a total of " + numGrades + " grades.");
        System.out.println("You have a total of " + totalGrades);
        System.out.println("You have an average grade of %8.2f"+ averageGrade);

        //For Loop
        for (int x=0; x<10; x++)
        {
            System.out.println("loop "+ x);
            System.out.println("Hello "+ x);
        }
        for(int x=0; x<=10; x++)
        {
            System.out.println(x);
        }
        for(int l=0; l<3; l++)
        {
            System.out.println();
        }
        for(int x=10; x>=0; x--)
        {
            System.out.println(x);
        }
        int reps = in.nextInt();
        for (int x=1; x<= reps; x++)
        {
            System.out.println("Re: "+ x);
        }
/*
        int rndA = rnd.nextInt(6)+1;
        int rndB = rnd.nextInt(6)+1;

        while (rndA = rnd.nextInt(6)+1
        {
             rndA = rnd.nextInt(6)+1;
             rndB = rnd.nextInt(6)+1;
            System.out.printf("\n%3d%3d", rndA, rndB);
        }
        System.out.println();

        for(int r= 1; r<=5; r++)
        {

        }
*/
    }
}