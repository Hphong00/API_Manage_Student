package controller;

import entity.Student;
import service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/students")
public class StudentController {

    StudentService studentService = new StudentService();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getListStudent() {
        return studentService.getListStudent();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("id") int id) {
        return studentService.getEntityByIdStudent(id);
    }

    @POST
    @Path("/insert")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addNewStudent(Student student) {
        return studentService.addStudent(student) ? "thêm mới sinh viên thành công" : "thêm mới sinh viên thất bại";
    }

    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String upDateStudent(Student student) {
        return studentService.updateStudent(student) ? "update thành công" : "update thất bại";
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String removeStudent(@PathParam("id") int id) {
        return studentService.deleteStudent(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}