package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcVacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calcVacation.csv")
    public void testFreelanceVacation(int expected, int income, int expenses, int enoughmoney) {
        CalcVacation service = new CalcVacation();

        int actual = service.calcVac(income, expenses, enoughmoney);
    }
}
