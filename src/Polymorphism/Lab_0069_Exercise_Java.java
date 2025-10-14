package Polymorphism;

public class Lab_0069_Exercise_Java {

        public static void main(String[] args) {
            Mathoperation m1 = new Mathoperation();

            int r1 = m1.add(5, 4);
            int r2 = m1.add(8, 7, 9);
            double r3 = m1.add(4.15, 4.14);
            String r4 = m1.add("Sufi", " Maldar");

            System.out.println("Addition of two integers: " + r1);
            System.out.println("Addition of three integers: " + r2);
            System.out.println("Addition of two doubles: " + r3);
            System.out.println("Concatenation of two strings: " + r4);
        }
    }

    class Mathoperation {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, double b) {
            return a + b;
        }

        String add(String a, String b) {
            return a + b;
        }
    }


