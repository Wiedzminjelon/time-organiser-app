package application.core.service;

import application.core.model.TodoData;
import application.core.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    // == fields ==
    private final TodoData todoData = new TodoData();

    // == public methods ==
    @Override
    public void addItem(TodoItem toAdd) {
        todoData.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        todoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return todoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        todoData.updateItem(toUpdate);
    }

    @Override
    public TodoData getData() {
        return todoData;
    }
}
