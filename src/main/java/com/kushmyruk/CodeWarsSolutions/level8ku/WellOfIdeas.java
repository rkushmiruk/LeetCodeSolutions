package com.kushmyruk.CodeWarsSolutions.level8ku;

/**
 * For every good kata idea there seem to be quite a few bad ones!
 *
 * In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
 * If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
 * If there are no good ideas, as is often the case, return 'Fail!'.
 */
public class WellOfIdeas {
    public static String well(String[] x) {
        int count = 0;
        for (String e : x) {
            if (e.equalsIgnoreCase("good")) {
                count++;
            }
        }
        if (count > 2) {
            return "I smell a series!";
        }
        else if (count > 0) {
            return "Publish!";
        }
        else return "Fail!";
    }

//    public static String well(String[] x) {
//        switch (Collections.frequency(Arrays.asList(x), "good")) {
//            case 1:
//            case 2:
//                return "Publish!";
//            case 0:
//                return "Fail!";
//            default:
//                return "I smell a series!";
//        }
//    }
}
