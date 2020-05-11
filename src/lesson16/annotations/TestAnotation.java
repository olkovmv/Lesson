package lesson16.annotations;

import java.text.Annotation;
import java.util.Arrays;

@ClassConfig(prefix = "test", version = 1 )
public class TestAnotation {
    @Requaered
    private String strmgData;

    public TestAnotation(String strmgData) {
        this.strmgData = strmgData;
    }

    public TestAnotation() {

    }

    public String getStrmgData() {
        return strmgData;
    }

    public void setStrmgData(String strmgData) {
        this.strmgData = strmgData;
    }

    @Override
    public String toString() {
        return "TestAnotation{" +
                "strmgData='" + strmgData + '\'' +
                '}';
    }
}

//    public static void main(String[] args) {
//        Class testClass = TestAnotation.class;
//// получение все анотации класса
//        Annotation[] annotations = testClass.getAnnotations();
//                System.out.println(Arrays.toString(annotations));
//
//
//                if (testClass.isAnnotationPresent(ClassConfig.class)){
//                    System.out.println("ClassConfig");
//                    //получаем ссылку на анотацию
//                }
//
//
//                }