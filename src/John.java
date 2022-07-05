import java.util.Scanner;

public class John {

	public static void main(String[] args) {
		
			class AsciiChars
		{
		    public static void printNumbers()
		    {
		        for(char i='0';i<='9';i++){
		            System.out.print((int)i+" ");
		        }
		        System.out.println();
		    }
		    
		    public static void printLowerCase()
		    {
		        
		        for(char i='a';i<'z';i++){
		            System.out.print((int)(i)+" ");
		        }
		        System.out.println();
		    }
		    
		    public static void printUpperCase()
		    {
		        for(char i='A';i<'Z';i++){
		            System.out.print((int)(i)+" ");
		        }
		        System.out.println();
		    }
		};

		class Main
		{
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				AsciiChars.printNumbers();
		        AsciiChars.printUpperCase();
		        AsciiChars.printLowerCase();
		        System.out.println("Please Enter your name: "); 
		        String name = sc.next();
		        System.out.println("Hello " + name);
		        System.out.println("Do you want to continue the interactive part: ");
		        String ans = sc.next();
		        if(ans.equals("yes") || ans.equals("y")){
		            while(true){
		                System.out.println("Please answer the following questions:");
		                System.out.println("Q1. Do you have a red car? (yes,no)");
		                sc.nextLine();
		                String r = sc.nextLine();
		                System.out.println("Q2. What is the name of your favourite pet?");
		                String pet = sc.nextLine();
		                System.out.println("Q3. What is the age of your favourite pet?");
		                int age = sc.nextInt();
		                System.out.println("Q4. What is your lucky number?");
		                int lucky = sc.nextInt();
		                System.out.println("Q5. What jersey number your favourite Quarterback wears? (Type 0 if you dont follow football)");
		                int jersey = sc.nextInt();
		                System.out.println("Q6. What is two-digit model year of your car?");
		                int model = sc.nextInt();
		                System.out.println("Q7. What is the first name of the your favorite actor or actress?");
		                sc.nextLine();
		                String actor = sc.nextLine();
		                System.out.println("Q8. Enter a random number between 1 and 50");
		                int rand = sc.nextInt();
		                int magic;
		                if(jersey == 0){
		                    magic = lucky * rand;
		                    while(magic>75){
		                        magic -= 75;
		                    }
		                }else{
		                    magic = jersey * rand;
		                    while(magic>75){
		                        magic -= 75;
		                    }
		                }
		                int arr[] = new int[5];
		                arr[0] = jersey + age + lucky;
		                arr[1] = age + model;
		                arr[2] = 42;
		                arr[3] = model + lucky;
		                arr[4] = (int)actor.charAt(0);
		                
		                for(int i=0;i<5;i++){
		                    while(arr[i]>65){
		                        arr[i] -= 12;
		                    }
		                }
		                Arrays.sort(arr);
		                for(int i=0;i<4;i++){
		                    if(arr[i]==arr[i+1]){
		                        arr[i+1] = arr[i+1] - 7;
		                    }
		                }
		                Arrays.sort(arr);
		                System.out.println("Lottery Numbers: " + arr[0] + " ,"+arr[1]+" ,"+arr[2]+" ,"+arr[3]+" ,"+arr[4]+" Magic Ball: "+magic);
		                System.out.println("Do you want to answer the questions again? Y/N");
		                String choice = sc.next();
		                if(choice.equals("Y"))
		                    continue;
		                else{ 
		                    System.out.println("Thank you for your time :)");
		                    break;
		                }
		            }
		        }else{
		            System.out.println("Please return later to complete the survey");
		        }
			}
		}


	}

}
