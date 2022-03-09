package org.carla.fibonacci;

public class Fibonacci {

    int fibonacci(int n)
    {
        int fib;
        if (n>1){
            fib = fibonacci(n-1) + fibonacci(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            fib = 1;
        }
        else if (n==0){  // caso base
            fib = 0;
        }
        else{ //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            fib = -1;
        }

        return fib;
    }

}
