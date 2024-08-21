package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<UserInfo> userList = new ArrayList<>();
        boolean keepRunning = true;
        
        while (keepRunning) {
            System.out.print("아이디 생성 : ");
            String id = sc.nextLine();

            if (id.isEmpty()) {
                keepRunning = false;
                break;
            }

            // 아이디 중복 체크
            boolean idExists = false;
            for (UserInfo user : userList) {
                if (user.getId().equals(id)) {
                    idExists = true;
                    break;
                }
            }
            if (idExists) {
                System.out.println("아이디가 중복됩니다");
                continue; // 중복된 아이디의 경우 다시 입력받도록 함
            }

            System.out.print("패스워드 입력 : ");
            int pwd = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            // 새로운 사용자 추가
            UserInfo newUser = new UserInfo(id, pwd);
            userList.add(newUser);

            // 유저 정보 출력
            for (UserInfo user : userList) {
                System.out.println(user.getId());
                System.out.println(user.getPwd());
                System.out.println("------------------------");
            }
        }
	}

}
