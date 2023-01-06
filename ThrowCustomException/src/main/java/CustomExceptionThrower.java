import java.util.Scanner;

public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     * @throws CustomException
     */
    public void throwCustomException(){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number between 1 and 10: ");

            try{
            int num = sc.nextInt();
            if (num < 1 || num > 10) {
                throw new CustomException();
            }
            }catch (CustomException ce){
                System.out.println(ce.getMessage());
            }
        }    
    }
}




    


