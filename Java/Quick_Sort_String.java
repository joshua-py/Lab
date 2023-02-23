  import java.util.Arrays;
  class Quick_Sort_String {
    static void quickSort(String array[], int low, int high) {
      if (low < high) {
        String pivot=array[low];
        int i=low;
        int j=high;
        while(i<j){
          while(i<high&&array[i].compareTo(pivot)<=0)
            i++;        
          while(j>low&&array[i].compareTo(pivot)>0)
            j--;        
          if(i<j){
            String temp=array[i];
            array[i]=array[j];
            array[j]=temp;
          }
        }

        String temp=array[low];
        array[low]=array[j];
        array[j]=temp;
        quickSort(array, low, j-1);
        quickSort(array, j+1, high);

      }

    }
    public static void main(String args[]) {

      String[] data = {"JO","po","co"};
      System.out.println("Unsorted Array");
      System.out.println(Arrays.toString(data));

      int size = data.length;
      // call quicksort() on array data
      quickSort(data, 0, size-1);

      System.out.println("Sorted Array in Ascending Order ");
      System.out.println(Arrays.toString(data));
    }
  }