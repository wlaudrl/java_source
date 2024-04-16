package pack3;

public class Ex14Main {

	public static void main(String[] args) {
		// 개과의 동물들 상속으로 처리
		Ex14Dog dog = new Ex14Dog();
		dog.prinMsg();
		System.out.println(dog.callName());
		
		System.out.println("HouseDog---------");
		Ex14HoseDog hd = new Ex14HoseDog("집개");
		hd.prinMsg();
		System.out.println(hd.callName());
		
		
		System.out.println("wolfDog---------");
		Ex14WolfDog wolfDog = new Ex14WolfDog("늑대");
		wolfDog.prinMsg();
		System.out.println(wolfDog.callName());
		
		wolfDog.display();
		
		System.out.println("\n\n주소 치환 ***************");
		Ex14WolfDog bushdog = wolfDog; // 같은 타입에 변수에게 주소를 치환
		wolfDog.printMsg();
		bushdog.printMsg();
		
		System.out.println(); 
	//	Ex14HoseDog hd2 =wolfDog;  // Type mismatch 에러
		Ex14Dog dog2 = wolfDog; // 타입은 다르지만 부모변수에 자식변수 주소 치환 가능 
		dog2.prinMsg();
		
		Ex14Dog dog3 = new Ex14Dog();
		dog3.prinMsg();
		// Ex14WolfDog wolfDog2 = dog3; // 자식 객체변수의 부모변수 주소 치환불가
		// wolfDog = dog3;
				
		

	}

}
