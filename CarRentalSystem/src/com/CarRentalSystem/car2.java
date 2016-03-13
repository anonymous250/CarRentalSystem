package com.CarRentalSystem;

import java.util.Scanner;

public abstract class extends ChooseCar{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("选择用途为载货");
		System.out.println("为您提供以下车型");
		String Kunk="东风大卡,载货量1-5/t,价格210/天";
		String[] cars=new String[]{Kunk};
		for(int i=0;i<cars.length;i++){ 
			System.out.println(cars[i]);
		}
			Scanner input1=new Scanner(System.in);
			System.out.print("请输入租用天数:");
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*400;
			System.out.println("您租车金额为:"+perice);
			System.out.println("正在打印凭条请稍等......");
			System.out.println("*******************");
			System.out.println("哒哒租车系统");
			System.out.println("租车天数:"+day1);
			System.out.println("总金额:"+perice);
			System.out.println("欢迎下次光临");
			System.out.println("*******************");
		}
	
	}


