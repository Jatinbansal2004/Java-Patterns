import java.util.*;

public class Javapatterns {
    public static void Hollow_rectangle(int rows, int cols) {
        // outer loop runs 4 times[Rows]
        for( int i = 1; i <= rows; i++) {
            // inner loop ( cell- [i,j] )
            for( int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // for next line after completing a row
        }
    }
    public static void Inverted_Rotated_Half_Pyramid(int n) {
        // outer loop runs 4 times[Rows]
        for( int i = 1; i <= n; i++) {
            // for spaces    space = n-i
            for( int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // for stars    stars = i
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }   
            System.out.println(); // for next line after completing a row
        }
    }
    public static void Inverted_Number_Triangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Floyd_Triangle(int n) {
        int number = 1;
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void Zero_One_Triangle(int n) {
        for( int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }

    public static void Butterfly(int n) {
        // 1st Half
        for(int i = 1; i<=n; i++) {
            // stars
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for(int j =1; j<= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        // 2nd Half
        for(int i=n; i>=1; i--) {
             // stars
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for(int j =1; j<= 2*(n-i); j++) {
                System.out.print("  ");
            }
            // stars
            for(int j = 1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

           
    }
    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces  n-i logic
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }

            // Stars   j <= n
            for( int j = 1; j <= n; j++) {
                System.out.print(" *");

            }
            System.out.println();
        }
    }
    public static void Hollow_Rhombus(int n) {
        // outer loop
        for(int i = 1; i<= n; i++) {
            // Spaces  logic- j<=n-i
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Stars 
            for(int j =1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n) {
        // 1st Half
        for(int i = 1; i <= n; i++) {
            // spaces j <= n-i
            for(int j =1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // stars j <= 2i-1
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
        // 2nd Half
        for(int i=n; i>=1; i--) {
             // spaces j <= n-i
             for(int j =1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // stars j <= 2i-1
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Number_Pyramid(int n) {
        for(int i =1; i<=n; i++) {
            // spaces  j<=n-i
            for(int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            // number
            for(int j = 1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void Palindrome_Triangle(int n) {
        // outer loop
        for(int i = 1; i <=n; i++) {
            // spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Number desecending order loop
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Number Ascending Order
            for( int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
     }
     
    public static void main(String[] args) {
       Butterfly(4);
       Palindrome_Triangle(5);
    }
}