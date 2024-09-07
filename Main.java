import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your education: ");
        String education = scanner.nextLine();

        System.out.println("Enter your experience: ");
        String experience = scanner.nextLine();

        System.out.println("Enter your skills: ");
        String skills = scanner.nextLine();

        Resume resume = new Resume(name, email, phoneNumber, education, experience, skills);

        resume.displayResume();

        scanner.close();
    }
}
