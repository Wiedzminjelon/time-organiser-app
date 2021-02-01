package application.core.service;

import application.core.model.TodoData;
import application.core.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();
}
