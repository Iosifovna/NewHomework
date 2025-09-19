//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача №1
        byte a = 2;
        short b = 22222;
        int c = 222222;
        Long d = 22222222L;

        float e = 2.22f;
        double f = 2.2222222222;

        System.out.println("Первая задача:");
        System.out.println("Значение переменной a в формате byte равно " + a);
        System.out.println("Значение переменной b в формате short равно " + b);
        System.out.println("Значение переменной c в формате int равно " + c);
        System.out.println("Значение переменной d в формате Long равно " + d);
        System.out.println("Значение переменной e в формате float равно " + e);
        System.out.println("Значение переменной f в формате double равно " + f);
        System.out.println();

        // Задача №2

        float number1 = 27.12f;
        Long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;
        System.out.println("Первая задача:");
        System.out.println("Значение переменной number1 в формате float равно " + number1);
        System.out.println("Значение переменной number2 в формате Long равно " + number2);
        System.out.println("Значение переменной number3 в формате short равно " + number3);
        System.out.println("Значение переменной number4 в формате short равно " + number4);
        System.out.println("Значение переменной number5 в формате short равно " + number5);
        System.out.println("Значение переменной number6 в формате short равно " + number6);
        System.out.println("Значение переменной number7 в формате byte равно " + number7);
        System.out.println();

        // Задача №3

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;

        byte totalStudents = (byte) (class1 + class2 + class3);
        short countOfLists = 480;
        byte countListsPerOneStudent = (byte) (countOfLists / totalStudents);
        System.out.println("3 задача:");
        System.out.println("На каждого ученика рассчитано " + countListsPerOneStudent + " листов бумаги.");
        System.out.println();

        //Задача №4

        byte bottlesInTwoMinutes = 16;
        byte bottlesInOneMinute = 16 / 2;
        short twentyMinutes = 20;
        short minutesInOneDay = 24 * 60;
        short minutesInOneMonth = (short) (minutesInOneDay * 31);
        short bottlesInTwentyMinutes = (short) (bottlesInOneMinute * twentyMinutes);
        System.out.println("4 задача:");
        System.out.println("За " + twentyMinutes + " минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок.");
        short bottlesInOneDay = (short) (bottlesInOneMinute * minutesInOneDay);
        System.out.println("За один день машина произвела " + bottlesInOneDay + " штук бутылок.");
        short bottlesInOneMonth = (short) (bottlesInOneMinute * minutesInOneMonth);
        System.out.println("За месяц машина произвела " + bottlesInOneMonth + " штук бутылок.");
        System.out.println();

        // Задача №5

        byte totalCountOfCansOfPaint = 120;
        byte whiteColorCanOfPaint = 1;
        byte brownColorCanOfPaint = 1;
        byte cansOfPaintsPerOneClass = (byte) (2 * whiteColorCanOfPaint + 4 * brownColorCanOfPaint);
        byte countOfClasses = (byte) (totalCountOfCansOfPaint / cansOfPaintsPerOneClass);
        byte totalCountOfWhiteColorCans = (byte) (countOfClasses * 2);
        byte totalCountOfBrownColorCans = (byte) (countOfClasses * 4);
        System.out.println("5 задача:");
        System.out.println("В школе, где " + countOfClasses + " классов, нужно " + totalCountOfWhiteColorCans + " банок белой краски и " + totalCountOfBrownColorCans + " банок коричневой краски.");
        System.out.println();

        // Задача №6

        byte weightOfOneBanana = 80;
        byte weightOfMilkOf100ml = 105;
        byte weightOfOneIceCreamSundae = 100;
        byte weightOfOneEgg = 70;
        short grPerKg = 1000;

        short totalWeightOfBreakfastInGr = (short) (weightOfOneBanana * 5 + weightOfMilkOf100ml * 2 + weightOfOneIceCreamSundae * 2 + weightOfOneEgg * 4);
        float totalWeightInKilo = totalWeightOfBreakfastInGr / (float) grPerKg;
        System.out.println("6 задача:");
        System.out.println("Вес завтрака спорстмена в граммах равен: " + totalWeightOfBreakfastInGr + "г.");
        System.out.println("Вес завтрака спортсмена в килограммах равен: " + totalWeightInKilo + "кг.");
        System.out.println();

        // Задача №7

        short overWeight = 7000;
        short weightToLosePerDayFirstOption = 250;
        short weightToLosePerDaySecondOption = 500;
        byte neededDaysForFirstOption = (byte) (overWeight / weightToLosePerDayFirstOption);
        byte neededDaysFofSecondOption = (byte) (overWeight / weightToLosePerDaySecondOption);
        short averageWeightToLosePerDay = (short) ((short) (weightToLosePerDayFirstOption + weightToLosePerDaySecondOption) / 2);
        byte neededDaysForAverageOption = (byte) (overWeight / averageWeightToLosePerDay);
        System.out.println("7 задача:");
        System.out.println("Если спортсмен будет терять каждый день по " + weightToLosePerDayFirstOption + "г, то понадбится " + neededDaysForFirstOption + " дней, чтобы скинуть 7 кг.");
        System.out.println("Если спортсмен будет терять каждый день по " + weightToLosePerDaySecondOption + "г, то понадбится " + neededDaysFofSecondOption + " дней, чтобы скинуть 7 кг.");
        System.out.println("Если спортсмен будет терять в среднем по " + averageWeightToLosePerDay + "г в день, то понадбится " + neededDaysForAverageOption + " дней, чтобы скинуть 7 кг.");
        System.out.println();

        // Задача №8

        int salaryOfMaria = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        int newSalaryOfMaria = (int) (salaryOfMaria * 1.1f);
        int newSalaryOfDenis = (int) (salaryOfDenis * 1.1f);
        int newSalaryOfKristina = (int) (salaryOfKristina * 1.1f);
        int differenceBetweenNewAndCurrentSalaryForYearForMaria = (int) (salaryOfMaria * 0.1f * 12);
        int differenceBetweenNewAndCurrentSalaryForYearForDenis = (int) (salaryOfDenis * 0.1f * 12);
        int differenceBetweenNewAndCurrentSalaryForYearForKristina = (int) (salaryOfKristina * 0.1f * 12);
        System.out.println("8 задача:");
        System.out.println("Маша теперь получает " + newSalaryOfMaria + " рублей. Годовой доход вырос на " + differenceBetweenNewAndCurrentSalaryForYearForMaria + " рублей");
        System.out.println("Денис теперь получает " + newSalaryOfDenis + " рублей. Годовой доход вырос на " + differenceBetweenNewAndCurrentSalaryForYearForDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryOfKristina + " рублей. Годовой доход вырос на " + differenceBetweenNewAndCurrentSalaryForYearForKristina + " рублей");
        // Почему даже в задаче у парня зарплата выше, чем у девущек! Это несправедливо! Сейчас же много матерей одиночек, а парни никого  не содержат :(
        // Для пуша
    }
}