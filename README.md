# Quicksort Algorithm Implementation

## Table of Contents
1. [Overview](#overview)
2. [Features](#features)
3. [Usage](#usage)
4. [Output Separators](#output-separators)
5. [Example Output](#example-output)
6. [How to Run the Program](#how-to-run-the-program)
7. [Requirements](#requirements)
8. [Author](#author)

## Overview
This project implements the Quicksort algorithm in Java, a highly efficient sorting algorithm that employs a divide-and-conquer strategy to sort elements in an array. The implementation includes features such as array display functionality, element swapping, and both standard and randomized versions of the Quicksort algorithm.

## Features
- **Array Display**: Displays all elements of an integer array in a single line, separated by spaces.
- **Element Swapping**: Provides functionality to swap two elements in an array.
- **Partitioning**: Implements partitioning of the array around a pivot element to aid in sorting.
- **Standard and Randomized Quicksort**: Uses recursion for sorting, with the option to use a randomly selected pivot to enhance performance.
- **Comparison of Sorting Results**: Compares the sorted results of an integer array and an `ArrayList` to ensure they match.

## Usage
The program generates a random array of integers within the range of 0 to 999, displays the unsorted array, sorts it using the Quicksort algorithm, and then shows the sorted array. It also generates a second collection, comparing results between the integer array and an `ArrayList` to verify that both collections contain the same sorted data.

## Output Separators
For improved readability, each output section is separated by a line of dashes:
```java
System.out.println("---------");

## Example Output

Unsorted array:
10 80 30 90 40 50 70 
Sorted array:
10 30 40 50 70 80 90 
---------
Random array before sorting:
918 612 22 453 326 ...
Random array after sorting:
22 76 137 167 326 ...
---------
The arrays are the same.
---------
Randomized quicksort result:
22 76 137 167 326 ...
---------

## How to Run the Program

	1.	Clone this repository or download the source code.
	2.	Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse, or VS Code).
	3.	Compile and run the Main class to see the output.

## Requirements

	•	Java 8 or higher

## Author
- **Nav Singh** - [nav7FSC on GitHub](https://github.com/nav7FSC)
