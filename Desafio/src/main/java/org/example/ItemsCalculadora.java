package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemsCalculadora{
    public double n1;
    public double n2;
    private int valor;
    private int valor_menu;
    private String message;
}
