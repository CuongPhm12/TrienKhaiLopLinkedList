import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(33);

        linkedList.add(0,46);

        linkedList.printList();



    }
}