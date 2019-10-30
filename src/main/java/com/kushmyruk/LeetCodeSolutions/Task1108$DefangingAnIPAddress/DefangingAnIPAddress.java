package com.kushmyruk.LeetCodeSolutions.Task1108$DefangingAnIPAddress;

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//A defanged IP address replaces every period "." with "[.]".
//
//Example 1:
//
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
//Example 2:
//
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
//
//Constraints:
//
//The given address is a valid IPv4 address.

public class DefangingAnIPAddress {

    //Runtime 1ms; Its uses StringBuffer, multithreading-safe
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

//    Runtime 0ms;
//    public String defangIPaddr(String address) {
//        final StringBuilder builder = new StringBuilder();
//        for(char c : address.toCharArray()) {
//            if (c == '.') {
//                builder.append("[.]");
//            } else {
//                builder.append(c);
//            }
//        }
//        return builder.toString();
//    }

}
