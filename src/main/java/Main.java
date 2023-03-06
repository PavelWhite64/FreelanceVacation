import ru.netology.services.CalcVacation;

public class Main {

    public static void main(String[] args) {
        CalcVacation service = new CalcVacation();

        int income = 100_000;
        int expenses = 60_000;
        int enoughmoney = 150_000;
        int rest = service.calcVac(income, expenses, enoughmoney);

        System.out.println("Отдыхает " + rest + " месяца.");
    }
}
