import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> Agenda;
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        Agenda = new HashMap<>();
    }
    
    public void enterNumber(String name, String number)
    {
        Agenda.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return Agenda.get(name);
    }
}
