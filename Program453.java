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
        int iCount= Count();

        Node newn= new Node(no);

        if((iPos < 1) || (iPos > iCount + 1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(no);
        }
        else if(iPos == iCount + 1)
        {
            InsertLast(no);
        }
        else
        {
            Node temp= first;

            for(int iCnt= 1; iCnt < iPos -1; iCnt++)
            {
                temp= temp.next;
            }
            newn.next= temp.next;
            temp.next= newn;

            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(first != null)
        {
            first= first.next;
            iCount--;
        }
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
    {
        int iSize= Count();

        if((iPos < 1) || (iPos > iSize))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iSize)
        {
            DeleteLast();
        }
        else
        {
            Node temp= first;

            for(int iCnt= 1; iCnt < iPos -1; iCnt++)
            {
                temp= temp.next;
            }
            temp.next= temp.next.next;

            iCount--;
        }
    }
}

class Program453
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

        obj.InsertAtPos(55, 4);
        obj.Display();
        System.out.println("Numner of elements are: "+obj.Count());
        obj.DeleteAtPos(4);
        obj.Display();
        System.out.println("Numner of elements are: "+obj.Count());

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.Display();
        System.out.println("Numner of elements are: "+obj.Count());
    }
}