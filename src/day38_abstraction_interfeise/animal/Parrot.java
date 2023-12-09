package day38_abstraction_interfeise.animal;

import day38_abstraction_interfeise.language.Language;

public class Parrot extends Bird implements Flyable, Language {


        public void eat(){
            System.out.println("Parrots each with their beaks");
        }

        public void fly() {
            System.out.println("Parrot is flying");
        }

        @Override
        public void hi() {
            System.out.println("HI HI");
        }

        @Override
        public void bye() {
            System.out.println("BYE BYE");
        }
    }