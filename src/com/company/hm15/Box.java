package com.company.hm15;

import java.util.ArrayList;
import java.util.List;


public class Box<K extends Fruit> {
    private static final float EMPTY_SIZE = 0.0F;
    public List<K> getFruits() {
        return fruits;
    }
    private List<K> fruits = new ArrayList<>();

    /*2.4. Реализовать метод добавление фрукта (1 ед.) в коробку.*/
    public void add(K fruit) {
        fruits.add(fruit);
    }

    /*2.5. Реализовать метод добавление фруктов (множ.) в коробку.*/
    public void addAll(List<K> otherFruits) {
        fruits.addAll(otherFruits);
    }

    /*2.6 Реализовать метод getWeight(). Метод высчитывает вес коробки на основании веса одного фрукта
    и его количества. Вес: яблока - 1.0F, апельсина - 1.5F.*/
    public float getWeight() {
        if (fruits.isEmpty()) {
            return EMPTY_SIZE;
        }
        for (K fruit : fruits) {
            if (fruit != null) {
                return fruit.getWeight() * fruits.size();
            }
        }
        return EMPTY_SIZE;
    }

    /*2.7 В классе Box реализовать метод compare. Метод производит сравнение текущую коробки с переденной
    в качестве параметра. Возвращать true - если их веса равны, в противном случае - false
    ВАЖНО! Можно сравнивать коробки содержащие различные фрукты. Так, коробки с яблоками возможно сравнивать
    с коробками с апельсинами и так далее.*/

    public boolean compare(Box<? extends Fruit> otherFruits) {
        return getWeight() == otherFruits.getWeight();
    }

   /*2.8 Реализовать метод merge. Метод выполняет пересыпание из переданной коробки в качестве параметра,
    в текущую. Однако, стоит учитывать, что в одну коробку нельзя сложить фрукты одинакого типа.*/
    public void merge(Box<K> otherFruits) {
        fruits.addAll(otherFruits.getFruits());
        otherFruits.getFruits().clear();
    }
}