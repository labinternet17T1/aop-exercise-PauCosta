package cat.tecnocampus.Application;

import cat.tecnocampus.domain.Classroom;
import cat.tecnocampus.persintence.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Controller {

    ClassroomDAO classroomDAO;

    public Controller(ClassroomDAO classroomDAO) {
        this.classroomDAO = classroomDAO;
    }


    public List<Classroom> findAll() {
        return classroomDAO.findAll();
    }

    public List<Classroom> findCapacityLargerThan(int capacity) {
        return classroomDAO.findCapacityLargerThan(capacity);
    }

    public List<Classroom> findCapacityLowerThan(int capacity) {
        return classroomDAO.findCapacityLowerThan(capacity);
    }

    public List<Classroom> findWithPlugs() {
        return classroomDAO.findWithPlugs();
    }

    public List<Classroom> findWithNoPlugs() {
        return  classroomDAO.findWithNoPlugs();
    }

    public int insert(Classroom classroom) {
        return classroomDAO.insert(classroom);
    }

    public int[] insertBatch(List<Classroom> classrooms) {
       return classroomDAO.insertBatch(classrooms);
    }
}
