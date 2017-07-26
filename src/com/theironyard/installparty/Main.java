package com.theironyard.installparty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Main{

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
            Student Ronnie = new Student("Ronnie", "Bivens", 121, 1);
                students.add(Ronnie);
            Student Bobby = new Student("Bobby", "Brown", 122, 1);
                students.add(Bobby);
            Student Ricky = new Student("Ricky", "Bell", 123, 1);
                students.add(Ricky);
            Student Mike = new Student("Mike", "Bivens", 124, 1);
                students.add(Mike);
            Student Ralph = new Student("Ralph", "Tresvant", 125, 1);
                students.add(Ralph);

            Student Beyonce = new Student("Beyonce", "Knowles", 131, 1);
                students.add(Beyonce);
            Student Kelly = new Student("Kelly", "Rowland", 132, 1);
                students.add(Kelly);
            Student Michelle = new Student ("Michelle", "Williams", 133, 1);
                students.add(Michelle);
            Student LeToya = new Student("LeToya", "Luckett", 134, 1);
                students.add(LeToya);
            Student LeTavia = new Student("LeTavia", "Roberson", 135, 1);
                students.add(LeTavia);

            Student Michael = new Student("Michael", "Jackson", 141, 1);
                students.add(Michael);
            Student Randy = new Student("Randy", "Jackson", 142, 1);
                students.add(Randy);
            Student Jermaine = new Student("Jermaine", "Jackson", 143, 1);
                students.add(Jermaine);
            Student Tito = new Student("Tito", "Jackson", 144, 1);
                students.add(Tito);
            Student Marlon = new Student("Marlon", "Jackson", 145, 1);
                students.add(Marlon);


        ArrayList<Teacher> teachers = new ArrayList<>();
            Teacher Brooke = new Teacher("Brooke", "Payne", 128, 1);
                teachers.add(Brooke);
            Teacher Matthew = new Teacher("Matthew", "Knowles", 138,1);
                teachers.add(Matthew);
            Teacher Joseph = new Teacher("Joseph", "Jackson", 148, 1);
                teachers.add(Joseph);


        Set<Student> newEdition = new HashSet<>();
            newEdition.add(Ronnie);
            newEdition.add(Bobby);
            newEdition.add(Ricky);
            newEdition.add(Mike);
            newEdition.add(Ralph);

        Set<Student> destinysChild = new HashSet<>();
            destinysChild.add(Beyonce);
            destinysChild.add(Kelly);
            destinysChild.add(Michelle);
            destinysChild.add(LeToya);
            destinysChild.add(LeTavia);

        Set<Student> jacksonFive = new HashSet<>();
            jacksonFive.add(Michael);
            jacksonFive.add(Randy);
            jacksonFive.add(Jermaine);
            jacksonFive.add(Tito);
            jacksonFive.add(Marlon);


        Map<Teacher, Set>  classes = new HashMap<>();
            classes.put(Brooke, newEdition);
            classes.put(Matthew, destinysChild);
            classes.put(Joseph, jacksonFive);

            for(Teacher teach: classes.keySet()){
                System.out.println(teach);
            }

            for(Set pupils: classes.values()){
                System.out.println(pupils);
            }

    }
}
