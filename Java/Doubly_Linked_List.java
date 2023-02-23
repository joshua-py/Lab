class DLL {
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int d){
            data=d;
        }
    }
    Node head=null,ptr;

    public void display(){
        ptr=head;
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        System.out.println();
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
        }
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            head.previous=null;
            head.next=null;
            return;
        }
        head.previous=newNode;
        newNode.next=head;
        newNode.previous=null;
        head=newNode;
    }

    public void append(int data){
        Node newNode = new Node(data);
        ptr=head;
        if(head==null)
            push(data);
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        newNode.previous=ptr;
        newNode.next=null;
    }

    public void addAtPos(int data,int pos){
        if(pos<0){
            System.out.println("Not possible to insert at negative position: ");
        }

        if(pos==0||head==null){
            push(data);
        }
        else{
            Node newNode = new Node(data);
            ptr=head;
            for (int i = 0; i < pos-1; i++) {
                if(ptr!=null){
                    ptr=ptr.next;
                }
            }if(ptr!=null){
                newNode.next=ptr.next;
                newNode.previous=ptr;
                ptr.next=newNode;
                if(newNode.next!=null)
                    newNode.next.previous=newNode;
            }else
                System.out.println("The previous node is null");
            

        }
    }
    void pop(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        head=head.next;
    }
    public void deleteAtPos(int data,int pos){
        if(pos<0){
            System.out.println("Not possible to delete||provide positive number: ");
            return;
        }
        else if(pos==0|| head==null)
            pop();
        else{
                ptr=head;
                for(int i=0;ptr!=null&& i<pos;i++)
                    ptr=ptr.next;
                if(ptr==null){
                    System.out.println("No such position exits in the list");
                    return;
                }
                if(head==ptr)
                    head=ptr.next;
                if(ptr.next!=null){
                    ptr.next.previous=ptr.previous;
                    ptr.previous.next=ptr.next;
                }
            }
    }
    void deleteEnd(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next==null);
            head=null;
        ptr=head;
        while(ptr.next!=null)
            ptr=ptr.next;
        ptr.previous.next=null;

    }
}
public class Doubly_Linked_List{
    public static void main(String[] args) {
        DLL dl= new DLL();
        dl.push(2);
        dl.append(3);
        dl.push(6);
        dl.push(5);
        dl.display();
        dl.addAtPos(1,1 );
        dl.display();
    }
}


