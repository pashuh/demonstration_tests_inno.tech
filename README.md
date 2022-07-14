# ������ �� ������������� ������������ ����� �������

## :page_with_curl:	����������

> :heavy_check_mark: [���������� � �����������](#technologist-����������-�-�����������)
>
> :heavy_check_mark: [����������� ��������](#bookmark_tabs-�����������-��������)
>
> :heavy_check_mark: [������ ������ �� ���������](#computer-������-������-��-���������)
>
> :heavy_check_mark: [������ ������ � Jenkins](#-������-������-�-jenkins)
>
> :heavy_check_mark: [����� � ����������� ������������ � Allure Report](#-�����-�-�����������-������������-�-allure-report)
>
>
> :heavy_check_mark: [����������� � Telegram � �������������� ����](#-�����������-�-telegram-�-��������������-����)
>
> :heavy_check_mark: [������ ������� ����� � Selenoid](#-������-�������-�����-�-selenoid)

## :technologist: ���������� � �����������

<p  align="center">

<img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg">
<img width="5%" title="Java" src="images/logo/Java.svg">
<img width="5%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="5%" title="Selenide" src="images/logo/Selenide.svg">
<img width="5%" title="Gradle" src="images/logo/Gradle.svg">
<img width="5%" title="Junit5" src="images/logo/Junit5.svg">
<img width="5%" title="GitHub" src="images/logo/GitHub.svg">
<img width="5%" title="Allure TestOPS" src="images/logo/Allure_TO.svg">
<img width="5%" title="Allure Report" src="images/logo/Allure.svg">
<img width="5%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="5%" title="Jira" src="images/logo/Jira.svg">
<img width="5%" title="Telegram" src="images/logo/Telegram.svg">
</p>

> *� ������ ������� ��������� �������� �� <code><strong>*Java*</strong></code> � �������������� ���������� <code><strong>*Selenide*</strong></code> ��� UI-������.*
>
>*��� ������ ������� ������������ <code><strong>*Gradle*</strong></code>.*
>
>*<code><strong>*JUnit 5*</strong></code> ������������ ��� ��������� ��� ���������� ������������.*
>
>*������ ������ ����������� �� <code><strong>*Jenkins*</strong></code>.*
>
>*<code><strong>*Selenoid*</strong></code> ������������ ��� ������� ��������� � �����������  <code><strong>*Docker*</strong></code>.*
>
>*<code><strong>*Allure Report, Allure TestOps, Jira, Telegram Bot*</strong></code> ������������ ��� ������������ ����������� ������������.*


## :bookmark_tabs: ����������� ��������

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; UI

> - [x] *�������� �������� � ���������� ������ �� ������� 'QA'*
>- [x] *�������� �������� � ���������� ������ �� ������� 'QA' � ��� �������� � �. ������*
>- [x] *�������� ������� ��������������� ��������� ������������ 'Data Engineering' �� ������� �������� � ����*
>- [x] *�������� ����������� ���������� ������ � Sberseasons*
>- [x] *�������� ������� ������� '����������� ��������������� �������� ��������' � SberTech*

## :computer: ������ ������ �� ���������

### ��������� ������ ������

```bash
gradle clean testSberTech
```

### ��������� ������ ������

```bash
gradle
clean
testSberTech
-Dremote=${ADDRESS}
-Dbrowser=${BROWSER}
-Dversion=${BROWSER_VERSION}
-Dresolution=${RESOLUTION}
```

### ��������� ������

> <code>ADDRESS</code> � ����� ���������� �������, �� ������� ����� ����������� �����.
>
> <code>BROWSER</code> � �������, � ������� ����� ����������� ����� (_�� ��������� - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> � ������ ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>100</code>_).
>
> <code>RESOLUTION</code> � ������ ���� ��������, � ������� ����� ����������� ����� (_�� ��������� - <code>1920x1080</code>_).

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> ������ ������ � [Jenkins](https://jenkins.autotests.cloud/job/demonstration_tests_sbertech/)

*��� ������� ������ ���������� ������� �������� ���������� � ������ ������ <code><strong>*�������*</strong></code>.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="800">
</p>

*����� ���������� ������, � ����� <code><strong>*������� ������*</strong></code> �������� ������ ������ ��������
������ <img width="2%" title="Allure Report" src="images/logo/Allure.svg"><code><strong>*Allure
Report*</strong></code>, ������� �� ��������, ��������� �������� � �������������� html-�������.*

<p align="center">
  <img src="images/screens/Jenkins2.png" alt="job" width="1000">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> ����� � ����������� ������������ � [Allure Report](https://jenkins.autotests.cloud/job/demonstration_tests_sbertech/)

### :pushpin: ����� ����������

*������� �������� Allure-������ �������� ��������� �������������� �����:*

> - [x] <code><strong>*ALLURE REPORT*</strong></code> - ���������� ���� � ����� ����������� �����, ����� ���������� ���������� ������, � ����� ��������� � ��������� �������� � ���������� ��������, ������� � ����������� � �������� ���������� ������
>- [x] <code><strong>*TREND*</strong></code> - ���������� ����� ����������� ������ �� ������ � ������
>- [x] <code><strong>*SUITES*</strong></code> - ���������� ������������� ����������� ������ �� �������� �������
>- [x] <code><strong>*ENVIRONMENT*</strong></code> - ���������� �������� ���������, �� ������� ����������� ����� (� ������ ������ ���������� �� ������)
>- [x] <code><strong>*CATEGORIES*</strong></code> - ���������� ������������� ��������� ��������� ������ �� ����� ��������
>- [x] <code><strong>*FEATURES BY STORIES*</strong></code> - ���������� ������������� ������ �� �����������, ������� ��� ���������
>- [x] <code><strong>*EXECUTORS*</strong></code> - ���������� ����������� ������� ������ (������ �� ������ � Jenkins)

<p align="center">
  <img src="images/screens/AllureReporet.png" alt="Allure Report" width="900">
</p>

### :pushpin: �����
<p align="center">
  <img src="images/screens/AllureReport2.png" alt="Allure Report" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> ���������� � [Allure TestOps](https://allure.autotests.cloud/launch/14276)

### :pushpin: �������� �������

<p align="center">
  <img src="images/screens/AllureTestOps.png" alt="dashboards" width="900">
</p>

### :pushpin: ����-�����

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="test cases" width="900">
</p>

## <img width="4%" title="Jira" src="images/logo/Jira.svg"> ���������� � [Jira](https://jira.autotests.cloud/browse/AUTO-638)

<p align="center">
  <img src="images/screens/Jira.png" alt="jira" width="1000">
</p>


## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> ����������� � Telegram � �������������� ����

> ����� ���������� ������ ����������� ���, ��������� � <code>Telegram</code>, ������������� ������������ � ���������� ��������� � ������� � ������� ������.

<p align="center">
<img title="Telegram Notifications" src="images/screens/Telegram2.png">
</p>

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> ������ ������� ����� � Selenoid

> � ������� ����� � ������ ����������� �����.
<p align="center">
  <img title="Selenoid Video" src="images/gif/video.gif">
</p>
