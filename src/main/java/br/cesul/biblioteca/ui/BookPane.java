package br.cesul.biblioteca.ui;

import br.cesul.biblioteca.dao.BookDao;
import br.cesul.biblioteca.model.Book;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class BookPane extends BorderPane implements Refreshable {

    private final BookDao dao = new BookDao();

    private final ObservableList<Book> data = FXCollections.observableArrayList();

    private final TableView<Book> table = new TableView<>(data);

    public BookPane() {

    }

    @Override public void refresh() { 

    }

    private TextField txt(String prompt) {

    }

    /* Helper para criar colunas com lambda */
    private TableColumn<Book, String> col(String title, String field, int w) {

    }
}
