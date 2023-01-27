package Seminar7.Control_List_Contragent;

import Seminar7.Communication_Method.ListCommunicationMethod;
import Seminar7.Contragent.Contragent;
import Seminar7.List_Contragent.ListContragent;

public class ControlListContragent extends AbstractControlContragent{

        ListCommunicationMethod listCommunicationMethod;
        Contragent contrAgent;
        ListContragent listContrAgent;
    
    public ControlListContragent(ListContragent listContrAgent) {
            this.listContrAgent = listContrAgent;
            this.listCommunicationMethod = new ListCommunicationMethod();
        }
    // добавить метод связи
        public void addNewComminicationMethodVk(Contragent contrAgent, String vk) {
            contrAgent.getListCommunicationMethod().addVkMethod(vk);
        }
        public void addNewComminicationMethodTelegram(Contragent contrAgent, String telegtam){
            contrAgent.getListCommunicationMethod().addTelegramMethod(telegtam);
        }
        public void addNewComminicationMethodEmail(Contragent contrAgent, String email){
            contrAgent.getListCommunicationMethod().addEmailMethod(email);
        }
        public void addNewComminicationMethodPhoneNumber(Contragent contrAgent, String number){
            contrAgent.getListCommunicationMethod().addPhoneNumberMethod(number);
        }
        public void addNewComminicationMethodAdress(Contragent contrAgent, String adress){
            contrAgent.getListCommunicationMethod().addAdressMethod(adress);
        }
    // удалить метод связи
        public void delComminicationMethodVk(Contragent contrAgent, int index) {
            contrAgent.getListCommunicationMethod().deleteVkMethod(index);
        }
        public void delComminicationMethodTelegram(Contragent contrAgent, int index){
            contrAgent.getListCommunicationMethod().deleteTelegramMethod(index);
        }
        public void delComminicationMethodEmail(Contragent contrAgent, int index){
            contrAgent.getListCommunicationMethod().deleteEmailMethod(index);
        }
        public void delComminicationMethodPhoneNumber(Contragent contrAgent, int index){
            contrAgent.getListCommunicationMethod().deletePhoneNumberMethod(index);
        }
        public void delComminicationMethodAdress(Contragent contrAgent, int index){
            contrAgent.getListCommunicationMethod().deleteAdressMethod(index);
        }
    // удалить контрагента
        public void deleteContrAgent(Contragent contrAgent, ListContragent listContrAgent) {listContrAgent.deleteContrAgent(contrAgent);}
    // распечатать список контр агентов
        public void printListContrAgent() {
            listContrAgent.printListContragent();}  
    // поиск по имени контрагента
        public void serchContrAgent(String name) {
            for (Contragent contrAgent : listContrAgent.getListContragent()) {
                if(contrAgent.getName() == name){
                    System.out.print(contrAgent.getName());
                    contrAgent.getListCommunicationMethod().printListCommunicationMethod();
                }
                if(contrAgent.getNameCompany() == name){
                    System.out.print(contrAgent.getNameCompany());
                    contrAgent.getListCommunicationMethod().printListCommunicationMethod();
                }
            }  
            System.out.println();
        }
    // создать нового контрагента
        public void addNewContrAgent(ListContragent listContrAgent, Contragent contrAgent){
            listContrAgent.addContragentInList(contrAgent);
        }
    
}
