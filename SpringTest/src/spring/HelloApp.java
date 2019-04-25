package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//스프링 환경구축->라이브러리를 불러와야 된다.

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.xml파일을 불러올 수 있도록 처리->절대,상대경로
		/* (1)
		 Resource resource=new FileSystemResource
				 ("C:/webtest/4.jsp/sou2/SpringTest/src/spring/applicationContext.xml"); */
		
		Resource resource =new ClassPathResource("/spring/applicationContext.xml");
	  //2.	빈즈공장을 불러와서 객체를 생성
		 BeanFactory factory=new XmlBeanFactory(resource);
		 //3.factory ->getBean("불러올 객체를 가져오는 id값을 부여")=>형변환
		// Message1 me=new Message1();
		// Message1 me=(Message1)factory.getBean("test");//Object->Message1
		// Message2 me=(Message2)factory.getBean("test2");
		 MessageInter me=(MessageInter)factory.getBean("test2");
		 me.sayHello("테스트");
	}

}




