public class ListNode {
    int item;
    ListNode next;

    //constructor method 1
    public ListNode(int item, ListNode next){
        this.item = item;
        this.next = next;
    }
    
    //constructor method 2
    public ListNode(int item){
        this.item = item;
        this.next = null;
    }
   
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        
        //show first item of the list 
        System.out.println("first item: " + l1.item);
        
        //show third item
        System.out.println("last item: " + l1.next.next.item);
        
    }
}
