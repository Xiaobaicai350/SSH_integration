package pointcutexample;


public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户成功！");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户成功！");
    }
}
