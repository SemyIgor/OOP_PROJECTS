## Task No1 (исходное задание Семинара №01)

_Реализовать, с учетом ООП подхода, приложение Для проведения исследований с генеалогическим древом. Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека._

### _Реализованы связи:_
- _родитель-ребёнок, муж-жена, брат-сестра, брат-брат, сестра-сестра, кузен-кузина_
### _сформированы исследования:_
- _выбрать всех детей Ирины_
- _выбрать всех мужчин, годных к воинской службе_
- _выбрать родителей Василия_

## Дополнительное задание Семинара №02

_Используйте предыдущие задачи из прошлого домашнего задания. Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или хомяком т е с интерфейсом “животное”_

`В программу добавлен интерфейс записи в файл`
