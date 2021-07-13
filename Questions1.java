package ComprinnoTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questions1 {
	public static void main(String[] args) throws java.lang.Exception{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int t=sc.nextInt();
			while(t-->0){
			    String s=sc.next();
			Map<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length();i++) {
				if(map.containsKey(s.charAt(i))) {
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				}
				else {
					map.put(s.charAt(i), 1);
				}
			}
			int[] dp=new int[map.size()];
			int i=0;
			for(Map.Entry<Character, Integer> entry:map.entrySet()) {
				dp[i]=entry.getValue();
				i++;
			}
			boolean flag=false;
			Arrays.sort(dp);
			if(dp.length<3){
			    System.out.println("Dynamic");
			    continue;
			}
			else{
			    if(checkfib(dp)==true){
			        System.out.println("Dynamic");
			    }
			    else{
			        int tmp=dp[0];
			        dp[0]=dp[1];
			        dp[1]=tmp;
			        if(checkfib(dp)==true){
			            System.out.println("Dynamic");
			        }
			        else{
			            System.out.println("Not");
			        }
			    }
			}
		   }
			sc.close();
		}
		static boolean checkfib(int[] dp){
		    for(int i=2;i<dp.length;i++){
		        if(dp[i]!=dp[i-1]+dp[i-2]){
		            return false;
		        }
		    }
		    return true;
		}
		
	}

