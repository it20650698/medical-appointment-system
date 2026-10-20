# Medical Appointment Scheduling System
### SE1020: Object-Oriented Programming — Final Coursework Project

![Java 17](https://img.shields.io/badge/Java-17%20LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Persistence](https://img.shields.io/badge/Storage-Flat--File%20IO-blue?style=for-the-badge&logo=files)

A standalone Java Spring Boot web application designed for doctor discovery, appointment requests, and clinical visit record management. The application uses low-level flat-file persistence (`BufferedReader` / `BufferedWriter`) instead of a relational database, strictly applying core Object-Oriented Programming principles.

---

## Features

- **Multi-Role Portal:** Separate dashboards for Patients, Doctors, and Administrators.
- **Doctor Discovery:** Filter clinicians by medical specialty.
- **Appointment Scheduling:** Slot booking with collision detection to prevent double-booking.
- **Medical Records:** Clinician consultation logs protected by URL-safe Base64 encoding.
- **Responsive UI:** Clean interface built using HTML5, CSS3, and server-side Thymeleaf templates.

---

## OOP Implementation

| Principle | Implementation Details |
|---|---|
| **Encapsulation** | Private fields across all model entities (`User`, `Patient`, `Doctor`, `Appointment`) with public accessors and mutator validation. |
| **Inheritance** | `PatientUser`, `DoctorUser`, and `AdminUser` extend base `User`. `GeneralPractitioner` and `SpecialistDoctor` extend `Doctor`. |
| **Polymorphism** | Overridden `calculateConsultationFee()` dynamically evaluating rates at runtime based on specialization tier. |
| **Abstraction** | Generic `FileRepository<T, ID>` interface separating business services from file stream operations. |

---

## File Persistence Architecture

Data is stored in plain text files using pipe (`|`) delimiters:

- `users.txt` — User credentials, roles, and profile information.
- `doctors.txt` — Medical IDs, specialties, and fee structures.
- `appointments.txt` — Scheduled appointments, timestamps, and status flags.
- `medical-records.txt` — Consultation notes and medical histories.

```text
Format : <Appointment_ID>|<Patient_ID>|<Doctor_ID>|<Base64_Payload>|<Status>|<Clinical_Reason>
Example: APP-1024|PAT-501|DOC-202|MjAyNi0xMS0xNVQxMDozMDowMA==|CONFIRMED|General Checkup
```

---

## How to Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/it20650698/medical-appointment-system.git](https://github.com/it20650698/medical-appointment-system.git)
   cd medical-appointment-system
   ```

2. **Build and Run:**
   ```bash
   mvn spring-boot:run
   ```

3. **Access via browser:**
   ```text
   http://localhost:8081
   ```

---

## Author

- **Name:** Samaraweera S.M.R.
- **Student ID:** IT20650698
- **Institution:** Sri Lanka Institute of Information Technology (SLIIT)
- **Degree:** B.Sc. (Hons) in Information Technology
- **Module:** SE1020 — Object-Oriented Programming
