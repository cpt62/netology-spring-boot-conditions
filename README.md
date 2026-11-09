# Решение домашнего задания: «Conditional приложение»

***

## Ход решения домашнего задания:

1. В классе `SpringBootConditionAppApplication` инициализируем `Spring boot` приложение, а именно:

- Создается `application context`;
- Сканируются компоненты (`@ComponentScan` - внутри `@SpringBootApplication`): поиск `@Component, @Repository, @Service,
  @Controller`;
- Применяется автоконфигуратор - spring boot при наличии классов в classpath регистрирует необходимые бины в контексте;
- Читаются свойства `application.properties` в `environment`;
- Обрабатываются условия в `@ConditionalOnProperty` - принимается решение создать бины в зависимости от параметра в
  свойствах:
  - если  `netology.profile.dev=true`  -> вывод консоли: `Current profile is dev`;
  - если  `netology.profile.dev=false` -> вывод консоли: `Current profile is production`;
- Создаюстя и внедряются бины;
- Запускается встроенный `tomcat` и принимаются запросы;

## Проверка работоспособности: 

Если содержимое файла: `application.properties`: netology.profile.dev=true

```bash
curl localhost:8080/profile
```

Вывод: Current profile is dev


***

Если содержимое файла `application.properties`: netology.profile.dev=false

```bash
curl localhost:8080/profile
```

Вывод: Current profile is production