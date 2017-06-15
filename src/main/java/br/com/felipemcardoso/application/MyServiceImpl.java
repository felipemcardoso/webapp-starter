package br.com.felipemcardoso.application;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.inject.Singleton;

@Singleton
public class MyServiceImpl implements MyService {

    private static Logger logger = LogManager.getLogger(MyServiceImpl.class);

    public MyServiceImpl() {
    }

    public void voila() {
        System.out.println("Voila");
        logger.error("Voila Log");
    }
}
