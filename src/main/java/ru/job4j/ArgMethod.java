package ru.job4j;

public class ArgMethod {

        public static void hello(String name, int age) {
            System.out.println("Hello, " + name + ", age = " + age);
        }

        public static void hello(String name) {
            System.out.println("Hello, " + name + ", age = 6");

        }

        public static void hello(int age) {
            System.out.println("Hello, Job4j, " + "age = " + age);

        }

        public static void hello(int age, String name) {
            System.out.println("Hello, " + name + ", age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            ru.job4j.ru.job4j.ArgMethod.hello(name, age);
            ru.job4j.ru.job4j.ArgMethod.hello(age);
            ru.job4j.ru.job4j.ArgMethod.hello(name);
            ru.job4j.ru.job4j.ArgMethod.hello(age, name);

        }
    }


