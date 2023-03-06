package ru.netology.services;

public class CalcVacation {

    public int calcVac(int income, int expenses, int enoughmoney) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month < 12; month++) {
            if (money >= enoughmoney) {
                money = (money - expenses) / 3;
                count++;
            } else {
                money = money + income - expenses;
            }
        }
        return count;

    }
}
