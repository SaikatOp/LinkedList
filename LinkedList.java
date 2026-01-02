class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    
    void add(int e){
        Node temp=new Node(e);
        if(head==null){
        head=temp;
        }else{
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        }
    }
    
    void addFirst(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    
    void printLinkedList(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    
    void add(int index,int element){
        if(index==0){
            add(element);
        }else{
            Node temp=new Node(element);
            Node curr=head;
            int count=0;
            while(count<index-1){
                curr=curr.next;
                count++;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
    }
    
    void addAll(int elements[]){
        for(int element:elements){
            System.out.println(element);
        }
    }
    
    void removeFirst(){
        if(head==null){
        }else if(head.next==null){
            head=null;
        }else{
           Node curr=head;
           head=head.next;
           curr.next=null;
        }
    }
    
    void removeLast(){
        if(head==null){
            
        }else if(head.next==null){
            head=null;
        }else if(head.next!=null){
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }
    
    int indexOf(int element){
        int index=0;
        Node curr=head;
        while(curr!=null){
        if(curr.data==element){
            return index;
        }
        curr=curr.next;
        index++;
        }
    return -1;
    }
        
}
public class Main{
    public static void main(String args[]){
        LinkedList l1=new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        
        // l1.add(2,25);
        
        // int ar[]={1,2,3,4,5};
        // l1.addAll(ar);
        //l1.removeFirst();
        //l1.removeLast();
        int result=l1.indexOf(30);
        System.out.println(result);
        
        l1.printLinkedList();
    }
}
