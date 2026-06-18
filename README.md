# SmartBasket

Android-проект для первой практической работы. Приложение представляет собой стартовый экран сервиса для ведения списка покупок.

## Что находится в проекте

- `app/src/main/res/layout/main_activity.xml` - первый экран приложения на `LinearLayout`.
- `app/src/main/res/layout/shopping_activity.xml` - экран покупок.
- `app/src/main/res/layout/settings_activity.xml` - экран настроек.
- `app/src/main/java/ru/practice/smartbasket/MainActivity.java` - основной Activity.
- `docs/practice1_notes.md` - пояснительная записка с концепцией, описанием экрана и местом под скриншоты.
- `docs/practice2_notes.md` - пояснительная записка ко второй практической работе.

## Параметры

- Название приложения: SmartBasket
- Package name: `ru.practice.smartbasket`
- Min SDK: 23
- Target SDK: 37
- Android Gradle Plugin: 9.2.1
- Gradle: 9.4.1

## Запуск

1. Открыть корневую папку проекта в актуальной стабильной версии Android Studio.
2. Дождаться синхронизации Gradle.
3. Запустить конфигурацию `app` на эмуляторе или устройстве.

## Практическая работа 2

Во второй работе добавлены экраны "Покупки" и "Настройки", а на главный экран вынесены иконко-кнопки будущих переходов. Все кнопки и иконко-кнопки имеют XML-слушатели через `android:onClick`, методы-заглушки находятся в `MainActivity.java`.
