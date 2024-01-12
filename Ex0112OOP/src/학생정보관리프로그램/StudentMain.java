package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		// Student 자료형 stu1 객체 생성
		Student stu1 = new Student();
		
		stu1.setName("정연재");
		stu1.setNumber("174495");
		stu1.setAge(27);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		
		// 이름, 자바 점수 출력
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
		// 메소드 이름 위에 마우스 올려서 포스트잇 모양이 뜨면
		// 초록색 동그라미 오른쪽에 있는 자료형이 리턴타입을 의미한다!
		
		// Student 자료형 stu2 객체 생성
		Student stu2 = new Student("임경남", "20240222", 20);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// ****생성자(Constructor)****
		
		
		
	}

}
