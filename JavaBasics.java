import java.util.*;


public class JavaBasics {
    public static void main(String[] args) {
        //declaringg variables :
//         int a=10;
//         int b=5;
//         System.out.println(a);
//         System.out.println(b);
//         String name="Tony Stark";
//         System.out.println(name);
//         a=50;
//         System.out.println(a);
//         a=b;
//         System.out.println(a);
//     }
    
// }

// different data types:

// byte b=8;
// System.out.println(b);
// char ch='a';  //single character 
// System.out.println(ch);
// boolean var=false;
// float price=2.55;
// int number=25;
// //long
// //double  
// short n=240;
//     }
// }


// sum of two numbers:

// int a=10;
// int b=5;
// int sum =a+b;
// System.out.println(sum);  
//     }
// }


// single line comment :

/* this is multiline comment
 in this we can store multiple lines  
 it increases the readability of code ;

*/
 

// IF ELSE STATEMENT USING IN JAVA:
// int age=22;
// if(age>=18){
//     System.out.println(("you are adult ,u can vote and drive"));
// }
// if(age>13 && age<18){
//     System.out.println(("you are teenager"));
// }
// else {
//     System.out.println((" you are not adult"));

// }
//     }
// }


// PRINT THE LARGEST NUMBER:USING CONDITIONAL STATEMENT:

// int A=1;
// int B=5;
// if(A>B){
//     System.out.println("A is greater than 2");
// }else{
//     System.out.println("B is greater than A");
// }
// // }
// // }

// // PRINT IF A NUMBER IS ODD OR EVEN:
// Scanner sc=new Scanner(System.in);
// int number=sc.nextInt();
// // if(number%2==0){
// //     System.out.println("number is even ");
// // }
// // else{
// //     System.out.println("number is odd");
// // }
// //     }
// // }

// // ELSE IF STATEMENT:
// // int age=13;

// // if(age>=18){
// //     System.out.println("Adult");
// // }
// // else if (age>=13 && age<18){
// //     System.out.println("teeneger");
// // }
// // else {
// //     System.out.println("child");
// // }
// //     }
// // }

// // INCOME TAX CALCULATOR:
// Scanner sc=new Scanner(System.in);
// int income=sc.nextInt();
// int tax;

// if(income < 500000){
//     tax=0;
// }

// else if (income >= 500000 && income < 1000000){
//     tax=(int)(income*0.2);
// }
// else{
//     tax=(int)(income*0.30);
// }
// System.out.println("your tax is :" + tax);
//     }
//}

// //Print the largest of 3:
// int A=7,B=9,C=6;
// if((A>=B) && (A>=C)){
//     System.out.println("A is the largest ");
// }
// else if(B>=C){
//     System.out.println(("B is the largest "));

// }
// else{
//     System.out.println("C is the largest");

// }
//     }
// }

// TERNARY OPERATOR :
// int number=5;
//  String type=(number%2==0)?"even":"odd";
//  System.out.println(type);
//     }
// }

// CHECK IF A STUDENT WILL PASS OR FAIL:using ternary operator ,

// int marks=32;
// String result=(marks>33)?"Pass":"Fail";
// System.out.println(result);
// }
// }
 
// SWITCH STATEMENT :
// int number=6;
// switch(number){
// case 1:
//     System.out.println("samosa");
//     break;
// case 2:
// System.out.println("burger");
// break;
// case 3:
// System.out.println("pizza");
// break;
// case 4:System.out.println("we wake up");
// break;
// default:System.out.println("dont eat too much");
// }
// }


// CALCULATOR:
Scanner sc=new Scanner(System.in);
System.out.println("enter a:");
int a=sc.nextInt();
System.out.println("enter b:");
int b=sc.nextInt();
System.out.println("enter operator:");
char operator=sc.next().charAt(0);

switch(operator){
case '+':
    System.out.println("sum is:"+(a+b));
    break;
case '-':
    System.out.println("difference is:"+(a-b));
    break;
case '*':
    System.out.println("product is:"+(a*b));
    break;
case '/':
    System.out.println("division is:"+(a/b));
    break;
case '%':
    System.out.println("modulus is:"+(a%b));
    break;
default:
    System.out.println("invalid operator");
    break;
}
    }
}




