package pointcutexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean(UserDao.class);

        userDao.addUser(); // 输出：***addUser方法开始执行......添加用户成功！
        userDao.deleteUser(); // 输出：***deleteUser方法开始执行......删除用户成功！
    }
}
