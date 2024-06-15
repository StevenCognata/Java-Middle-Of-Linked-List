import java.util.*;

public class MiddleNode{
    public static LinkedListNode middleNode(LinkedListNode head) {
      LinkedListNode slow = head;
      LinkedListNode fast = head;

      if(fast == null){
          return slow;
        }

      while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
    return slow;
  }
}
