<div align="center">

# Medical Appointment Scheduling System
### SE1020: Object-Oriented Programming — Final Coursework Project

![Java 17](https://img.shields.io/badge/Java-17%20LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Persistence](https://img.shields.io/badge/Storage-Flat--File%20IO-blue?style=for-the-badge&logo=files)

<p align="center">
  A clean, modular Java web application demonstrating core Object-Oriented Programming (OOP) paradigms with a custom flat-file persistence engine instead of an RDBMS.
</p>

[Key Features](#-key-features) •
[OOP Architecture](#-object-oriented-programming-oop-pillars) •
[Storage Schema](#-file-persistence-engine) •
[Getting Started](#-getting-started) •
[Author](#-author)

---

</div>

## Project Overview

The **Medical Appointment Scheduling System** is designed to streamline clinical appointment workflows, doctor discovery, and medical record management. Instead of relying on traditional SQL databases, the application implements a stream-based flat-file persistence layer using Java `BufferedReader` and `BufferedWriter`, testing low-level data serialization, delimiter integrity, and object mapping within a modern Spring Boot web architecture.

---

## Key Features

- **Multi-Role Portal:** Dedicated views and workflows for Patients, Clinicians, and System Administrators.
- **Doctor Directory & Filtering:** Real-time doctor search filtered by clinical specialty.
- **Slot Reservation Engine:** Overlap detection preventing double-booking of doctor shifts.
- **Diagnostic Record Management:** Clinician consultation logs protected by URL-safe Base64 encoding.
- **Responsive Web UI:** Clean, mobile-friendly interface built with modern CSS3 and Thymeleaf templates.

---

## Object-Oriented Programming (OOP) Pillars

| Principle | Implementation Details in This System |
|---|---|
| **Encapsulation** | Strict `private` field visibility in models (`User`, `Patient`, `Doctor`, `Appointment`); mutation validated through public getters and setters. |
| **Inheritance** | Base `User` class extended by `PatientUser`, `DoctorUser`, and `AdminUser`. Base `Doctor` extended into `GeneralPractitioner` and `SpecialistDoctor`. |
| **Polymorphism** | Overridden `calculateConsultationFee()` dynamically evaluating rates at runtime based on doctor specialization category. |
| **Abstraction** | Data layer decoupled using a generic `FileRepository<T, ID>` interface, separating business logic from direct file I/O streams. |

---

## File Persistence Engine

All system records persist in structured text files located in the `data/` runtime directory:

* `users.txt` — User credentials, roles, and account metadata.
* `doctors.txt` — Medical council IDs, doctor specializations, and fee tiers.
* `appointments.txt` — Time-slot reservations, clinician-patient links, and appointment states.
* `medical-records.txt` — Clinical consultation notes and diagnostic summaries.

### Record Delimiter Schema

```text
Format : <Appointment_ID>|<Patient_ID>|<Doctor_ID>|<Base64_Payload>|<Status>|<Clinical_Reason>
Example: APP-1024|PAT-501|DOC-202|MjAyNi0xMS0xNVQxMDozMDowMA==|CONFIRMED|General Checkup
