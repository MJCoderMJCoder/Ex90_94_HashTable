package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ex90_94_HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("001", "��ѧӢ��");
		table.put("002", "�ߵ���ѧ");
		table.put("003", "��ѧ����");
		table.put("004", "��ѧ����");
		System.out.println("��ϣ���е�Ԫ��Ϊ��");
		Enumeration em = table.keys(); //��e��tabl��Enumeration������
		while(em.hasMoreElements()) {
			Object key = em.nextElement(); //������һ��Ԫ��
			Object element = table.get(key); //���ؼ�ֵ��Ӧ��Ԫ��
			System.out.println(key + "��" + element);
		}
		System.out.println("�ù�ϣ�����Ƿ����'��ѧ����'��" + table.contains("��ѧ����")); 
	}

}
