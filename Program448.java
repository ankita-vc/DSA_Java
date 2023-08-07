// Singly Linear LL

import java.util.*;

class Node  // structre of node
{
    public int  data;
    public Node next;  // struct node *next (next is referance) self referantial class

    public Node(int no)  // constructor
    {
        this.data= no;
        this.next= null;
    }
}

class SinglyLL
{
    public Node first;   // node cha referance(first)
    public int iCount;

    public SinglyLL()
    {
        this.first= null;
        this.iCount= 0;
    }

    public void Display()
    {}

    public int Count()
    {
        return 0;
    }

    public void InsertFirst(int no)
    {}

    public void InsertLast(int no)
    {}

    public void InsertAtPos(int no, int iPos)
    {}

    public void DeleteFirst()
    {}

    public void DeleteLast()
    {}

    public void DeleteAtPos(int iPos)
    {}
}

class Program448
{
    public static void main(String arg[])
    {
        SinglyLL obj= new SinglyLL();  // class object

    }
}