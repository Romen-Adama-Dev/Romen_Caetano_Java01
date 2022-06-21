package pk.edu.pk.erasmus.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1º Exercise
        System.out.println("|___________________________|");
        System.out.println("This is the Third point");

        System.out.println("Hello World form Java!");

        System.out.println("|___________________________|");
        System.out.println("This is the Fifth point");
        int x = 100;
        short y = 2;
        float z = (float) (5.0 + (10 / 7));
        boolean verdad = true;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(verdad);

        System.out.println("|___________________________|");
        System.out.println("This is the Sixth point");


        Scanner lec = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = lec.nextInt();

        if (age > 18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Can't vote");
        }

        System.out.println("|___________________________|");
        System.out.println("This is the Seventh point");

        String n;
        Scanner lecSize = new Scanner(System.in);
        System.out.println("Choose Size: 1, 2, 3, 4, 5");
        int size = lecSize.nextInt();

        switch (size){

            case 1:
                n = "Very Small";
                System.out.println(n);
                break;

            case 2:
                n = "Small";
                System.out.println(n);
                break;

            case 3:
                n = "Medium";
                System.out.println(n);
                break;

            case 4:
                n = "Big";
                System.out.println(n);
                break;

            case 5:
                n = "Extra Large";
                System.out.println(n);
                break;

            default:
                System.out.println("Wrong size, please choose again");
                break;

        }

    }

}
