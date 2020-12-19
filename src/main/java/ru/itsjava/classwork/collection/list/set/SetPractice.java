package ru.itsjava.classwork.collection.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Man> men = new HashSet<>();
        Man andrey = new Man("Andrey");
        Man mark = new Man("Mark");
        System.out.println("mans.add(andrey) = " + men.add(andrey));
        System.out.println("mans.add(andrey) = " + men.add(andrey));

        System.out.println("men.size() = " + men.size());
        men.add(mark);
        System.out.println("men.size() = " + men.size());

        for (Man man : men) {
            System.out.print(man + " ");
        }
        System.out.println();

        Iterator<Man> iterator = men.iterator(); //ctrl + alt + v
        while (iterator.hasNext()) {
            Man next = iterator.next();
            System.out.print(next + " ");
            if (next == mark) {
                iterator.remove();
            }
        }
        System.out.println();


        Set<Man> manSet = Set.of(andrey, mark);
        for (Man man: manSet) {
            System.out.print(man + " ");
        }
        System.out.println();

    }
}
