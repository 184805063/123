package cn.itcast.application;

import java.util.HashMap;

public class DBUtil {
	private static DBUtil instance = null;
	private HashMap<String,User> users = new HashMap<String,User>();
	
	private DBUtil(){
		
		
		User u1=new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("����");
		u1.setCall("15678230984");
		u1.setAccount(10000);
		users.put(u1.getCardId(), u1);
		
		User u2=new User();
		u2.setCardId("1002");
		u2.setCardPwd("000000");
		u2.setUserName("����");
		u2.setCall("16738329473");
		u2.setAccount(20000);
		users.put(u2.getCardId(), u2);
		
		User u3=new User();
		u3.setCardId("1003");
		u3.setCardPwd("654321");
		u3.setUserName("�ŷ�");
		u3.setCall("17836936748");
		u3.setAccount(30000);
		users.put(u3.getCardId(), u3);
	}
	//����ʽ����ģʽ
	public static DBUtil getInstance(){
		if(instance == null){
			synchronized(DBUtil.class){
				if(instance == null){
					instance = new DBUtil();
				}
			}
		}
		return instance;
	}
	//�������п��Ż�ȡ��Ӧ�����˻�����Ϣ
	public User getUser(String cardId){
		User user = (User) users.get(cardId);
		return user;
	}
	//��ȡ�����˻�����Ϣ
	public HashMap<String, User> getUsers(){
		return users;
	}

}
