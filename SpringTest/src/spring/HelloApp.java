package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
//������ ȯ�汸��->���̺귯���� �ҷ��;� �ȴ�.

public class HelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.xml������ �ҷ��� �� �ֵ��� ó��->����,�����
		/* (1)
		 Resource resource=new FileSystemResource
				 ("C:/webtest/4.jsp/sou2/SpringTest/src/spring/applicationContext.xml"); */
		
		Resource resource =new ClassPathResource("/spring/applicationContext.xml");
	  //2.	��������� �ҷ��ͼ� ��ü�� ����
		 BeanFactory factory=new XmlBeanFactory(resource);
		 //3.factory ->getBean("�ҷ��� ��ü�� �������� id���� �ο�")=>����ȯ
		// Message1 me=new Message1();
		// Message1 me=(Message1)factory.getBean("test");//Object->Message1
		// Message2 me=(Message2)factory.getBean("test2");
		 MessageInter me=(MessageInter)factory.getBean("test2");
		 me.sayHello("�׽�Ʈ");
	}

}




