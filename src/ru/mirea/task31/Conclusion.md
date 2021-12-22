# Вывод, сделанный по результатам тестирования в задании 30


## Практические выводы:

**JUnit** отличный инструмент для покрытия своего кода **тестами**. JUnit сработает еще лучше, в связке с **Maven**, при сборке проекта, Maven обязательно проведет все тесты, и потом соберет наш готовый проект, но если тесты будут провалены, проект не будет собран, и мы будем знать причины, и так будет легче разобраться где именно поломка.

Второй плюс **JUnit** это случай Рефакторинга, тесты JUnit помогут нам проследить чтобы логика нашей программы не поломалась. А в больших проектах без системы автоматического тестирования жизнь не возможна, хотя может и возможна, но велика вероятность возникновения множества ошибок, а поиски этих самых ошибок займут уйму времени.

Если мы хорошо покроем тестами наш код, то можем быть уверены, что у клиента, наш продукт будет отлично работать.