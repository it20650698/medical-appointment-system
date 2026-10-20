# DIYANATH Medicare — Medical Appointment Scheduling System (SE1020 OOP)

Java 17 + Spring Boot + Thymeleaf + plain-text file storage. මෙය අධ්‍යාපනික demonstration project එකකි; සැබෑ රෝගී දත්ත production environment එකක භාවිත නොකරන්න.

## අවශ්‍ය දේ
- JDK 17 හෝ 21
- IntelliJ IDEA (Maven support)
- පළමු run එකේ Maven dependencies download කිරීමට Internet

## IntelliJ IDEA හරහා Run කිරීම
1. ZIP එක extract කරන්න.
2. IntelliJ → **Open** → `medical-appointment-system` folder එක තෝරන්න.
3. Maven project එක load වන තුරු රැඳී සිටින්න. `pom.xml` Maven ලෙස import කරන්න.
4. File → Project Structure → Project SDK ලෙස JDK 17+ තෝරන්න.
5. `src/main/java/lk/medical/MedicalAppointmentApplication.java` ගොනුව විවෘත කරන්න.
6. `main` අසල ඇති කොළ Run icon එක click කරන්න. නැතිනම් terminal එකේ `mvn spring-boot:run` run කරන්න.
7. Browser එකෙන් `http://localhost:8080` විවෘත කරන්න.
8. Text files පළමු run එකේ project root එකේ `data/` folder එකට ස්වයංක්‍රීයව සාදයි. File එකක් Notepad එකෙන් බැලිය හැකි නමුත් app එක ක්‍රියාත්මක අතරතුර අතින් edit නොකරන්න.

## Demo sign-ins
- Patient: `patient@demo.com` / `patient123`
- Doctor: `doctor@demo.com` / `doctor123`
- Admin: `admin@demo.com` / `admin123`

## Fixes in corrected package
- `MedicalService.java` uses `split("\\\\|", -1)` so Java correctly compiles the pipe separator regex.
- Patient registration writes the new account exactly once (prevents duplicate user records).

## Features
- Patient register/login, doctor search, appointment booking, cancellation, visit history.
- Doctor dashboard, confirm/complete appointment, prescription/visit note and feedback entry.
- Admin dashboard with full doctor CRUD (create, view, update and delete), patient deletion, appointment overview and status updates.
- File persistence: `data/users.txt`, `data/doctors.txt`, `data/appointments.txt`, `data/medical-records.txt` (reserved for future dedicated record repository; notes currently live with appointment entries).
- OOP: private fields/getters/setters, User inheritance, Doctor subclasses, overridden fee/authentication methods, FileRepository abstraction interface, TextFileStore buffered I/O.

## Maven commands
```bash
mvn clean test
mvn spring-boot:run
mvn clean package
java -jar target/medical-appointment-system-1.0.0.jar
```

## Folder structure
```text
medical-appointment-system/
├── pom.xml
├── README_SI.md
├── docs/
│   ├── CLASS_DIAGRAM.md
│   └── FINAL_REPORT_TEMPLATE.md
├── data/ (created on first run; sample text files are included in sample-data/)
├── sample-data/
│   ├── users.txt
│   ├── doctors.txt
│   ├── appointments.txt
│   └── medical-records.txt
└── src/main/
    ├── java/lk/medical/
    │   ├── MedicalAppointmentApplication.java
    │   ├── controller/WebController.java
    │   ├── model/{User,PatientUser,DoctorUser,AdminUser,Doctor,GeneralPractitioner,SpecialistDoctor,Appointment,MedicalRecord}.java
    │   ├── repository/FileRepository.java
    │   └── service/{TextFileStore,MedicalService}.java
    └── resources/
        ├── application.properties
        ├── static/css/style.css
        └── templates/{index,login,register,dashboard,admin,fragments}.html
```

## Important design/security notes
- Demo passwords are stored as plain text to keep the file format and OOP coursework simple. This is **not secure for production**; use password hashing, CSRF protection, role-aware authorization, audit logging, backups and a database for a real medical application.
- Appointment overlap is checked at application level. A plain text file does not provide database-grade concurrency guarantees. Run as a single local instance for coursework demos.
- The hero photographs are loaded from Unsplash URLs, so the computer needs Internet to display them. The application itself can still run without those photos.
- Admin can select Edit beside a doctor, change name, specialization, availability, room, consultation fee, category and login email, then save changes. Leave the password blank to keep the existing password. The form also supports adding and deleting doctors.
- This starter is intended for learning and demonstration, not a claim of zero bugs or clinical suitability. Test the workflows before submission and personalise the code/report/commit history for your own contribution.
