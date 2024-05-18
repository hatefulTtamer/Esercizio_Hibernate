package co.develhope.eserciziohibernate.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "enrollments")
@NoArgsConstructor
@AllArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Class classroom;

    @ManyToMany
    private List<Student> students;
}
