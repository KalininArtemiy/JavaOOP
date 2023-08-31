package homework;
//интерфейс очереди - добовляет у удаляет людей из очереди, а также показывает текущий размер очереди
public interface QueueBehaviour {
    void addPerson (String person); //добавляет
    String removePerson ();//удалляет
    Integer size();//размер
    boolean isEmpty();//проверяем есть ли люди в очереди
}
