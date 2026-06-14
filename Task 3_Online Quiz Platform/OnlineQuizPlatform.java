import java.util.Scanner;

public class OnlineQuizPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== ONLINE QUIZ PLATFORM =====");

        // Question 1
        System.out.println("\nQ1. Which language is used for Android Development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. PHP");

        int answer1 = sc.nextInt();

        if(answer1 == 1) {
            score++;
        }

        // Question 2
        System.out.println("\nQ2. Which company developed Java?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");

        int answer2 = sc.nextInt();

        if(answer2 == 2) {
            score++;
        }

        // Question 3
        System.out.println("\nQ3. Java is a?");
        System.out.println("1. Database");
        System.out.println("2. Operating System");
        System.out.println("3. Programming Language");
        System.out.println("4. Browser");

        int answer3 = sc.nextInt();

        if(answer3 == 3) {
            score++;
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/3");

        sc.close();
    }
}
