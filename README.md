# Автотесты, проверяющие АПИ сайта <a target="_blank" href=https://reqres.in>https://reqres.in </a>

### Для написания автотестов использовались технологии и инструменты:
<p align="left">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/git-logo.svg" alt="git">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/java-logo.svg" alt="java">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/gradle-logo.svg" alt="gradle">
<img height="40" width="40" src="https://raw.githubusercontent.com/r2ff/r2ff/1cd5ac320c63eada404ddab3cfe71b4fbb5e73b0/svg/junit5-logo.svg" alt="junit5">
<img height="40" width="40" src="https://user-images.githubusercontent.com/84721020/131733118-67426995-f58b-4f2d-89ce-ab59f0c4a9bc.png" alt="rest-assured">
</p>

### Реализованы следующие проверки

#### API тесты:
- [X] - Проверка запросов GET, POST и DELETE
- [X] - Проверка ответа запроса на разные коды ответа (200, 201, 204, 404)
- [X] - Проверка ответа запроса после преобразования в объекты класса
- [X] - Проверка ответа запроса с помощью groovy

### Для запуска необходимо выполнить команду:

```bash
gradle clean test
```
