import java.util.Scanner;

public class treePrinter {

    public static void printStars(int number) {
        // This method prints the stars representing the branches
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // This method prints empty spaces so that the branches are properly positioned
        int i = 1;
        while (i <= number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void christmasTree(int height) {
        // The tree is composed of a triangle of dimension 'height' over a 2x3 rectangle representing the base of the tree. 

        int i = 1;
        int halfWidth = height;
        while (i <= height) {
            printSpaces((halfWidth - i)); //Spaces are added so that there is the right distance from the left margin of the terminal.
            printStars(2 * i - 1); //The more we go towards the base, the more spaces decrease and stars increase.
            i++;
        }
        //This part prints the base of the tree once the loop is over. 
        //printSpaces() has the width as a parameter, so that the base of the tree is always centralized.
        printSpaces(halfWidth - 2);
        printStars(3);
        printSpaces(halfWidth - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big should the tree be? Please write an integer bigger then 1");
        int input = scanner.nextInt();
        christmasTree(input);

    }
}
