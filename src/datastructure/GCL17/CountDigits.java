/*
 You are given a string S. Count the number of occurrences of all the digits in the string S.

Input:
First line contains string S.

Output:
For each digit starting from 0 to 9, print the count of their occurrences in the string S. So, print  lines, each line containing 2 space separated integers. First integer i and second integer count of occurrence of i. See sample output for clarification.

Constraints:

Sample Input
77150
Sample Output
0 1
1 1
2 0
3 0
4 0
5 1
6 0
7 2
8 0
9 0
 */

package datastructure.GCL17;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num[] = {7,7,1,5,0}; 
        int count[] = {0,0,0,0,0,0,0,0,0,0};
        int i = 0;
		while(num[i] != '\0') {
            
            switch(num[i]){
            
            case '0':
            count[0] += 1;
            break;
            
            case '1':
            count[1] += 1;
            break;
            
            case '2':
            count[2] += 1;
            break;
            
            case '3':
            count[3] += 1;
            break;
            
            case '4':
            count[4] += 1;
            break;
            
            case '5':
            count[5] += 1;
            break;
            
            case '6':
            count[6] += 1;
            break;
            
            case '7':
            count[7] += 1;
            break;
            
            case '8':
            count[8] += 1;
            break;
            
            case '9':
            count[9] += 1;
            break;
            }
        
        }
        for(int j=0;j<10;j++){
            System.out.println(j+" "+count[j]);
        }

	}

}
