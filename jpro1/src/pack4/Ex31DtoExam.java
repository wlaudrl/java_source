package pack4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex31DtoExam {

	private ArrayList<Ex31StudDto> list = new ArrayList<Ex31StudDto>();
	private String name;
	private int kor, eng;

	public void insertList() {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("이름 :");
				name = scanner.next();
				System.out.println("국어 : ");
				kor = scanner.nextInt();
				System.out.println("영어 : ");
				eng = scanner.nextInt();

				Ex31StudDto dto = new Ex31StudDto();
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				list.add(dto);

				System.out.println("계속 할까요?(y/n)");
				if (scanner.next().equalsIgnoreCase("n"))
					break;
			} catch (Exception e) {
				System.out.println("처리 중 오류 :" + e);
				break;
			}

		}
	}

	public void showList() {
		for (Ex31StudDto d : list) {
			System.out.println(d.getName() + " " + d.getKor() + " " + d.getEng());

		}
		System.out.println("응시 인원 : " + list.size() + "명");
	}

	public static void main(String[] args) {
		Ex31DtoExam dtoExam = new Ex31DtoExam();
		dtoExam.showList();
		dtoExam.insertList();

	}
}