package dev.felipemcardoso.webstarter.domain.model.identity;

public class User {

    private String id;
    private String alias;
    private String data;

    public User(String id, String alias, String data) {
        this.id = id;
        this.alias = alias;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public String getAlias() {
        return alias;
    }

    public String getData() {
        return data;
    }
}
