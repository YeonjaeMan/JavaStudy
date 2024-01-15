package PokemonGame;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 두 마리 포켓몬 생성(객체 생성)
		// 메타몽 / 노멀 / 변신하기 / hp : 80 / atk : 10
		Pokemon meta = new Pokemon("메타몽", 80, 10, "변신하기", "노멀");
		// 피카츄 / 전기 / 백만볼트 / hp : 100 / atk : 15
		Pokemon pika = new Pokemon("피카츄", 100, 15, "백만볼트", "전기");

		while (true) {
			System.out.println("포켓몬을 선택하세요 : ");
			System.out.print("[1]메타몽 [2]피카츄 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				// 사용자가 메타몽을 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반 공격 [2]스킬 공격 >> ");
				int choiseAtk = sc.nextInt();

				if (choiseAtk == 1) {
					// 메타몽이 피카츄를 일반 공격하겠다.
					// 1. 메타몽의 atk만큼 피카츄의 hp가 감소한다.
					//    피카츄의 현재 = 피카츄의 현재 hp - 메타몽의 atk
					pika.setHp(pika.getHp() - meta.getAtk());
					// 2. 두 마리 포켓몬의 현재 hp 출력!
					System.out.println("메타몽의 HP : " + meta.getHp());
					System.out.println("피카츄의 HP : " + pika.getHp());
					
				} else if (choiseAtk == 2) {
					// 메타몽이 피카츄를 스킬 공격하겠다.
					// 1. 메타몽의 atk의 1.5배만큼 피카츄의 hp가 감소한다.
					//    피카츄의 현재 hp = 피카츄의 현재 hp - 메타몽의 atk*1.5
					pika.setHp((int)(pika.getHp() - (meta.getAtk() * 1.5)));
					
					// 2. 메타몽의 스킬을 출력
					System.out.println(meta.getName() + "!!!! " + meta.getSkill() + "!!!!");
					
					// 3. 두 마리 포켓몬의 현재 hp 출력!
					System.out.println("메타몽의 HP : " + meta.getHp());
					System.out.println("피카츄의 HP : " + pika.getHp());
					
				} else {
					System.out.println();
				}

			} else if (choice == 2) {
				// 사용자가 피카츄를 선택
				System.out.println("공격을 선택하세요.");
				System.out.print("[1]일반 공격 [2]스킬 공격 >> ");
				int choiseAtk = sc.nextInt();

				if (choiseAtk == 1) {
					// 피카츄가 메타몽을 일반 공격하겠다.
					// 1. 피카츄의 atk만큼 메타몽의 hp가 감소
					//	  메타몽의 현재 hp = 메타몽의 현재 hp - 피카츄의 atk
					meta.setHp(meta.getHp() - pika.getAtk());
					// 2. 두 포켓몬의 hp 출력
					System.out.println("메타몽의 HP : " + meta.getHp());
					System.out.println("피카츄의 HP : " + pika.getHp());

				} else if (choiseAtk == 2) {
					// 피카츄가 메타몽을 스킬 공격하겠다.
					// 3. 피카츄의 atk*1.5만큼 메타몽의 hp 감소
					//    메타몽의 현재 hp = 메타몽의 현재 hp - 피카츄의 atk*1.5
					meta.setHp((int)(meta.getHp() - pika.getAtk()*1.5));
					// 4. "피카츄!!!! 백만볼트!!!!" 라고 출력
					System.out.println(pika.getName() + "!!!! " + pika.getSkill() + "!!!!");
					// 5. 두 포켓몬의 hp 출력
					System.out.println("메타몽의 HP : " + meta.getHp());
					System.out.println("피카츄의 HP : " + pika.getHp());

				} else {
					System.out.println();
				}

			} else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}
			
			// ------------------------------------------------------
			// 1. 둘 중에 한 마리의 포켓몬의 hp가 0보다 작거나 같을 때 프로그램을 종료
			// 2. 승자가 누구인지 출력
			// 단, Pokemon 설계도는 건드리지 말 것.
			if(meta.getHp() <= 0) {
				System.out.println(pika.getName() + "가 승리했습니다.");
				break;
			} else if(pika.getHp() <= 0) {
				System.out.println(meta.getName() + "이 승리했습니다.");
				break;
			} else {
				continue;
			}
			
			

		}

	}

}
