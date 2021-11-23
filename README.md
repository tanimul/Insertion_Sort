# Insertion Sort
Perform Insertion Sort using JAVA language.

# About Insertion Sort
Insertion sort is a simple sorting algorithm that builds a final sorted array one element at a time. While sorting is a simple concept, it is a 
basic principle used in complex computer programs such as file search, data compression, and path finding.

![Insertion-sort-](https://user-images.githubusercontent.com/35636662/143002612-28b38698-64f4-4f15-8809-ee512c6c2b8b.gif)

# Java
   Step 1: 
   
              for (int i = 1; i < numbers.length; i++) {
              int key = numbers[i];
              int j = i - 1;
              // Compare key with each element on the left of it until an element smaller than
              // it is found.
              // For descending order, change key<array[j] to key>array[j].
              while (j >= i - 1 && key < numbers[j]) {
                   numbers[j + 1] = numbers[j];
                   --j;
              }
              // Place key at after the element just smaller than it.
              numbers[j + 1] = key;
              }
    
   Step 2: 
   Now,Print sorted Array in Ascending Order by loop
   
              System.out.print("Sorted Array in Ascending Order: ");
              for (int i = 0; i < numbers.length; i++) {
              System.out.print(numbers[i] + " ");
              }

