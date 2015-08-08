package algorithm;

public class HeapSort {

    public static int heapSize;
    public static int LEFT(int i)
    {
        //returns left index of a zero index based array
        return 2*i+1;
    }

    public static int RIGHT(int i)
    {
        //returns right index of a zero based array
        return 2*i+2;
    }


    public static void BUILD_MAX_HEAP(int A[])
    {
        heapSize = A.length;//heap size initialised
        for(int i=A.length/2; i>=0;i--)//since n/2, n/2+1 ... are leaves we can start from n/2 step downwards
        {
            //call MAX_HEAPIFY on each root node starting from n/2
            MAX_HEAPIFY(A, i);
        }
    }


    public static void MAX_HEAPIFY(int A[],int i)
    {
        int l=LEFT(i);//the left element's index which is 2*i+1 (for zero based indexed array)
        int r=RIGHT(i);//right index = 2*i+2;
        int largestElementIndex = -1;//index can't be negative so initialise largest index , it will be used later
    
        if(l<heapSize && A[l]>A[i]){
            largestElementIndex = l;
        }
        else //if max heap property is not violated copy the root's index in largestElementIndex
        {
            largestElementIndex=i;
        }
    
        if(r<heapSize && A[r]>A[largestElementIndex])
        {
            largestElementIndex = r;
        }
        //if root doesn't has the largest index then swap the largest element with root element

        if(largestElementIndex!=i)
        {
            int temp = A[i];
            A[i]=A[largestElementIndex];
            A[largestElementIndex]=temp;
            //after swap, recursively call the MAX_HEAPIFY on the largest index(root element)
            MAX_HEAPIFY(A, largestElementIndex);
        }
    }

    public static void sort(int array[])
    {
        //max heap is built with heapSize initialised
        BUILD_MAX_HEAP(array);
        //starting from end loop through entire array
        for(int i=array.length-1;i>=0;i--)
        {
            int temp = array[0];
            array[0]=array[i];
            array[i]=temp;
            //reduce the heap window by 1
            heapSize  = heapSize-1;
            //call max heapify on the reduced heap
            MAX_HEAPIFY(array,0);
        }
    }
}