# Lab_7
## Функціональність програми
Реалізувати спрощену систему бек-енду для платформи електронної комерції, використовуючи Java Collections, зосереджуючись на управлінні запасами, управлінні корзиною користувача та обробці замовлень.
### Етапи
Спроєктувати класи такі класи:
- Product в якому має бути id, name, price ,stock, та відповідні конструктори та гетери.
- User в якому має бути id, cart та відповідні конструктори та гетери.
- Order в якому має бути id, userId, orderDetails та відповідні конструктори та гетери.
Реалізувати такі платформи електронної комерції:
- ECommercePlatform в якому має бути Поля users, products, orders, та методи для додавання користувачів, товарів, створення замовлення, переліку доступних товарів, переліку користувачів, переліку замовлень та оновлення запасів товарів.
- ECommerceDemo який є класом для демонстрації функціональності.
Реалізувати такі розширені функції:
- Comparable у класі Product для сортування за ціною.
- Клас Comparator для сортування Товарів за назвою та запасами.
- Реалізувати функцію для рекомендації товарів користувачам.
## Опис роботи
- Створено клас Product в якому є id, name, price ,stock, та відповідні конструктори та гетери.
- Створено User є id, cart та відповідні конструктори та гетери.
- Створено Order є id, userId, orderDetails та відповідні конструктори та гетери.
- Створено ECommercePlatform є Поля users, products, orders, та методи про яких було сказано вище.
- Створено ECommerceDemo який є класом для демонстрації функціональності.
- Реалізовано Comparable у класі Product для сортування за ціною.
- Реалізовано Comparator для сортування Товарів за назвою та запасами.
- Реалізовано функцію для рекомендації товарів користувачам.
## Тестування
Було створено клас EcommercePlatformTest
EcommercePlatformTest має в собі такі тести:
- RegisterUser_ValidUser_ShouldBeListedInCustomers: Перевіряє, чи користувач, який був зареєстрований, дійсно присутній в списку клієнтів.
- RegisterProduct_RegisteredProduct_ShouldThrowECommersObjectRegistrationException: Перевіряє, чи генерується виняток, коли спробують зареєструвати продукт, який вже зареєстрований.
- RegisterProduct_ValidProduct_ShouldBeListedAvailableInProducts: Перевіряє, чи продукт, який був зареєстрований, дійсно присутній в списку доступних продуктів.
- RegisterUser_RegisteredUser_ShouldThrowECommersObjectRegistrationException: Перевіряє, чи генерується виняток, коли спробують зареєструвати користувача, який вже зареєстрований.
- MakeOrder_ValidOrder_ShouldBeListedInOrders: Перевіряє, чи замовлення, яке було зроблено, дійсно присутнє в списку замовлень.
- MakeOrder_SameOrder_ShouldThrowECommersObjectRegistrationException: Перевіряє, чи генерується виняток, коли спробують зробити те ж саме замовлення знову.
- MakeOrder_InsufficientStockProduct_ShouldThrowECommersException: Перевіряє, чи генерується виняток, коли спробують зробити замовлення з недостатньою кількістю продукту на складі.
- MakeOrder_UnregisteredProduct_ShouldThrowECommersException: Перевіряє, чи генерується виняток, коли спробують зробити замовлення з незареєстрованим продуктом.
- MakeRecommendations_ShouldReturnOrderedMostPopularProducts: Перевіряє, чи метод getRecommendations повертає продукти в правильному порядку, на основі популярності, після оформлення замовлення.
## Висновок
Використовуючи Java Collections, було створено спрощену систему бек-енду для платформи електронної комерції.