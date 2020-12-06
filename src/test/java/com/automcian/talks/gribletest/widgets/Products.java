package com.automcian.talks.gribletest.widgets;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class Products {
    public void open() {
        Selenide.open("/");
    }

    public void add(String name) {
        $("#btn-add-product").click();
        new Dialog().setFor("Name", name);
    }
}
