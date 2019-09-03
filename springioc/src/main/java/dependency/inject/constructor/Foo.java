package dependency.inject.constructor;

public class Foo {
    private Bar bar;
    private Baz baz;
    public Foo(Bar bar, Baz baz) {
        super();
        this.bar = bar;
        this.baz = baz;
    }
}