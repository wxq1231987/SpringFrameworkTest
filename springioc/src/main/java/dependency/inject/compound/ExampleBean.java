package dependency.inject.compound;

public class ExampleBean {
    private AnotherBean anotherBean;
    private YetAnotherBean yetAnotherBean;
    private int i;
    private ExampleBean(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        super();
        this.anotherBean = anotherBean;
        this.yetAnotherBean = yetAnotherBean;
        this.i = i;
    }

    private ExampleBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**public ExampleBean(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
        super();
        this.anotherBean = anotherBean;
        this.yetAnotherBean = yetAnotherBean;
        this.i = i;
    }

    public ExampleBean() {
        super();
    }


    public AnotherBean getAnotherBean() {
        return anotherBean;
    }
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
    public YetAnotherBean getYetAnotherBean() {
        return yetAnotherBean;
    }
    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    **/
    public static ExampleBean createExampleBean(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, 
            int i) {
        ExampleBean exampleBean = new ExampleBean(anotherBean, yetAnotherBean, i);
        return exampleBean;
    }
}