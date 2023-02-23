import java.util.Arrays;

class Quicksort {

  // method to find the partition position
  static int partition(int array[], int low, int high) {
    int pivot, index;
    pivot = array[low];
    index = low;
        do {
            low ++;
        } while (pivot > array[low]);
        
        do {
            high --;
        } while (pivot < array[high]);

        if (low < high) {
           int temp=array[low];
            array[low]=array[high];
            array[high]=temp;
        }
        else{
            int temp=array[index];
            array[index]=array[high];
            array[high]=temp;
            return high;
        }
   return high;
      }


   void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }
}

// Main class
class Quick_Sort {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;
    Quicksort q= new Quicksort();
    // call quicksort() on array data
    q.quickSort(data, 0, size);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}