//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a = 28;
        short b = 23000;
        int c = -51231233;
        long d = 969923986;
        float e = 94.23f;
        double f = 23.682356;
        System.out.println("Значение переменной (a)" + " с типом byte " + "равно " + a);
        System.out.println("Значение переменной (b)" + " с типом short " + "равно " + b);
        System.out.println("Значение переменной (c)" + " с типом int " + "равно " + c);
        System.out.println("Значение переменной (d)" + " с типом long " + "равно " + d);
        System.out.println("Значение переменной (e)" + " с типом float " + "равно " + e);
        System.out.println("Значение переменной (f)" + " с типом double " + "равно " + f);

        {
            System.out.println("Задание 2");
            float a1 = 27.12f;
            long b1 = 987678965549l;
            float c1 = 2.786f;
            short d1 = 569;
            short e1 = -159;
            short f1 = 27897;
            byte g1 = 67;
            System.out.println("Значение переменной (a1)" + " с типом float " + "равно " + a1);
            System.out.println("Значение переменной (b1)" + " с типом long " + "равно " + b1);
            System.out.println("Значение переменной (c1)" + " с типом float " + "равно " + c1);
            System.out.println("Значение переменной (d1)" + " с типом short " + "равно " + d1);
            System.out.println("Значение переменной (e1)" + " с типом short " + "равно " + e1);
            System.out.println("Значение переменной (f1)" + " с типом short " + "равно " + f1);
            System.out.println("Значение переменной (g1)" + " с типом byte " + "равно " + g1);
        }

        {
            System.out.println("Задание 3");
            byte ludmilaPavlovna = 23;
            byte annaSergeevna = 27;
            byte ekaterinaAndreevna = 30;
            short paper = 480;
            float paperOnOneStudent = paper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
            System.out.println("На каждого ученика рассчитано " + paperOnOneStudent + " листов бумаги");
        }

        {
            System.out.println("Задание 4");
            byte efficiency = 16 / 2;
            System.out.println("Производительность машины за 1 минуту равна = " + efficiency + " штук бутылок");
            int a4 = efficiency * 20;
            int b4 = efficiency * 24 * 60;
            int c4 = efficiency * 3 * 24 * 60;
            int d4 = efficiency * 31 * 24 * 60;
            System.out.println("За 20 мин машинап произвела " + a4 + " штук бутылок");
            System.out.println("За сутки машина произвела " + b4 + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + c4 + " штук бутылок");
            System.out.println("За месяц(31 день) машина произвела " + d4 + " штук бутылок");
        }

        {
            System.out.println("Задание 5");
            int banks = 120;
            int whitePaint1 = 2;
            int brownPaint1 = 4;
            int classes = banks / (whitePaint1 + brownPaint1);
            int whitePaint = classes * whitePaint1;
            int brownPaint = classes * brownPaint1;
            System.out.println("В школе,где " + classes + " классов" + " нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        }

        {
            System.out.println("Задание 6");
            int bananas = 5;
            int bananaWeightG = 80;
            int milkMl = 200;
            int milk100MlG = 105;
            int iceCream = 2;
            int iceCreamWeightG = 100;
            int eggs = 4;
            int eggWeightG = 70;
            int b6 = bananas * bananaWeightG;
            int m6 = milkMl * milk100MlG;
            int i6 = iceCream * iceCreamWeightG;
            int e6 = eggs * eggWeightG;
            float weightGeneralG = b6 + m6 + i6 + e6;
            float weightGeneralKg = weightGeneralG / 1000;
            System.out.println("Завтрак составляет " + weightGeneralG + " Г или " + weightGeneralKg + " Кг");
        }

        {
            System.out.println("Задание 7");
            int rest = 7 * 1000;
            int a7 = 250;
            int b7 = 500;
            int reset1 = rest / a7;
            int reset2 = rest / b7;
            System.out.println(reset1 + " дней понадобится,если сбрасывать по 250 г");
            System.out.println(reset2 + " дней понадобится,если сбрасывать по 500 г");
        }

        {
            System.out.println("Задание 8");
            float increaseZp = 0.1f;
            int masha = 67760;
            int denis = 83690;
            int kristina = 76230;
            float m8 = (masha * increaseZp) + masha;
            float d8 = (denis * increaseZp) + denis;
            float k8 = (kristina * increaseZp) + kristina;
            float differens1 = (m8 * 12) % (masha * 12);
            float differens2 = (d8 * 12) % (denis * 12);
            float differens3 = (k8 * 12) % (kristina * 12);
            System.out.println("Маша теперь получает " + m8 + " рублей. Годовой доход вырос на " + differens1 + " рублей");
            System.out.println("Денис теперь получает " + d8 + " рублей. Годовой доход вырос на " + differens2 + " рублей");
            System.out.println("Кристина теперь получает " + k8 + " рублей. Годовой доход вырос на " + differens3 + " рублей");

        }

        {
            System.out.println("Cпасибо,что уделилили время");
        }
    }
}