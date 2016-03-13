package com.CarRentalSystem;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Scanner;

public abstract class cars extends ChooseCar {
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("选择用途为载人");
		System.out.println("为您提供以下车型");
		String Bwm="宝马3系,载人数：5，价格400天";
		String Audi="奥迪A4,载人数:5,价格:450/天";
		String Benz="奔驰GLK300,载人数:5,价格:500/天";
		String[] cars=new String[]{Audi,Benz};
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
		System.out.println("请选择车型: 1:宝马3系 2:奥迪A4 3:奔驰GLK300");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num==1){
			System.out.println("你选择了宝马3系");
			System.out.print("请输入租用天数:");
			Scanner input1=new Scanner(System.in);
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
		if(num==2){
			System.out.println("你选择了奥迪A4");
			System.out.print("请输入租用天数:");
			Scanner input1=new Scanner(System.in);
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*450;
			System.out.println("您租车金额为:"+perice);
			System.out.println("正在打印凭条请稍等......");
			System.out.println("*******************");
			System.out.println("哒哒租车系统");
			System.out.println("租车天数:"+day1);
			System.out.println("总金额:"+perice);
			System.out.println("欢迎下次光临");
			System.out.println("*******************");
		}
		if(num==3){
			System.out.println("你选择了奔驰GLK300");
			System.out.print("请输入租用天数:");
			Scanner input1=new Scanner(System.in);
			int day1=input1.nextInt();
			int perice=0;
			perice=day1*500;
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
}
