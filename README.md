# QA Automation & Java Practice — Shibu Vasudevan

A collection of hands-on practice work built during my Software Testing Internship and self-study, covering manual-to-automation QA fundamentals with Selenium WebDriver, JUnit, TestNG, Apache POI (data-driven testing), and core Java.

**Honesty note:** This is practice and self-study code, not production or client deliverable work. My professional, delivered QA work (100+ test cases, defect reports, RTMs on a live EVA CRM/Talento application) is documented separately in my [resume](https://shibuvasudevqa.netlify.app/) and portfolio. This repository exists to show the hands-on automation groundwork behind that.

---

## 📁 Repository Structure

```
qa-automation-practice/
├── selenium-automation/
│   ├── junit/              (6 files — SauceDemo, Demoblaze, PetStore assertions)
│   ├── testng/              (10 files — TestNG suites, screenshots, data-driven)
│   ├── excel-driven/        (7 files — Apache POI + Selenium combined)
│   └── standalone/          (2 files — plain main() practice scripts)
├── excel-utilities/          (3 files — Apache POI read/write, no browser)
├── exception-handling/       (8 files — custom exceptions, try/catch/finally)
├── core-java/                (61 files — OOP, Scanner I/O, algorithms)
└── README.md
```

---

## 🌟 Highlighted Work (most representative of current skill level)

| File | Why it stands out |
|---|---|
| `Parabank.java` | Most mature script — uses explicit `WebDriverWait` + `ExpectedConditions` instead of just `Thread.sleep()`. Full banking flow: registration, login, account creation, fund transfer, transaction history. |
| `Sunscreen.java` | Weather Shopper price-scraper — loops through products, parses prices, identifies the cheapest, adds it to cart, and writes results back to an Excel sheet. |
| `NewTest.java` | Includes a genuine **negative test case** (invalid login) alongside the happy path, with screenshots captured per outcome. |
| `Ev100.java` | Full data-driven signup→login→purchase→logout flow across a live e-commerce demo site, driven entirely from an Excel input file via Apache POI. |
| `Bankthrow.java`, `Amazonexcp.java` | Custom exception classes (`InsufficientBalanceException`, `OutOfStockException`) — practicing exception design, not just handling built-in ones. |

---

## 🧭 Learning Notes (honest self-assessment)

I'm including this section deliberately — I'd rather show self-awareness than pretend this code is production-ready.

- **`Thread.sleep()` is used heavily** throughout the earlier scripts instead of explicit waits. I know this is a beginner pattern; `Parabank.java` shows where I started correcting it with `WebDriverWait`/`ExpectedConditions`, and it's something I'm actively continuing to apply going forward.
- **Hardcoded local file paths** (`C:\Users\shibu\...`) appear in the Excel-driven scripts. These were written for my own machine during practice and won't run as-is on another system — they'd need to be parameterized (e.g., relative paths or config files) to be portable.
- **Locators are a mix of ID, className, linkText, and some brittle absolute XPath.** Later scripts lean more on stable locators (`id`, `name`) where the site allows it.
- **Some early scripts use `EdgeDriver` directly without WebDriverManager**, meaning the driver executable path is hardcoded rather than auto-managed.

---

## 🛠️ Tech Used

- **Languages:** Java
- **Automation:** Selenium WebDriver
- **Test Frameworks:** JUnit 4, TestNG
- **Data-Driven Testing:** Apache POI (XSSFWorkbook/XSSFSheet)
- **Browsers:** Microsoft Edge (EdgeDriver), Chrome (ChromeDriver)
- **Build:** Eclipse-managed projects (some under Maven — see `pom.xml` if present per project)

## 🌐 Sites Practiced On

SauceDemo, Demoblaze, JPetStore (OctoPerf), AutomationExercise.com, ParaBank, Weather Shopper, Guru99 Bank Demo

---

## 📬 Contact

**Shibu Vasudevan** — QA Engineer, Manual Testing & Selenium Automation
📧 shibuvasudev7@gmail.com | 🔗 [LinkedIn](https://linkedin.com/in/shibuvasudev) | 🌐 [Portfolio](https://shibuvasudevqa.netlify.app/)
