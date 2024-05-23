package com.selfcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LocalDate> dataCollection = new ArrayList<>();
        dataCollection.add(LocalDate.of(2004, 7, 1));
        dataCollection.add(LocalDate.of(2005, 1, 2));
        dataCollection.add(LocalDate.of(2007, 1, 1));
        dataCollection.add(LocalDate.of(2032, 5, 3));

        DateSorter dates= new DateSorter();

        System.out.println(dates.sortDates(dataCollection));
    }
}
