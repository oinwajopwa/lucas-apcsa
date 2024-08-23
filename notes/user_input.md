User Input

To get user input you need to impor the scanner class. Additonally, you need to initualize the scanner class in the following method: 

```import java.util.Scanner

```java 
Scanner userInput = new Scanner(System.in);
int age = userInput.nextInt();
String name = userInput.nextLine();
```

The parseInt() function parses a string argument and returns an integer of the specified radix (the base in mathematical numeral systems).