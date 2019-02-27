import java.util.Scanner;
import java.util.Random;
public class Summative1 {
    public static void main(String[] args) {
        //initialize scanner and variables
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String again, answer;
        int random, score;
        do {
            score = 0;
            again = "";
            //create an array with all questions
            String[] questions = {
                "This person looks at code to find weak spots in security, protecting companies and government agencies "
                + "from cyber crime and attacks.\nSometimes refered to as \"white hat hackers\", they typically require " 
                + "a bachelors degree, 5 years of experience and earn around $100K.",
                "This person creates the technical aspect of webpages for companies. They can work on both the front-end " 
                + "and back-end of sites.\nThey use languages like CSS, Javascript and HTML, and don't require formal "
                + "education, however, most companies prefer at least college education. They earn around $60K.",
                "This person designs the physical components of computers. They also perform tests and manage manufacturing "
                + "on their parts.\nFrom designing PCBs, soldering components and putting together CPUs, companies look " 
                + "for those with a bachelors, paying a median salary of $100K.",
                "This person allows computers to connect with one another, upkeeping servers and helping solve techical "
                + "issues.\n They have an understanding of network weaknesses, maintain disk images and more. They earn "
                + "$80K and require a bachelors degree.",
                "This person passes on knowledge of computers and related fields to younger people willing to learn. "
                + "This is the most important job in the world.\nThey are passionate about the field of computer science and "
                + "require going to secondary education after university. They earn from $50K to $100K.",
                "This person creates and tests computer programs. Their work is used in many areas, like business, video "
                + "games, and databases.\nThey mainly design and plan, however they may also do the coding. Companies "
                + "require a bachelors, however, many get a masters, causing most to earn more than $100K.",
                "This person designs applications for use on portable platforms such as phones. They use their skills to "
                + "create games, utilities and transport existing computer applications.\nThey can use IDEs such as Xcode"
                + "and use languages such as java ME. The median salary for this career is $80K, usually requiring a bachelors",
                "This person assists others with their issues related to computers. In a business, they may update computers,"
                + " help workers or upkeep servers. It is also possible for these people to work from home, and answer calls"
                + "remotely. They earn upwards of $60K a year and require a bachelors degree or higher.",
                "This person works in large companies setting up and keep databases full of user information. They"
                + " perform maintenance and upgrade them as needed. Many companies require large databases due to the amount"
                + "of data in the internet, so they are in high demand. They earn $75K and most companies require a bachelors degree.",
                "This person works with artists and designers to program games for the public. They will code for lots of"
                + "technology such as VR, consoles, and many other platforms. While many earn more than $90K a year, there"
                + "are also a large amount of freelancers, working for themselves"
            };
            //create an array with the possible choices
            String[] options = {
                "a. Security Analyst\nb. Network Administrator\nc. IT Support\nd. Hardware Engineer",
                "a. Mobile App Developer\nb. Computer Science Teacher\nc. Web Developer\nd. Database Administrator",
                "a. Hardware Engineer\nb. IT Support\nc. Network Administrator \nd. Software Engineer",
                "a. Database Administrator \nb. Network Administrator\nc. Security Analyst\nd. Web Developer",
                "a. IT Support\nb. Computer Science Teacher\nc. Mobile App Developer\nd. Video Game Programmer",
                "a. Mobile App Developer\nb. Video Game Programmer\nc. Database Administrator\nd. Software Engineer",
                "a. Computer Science Teacher\nb. IT Support\nc. Mobile App Developer\nd. Security Analyst",
                "a. IT Support\nb. Computer Science Teacher\nc. Hardware Engineer\nd. Software Engineer",
                "a. Security Analyst\nb. Mobile App Developer\nc. Web Developer\nd. Database Administrator",
                "a. Network Administrator\nb. IT Support\nc. Video Game Programmer\nd. Computer Science Teacher",
            };
            //create an array with the correct answers
            String[] answers = {"a","c","a","b","b","d","c","a","d","c"};
            System.out.println("Welcome to the Comp Career Cuhwizz (CCC)!");
            System.out.println("In this game, you must correctly guess the career from the prompt given.");
            System.out.println("The answers will be multiple choice. All you must input is the letter (e.g. b).");
            System.out.println("If the input is invalid, it will ask you for input again.\n");
            System.out.println("Before we start, what is your name?");
            //ask user for name and output
            String name = sc.nextLine();
            System.out.println("Hello " + name + "! Let's jump right into it.\n");
            //begin loop for 10 questions
            for (int i = 0; i < 10; i++) {
                do {
                    //create a random number from 0 to 9 (question selector)
                    random = rand.nextInt(10);
                //repeats until a new number is chosen
                } while (questions[random].equals("0"));
                //print question number, question and options
                do {
                    System.out.println("\nQuestion " + (i+1) + ":");
                    System.out.println(questions[random]);
                    System.out.println(options[random]);
                    //decide whether answer is correct, incorrect or invalid
                    System.out.print("Answer: ");
                    answer = sc.next();
                    //correct
                    if (answer.equals(answers[random])) {
                        System.out.println("-[[Correct! You have gained one point.]]-\n");
                        //increment score
                        score++;
                    //incorrect
                    } else if (answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")) {
                        System.out.println("-[[Whoops, wrong answer! The correct answer is " + answers[random] + ". Moving on...]]-\n");
                    //invalid
                    } else {
                        System.out.println("Error! Invalid answer!! Please only use a,b,c or d");
                    }
                //repeats until answer is valid (a,b,c,d)
                } while (!(answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d")));
                //sets the question to value "0", marking it as already done
                questions[random] = "0";
            }
            //game over message and score
            System.out.println("That's it for the game! Your final score was: " + score + ". " + score + "0%. Not bad!");
            //asks user if they want to play again
            do {
                System.out.println("Would you like to play again? (Enter Y or N)");
                again = sc.next();
                //prints if not valid
                if (!(again.equalsIgnoreCase("Y") || again.equalsIgnoreCase("N"))) {
                    System.out.println("Invalid. Please enter Y or N");
                }
            //repeats until input is Y or N (valid)    
            } while (!(again.equalsIgnoreCase("Y") || again.equalsIgnoreCase("N")));
        //repeats if Y
        } while (again.equals("Y"));
        sc.close();
        System.out.println("Thank you for playing on Computer Career Cuhwizz! Come again!");
    }
}
