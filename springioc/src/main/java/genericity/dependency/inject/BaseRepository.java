package genericity.dependency.inject;

public class BaseRepository<T> {

    public BaseRepository() {
        super();
        System.out.println("BaseRepository�������");
    }
    public void save() {
        System.out.println("BaseRepository ����user����");
    }
}
