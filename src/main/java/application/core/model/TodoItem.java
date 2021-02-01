package application.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(of = "id")
public class TodoItem {
    // == fields ==
    private int id;
    private String title;
    private String details;
    private LocalDate localDate;

    // = constructors ==

//    public TodoItem(int id, String title, String details) {
//        this.id = id;
//        this.title = title;
//        this.details = details;
//    }

    public TodoItem(String title, String details, LocalDate localDate) {
        this.title = title;
        this.details = details;
        this.localDate = localDate;
    }
}
