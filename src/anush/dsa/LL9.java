package anush.dsa;
//LINKED LIST CYCLE CHECK.
public class LL9 {
    ListNode head;
    public boolean hasCycle(){
        if(head==null){
            return false;
        }
        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null||hare.next==null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;

    }
}
