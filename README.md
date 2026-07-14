<div align="center">

<img src="./assets/icon.png" width="100" height="100" alt="icon" />

# ISExplorer

Файловый менеджер с **Material Design 3** для Android

</div>

---

## Сборка

Для **x86_64** систем:
```sh
git clone https://github.com/rich-beluga/ISExplorer.git
cd ISExplorer
./gradlew build
```

Для **arm** (**aarch64**) систем:
```sh
git clone https://github.com/rich-beluga/ISExplorer.git
cd ISExplorer
bash build-arm.sh
```

Результат:
- `app/build/outputs/apk/debug/`
- `app/build/outputs/apk/release/`

> [!NOTE]
> Для ручной сборки APK необходимо иметь установленные `platform-tools`, `build-tools;35.0.0` и `platforms;android-35` из **sdkmanager**
>
> Или просто скачайте готовый APK с Github Releases

## Нашли ошибку?

<img src="./assets/issue.svg" width="16" height="16" alt="issue" />&nbsp;[Сообщите](https://github.com/rich-beluga/ISExplorer/issues/new?template=bug_report.yml) нам о ней
