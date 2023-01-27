package Seminar7.List_Contragent;

import Seminar7.Contragent.Contragent;
import java.util.ArrayList;
import java.util.List;

public class ListContragent extends AbstractListContragent<Contragent>{
    private List<Contragent> ListContragent = new ArrayList<>();

    public List<Contragent> getListContragent() {return ListContragent;}

    public void addContragentInList(Contragent Contragent){
        ListContragent.add(Contragent);        
    }

    public void deleteContrAgent(Contragent Contragent){
        ListContragent.remove(Contragent);
    }

    public void printListContragent(){
        for (Contragent Contragent : ListContragent) {
            System.out.println(Contragent);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListContragent [\n" + ListContragent + "]";
    }
    
}
