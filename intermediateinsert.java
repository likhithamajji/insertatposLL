class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
    }
}
class LLM{
    public static node head;
    public static void insertatposition(int num,int position){
        node newnode=new node(num);
        node temp=head;
        
        if(position==1){
            newnode.next=head;
            head=newnode;
            return;
        }else{
            for(int i=1;temp!=null&&position<i-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
        public static void display(){
            node temp=head;
    if(head==null){
        System.out.print("no linkedlist");
        return;
    }
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.print("null");
}
    }      
class intermediateinsert{
    public static void main(String[] args) {
        LLM.insertatposition(1,1);
        LLM.insertatposition(2,1);
        LLM.insertatposition(3,3);
        LLM.insertatposition(4,4);
        LLM.insertatposition(5,5);
        LLM.insertatposition(6,6);
        LLM.display();
        
    }
}