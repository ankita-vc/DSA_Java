// Singly Linear LL

import java.util.*;

class Node  
{
    public int  data;
    public Node next;  

    public Node(int no)  
    {
        this.data= no;
        this.next= null;
    }
}

class SinglyLL
{
    public Node first;   
    public int iCount;

    public SinglyLL()
    {
        this.first= null;
        this.iCount= 0;
    }

    public void Display()
    {
        System.out.println("elements of SinglyLL are:");

        Node temp= first;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp= temp.next;
        }
        System.out.println("\n");
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn= new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next= first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
        Node newn= new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Node temp= first;  // temp is referance refering to first

            while(temp.next != null)
            {
                temp= temp.next;
            }
            temp.next= newn;
        }
        iCount++;
    }

    public void InsertAtPos(int no, int iPos)
    {
        Node newn= new Node(no);

        if((iPos < 1) || (iPos > iCount + 1))
        {
            System.out.println("Invalid Position");
            return;
        }
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first= null;
        }
        else
        {
            first= first.next;
        }
        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first= null;
        }
        else
        {
            Node temp= first;

            while(temp.next.next != null)
            {
                temp= temp.next;
            }
            temp.next= null;
        }
        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {}
}

class Program450
{
    public static void main(String arg[])
    {
        SinglyLL obj= new SinglyLL();  

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.Display();
        System.out.println("Numner of elements are: "+obj.Count());

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.Display();
        System.out.println("Numner of elements are: "+obj.Count());
    }
}