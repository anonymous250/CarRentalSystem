package com.CarRentalSystem;

import java.util.Scanner;

public abstract class extends ChooseCar{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("ѡ����;Ϊ�ػ�");
		System.out.println("Ϊ���ṩ���³���");
		String Kunk="�����,�ػ���1-5/t,�۸�210/��";
		String[] cars=new String[]{Kunk};
		for(int i=0;i<cars.length;i++){ 
			System.out.println(cars[i]);
		}
			Scanner input1=new Scanner(System.in);
			System.out.print("��������������:");
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
	
	}


