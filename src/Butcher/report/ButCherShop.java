package Butcher.report;

import java.util.ArrayList;
import java.util.Scanner;

import Customer.*;
import Todaysale.*;
import Utils.*;

public class ButCherShop {
		
		
		private static Meat[] meatArray = new Meat[10];
		private static Scanner scanner = new Scanner(System.in);
		
		
	public static void main(String[] args) {
	
		
		
		boolean run = true;
		
		while (run) {
			System.out.println("----------------------------");
			System.out.println("HappyButchershop 오신걸 환영합니다");
			System.out.println("1. 들어간다 |  2. 나간다.");
			System.out.println("-------------------------------");
			System.out.println("선택>"); 
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			case 1:
				createmeat();
				break;
			case 2:
				
				return;
			}
		}
	}
	
	private static void createmeat() {
		Meat[] meat = {new USAMeat(),new KoreaMeat()};
		ArrayList<Stake> stakeList = new ArrayList<>();
		
		Stake pig = new Stake("돼지앞다리" , "A+" , 2250 , Define.KOREA);
		Stake cow = new Stake("소고기" , "Primes" , 4510 , Define.USA );
		Stake coke = new Stake("닭고기" , "B" ,  1200 , Define.KOREA);
		Stake sam = new Stake("삼결살" , "A" ,3100 ,Define.KOREA);
		Stake gal = new Stake("갈비살" ,"A+" , 3500 ,Define.KOREA);
		
		stakeList.add(pig);
		stakeList.add(cow);
		stakeList.add(sam);
		stakeList.add(gal);
		stakeList.add(coke);
		
		System.out.println("===================================");
		System.out.println("            오늘의 고기 종류            ");
		System.out.println("1:" +pig.getName() + " 등급:" + pig.getGrade() + " 가격:" + pig.getPrice() );
		System.out.println("2:" +cow.getName() + " 등급:" + cow.getGrade() + " 가격:" + cow.getPrice() );
		System.out.println("3:" +coke.getName() + " 등급:" + coke.getGrade() + " 가격:" + coke.getPrice() );
		System.out.println("4:" +sam.getName() + " 등급:" + sam.getGrade() + " 가격:" + sam.getPrice() );
		System.out.println("5:" +gal.getName() + " 등급:" + gal.getGrade() + " 가격:" + gal.getPrice() );
		System.out.println("===================================");
		
		int selectNo = scanner.nextInt();
		
		switch (selectNo) {
		case 1:
			System.out.println(pig);
			break;
		case 2:
			System.out.println(cow);
			break;
		case 3:
			System.out.println(coke);
			break;
		case 4:
			System.out.println(sam);
			break;
		case 5:
			System.out.println(gal);
			break;

		default:
			break;
		}
		
	}
	
	
	private static void createCustomer() {
		ArrayList<Customer> customerlist = new ArrayList<>();
		
		Customer hong = new GoldCustomer("홍길동");
		Customer Eunji = new BlackCustomer("김은지");
		Customer Pill = new VipCustomer("박필영");
		Customer Kim = new Customer("김유신");
		
		//리스트에 넣어줌 
		customerlist.add(Eunji);
		customerlist.add(hong);
		customerlist.add(Pill);
		customerlist.add(Kim);
	}
}
