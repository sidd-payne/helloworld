package gitdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class helloworld {
	public static String count(String str) {
		int count[]=new  int[26];
		
		for(int i=0;i<str.length();i++) {
		
			count[str.charAt(i)-'a']++;
			
		}
	//	System.out.println(Arrays.toString(count));
		
		for(int i=0;i<count.length;i++) {
			
			if((count[i])%2==0) {
				continue;
			}else {
				return "";
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		List<Integer> answerRes=new ArrayList<Integer>();
		for(int m=0;m<l;m++) {
			int n=sc.nextInt();
		String c=sc.next();
		char str[]=c.toCharArray();
		List<String> res=new ArrayList<String>();
	//	System.out.println(Arrays.toString(str));
		 for (int len = 1; len <= n; len++) {
	            // Pick ending point
	            for (int i = 0; i <= n - len; i++) { 
	                int j = i + len - 1;
	                String temp="";
	                for (int k = i; k <= j; k++) {
	                    temp=temp+str[k];
	                }
	 res.add(temp);
	        //        System.out.println();
	            }

	}
	//	 System.out.println(res);
		 int answer=0;
		
		 for(int i=0;i<res.size();i++) {
			 if(count(res.get(i)).length()>0)
			 answer++;
		 }
		 answerRes.add(answer);
		}
		for(int a:answerRes) {
			System.out.println(a);
		}

}
}
