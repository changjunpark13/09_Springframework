package com.ohgiraffers.mapping.section03.compositekey.subsection02.idclass;

import java.io.Serializable;
import java.util.Objects;

public class CartCompositeKey implements Serializable {
    private int cartOwner;
    private int addedBook;

    public CartCompositeKey() {
    }

    public CartCompositeKey(int cartOwner, int addedBook) {
        this.cartOwner = cartOwner;
        this.addedBook = addedBook;
    }

    // 밑에 두개를 해주면 동등 객체가 동일 객체로 바뀐다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CartCompositeKey that = (CartCompositeKey) o;
        return cartOwner == that.cartOwner && addedBook == that.addedBook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartOwner, addedBook);
    }
}
