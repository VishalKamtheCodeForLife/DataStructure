package com.example.department;

@FunctionalInterface
interface DoitInterface {
    void doit();
}

@FunctionalInterface
interface DoitAgainInterface {
    void doit(int a, int b);
}

class DoitClass{
    public static void main(String[] args) {

        DoitInterface d = () ->{
                System.out.println("Functional Interface");
            };
        d.doit();
        DoitAgainInterface d1=(int a, int b) ->{
                System.out.println("Sum is: "+ (a+b));
        };
        d1.doit(1,2);
    }
}