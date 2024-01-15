package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		// 1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(짝꿍의 이름, 나이를 가지고 있는 데이터(Student) 추가)
		sList.add(new Student("김상원", 25));
		
		// 3. 짝꿍의 이름 출력
		System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 확인할 것!
		// sList.get(0) ---> return type : Student ---> 객체
		
		// 4. 팀원 데이터를 전부 추가하기
		sList.add(new Student("조은해", 23));
		sList.add(new Student("강우석", 28));
		sList.add(new Student("노승우", 27));
		sList.add(new Student("정연재", 27));
		
		// 5. 팀원 이름, 나이 전부 출력!! ==> for-each문 사용해보기!!
		System.out.println("===== 팀원 정보 =====");
		for(Student s : sList) {
			System.out.println(s.getName() + "\t" + s.getAge());
		}
	}

}
