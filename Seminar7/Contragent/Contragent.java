package Seminar7.Contragent;

import Seminar7.Communication_Method.ListCommunicationMethod;

public class Contragent extends AbstractContragent{
    private ListCommunicationMethod listCommunicationMethod;

    public Contragent(String name, int age, ListCommunicationMethod listCommunicationMethod) {
        super.name = name;
        super.age = age;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public Contragent(String nameCompany, ListCommunicationMethod listCommunicationMethod) {
        super.nameCompany = nameCompany;
        this.listCommunicationMethod = listCommunicationMethod;
    }

    public int getAge() {return age;}
    public String getName() {return name;}
    public String getNameCompany() {return nameCompany;}
    public ListCommunicationMethod getListCommunicationMethod() {return listCommunicationMethod;}
    

    @Override
    public String toString() {
        if(age != 0 ){
            return "Contragent [ " + name + ", " + age + " ]";
        }
        else{
            return "Contragent [ " + nameCompany + " ]";
        }
    }
}
    
