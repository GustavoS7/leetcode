package com.gustavo.leetcode.findtheindexofthefirstoccurrenceinastring;

public class Solution {
  public static int strStr(String haystack, String needle) {
    int i = 0;
    int index = -1;

    while (i < haystack.length() && haystack.length() - i - needle.length() > 0) {
      boolean isValid = true;
      for (int j = 0, x = i; j < needle.length(); j++) {
        if (haystack.charAt(x) != needle.charAt(j) ) {
          isValid = false;
          break;
        }
        x++;
      }
      if (isValid) {
        index = i;
        break;
      };
      i++;
    }

    return index;
  }
}


// class Solution {
//   public int strStr(String haystack, String needle) 
//   {
//       for(int i=0;i<haystack.length();i++)
//       {
//           if(haystack.charAt(i)==needle.charAt(0))
//           {
//               if(i+needle.length()<=haystack.length())
//               {
//                   if(haystack.substring(i,i+needle.length()).equals(needle))
//                   {
//                       return i;
//                   }
//               }
//           }
//       }
//       return -1;
//   }
// }