package anush.dsa;
//LINKED LIST CYCLE CHECK.
public class LL9 {
    Node head;
    public boolean hasCycle(){
        if(head==null){
            return false;
        }
        Node hare=head;
        Node turtle=head;
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
