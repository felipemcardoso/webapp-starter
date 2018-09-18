package br.com.felipemcardoso.application;

import javax.validation.constraints.NotNull;

public class MyCommand {

    @NotNull(message = "{error.id.notnull}")
    private Integer id;

    public MyCommand() {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
