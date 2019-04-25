package spring;

//사용자로부터 값을 입력->출력해주는 메서드
public class Message2 implements MessageInter {
	 @Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		 System.out.println("반가워요!"+name+"님!");
	}
}
