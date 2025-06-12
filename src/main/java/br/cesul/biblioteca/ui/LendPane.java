package br.cesul.biblioteca.ui;

import br.cesul.biblioteca.dao.BookDao;
import br.cesul.biblioteca.model.Book;

import javafx.collections.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class LendPane extends BorderPane implements Refreshable {

    private final BookDao dao = new BookDao();

    private final ObservableList<Book> disponiveis = FXCollections.observableArrayList();
    private final ObservableList<Book> emprestados = FXCollections.observableArrayList();

    private final ListView<Book> listDisp = new ListView<>(disponiveis);
    private final ListView<Book> listEmp  = new ListView<>(emprestados);

    public LendPane() {

    }

    @Override public void refresh() {

    }

    private static class BookCell extends ListCell<Book> {

    }
}
