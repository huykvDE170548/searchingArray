/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;
import java.util.Scanner;
/**
 *
 * @author This PC
 */
public class SearchProgramming extends Menu<String>{
    static String[] mc = {"Linear search", "Binary search", "Exit"};
    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;
    static Scanner sc= new Scanner(System.in);
    
    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }


    
    @Override
    public void execute(int n) {         
        switch (n) {
            case 1:
                library.display(array);
                int key= input();
                int position = algorithm.linerSearch(array, key);
                System.out.println("Value found in position: "+position);                              
                break;
            case 2:
                algorithm.buddleSort(array);
                library.display(array);
                int value= input();
               
                if(algorithm.binarySearch(array, value, 0, size_array-1)!=-1){
                    System.out.println("Value "+ value + " found in array");
                } 
                else System.out.println("Value no found in array!");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public static int input(){
        System.out.println("Please enter value searching: ");
        int key= sc.nextInt();
        return key;
    }
}

   

    

