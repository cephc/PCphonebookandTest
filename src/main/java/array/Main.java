package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(5.06);
        numbers.add(938.2);
        numbers.add(654.92);
        numbers.add(3.0);

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.set(1, 8.5));
        System.out.println(numbers.remove(2));

        //for loop
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        //for each loop
        for (Double looping : numbers){
            System.out.println(looping);
        }
        //creating array from another collection
        List<Double> firstTwoNumbers = new ArrayList<>();
        firstTwoNumbers.add(5.0);
        firstTwoNumbers.add(4.0);
        firstTwoNumbers.add(3.0);
        firstTwoNumbers.add(2.0);
        firstTwoNumbers.add(1.0);

        List<Double> nextThree = new ArrayList<>(firstTwoNumbers);
        System.out.println(nextThree);

        nextThree.add(6.0);
        nextThree.add(7.0);
        nextThree.add(8.0);

        nextThree.addAll(nextThree);

        System.out.println(nextThree);

        Iterator<Double> numbersIterator = numbers.iterator();

        while(numbersIterator.hasNext()){
            Double returnIt = numbersIterator.next();
            System.out.println(returnIt);
        }

        ArrayList<Integer> oddsAndEvens= new ArrayList<>();

        oddsAndEvens.add(10);
        oddsAndEvens.add(1);
        oddsAndEvens.add(11);
        oddsAndEvens.add(1101);
        oddsAndEvens.add(6);

        Iterator<Integer> oddsAndEvensIterator = oddsAndEvens.iterator();
        while(oddsAndEvensIterator.hasNext()){
            Integer returnIt = oddsAndEvensIterator.next();
            if (oddsAndEvensIterator.next() % 2 != 0) {
                oddsAndEvensIterator.remove();
            }
            System.out.println(returnIt);
        }
    }
}
