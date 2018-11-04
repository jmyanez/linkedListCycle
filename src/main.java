import java.util.List;

public class main {


    public static void main(String[] args){
        ListNode temp;
        ListNode x = new ListNode(0);
        x = fillList(x);
        //printList(x);
        x = createCycle(x);
        System.out.println(hasCycle(x));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode one = head;
        ListNode two = head.next;

        while(one.next !=null || two.next != null){
            if(one.val==two.val){
                return true;
            }
            else if(two.next == null || two.next.next == null){
                return false;
            }
            one = one.next;
            two = two.next.next;
        }
        return false;
    }

    public static void printList(ListNode x){

        while(x != null){
            System.out.println(x.val);
            x=x.next;
        }

    }

    public static ListNode fillList(ListNode h){
        ListNode t = h;
        for(int i =1;i<=10;i++){
            h.next = new ListNode(i);
            h = h.next;
        }
        return t;
    }

    public static ListNode createCycle(ListNode h){
        ListNode t = h;
        for(int i =1;i<=10;i++){
            h.next = new ListNode(i);
            h = h.next;
            if(i==9){
                h.next = t.next.next;
            }
        }
        return t;
    }

}
