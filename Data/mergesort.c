#include <stdio.h>
#include <stdlib.h>

int sorted_array[20];

void merge(int[],int[], int, int, int);
void mergeSort(int[], int, int);


int main() {
    int size;

    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int array[size];

    printf("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
        scanf("%d", &array[i]);
    }

    mergeSort(array, 0, size - 1);

    for (int i = 0; i < size; i++) {
        printf("%d ", sorted_array[i]);
    }
    printf("\n");
    

    return 0;
}

void merge(int sorted_array[],int array[], int low, int mid, int high) {
    int i, j, k;

    i = low;
    j = mid + 1;
    k = low;

    while (i <= mid && j <= high) {
        if (array[i] <= array[j]) {
            sorted_array[k] = array[i];
            i++;
            k++;
        } else {
            sorted_array[k] = array[j];
            j++;
            k++;
        }
    }
    while (i <= mid) {
        sorted_array[k] = array[i];
        i++;
        k++;
    }
    while (j <= high) {
        sorted_array[k] = array[j];
        j++;
        k++;
    }
    
}

void mergeSort(int array[], int low, int high) {
    int mid;

    if (low < high) {
        mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(sorted_array,array, low, mid, high);
    }
}