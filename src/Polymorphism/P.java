package Polymorphism;

    class MultiplyFun {

        int Multiply(int a, int b)
        {
            return a * b;
        }
        int Multiply(int a, int b, int c)
        {
            return a * b * c;
        }

        double Multiply(double a, double b)
        {
            return a * b;
        }
    }

    class Main {
        public static void main(String[] args)
        {
            MultiplyFun multiplyFun = new MultiplyFun();
            System.out.println(multiplyFun.Multiply(2, 3));
            System.out.println(multiplyFun.Multiply(2.5, 3.5));
            System.out.println(multiplyFun.Multiply(2, 3, 4));

        }
    }

