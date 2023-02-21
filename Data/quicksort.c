#include <stdio.h>

int partition(int[], int, int);
void quicksort(int[], int, int);
void swap(int*, int*);


int main() {

    int size;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int array[size];

    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    quicksort(array, 0, size);

    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
    

    return 0;
}

int partition(int array[], int low, int high) {
   int pivot, index;


    pivot = array[low];
    index = low;

    while (low < high) {
        do {
            low ++;
        } while (pivot > array[low]);
        
        do {
            high --;
        } while (pivot < array[high]);

        if (low < high) {
            swap(&array[low], &array[high]);
        }
    }
    swap(&array[index], &array[high]);
    return high;
}   

void quicksort(int array[], int low, int high) {
    int index;
    if (low < high) {
        index = partition(array, low, high);
        quicksort(array, low, index);
        quicksort(array, index+1, high);
    }
}

void swap(int* ptr1, int* ptr2) {
    int tmp = *ptr1;
    *ptr1 = * ptr2;
    *ptr2 = tmp;
}   