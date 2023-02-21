import java.util.Scanner;

public class deneme
{
        public static void main(String[] args)
        {
                String f = "fizz", b = "buzz", fb = "fizzbuzz";
                int counter = 0;
                String input;
                Scanner read = new Scanner(System.in);

                System.out.println("Start counting \"1-2-fizz-4-buzz...\" ");

                while(true)
                {
                        counter++;
                        if(counter % 3 == 0 && counter % 5 == 0)
                        {
                                System.out.print("=> ");
                                input = read.nextLine();
                                if(!fb.equalsIgnoreCase(input))
                                {
                                        System.out.println("\nWrong answer!!\nIt should be => " + fb);
                                        break;
                                }
                        }
                        else if(counter % 3 == 0)
                        {
                                System.out.print("=> ");
                                input = read.nextLine();
                                if(!f.equalsIgnoreCase(input))
                                {
                                        System.out.println("\nWrong answer!!\nIt should be => " + f);
                                        break;
                                }
                        }
                        else if(counter % 5 == 0)
                        {
                                System.out.print("=> ");
                                input = read.nextLine();
                                if(!b.equalsIgnoreCase(input))
                                {
                                        System.out.println("\nWrong answer!!\nIt should be => " + b);
                                        break;
                                }
                        }
                        else
                        {                
                                System.out.print("=> ");
                                input = read.nextLine();
                                // if the input is not an integer these codes help to detect it.
                                try                                                                             
                                {
                                        if(Integer.parseInt(input) != counter)
                                        {
                                                System.out.println("\nWrong answer!!\nIt should be => " + counter);
                                                break;
                                        }       
                                }
                                catch(NumberFormatException e)
                                {
                                        System.out.println("\nWrong answer!!\nIt should be => " + counter);
                                                break;
                                }
                        }

                }
                read.close();
        }
}
