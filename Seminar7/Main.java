package Seminar7;

import Seminar7.List_Contragent.ListContragent;
import Seminar7.Communication_Method.ListCommunicationMethod;
import Seminar7.Contragent.Contragent;
import Seminar7.Control_List_Contragent.ControlListContragent;

public class Main {
    public static void main(String[] args) {
        // создание способов связаться с контрагентами
                ListCommunicationMethod alexListCommunicationMethod = new ListCommunicationMethod();
                ListCommunicationMethod saraListCommunicationMethod = new ListCommunicationMethod();
                ListCommunicationMethod flagmanListCommunicationMethod = new ListCommunicationMethod();
                ListCommunicationMethod blackCoubListCommunicationMethod = new ListCommunicationMethod();
        // Создание контрагентов
                Contragent alex = new Contragent("Alex", 23, alexListCommunicationMethod);
                Contragent sara = new Contragent("Sara", 27, saraListCommunicationMethod);
                Contragent flagman = new Contragent("Flagman",flagmanListCommunicationMethod);
                Contragent blackCoub = new Contragent("blackCoub", blackCoubListCommunicationMethod);
        // распечатать по одному контрагенту
                // System.out.println(alex);
                // System.out.println(sara);
                // System.out.println(flagman);
                // System.out.println(blackCoub);
                // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // создание списка контрагентов
                ListContragent listContragent = new ListContragent();
        // добавление контрагентов в список контрагентов
                listContragent.addContragentInList(alex);
                listContragent.addContragentInList(sara);
                listContragent.addContragentInList(flagman);
                listContragent.addContragentInList(blackCoub);
        // распечатать список контрагентов
                // listContragent.printListContrAgent();
        // Добавление способов связи
                alexListCommunicationMethod.addVkMethod("vk/111111");
                alexListCommunicationMethod.addVkMethod("vk/222222");
                alexListCommunicationMethod.addAdressMethod("ул.Пушкина дом 4");
                alexListCommunicationMethod.addEmailMethod("fonoteka@mail.ru");
                alexListCommunicationMethod.addTelegramMethod("@telebot");
                alexListCommunicationMethod.addPhoneNumberMethod("89523467766");
        
                saraListCommunicationMethod.addPhoneNumberMethod("8952435678");
                saraListCommunicationMethod.addVkMethod("vk/777777");
                saraListCommunicationMethod.addAdressMethod("ул.Голубева дом 77");
        
                flagmanListCommunicationMethod.addPhoneNumberMethod("2794356");
                flagmanListCommunicationMethod.addPhoneNumberMethod("2798899");
                flagmanListCommunicationMethod.addPhoneNumberMethod("2798822");
                flagmanListCommunicationMethod.addTelegramMethod("@flagmanTrue");
                flagmanListCommunicationMethod.addEmailMethod("flagmaGolg@mail.ru");
        
                blackCoubListCommunicationMethod.addVkMethod("vk/blackCoub");
                blackCoubListCommunicationMethod.addAdressMethod("ул.Воронова дом 666");
                blackCoubListCommunicationMethod.addPhoneNumberMethod("2798811");
                blackCoubListCommunicationMethod.addPhoneNumberMethod("2793300");
                blackCoubListCommunicationMethod.addTelegramMethod("@blackCoub");
                blackCoubListCommunicationMethod.addEmailMethod("blackCoub@mail.ru");
        //контроллер списка контрагентв
                ControlListContragent controlListContrAgent = new ControlListContragent(listContragent);
        // распечатпть список контрагентов
                controlListContrAgent.printListContrAgent();
        // поиск конрагентов по имени
                controlListContrAgent.serchContrAgent("Flagman");
                controlListContrAgent.serchContrAgent("Sara");
        // добавить способ связи с контрагентом
                controlListContrAgent.addNewComminicationMethodPhoneNumber(flagman, "22534");
        // удалить способ связи с контрагентом
                controlListContrAgent.delComminicationMethodPhoneNumber(flagman, 0);
        // добавить в список нового контрагента
                // controlListContrAgent.addNewContrAgent(listContragent, newName);
            }
}
