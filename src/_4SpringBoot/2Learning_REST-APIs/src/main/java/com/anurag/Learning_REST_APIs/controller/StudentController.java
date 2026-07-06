package com.anurag.Learning_REST_APIs.controller;

import com.anurag.Learning_REST_APIs.entity.Student;
import com.anurag.Learning_REST_APIs.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController
{

    private final StudentService studentService;

    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id)
    {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
        return "Student Deleted Successfully";
    }

}

/*
=========================================================
                 @RequestBody
=========================================================

Definition:
@RequestBody is used to read JSON data from the HTTP Request Body
and automatically convert it into a Java Object.

Flow:

Postman (JSON)
        │
        ▼
@RequestBody
        │
        ▼
Java Object (Student)

Example:

POST /students

Request Body:

{
    "name":"Anurag",
    "email":"anurag@gmail.com",
    "age":22,
    "course":"Java"
}

Controller:

@PostMapping
public Student saveStudent(@RequestBody Student student)
{
    return studentService.saveStudent(student);
}

Without @RequestBody:
- Spring cannot convert JSON into a Java Object.
- Request may fail with 400 Bad Request or object fields may remain null.

Interview Definition:
@RequestBody binds the HTTP request body (JSON/XML) to a Java Object.

=========================================================
                 @PathVariable
=========================================================

Definition:
@PathVariable is used to extract a value from the URL
and bind it to a method parameter.

Flow:

URL
/students/5
      │
      ▼
@PathVariable
      │
      ▼
Long id = 5

Example:

GET /students/5

Controller:

@GetMapping("/{id}")
public Student getStudent(@PathVariable Long id)
{
    return studentService.getStudentById(id);
}

Another Example:

PUT /students/5

@RequestBody  -> Contains updated Student data.
@PathVariable -> Contains Student ID (5).

Controller:

@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id,
                             @RequestBody Student student)
{
    return studentService.updateStudent(id, student);
}

Without @PathVariable:
- Spring cannot read the value from the URL.
- The id parameter will not be populated correctly.

Interview Definition:
@PathVariable extracts a value from the URL path
and binds it to a method parameter.

=========================================================
Difference Between @RequestBody and @PathVariable
=========================================================

@RequestBody
--------------
✔ Reads data from HTTP Request Body.
✔ Used with POST and PUT APIs.
✔ Converts JSON into Java Object.

Example:

POST /students

{
    "name":"Anurag",
    "age":22
}

@PathVariable
--------------
✔ Reads data from URL.
✔ Used with GET, PUT and DELETE APIs.
✔ Converts URL value into Java Variable.

Example:

GET /students/5

=========================================================
Easy Trick to Remember
=========================================================

@RequestBody  -> Data comes FROM BODY (JSON)

@PathVariable -> Data comes FROM URL

Examples:

POST   /students
        ↓
@RequestBody Student student

GET    /students/5
        ↓
@PathVariable Long id

PUT    /students/5
        ↓
@PathVariable Long id
@RequestBody Student student

DELETE /students/5
        ↓
@PathVariable Long id
=========================================================
*/

/*
====================================================================
                    STUDENT CRUD REST APIs
====================================================================

Base URL:
http://localhost:9091/students

====================================================================
1. CREATE STUDENT
====================================================================

Method:
POST

URL:
http://localhost:9091/students

Request Body:

{
    "name":"Anurag",
    "email":"anurag@gmail.com",
    "age":22,
    "course":"Java"
}

Controller:

@PostMapping
public Student saveStudent(@RequestBody Student student)

Purpose:
Creates a new student in the database.

Repository Method Used:
save()

====================================================================
2. GET ALL STUDENTS
====================================================================

Method:
GET

URL:
http://localhost:9091/students

Request Body:
Not Required

Controller:

@GetMapping
public List<Student> getAllStudents()

Purpose:
Returns all students from the database.

Repository Method Used:
findAll()

====================================================================
3. GET STUDENT BY ID
====================================================================

Method:
GET

URL:
http://localhost:9091/students/{id}

Example:
http://localhost:9091/students/1

Request Body:
Not Required

Controller:

@GetMapping("/{id}")
public Student getStudentById(@PathVariable Long id)

Purpose:
Returns a single student using the given ID.

Repository Method Used:
findById()

====================================================================
4. UPDATE STUDENT
====================================================================

Method:
PUT

URL:
http://localhost:9091/students/{id}

Example:
http://localhost:9091/students/1

Request Body:

{
    "name":"Anurag Tiwari",
    "email":"anurag@gmail.com",
    "age":23,
    "course":"Spring Boot"
}

Controller:

@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id,
                             @RequestBody Student student)

Purpose:
Updates an existing student's information.

Repository Method Used:
save()

====================================================================
5. DELETE STUDENT
====================================================================

Method:
DELETE

URL:
http://localhost:9091/students/{id}

Example:
http://localhost:9091/students/1

Request Body:
Not Required

Controller:

@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Long id)

Purpose:
Deletes a student using the given ID.

Repository Method Used:
deleteById()

====================================================================
Repository Methods Used in CRUD
====================================================================

POST      -> save()

GET ALL   -> findAll()

GET BY ID -> findById()

PUT       -> save()

DELETE    -> deleteById()

====================================================================
HTTP Methods
====================================================================

POST    -> Create Data

GET     -> Read Data

PUT     -> Update Data

DELETE  -> Delete Data

====================================================================
REST API FLOW
====================================================================

Postman
    │
    ▼
StudentController
    │
    ▼
StudentService
    │
    ▼
StudentRepository
    │
    ▼
Spring Data JPA
    │
    ▼
Hibernate
    │
    ▼
PostgreSQL

====================================================================
Interview Questions
====================================================================

Q1. Which annotation reads JSON data?
Ans:
@RequestBody

Q2. Which annotation reads value from URL?
Ans:
@PathVariable

Q3. Which repository methods are used?

save()
findAll()
findById()
deleteById()

Q4. Which HTTP methods are used?

POST
GET
PUT
DELETE
*/