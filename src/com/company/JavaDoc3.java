package com.company;

/**
 * This is java doc class
 */
public class JavaDoc3 {
    /**
     *
     * @param args these are arguments supplied to command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hlo this the addition method of this class
     * @param a This is 1st number to add
     * @param b This is 2nd number to add
     * @return This will give sum of 2 numbers
     * @throws Exception if a is zero
     * @deprecated This method is deprecated please use plus operator
     */
    public int add(int a,int b) throws Exception{
        if(a==0){
            throw new Exception();
        }
        return a+b;
    }
}
