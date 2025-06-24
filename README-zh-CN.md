# android-compose-app-template

[![GitHub license](https://img.shields.io/github/license/BetterAndroid/android-compose-app-template?color=blue&style=flat-square)](https://github.com/BetterAndroid/android-compose-app-template/blob/main/LICENSE)
[![Telegram](https://img.shields.io/badge/discussion-Telegram-blue.svg?logo=telegram&style=flat-square)](https://t.me/BetterAndroid)
[![Telegram](https://img.shields.io/badge/discussion%20dev-Telegram-blue.svg?logo=telegram&style=flat-square)](https://t.me/HighCapable_Dev)
[![QQ](https://img.shields.io/badge/discussion%20dev-QQ-blue.svg?logo=tencent-qq&logoColor=red&style=flat-square)](https://qm.qq.com/cgi-bin/qm/qr?k=Pnsc5RY6N2mBKFjOLPiYldbAbprAU3V7&jump_from=webapi&authKey=X5EsOVzLXt1dRunge8ryTxDRrh9/IiW1Pua75eDLh9RE3KXE+bwXIYF5cWri/9lf)

<img src="img-src/icon.png" width = "100" height = "100" alt="LOGO"/>

一个快速创建基础 Android 项目的模版 (Jetpack Compose 版本)。

[English](README.md) | 简体中文

| <img src="https://github.com/BetterAndroid/.github/blob/main/img-src/logo.png?raw=true" width = "30" height = "30" alt="LOGO"/> | [BetterAndroid](https://github.com/BetterAndroid) |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------- |

这个项目属于上述组织，**点击上方链接关注这个组织**，发现更多好项目。

## 这是什么

这是一个快速创建基础 Android 项目的模版，通过此模版，你可以快速创建一个干净、简洁的标准 Android 项目。

模版中自动为你集成了 [Flexi UI](https://github.com/BetterAndroid/FlexiUI) 和 [BetterAndroid](https://github.com/BetterAndroid/BetterAndroid) 依赖，它能助你的开发变得更轻松。

如果你需要使用传统的开发方式，请参考另一个模版 [android-app-template](https://github.com/BetterAndroid/android-app-template)。

## 开始使用

在 GitHub 上点击 “Use this template” 按钮来使用此模版，成功创建新的存储库后，使用 `git clone` 命令将你的项目克隆到本地，此时不要立即打开项目。

在项目的根目录，你可以找到 `initializer.json` 和 `initializer.py` 两个文件，请打开 `initializer.json` 文件，内容如下。

```json
{
  // 你的项目名称，这将作为整个 Gradle 项目的名称，只允许英文
  "__PROJECT_NAME__": "android-compose-app-demo",
  // 你的 App 名称
  "__APP_NAME__": "Android Compose App Demo",
  // 你的 App 包名
  "__PACKAGE_NAME__": "com.highcapable.androidcomposeappdemo"
}
```

编辑完成配置文件后，运行 `initializer.py` 脚本对项目进行初始化，初始化成功后这两个文件会被自动删除。

如果你的系统中没有 Python，请前往 [官网](https://www.python.org/) 下载一个，然后在命令行执行 `python3 initializer.py`。

如果你正在使用 macOS 或 Linux，你可以直接执行 `./initializer.py`。

项目初始化成功后，你可以使用 Android Studio 或 IntelliJ IDEA 打开这个项目。

## 项目推广

<!--suppress HtmlDeprecatedAttribute -->
<div align="center">
    <h2>嘿，还请君留步！👋</h2>
    <h3>这里有 Android 开发工具、UI 设计、Gradle 插件、Xposed 模块和实用软件等相关项目。</h3>
    <h3>如果下方的项目能为你提供帮助，不妨为我点个 star 吧！</h3>
    <h3>所有项目免费、开源，遵循对应开源许可协议。</h3>
    <h1><a href="https://github.com/fankes/fankes/blob/main/project-promote/README-zh-CN.md">→ 查看更多关于我的项目，请点击这里 ←</a></h1>
</div>

## Star History

![Star History Chart](https://api.star-history.com/svg?repos=BetterAndroid/android-compose-app-template&type=Date)

## 许可证

- [Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0)

```
Apache License Version 2.0

Copyright (C) 2019 HighCapable

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

版权所有 © 2019 HighCapable