package util;

import com.viktor.model.Worker;
import java.util.Random;

public class RandWorker
{
    public static final int MIN_birthDayYear = 1950;
    private static final Random newRandom = new Random();

    private static final String workerMassName[] =
            { "Martin", "Morris" , "Adam" , "Viktor" , "Andriy" , "Marianna", "Misha" , "Sergiy", "Artur","Vasya"};
    private static final String  workerSurname[] =
            { "Gavor", "Shishka", "Pilipchuk","Zabchuk", "Yablonskiy", "Harris", "Ivanov", "Black","Brown","New" };


    public static String getRandomName()
    {
        String ranName = workerMassName[newRandom.nextInt(workerMassName.length - 1)];
        return  ranName;
    }

    public static String getRandomSurname()
    {
        String ranSurname = workerSurname[newRandom.nextInt(workerMassName.length - 1)];
        return ranSurname;
    }

    public static Integer getRandomYearOfBirth()
    {
        return newRandom.nextInt(2016- MIN_birthDayYear)+ MIN_birthDayYear;
    }

    public static Worker RandWorker()
    {
        return new Worker(getRandomName(), getRandomSurname(), getRandomYearOfBirth());
    }


}
