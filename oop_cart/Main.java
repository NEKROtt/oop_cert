package oop_cart;

/**
 * Итоговое домашнее задание по курсу ООП:
 * Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 * Можно выбрать другой язык программирования, например C# или Python, если выбран язык, отличный от JAVA, 
 * то необходимо написать документ, каким образом можно запустить приложение (что необходимо установить, каким образом запускать и т.п.).
 */

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new FileLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
