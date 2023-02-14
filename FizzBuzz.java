import java.util.Scanner;

public class FizzBuzz
{
        public static void main(String[] args)
        {
                String f = "fizz", b = "buzz", fb = "fizzbuzz";
                int numberEntry, counter = 0;
                String entry;
                Scanner read = new Scanner(System.in);

                System.out.println("Start counting \"1-2-fizz-4-buzz...\" ");

                while(true)
                {
                        counter++;
                        if(counter % 3 == 0 && counter % 5 == 0)
                        {
                                read.nextLine();
                                // The purpose of the top line is that if an integer is taken in the previous counter, \n is formed and \n is swallowed by the above line.

                                System.out.print("=> ");
                                entry = read.nextLine();
                                if(!fb.equalsIgnoreCase(entry))
                                {
                                        System.out.println("\nWrong entry!!\nIt should be => " + fb);
                                        break;
                                }
                        }
                        else if(counter % 3 == 0)
                        {
                                if((counter - 1) % 5 != 0) 
                                // The reason for the above condition is that if the counter before it is a multiple of five, there is no need for the line that swallows the \n below (example: 20 (multiple of 5) before 21 (multiple of 3)).
                                        read.nextLine();   

                                System.out.print("=> ");
                                entry = read.nextLine();
                                if(!f.equalsIgnoreCase(entry))
                                {
                                        System.out.println("\nWrong entry!!\nIt should be => " + f);
                                        break;
                                }
                        }
                        else if(counter % 5 == 0)
                        {
                                if((counter - 1) % 3 != 0)
                                // The reason for the above condition is that if the counter before it is a multiple of three, there is no need for the line that swallows the \n below (for example, 9 (multiple of 3) before 10 (a multiple of 5)).
                                        read.nextLine();

                                System.out.print("=> ");
                                entry = read.nextLine();
                                if(!b.equalsIgnoreCase(entry))
                                {
                                        System.out.println("\nWrong entry!!\nIt should be => " + b);
                                        break;
                                }
                        }
                        else
                        {                
                                System.out.print("=> ");
                                numberEntry = read.nextInt();
                                if(numberEntry != counter)
                                {
                                        System.out.println("\nWrong entry!!\nIt should be => " + counter);
                                        break;
                                }
                        }

                }
                read.close();
        }
}