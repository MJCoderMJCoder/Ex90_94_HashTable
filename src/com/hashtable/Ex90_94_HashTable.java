package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ex90_94_HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("001", "大学英语");
		table.put("002", "高等数学");
		table.put("003", "大学语文");
		table.put("004", "大学物理");
		System.out.println("哈希表中的元素为：");
		Enumeration em = table.keys(); //创e建tabl的Enumeration迭代器
		while(em.hasMoreElements()) {
			Object key = em.nextElement(); //返回下一个元素
			Object element = table.get(key); //返回键值对应的元素
			System.out.println(key + "：" + element);
		}
		System.out.println("该哈希表中是否包含'大学物理'：" + table.contains("大学物理")); 
	}

}
