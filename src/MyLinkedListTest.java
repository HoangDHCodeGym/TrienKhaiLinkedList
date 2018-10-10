public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList<String>("Hello");
        list.printList();
        list.addFirst("Vietnam");
        list.addLast("America");
        list.printList();
        list.remove(1);
        list.printList();
        System.out.println(list.indexOf("Hello"));
    }
}
