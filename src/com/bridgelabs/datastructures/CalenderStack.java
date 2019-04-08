package com.bridgelabs.datastructures;

import com.bridgelabs.functionalutil.AlgorithmUtil;
import com.bridgelabs.functionalutil.FunctionalUtil;
import com.bridgelabs.functionalutil.QueueLinkedList;
import com.bridgelabs.functionalutil.StackLinkedList;

public class CalenderStack {
        /*
        * The main function is to take the input from the user 
        * and printing the calendar by using queue and stacks 
       m */
        public static void main(String[] args) {
            int month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December" };
            int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (month==2 && FunctionalUtil.Checkyear(year)) {
                days[month] = 29;
            }
            System.out.println("\t\t " + months[month] + " " + year);
            System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
            int dayofWeek = AlgorithmUtil.dayOfWeek(1, month, year);
            StackLinkedList<QueueLinkedList<Integer>> stack=new StackLinkedList<>();
            QueueLinkedList<Integer> refqueue=new QueueLinkedList<>();
            for (int i = 1; i <= days[month]; i++) {
                refqueue.insert(i);
                if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
                    stack.push(refqueue);
                    refqueue=new QueueLinkedList<Integer>();
                    continue;
                }
            }    
            for (int i = 0; i < dayofWeek; i++)
                System.out.print("\t");
            int size = stack.getSize();
            StackLinkedList<QueueLinkedList<Integer>> stackNew = new StackLinkedList<>();
            
            for(int i=0; i < size; i++){
                stackNew.push(stack.pop());
            }

            for (int i = 0; i < size; i++) {
                QueueLinkedList<Integer> week = stackNew.pop();
                for (int j = 0; j < week.getSize(); j++) {
                    System.out.print(week.remove() + "\t");
                }
                System.out.println();
}}}