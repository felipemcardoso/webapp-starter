package br.com.felipemcardoso.application;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MyCommand {

    @NotNull
    @Size(min = 2, max = 50)
    private String id;

    public MyCommand() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
