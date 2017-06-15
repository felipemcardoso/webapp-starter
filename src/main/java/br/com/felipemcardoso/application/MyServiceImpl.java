package br.com.felipemcardoso.application;

import javax.inject.Singleton;

@Singleton
public class MyServiceImpl implements MyService {

    public MyServiceImpl() {
        System.out.println(MyServiceImpl.class);
    }

    public void voila() {
        System.out.println("Voila");
    }
}
