This project automates an end-to-end flow of the CURA Healthcare Service demo website using Java and Selenium WebDriver. It simulates a real user journey from landing on the homepage, logging in, booking an appointment, and logging out.

🧪 Project Summary
Technology: Java, Selenium WebDriver

Browser: Google Chrome

Website Under Test: CURA Healthcare Service Demo

Automation Includes:

Title & URL validation

Navigation menu interaction

User login

Appointment booking with form filling

Confirmation validation

Logout

📁 Project Structure
bash
Copy
Edit
cura_healthcare_services/
│
└── CURA_ENDToEND_FLOW.java   # Main automation script
🚀 Prerequisites
Java JDK 8 or higher

Selenium Java bindings

Chrome browser installed

ChromeDriver (ensure the version matches your browser)

Eclipse or any Java IDE

⚙️ Setup Instructions
Clone or download this repository.

Open the project in your IDE.

Update the path to chromedriver.exe in the code:

java
Copy
Edit
System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
Add Selenium JARs to your project’s build path.

Run the CURA_ENDToEND_FLOW.java file.

🧩 Features Covered
Chrome browser automation with options

Dynamic waits and validations

Login functionality (with hardcoded credentials)

Dropdown, checkbox, radio button interactions

Form input and appointment submission

Screenshot & error logging (optional for future enhancements)

Graceful browser teardown

🔐 Credentials Used
Username: John Doe
Password: ThisIsNotAPassword

(These are from the demo site.)

✍️ Author
Dibyajyoti Pattnaik
Quality Engineering Analyst | Passionate about test automation
