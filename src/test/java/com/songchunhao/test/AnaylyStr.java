package com.songchunhao.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import com.sch.utils.NumberUtils;
import com.sch.utils.StringUtils;


public class AnaylyStr {

	@Test
	public void analyzeStr() {
		String  str = "* Because TreeNodes are about twice the size of regular nodes, we\r\n" + 
				"     * use them only when bins contain enough nodes to warrant use\r\n" + 
				"     * (see TREEIFY_THRESHOLD). And when they become too small (due to\r\n" + 
				"     * removal or resizing) they are converted back to plain bins.  In\r\n" + 
				"     * usages with well-distributed user hashCodes, tree bins are\r\n" + 
				"     * rarely used.  Ideally, under random hashCodes, the frequency of\r\n" + 
				"     * nodes in bins follows a Poisson distribution\r\n" + 
				"     * (http://en.wikipedia.org/wiki/Poisson_distribution) with a\r\n" + 
				"     * parameter of about 0.5 on average for the default resizing\r\n" + 
				"     * threshold of 0.75, although with a large variance because of\r\n" + 
				"     * resizing granularity. Ignoring variance, the expected\r\n" + 
				"     * occurrences of list size k are (exp(-0.5) * pow(0.5, k) /\r\n" + 
				"     * factorial(k)). The first values are";
		
		String[] split = str.split("");
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		for (String c : split) {
			Integer cnt = hashMap.get(c);
			if(cnt==null) {
				hashMap.put(c, 1);
			}else {
				hashMap.put(c, ++cnt);
			}
		}
		hashMap.forEach((key,value)->{
			System.out.println(" key is [" + key + "] 出现的次数是 [" + value + "]");
		});
		System.out.println("------------------------------------------");
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(" key is [" + entry.getKey() + "] 出现的次数是 [" + entry.getValue() + "]");
		}
		
		
		System.out.println("=========================================");
		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
			System.out.println(" key is [" + key + "] 出现的次数是 [" + hashMap.get(key) + "]");
		}
		
		
		// 求超过三次的单词
		String[] split2 = str.split(" ");
		HashMap<String, Integer> hashMap2 = new HashMap<String,Integer>();
		for (String string : split2) {
			Integer cnt  = hashMap2.get(string);
			if(cnt==null) {
				hashMap2.put(string, 1);
			}else {
				hashMap2.put(string, cnt+1);
			}
		}
		
		HashSet<String> hashSet = new HashSet<String>();
		hashMap2.forEach((key,val)->{
			if(val>=3)
				hashSet.add(key);
		});
		
		hashSet.forEach(x->{
			System.out.println(" x is " + x);
		});
	}
}
