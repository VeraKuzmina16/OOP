package Seminar6.Task1;

public class SuperPhone extends TelephoneAbstract {

    @Override
    public void mode() {
        System.out.println("Без блокировки");
    }

    @Override
    public void pin() {
        System.out.println("Пин-код");
    }

    @Override
    public void fingerprint() {
        System.out.println("Отпечаток пальца");
    }

    @Override
    public void faceID() {
        System.out.println("Распознавание по лицу");
    }
}
    

