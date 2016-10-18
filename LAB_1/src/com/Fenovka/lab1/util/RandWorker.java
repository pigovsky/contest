package com.Fenovka.lab1.util;

import com.Fenovka.lab1.model.Worker;
import java.util.Random;

public class RandWorker {
    private static final int MIN_YEAR = 1970;
    private static final int MAX_EMPL_YEAR = 90;
    private static final Random rand = new Random();

    private final String workerName[] = {
            "Олег", "Михайло","Євген","Андрій","Ярослав","Олександр","Володимир","Адам","Анатолій","Антон","Віст","Грива","Дибач",
            "Ада","Аїда","Анна","Людмила","Берта","Віола","Віта","Донна","Емма","Ївга","Зоя","Клара","Кора","Лада","Мотря","Остап","Назар"};
    private  final String  workerSurname[] = {
            "Опалько","Надорожняк",
            "Шаля","Чуча","Чугуй","Цибко","Самець","Очкур","Конопля","Жебрак","Бухтій","Щетина","Сом","Рись","Калюк","Гак","Влах",
            "Бриж","Барон","Тиран" +
            "","Цар","Хруль","Гашенко","Бих","Масич","Лопух","Квак","Хан","Щурик","Нич","Деде","Ваш","Члек","Пиж"};

    public  String getRandomName(){
        return workerName[rand.nextInt(workerName.length - 1)];
    }

    public  String getRandomSurname(){
        return workerSurname[rand.nextInt(workerName.length - 1)];
    }

    public Integer getRandomYearOfEmpl(){
        return rand.nextInt(MAX_EMPL_YEAR);
    }
    public  Integer getRandomYearOfBirth(){
        return rand.nextInt(2016 - MIN_YEAR)+ MIN_YEAR;
    }
    public  Worker RandWorker(){
        return new Worker(getRandomName(), getRandomSurname(), getRandomYearOfBirth(),getRandomYearOfEmpl());
    }
}
