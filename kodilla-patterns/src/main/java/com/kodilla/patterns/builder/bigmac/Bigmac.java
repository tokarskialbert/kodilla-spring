package com.kodilla.patterns.builder.bigmac;

import sun.text.bidi.BidiLine;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private BUN bun;
    private int burgers;
    private SAUCE sauce;
    private List<INGREDIENTS> ingredients;

    public BUN getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public SAUCE getSauce() {
        return sauce;
    }

    public List<INGREDIENTS> getIngredients() {
        return ingredients;
    }

    private Bigmac(final BUN bun, final int burgers, final SAUCE sauce, final List<INGREDIENTS> ingredients) {

        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class Builder {

        private BUN bun;
        private int burgers;
        private SAUCE sauce;
        private List<INGREDIENTS> ingredients = new ArrayList<>();

        public Builder bun(BUN bun) {
            this.bun = bun;
            return this;
        }

        public Builder burger(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Builder sauce(SAUCE sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder ingredient(INGREDIENTS ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
