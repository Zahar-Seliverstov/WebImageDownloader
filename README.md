# Images Downloader

Проект **Images Downloader** представляет собой программу для загрузки изображений с веб-страницы и сохранения их на локальный компьютер.

## Описание

Эта программа разработана для автоматизации процесса загрузки изображений с веб-страницы. Она извлекает URL-адреса всех изображений на указанной веб-странице, скачивает их и сохраняет в указанной папке на локальном компьютере.

## Как использовать

1. Установите необходимые зависимости, выполнив команду `mvn clean install`.
2. Запустите приложение, выполните метод `main` в классе `Main`.
3. Введите URL-адрес веб-страницы, с которой вы хотите загрузить изображения.
4. Изображения будут загружены в папку `images` в корневой директории проекта.

## Зависимости

Для работы программы используется библиотека [Jsoup](https://jsoup.org/), которая позволяет парсить HTML-код веб-страницы и извлекать информацию из него.

## Контрибуция

Мы приветствуем ваши предложения и исправления ошибок! Если вы хотите внести свой вклад в проект, пожалуйста, создайте Issue или Pull Request.

## Авторы

- John Doe (@johndoe)
- Jane Smith (@janesmith)

## Лицензия

Этот проект лицензирован в соответствии с условиями лицензии [MIT](LICENSE).