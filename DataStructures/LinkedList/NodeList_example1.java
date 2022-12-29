public class ListNode {
    int item;
    ListNode next;
   
    public static void main(String[] args) {
    ListNode l1 = new ListNode();
    ListNode l2 = new ListNode();
    ListNode l3 = new ListNode();
       
    //declaring items
    l1.item = 1;
    l2.item = 7;
    l3.item = 3;
    
    //declaring nexts
    l1.next = l2;
    l2.next = l3;
    l3.next = null;
}
   
}
