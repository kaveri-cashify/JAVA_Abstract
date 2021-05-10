package Polymorphism.overridding;

    class Parent {

        void Print()
        {
            System.out.println("parent class");
        }
    }

    class subclass1 extends Parent {

        void Print()
        {
            System.out.println("subclass1");
        }
    }

    class subclass2 extends Parent {

        void Print()
        {
            System.out.println("subclass2");
        }
    }

    class TestPolymorphism3 {
        public static void main(String[] args)
        {

            Parent a = new subclass1();
            a.Print();

            Parent b = new subclass2();
            b.Print();
        }
    }

