import java.util.HashMap;
/**
 * Clase AgendaTelefonica. Crea agendas con nombres y números y consulta su información.
 * 
 * @author (Josu) 
 * @version (4.3.15 - 4/03/2015)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> agenda;
    /**
     * Constructor de la clase AgendaTelefonica. Crea una agenda vacia. 
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
