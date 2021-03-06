# Паттерны
## Singleton
Шаблон Singleton накладывает ограничения на создание экземпляра класса и гарантирует, что в JVM существует только один экземпляр дан-ного класса. Класс Singleton-а должен иметь глобальную точку доступа для получения экземпляра класса. Шаблон используют для логирования, объектов драйверов, кеширования и наборов нитей. 

## Service Locator
Service Locator – это паттерн, который используется в разработке программного обеспечения для инкапсуляции процессов, связанных с получением модуля с сильным уровнем абстракции.
Реализуется в виде центрального реестра ресурсов, возвращающего нужную информацию по запросу. Главное отличие от фабрик в том, что Service Locator не создаёт объекты, а знает, как получить тот или иной объект. Т.е. фактически уже содержит в себе инстанцированные объекты.
Объекты в Service Locator могут быть добавлены напрямую, через конфигурационный файл, или любым другим удобным программисту способом.


## Proxy
Proxy (Заместитель) – паттерн, структурирующий объекты.
Шаблон "proxy" используется, чтобы создать представительный объект, который управляет доступом к другому объекту, который может быть удаленным, обладать дорогостоящим созданием или нуждающийся в защите.

**Применение шаблона Прокси в JDK:**

-  java.lang.reflect.Proxy
-  java.rmi.* (whole package)

## Template method
Template method – это поведенческий шаблон проектирования, который определяет алгоритм, некоторые методы которого делегируются подклассам, позволяя тем самым переопределить некоторые шаги алгоритма, не меняя его структуры.
Суть метода заключается в том, что алгоритм поведения объектов выносится в базовый класс, а реализация отдельных шагов падает на плечи классов-наследников.