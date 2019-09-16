package genericity.dependency.inject;

public class BaseRepository<T> {

    public BaseRepository() {
        super();
        System.out.println("BaseRepository构造好了");
    }
    public void save() {
        System.out.println("BaseRepository 保存user对象");
    }
}
