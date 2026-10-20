# SE1020 OOP Project — Final Report Template

## 1. Project overview
Medical Appointment Scheduling System: a Java web application for doctor discovery, appointment requests and visit record management. The system persists data in text files instead of a relational database.

## 2. Objectives
- Demonstrate encapsulation, inheritance, abstraction and polymorphism.
- Implement file read/write operations with BufferedReader and BufferedWriter.
- Implement CRUD workflows and responsive user interfaces.

## 3. Technology stack
Java 17, Spring Boot 3, Maven, Thymeleaf, HTML5, CSS3, plain text files.

## 4. OOP implementation
- Encapsulation: private fields with accessors in model classes.
- Inheritance: PatientUser, DoctorUser and AdminUser extend User; GeneralPractitioner and SpecialistDoctor extend Doctor.
- Polymorphism: overridden authentication and consultation fee methods.
- Abstraction: FileRepository interface and service layer.

## 5. File storage
`users.txt`, `doctors.txt`, `appointments.txt`, `medical-records.txt`. Values are URL-safe Base64 encoded where necessary to protect delimiter characters; this is encoding, not encryption.

## 6. Functional testing record
Complete this table after you run the app yourself.
| Test | Expected result | Actual result | Pass/Fail |
|---|---|---|---|
| Register patient | New patient persists | | |
| Login as patient | Dashboard loads | | |
| Search doctor | Matching doctors shown | | |
| Book valid slot | Appointment appears | | |
| Book occupied slot | Friendly error appears | | |
| Cancel appointment | Status becomes CANCELLED | | |
| Doctor confirms appointment | Status becomes CONFIRMED | | |
| Doctor adds visit note | Note appears in records | | |
| Admin adds/removes doctor | Directory updates | | |

## 7. Screenshots
Add your own screenshots of home, login, patient dashboard, doctor dashboard and admin dashboard.

## 8. GitHub commit history
Add your actual repository URL and screenshots/summary of your real commits. Do not fabricate commit history.

## 9. Limitations and future improvements
Production security (password hashing, CSRF protection), atomic locking/concurrency, appointment availability rules, dedicated medical-record file repository, stronger validation, automated tests and audit trail should be improved before real-world use.

## 10. Conclusion
Summarise what you implemented and what you personally learned.
