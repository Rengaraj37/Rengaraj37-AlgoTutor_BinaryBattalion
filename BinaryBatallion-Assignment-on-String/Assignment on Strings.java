1)  ROMAN TO INTEGER

class Solution {
    public int romanToInt(String s) {
       Map<Character,Integer> map=new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);

       int val=map.get(s.charAt(s.length()-1));
       for(int i=s.length()-2; i>=0; i--)
       {
           if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
           {
               val-=map.get(s.charAt(i));
           }
           else
           {
               val+=map.get(s.charAt(i));
           }
       }
       return val;
    }
}



2) LONGEST COMMON PREFIX

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0)
        {
            return "";
        }
        String r = strs[0];
        for(int i=0; i<n; i++)
        {
            while(strs[i].indexOf(r) != 0)
            {
                r = r.substring(0, r.length()-1);
            }
        }
        return r;
    }
}




3) VALID PALINDROME

class Solution {
    public boolean isPalindrome(String s) {
        String lowerCase = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String Reverse = new StringBuffer(lowerCase).reverse().toString();
        return lowerCase.equals(Reverse);  
    }
}




4) VALID ANAGRAM

class Solution {
    public boolean isAnagram(String s, String t) {
        int S = s.length();
        int R = t.length();
        if(S != R)
        {
            return false;
        }
        int[] varOrder = new int[26];
        for(int i=0; i<S; i++)
        {
            varOrder[s.charAt(i) - 'a']++;
            varOrder[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<varOrder.length; i++)
        {
            if(varOrder[i] != 0)
            {
                return false;
            }
        }
        return true; 
    }
}




5) REVERSE WORDS IN A STRING

class Solution {
    public String reverseWords(String s) {
        int r = 0;
        int k = r;
        String res = "";
        while(r < s.length())
        {
        while(r<s.length() && s.charAt(r)==' ')
            r++;
        if(r >= s.length())  break;
         k = r+1;
        while(k < s.length() && s.charAt(k)!= ' ')
            k++;
        String temp = s.substring(r,k);
        if(res.length() == 0)
            res = temp;
        else
            res = temp+" "+res;
        r = k+1;
        }
        return res;
    }
}




6) COUNT AND SAY

class Solution {
    public String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
        String s = countAndSay(n-1);
        int r = 0;
        StringBuilder res = new StringBuilder();
        while(r < s.length())
        {
            int now  = s.charAt(r) - '0';
            int num = 1;
            while(r+1<s.length() && now==s.charAt(r+1)-'0')
            {
                num++;
                r++;
            }
            res.append(String.valueOf(num) + String.valueOf(now));
            r++;
        }
        return  res.toString(); 
    }
}




7) LONGEST VALID PARANTHESIS

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> k = new Stack<>();
        k.push(-1);
        int r = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                k.push(i);
            }
            else if(s.charAt(i) == ')')
            {
                k.pop();
                if(k.empty())
                {
                    k.push(i);
                }
                else
                {
                    r = Math.max(r, i-k.peek());
                }
            }
        }
        return r;
    }
}




8) VALID NUMBER

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
        public boolean isNumber(String s) {
    	s = s.trim();
    	if(s.length() == 0) {
    		return false;
    	}
    	boolean result = true;
        try{
        	new BigDecimal(s);
        } catch(Exception e) {
        	result = false;
        }
        if(s.contains("e")) {
        	int firstIndex = s.indexOf("e");
        	int lastIndex = s.lastIndexOf("e");
        	if(lastIndex != firstIndex) {
        		return false;
        	}
        	try{
        		new BigDecimal(s.substring(0, firstIndex));
        		new BigInteger(s.substring(firstIndex + 1));
        		result = true;
        	} catch(Exception e) {
            	result = false;
            }
        }
        return result;
    }
}
