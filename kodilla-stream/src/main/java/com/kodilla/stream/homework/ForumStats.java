package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
//
//    Napisz Stream tak, aby obliczył średnią liczbę postów dla użytkowników, których wiek jest >= 40.
//
//        Napisz kolejny Stream, który obliczy średnią liczbę postów dla użytkowników, których wiek jest < 40.
