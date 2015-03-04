import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> agenda;
    /**
     * Constructor for objects of class AgendaTelefonica     * 
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * Introduce una persona y número en la agenda.
     * @param name El nombre de la persona
     * @param number El número asociado a la persona.
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }

    /**
     * Busca por un nombre en la agenda.
     * @param name El nombre por el que buscas.
     * @return agenda.get(name) El número asociado al nombre.
     */
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }

    /**
     * Muestra todos los nombres. 
     */
    public void printAllNames()
    {
        System.out.println(agenda.keySet());
    }
}
