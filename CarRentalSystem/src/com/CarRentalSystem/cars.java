package com.CarRentalSystem;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Scanner;

public abstract class cars extends ChooseCar {
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("ѡ����;Ϊ����");
		System.out.println("Ϊ���ṩ���³���");
		String Bwm="����3ϵ,��������5���۸�400��";
		String Audi="�µ�A4,������:5,�۸�:450/��";
		String Benz="����GLK300,������:5,�۸�:500/��";
		String[] cars=new String[]{Audi,Benz};
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
		System.out.println("��ѡ����: 1:����3ϵ 2:�µ�A4 3:����GLK300");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.println("��ѡ���˱���3ϵ");
			System.out.print("��������������:");
			Scanner input1=new Scanner(System.in);
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*400;
			System.out.println("���⳵���Ϊ:"+perice);
			System.out.println("���ڴ�ӡƾ�����Ե�......");
			System.out.println("*******************");
			System.out.println("�����⳵ϵͳ");
			System.out.println("�⳵����:"+day1);
			System.out.println("�ܽ��:"+perice);
			System.out.println("��ӭ�´ι���");
			System.out.println("*******************");
		}
		if(num==2){
			System.out.println("��ѡ���˰µ�A4");
			System.out.print("��������������:");
			Scanner input1=new Scanner(System.in);
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*450;
			System.out.println("���⳵���Ϊ:"+perice);
			System.out.println("���ڴ�ӡƾ�����Ե�......");
			System.out.println("*******************");
			System.out.println("�����⳵ϵͳ");
			System.out.println("�⳵����:"+day1);
			System.out.println("�ܽ��:"+perice);
			System.out.println("��ӭ�´ι���");
			System.out.println("*******************");
		}
		if(num==3){
			System.out.println("��ѡ���˱���GLK300");
			System.out.print("��������������:");
			Scanner input1=new Scanner(System.in);
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*500;
			System.out.println("���⳵���Ϊ:"+perice);
			System.out.println("���ڴ�ӡƾ�����Ե�......");
			System.out.println("*******************");
			System.out.println("�����⳵ϵͳ");
			System.out.println("�⳵����:"+day1);
			System.out.println("�ܽ��:"+perice);
			System.out.println("��ӭ�´ι���");
			System.out.println("*******************");
		}
	}
}
