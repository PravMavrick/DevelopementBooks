package com.shoppingbasket.price.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ShoppingBasket {

    private int bookId;
    private String bookName;
    private int bookQuantity;

}
