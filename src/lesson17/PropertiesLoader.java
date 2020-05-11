package lesson17;

import java.util.Properties;

public class PropertiesLoader {
    private static PropertiesLoader propertiesLoader;
    private String propFilName;

    // возможно создание обьтекта только внутри класса


    public static PropertiesLoader getPropertiesLoader(String propFilName){ ///ДЛя многопоточности не подходит
        if(propertiesLoader  == null){
            propertiesLoader = new PropertiesLoader(propFilName);

        }
        return propertiesLoader;
    }

    private Properties properties;
    private PropertiesLoader(String propFilName){
        this.properties = new Properties();
        this.propFilName = propFilName;

        loadProperties();

    }

    private void loadProperties(){}

}
