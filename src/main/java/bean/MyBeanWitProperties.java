package bean;

public class MyBeanWitProperties implements MyBeanProperties{

    private String url;
    @Override
    public String function(){
        return url;
    }

    public MyBeanWitProperties(String url) {
        this.url = url;
    }
}
