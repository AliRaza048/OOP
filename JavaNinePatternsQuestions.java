/**
 * JavaNinePatternsQuestions
 */
public class JavaNinePatternsQuestions {

    public static void main(String[] args) {

        //Question 1 = Print the Pattern
                //    *****
                //    *****
                //    *****
                //    *****
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Question 2 = Print the pattern
        //    *****
        //    *   *
        //    *   *
        //    *****
        int n=4;
        int m=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        } 


        //Question 3 = Print the Pattern
                //  *
                //  **
                //  ***
                //  ****
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        //Question 4 = Print the Pattern
                    //  ****
                    //  ***
                    //  **
                    //  *
        //Method 1
        for(int i=1; i<=4; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Method 2
        for(int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        //Quesgtion 5 = Print the pattern
                   //     *
                   //    **
                 //     ***
                 //    **** 
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }    
            System.out.println("");
        }

        //Question 6 = Print the pattern
                //   1
                //   12
                //   123
                //   1234
                //   12345
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }    
            System.out.println("");
        }


        //Question 7 = Print the pattern
                //   12345
                //   1234
                //   123
                //   12
                //   1
        //Method 1
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }

        //Method 2
        for(int i=1; i<=5; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }


        //Question = 8 Print the pattern
                //    1
                //    2  3
                //    4  5  6
                //    7  8  9 10
                //    11 12 13 14 15
        int number=1;    
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+++(" "));
            }   
            System.out.println("");
        }


        //Question 9 = Print the pattern
                // 1
                // 0 1
                // 1 0 1
                // 0 1 0 1
                // 1 0 1 0 1
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                int sum= i+j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }    
            System.out.println("");
        }
    }
}