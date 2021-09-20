//Working of Loop in Java
// Program to print a text 5 times

class Main {
  public static void main(String[] args) {

    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println("Java is fun");
    }
  }
}

// Program to print numbers from 1 to 5

class Main {
  public static void main(String[] args) {
  
    int n = 5;
    // for loop  
    for (int i = 1; i <= n; ++i) {
      System.out.println(i);
    }
  }
}

// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 1000;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
      sum += i;     // sum = sum + i
    }
       
    System.out.println("Sum = " + sum);
  }
}
