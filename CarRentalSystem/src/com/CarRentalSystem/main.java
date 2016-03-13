package com.CarRentalSystem;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入序号选择用途：1：载人 2：载货");
		int num=input.nextInt();
		ChooseCar car=new cars() {
		};
		ChooseCar car2=new car2() {
		};
		switch(num){
		case 1:car.price();break;
		case 2:car2.price();break;
		}
	}

}
