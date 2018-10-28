package test1_2;

import org.apache.commons.lang3.*;
import java.util.Scanner;


public class Test1_2code {

	public Test1_2code() {
		// TODO Auto-generated constructor stub
	}
	
	public static String numSort(String s) {
		
		int[] nums = new int[] {};
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				nums = ArrayUtils.add(nums, ch - '0');

			} 
		}

		if (ArrayUtils.isEmpty(nums)) {
			return ("NoNums");
		} else {
			int min = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				min = i;
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] < nums[min]) {
						min = i; //min = j;
					}
				}
				ArrayUtils.swap(nums, i, min);
			}
			String string="";
			for (int i = 0; i < nums.length; i++) {
				string+=nums[i];
			}
			return string;
		}

	}

	public static String alphabetSort(String string) {
		String alphabets = "";
		char ch;
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				alphabets += ch;
			}
		}
		
		if (StringUtils.isEmpty(alphabets)) {
			return ("NoAlphabets");
		} else {
			char[] s = alphabets.toCharArray();
			int min = 0;
			for (int i = 0; i < s.length - 1; i++) {
				min = i;
				for (int j = i + 1; j < s.length; j++) {
					if (s[j] < s[min]) {
						min = j;
					}
				}
				ArrayUtils.swap(s, min, i);
			}

			String string1="";
			for (int i = 0; i < s.length; i++) {
				string1+=s[i];
			}
			return string1;
		}
	}
	
	public static String sort(String s) {
		
		return(Test1_2code.numSort(s)+Test1_2code.alphabetSort(s));
		
		/*桩模块替换
		char s1[];
		s1=s.toCharArray();
		int min=0;
		for (int i = 0; i < s1.length-1; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[j] < s1[min]) {
					min = j;
				}
			}
			ArrayUtils.swap(s1, min, i);
		}
		String string1="";
		for (int i = 0; i < s1.length; i++) {
			if ((s1[i]>='0'&&s1[i]<='9')||(s1[i]>='a'&&s1[i]<='z')||(s1[i]>='A'&&s1[i]<='Z')) {
				string1+=s1[i];
			}
		}
		if (string1.charAt(0)>'9') {
			return("NoNums"+string1); 
		}
		if (string1.charAt(string1.length()-1)<='9') {
			return(string1+"NoAlphabets");
		}
		return string1;
		*/
	}
	
	public static String StringSwap(String string){
		char[] s = string.toCharArray();
		for (int i = 0; i < s.length/2; i++) {
			ArrayUtils.swap(s, i, s.length-i-1);
		}
		String string1="";
		for (int i = 0; i < s.length; i++) {
			string1+=s[i];
		}
		return string1;
	}

	
}
