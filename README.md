# Инструмент анализа статистики продаж

## Данный инструмент предназначен для автоматизации некоторых задач из отдела продаж.

### Представлена первая версия данного сервиса:
Класс Main:
```java
public class Main {

    public static void main(String[] args) {
        int[] sales = new int[] {100, 200, 300, 400};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);
    }
}
```
Класс SalesManager:
```java
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```