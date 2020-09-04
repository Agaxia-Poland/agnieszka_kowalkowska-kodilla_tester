//package com.kodilla.stream.homework;
//
//import java.time.LocalDate;
//import java.util.stream.Collectors;
//
//public class TaskManager {
//
//    public static void main(String[] args) {
//        TaskRepository.getTasks()
//                .stream()
//                .filter(task -> task.getDeadline().equals(2020-9-20))
//                .map(task -> task.getOpened())
//                .collect(Collectors.toList());
//                System.out.println();
//
//    }
//
//    public static LocalDate getDeadline(){
//        LocalDate myDate = LocalDate.of(2019, 11, 20);
//        LocalDate currentDate = LocalDate.now();
//        return myDate;
//    }
//}

//Klasę TaskManager z metodą main, w której przy pomocy Stream
// oraz operacji filtrowania i transformacji utworzona zostanie
// lista List<LocalDate> zawierająca daty deadline wszystkich zadań,
// których data deadline jeszcze nie upłynęła.
