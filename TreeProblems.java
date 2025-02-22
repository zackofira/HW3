/*
 * *** Zach Kofira / Section 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    Set<Integer> tempA = new TreeSet<>();
    tempA.addAll(setA);
    Set<Integer> tempB = new TreeSet<>();
    tempB.addAll(setB);
    Set<Integer> returnSet = new TreeSet<>();

    tempA.removeAll(setB);
    tempB.removeAll(setA);

    returnSet.addAll(tempA);
    returnSet.addAll(tempB);

    return returnSet;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    //According to the treeMap class, changes in a keySet of the map are reflected in the map
    //So, we can remove all integers from the set if they are even to remove them from the map
    //I did this by using the removeIf function present in sets

    treeMap.keySet().removeIf(keyInt -> keyInt % 2 == 0);

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE
    //simple equality check
    return tree1.equals(tree2);


  }

} // end treeProblems class
